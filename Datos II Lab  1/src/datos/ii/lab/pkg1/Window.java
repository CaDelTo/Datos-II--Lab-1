/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.ii.lab.pkg1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Elsup
 */
public class Window extends JFrame{
    private Dimension dim;
    Toolkit tk = Toolkit.getDefaultToolkit();
    public JPanel panel;
    public JPanel panel2;
    public JTabbedPane tabbedPaneA;
    public JPanel userCreatePanel;
    public JPanel searchUserPanel;

    public Window(){
        dim = tk.getScreenSize();
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lab 1 - EDD 2");
        setResizable(true);
        setLocationRelativeTo(null);
        initComponents();
        JTabbedPane tabbedPane = new JTabbedPane();
        add(tabbedPane);
        JLabel label2 = new JLabel("Products");
        
        tabbedPane.add("Users", tabbedPaneA);
        tabbedPane.add("Products", label2);
           
        pack();

    }
    private void tabbedPanesUsers(){
        tabbedPaneA = new JTabbedPane();
        UserCreatePanel  panel2 = new UserCreatePanel();
        UserSearchPanel panel3 = new UserSearchPanel();
        
        tabbedPaneA.add("Create User Categories", null);
        tabbedPaneA.add("Create User", panel2);
        tabbedPaneA.add("Search User", panel3);
        tabbedPaneA.add("Path", null);
        tabbedPaneA.add("Edit User", null);

    }
    private void initComponents(){
        tabbedPanesUsers();
        
    }
    
}
