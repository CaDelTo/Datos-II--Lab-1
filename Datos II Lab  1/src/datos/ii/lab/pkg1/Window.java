/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.ii.lab.pkg1;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
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
    public Window(){
        dim = tk.getScreenSize();
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lab 1 - EDD 2");
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        JTabbedPane tabbedPane = new JTabbedPane();
        add(tabbedPane);
        JLabel label1 = new JLabel("Users");
        JLabel label2 = new JLabel("Products");
        
        tabbedPane.add("Users", tabbedPaneA);
        tabbedPane.add("Products", label2);
        
        
    }
    private void tabbedPanesUsers(){
        tabbedPaneA = new JTabbedPane();
        
        tabbedPaneA.add("Create User Categories", null);
        tabbedPaneA.add("Create User", userCreatePanel);
        tabbedPaneA.add("Search User", null);
        tabbedPaneA.add("Path", null);
        tabbedPaneA.add("Edit User", null);
        tabbedPaneA.add("Set User", null);
        tabbedPaneA.add("", null);

    }
    private void initComponents(){
        setPanel1();
        userCreatePanel();
        tabbedPanesUsers();
        
    }
    private void setPanel1(){
        panel = new JPanel();
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        buttons();
        
    }

    private void userCreatePanel(){
        userCreatePanel = new JPanel();
        userCreatePanel.setLayout(null);


        JLabel Name = new JLabel("Name");
            Name.setBounds(80, dim.height/10 + (dim.height/20)*-1 , 300, 100);
            Name.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(Name);
            JTextField NameArea = new JTextField();
                NameArea.setBounds(Name.getX()+ dim.width/5, Name.getY() + 10 , 300, 50);
                userCreatePanel.add(NameArea);

        JLabel lastName = new JLabel("Last Name");
            lastName.setBounds(80, (dim.height/10), 300, 100);
            lastName.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(lastName);
            JTextField lastNameA = new JTextField();
                lastNameA.setBounds(Name.getX()+ dim.width/5, lastName.getY() + 10 , 300, 50);
                userCreatePanel.add(lastNameA);
            
        JLabel age = new JLabel("Age");
            age.setBounds(80, (dim.height/10) + (dim.height/20)*1, 300, 100);
            age.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(age);
            JTextField ageA = new JTextField();
                ageA.setBounds(Name.getX()+ dim.width/5, age.getY() + 10 , 300, 50);
                userCreatePanel.add(ageA);

        JLabel birthDate = new JLabel("Birth Date");
            birthDate.setBounds(80, (dim.height/10) + (dim.height/20)*2, 300, 100);
            birthDate.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(birthDate);
            JTextField birthDateA = new JTextField();
                birthDateA.setBounds(Name.getX()+ dim.width/5, birthDate.getY() + 10 , 300, 50);
                userCreatePanel.add(birthDateA);

        JLabel civState = new JLabel("Civil State");
            civState.setBounds(80, (dim.height/10) + (dim.height/20)*3, 300, 100);
            civState.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(civState);
            JTextField civStateA = new JTextField();
                civStateA.setBounds(Name.getX()+ dim.width/5, civState.getY() + 10 , 300, 50);
                userCreatePanel.add(civStateA);

        JLabel phoneNumber = new JLabel("Phone Number");
            phoneNumber.setBounds(80, (dim.height/10) + (dim.height/20)*4, 300, 100);
            phoneNumber.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(phoneNumber);
            JTextField phoneNumberA = new JTextField();
                phoneNumberA.setBounds(Name.getX()+ dim.width/5, phoneNumber.getY() + 10 , 300, 50);
                userCreatePanel.add(phoneNumberA);

        JLabel Email = new JLabel("Email");
            Email.setBounds(80, (dim.height/10) + (dim.height/20)*5, 300, 100);
            Email.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(Email);
            JTextField EmailA = new JTextField();
                EmailA.setBounds(Name.getX()+ dim.width/5, Email.getY() + 10 , 300, 50);
                userCreatePanel.add(EmailA);
                
        JLabel eduLevel = new JLabel("Educational Level");
            eduLevel.setBounds(80, (dim.height/10) + (dim.height/20)*6, 300, 100);
            eduLevel.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(eduLevel);
            JTextField eduLevelA = new JTextField();
                eduLevelA.setBounds(Name.getX()+ dim.width/5, eduLevel.getY() + 10 , 300, 50);
                userCreatePanel.add(eduLevelA);

        JLabel incomeRange = new JLabel("Income Range");
            incomeRange.setBounds(80, (dim.height/10) + (dim.height/20)*7, 300, 100);
            incomeRange.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(incomeRange);
            JTextField incomeRangeA = new JTextField();
                incomeRangeA.setBounds(Name.getX()+ dim.width/5, incomeRange.getY() + 10 , 300, 50);
                userCreatePanel.add(incomeRangeA);

        JLabel address = new JLabel("Address");
            address.setBounds(80, (dim.height/10) + (dim.height/20)*8, 300, 100);
            address.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(address);
            JTextField addressA = new JTextField();
                addressA.setBounds(Name.getX()+ dim.width/5, address.getY() + 10 , 300, 50);
                userCreatePanel.add(addressA);
        
        JLabel noEmail = new JLabel("No Email Contact");
            noEmail.setBounds(80, (dim.height/10) + (dim.height/20)*9, 300, 100);
            noEmail.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(noEmail);
            //JTextField NameArea = new JTextField();
                NameArea.setBounds(Name.getX()+ dim.width/5, Name.getY() + 10 , 300, 50);
                userCreatePanel.add(NameArea);

        JLabel noPhone = new JLabel("No Phone Contact");
            noPhone.setBounds(80, (dim.height/10) + (dim.height/20)*10, 300, 100);
            noPhone.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(noPhone); 
            //JTextField NameArea = new JTextField();
                NameArea.setBounds(Name.getX()+ dim.width/5, Name.getY() + 10 , 300, 50);
                userCreatePanel.add(NameArea);  
            
        JLabel noSMS = new JLabel("No SMS Contact");
            noSMS.setBounds(80, (dim.height/10) + (dim.height/20)*11, 300, 100);
            noSMS.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(noSMS); 
            //JTextField NameArea = new JTextField();
                NameArea.setBounds(Name.getX()+ dim.width/5, Name.getY() + 10 , 300, 50);
                userCreatePanel.add(NameArea);
                

        JLabel noMail = new JLabel("No Mail Contact");
            noMail.setBounds(80, (dim.height/10) + (dim.height/20)*12, 300, 100);
            noMail.setFont(new Font("arial", Font.PLAIN, 30));
            userCreatePanel.add(noMail);    
            //JTextField NameArea = new JTextField();
                NameArea.setBounds(Name.getX()+ dim.width/5, Name.getY() + 10 , 300, 50);
                userCreatePanel.add(NameArea);

        userCreatePanel.setBackground(Color.lightGray);
        
        
        
    }
    private void buttons(){
        JButton bt1 = new JButton();
        bt1.setBounds(dim.width/4, dim.height/4, dim.height/4, dim.width/5);
        panel.add(bt1);
    }
}
