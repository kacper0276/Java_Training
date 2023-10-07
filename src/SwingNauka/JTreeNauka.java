package SwingNauka;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class JTreeNauka extends JFrame {
    public static void main(String[] args) {
        JTreeNauka frame = new JTreeNauka();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        JTree tree = new JTree(root);
        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("cars");
        root.add(cars);

        DefaultMutableTreeNode ford = new DefaultMutableTreeNode("Ford");
        cars.add(ford);
        DefaultMutableTreeNode dodge = new DefaultMutableTreeNode("Dodge");
        cars.add(dodge);

        // Open all rows
        for(int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Object el = e.getNewLeadSelectionPath().getLastPathComponent();

                DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
                System.out.println("Selected: " + node);
            }
        });

        frame.add(tree);
        frame.setSize(200, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
