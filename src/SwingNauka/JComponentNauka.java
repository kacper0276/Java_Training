package SwingNauka;

// Komoponenty wywodzą się z abstrakcyjnej klasy Component, która posiada różne właściwości jak kolory, czcionki, które mogą być ustawione przez odpowiadające im klasy
// Komponenty które wyświetlają inne komponenty nazywane są kontenerami, np. JPanel, do nich możemy dodawać komponenty i inne kontenery

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

class TestJComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(30, 30, 100, 30);
        g.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
        g.setColor(Color.blue);
        g.drawString("Some text", 15, 15);
    }
}

class Test2JComponent extends JComponent {
    Image img;
    public Test2JComponent() {
        super();
        img = new ImageIcon("files\\img\\aaa.jpg").getImage();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 3, 3, 300, 500, this);
    }
}

class Test3JComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.draw(new Line2D.Float(0, 0, 200.0f, 20.0f));
        g2d.drawRect(20, 20, 40, 60);
        g2d.setColor(Color.red);
        g2d.draw(new Rectangle2D.Float(10, 10, 20.5f, 25.0f));
        g2d.setColor(Color.green);
        g2d.draw(new Ellipse2D.Float(50, 40, 60, 30));

        GradientPaint gp = new GradientPaint(5, 5, Color.yellow, 20, 25, Color.red, true);
        g2d.setPaint(gp);
        g2d.fillRect(60, 80, 100, 50);
    }
}

public class JComponentNauka extends JFrame {
    public static void main(String[] args) {
        JComponentNauka frame = new JComponentNauka();
        frame.setSize(500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TestJComponent());
        frame.add(new Test2JComponent());
        frame.add(new Test3JComponent());
        frame.setVisible(true);
    }
}
