package org.example;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

public class HtmlUnitNauka {
    public static void main(String[] args) throws Exception {
        WebClient webClient = new WebClient();
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setUseInsecureSSL(true);

        HtmlPage page = webClient.getPage("https://ckziubrodnica.pl/");

        System.out.println("Page title: " + page.getTitleText());
        System.out.println("Page XML: " + page.asXml());
        System.out.println("Page text: " + page.asText());

        HtmlElement body = (HtmlElement) page.getElementById("page");
        System.out.println(body.asXml());

        System.out.println(page.getElementsByTagName("input").size());

        HtmlForm form = page.getForms().get(0);
        HtmlSubmitInput submit = form.getOneHtmlElementByAttribute("input", "type", "submit");
        HtmlTextInput input = (HtmlTextInput) page.getElementById("query");
        input.setValueAttribute("htmlunit");

        HtmlPage results = submit.click();
        System.out.println(results.getTitleText());
        DomNodeList<DomNode> data = results.querySelectorAll(".im-header");
        System.out.println("Number of query results: " + data.size());

        System.out.println(data.get(0).asText());

    }
}
