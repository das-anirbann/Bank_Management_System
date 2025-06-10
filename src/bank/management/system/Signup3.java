package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton saving, fixed, current, recurring;
    JCheckBox atm, internet, mobile, email, cheque, estmt, declaration;
    JButton submit, cancel;
    String form_no;

    Signup3(String form_no) {
        this.form_no = form_no;
        setLayout(null);
        
        ImageIcon bank_image = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image2 = bank_image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image3 = new ImageIcon(bank_image2);
        JLabel image = new JLabel(bank_image3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label = new JLabel("Page 3: Account Details");
        label.setFont(new Font("Raleway", Font.BOLD, 22));
        label.setBounds(280, 80, 400, 30);
        add(label);

        JLabel accType = new JLabel("Account Type:");
        accType.setFont(new Font("Raleway", Font.BOLD, 18));
        accType.setBounds(100, 140, 200, 30);
        add(accType);

        saving = new JRadioButton("Saving Account");
        saving.setBounds(100, 180, 200, 30);
        saving.setBackground(new Color(222, 255, 228));
        add(saving);

        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setBounds(350, 180, 300, 30);
        fixed.setBackground(new Color(222, 255, 228));
        add(fixed);

        current = new JRadioButton("Current Account");
        current.setBounds(100, 220, 200, 30);
        current.setBackground(new Color(222, 255, 228));
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setBounds(350, 220, 300, 30);
        recurring.setBackground(new Color(222, 255, 228));
        add(recurring);

        ButtonGroup group = new ButtonGroup();
        group.add(saving);
        group.add(fixed);
        group.add(current);
        group.add(recurring);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setBounds(100, 280, 200, 30);
        add(card);

        JLabel cardNum = new JLabel("XXXX-XXXX-XXXX-1234");
        cardNum.setFont(new Font("Raleway", Font.BOLD, 18));
        cardNum.setBounds(300, 280, 300, 30);
        add(cardNum);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100, 330, 200, 30);
        add(pin);

        JLabel pinNum = new JLabel("XXXX");
        pinNum.setFont(new Font("Raleway", Font.BOLD, 18));
        pinNum.setBounds(300, 330, 300, 30);
        add(pinNum);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 18));
        services.setBounds(100, 390, 200, 30);
        add(services);

        atm = new JCheckBox("ATM Card");
        atm.setBackground(new Color(222, 255, 228));
        atm.setBounds(100, 430, 200, 30);
        add(atm);

        internet = new JCheckBox("Internet Banking");
        internet.setBackground(new Color(222, 255, 228));
        internet.setBounds(350, 430, 200, 30);
        add(internet);

        mobile = new JCheckBox("Mobile Banking");
        mobile.setBackground(new Color(222, 255, 228));
        mobile.setBounds(100, 470, 200, 30);
        add(mobile);

        email = new JCheckBox("EMAIL Alerts");
        email.setBackground(new Color(222, 255, 228));
        email.setBounds(350, 470, 200, 30);
        add(email);

        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(new Color(222, 255, 228));
        cheque.setBounds(100, 510, 200, 30);
        add(cheque);

        estmt = new JCheckBox("E-Statement");
        estmt.setBackground(new Color(222, 255, 228));
        estmt.setBounds(350, 510, 200, 30);
        add(estmt);

        declaration = new JCheckBox("I hereby declare that the above entered details are correct.");
        declaration.setBackground(new Color(222, 255, 228));
        declaration.setBounds(100, 570, 600, 30);
        add(declaration);

        submit = new JButton("Submit");
        submit.setBounds(250, 630, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 630, 100, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);



        JLabel  fromNol = new JLabel("Form no:");
        fromNol.setFont(new Font("Raleway", Font.BOLD, 20));
        fromNol.setBounds(600, 50, 400, 30);
        add(fromNol);

        JLabel  fromNo = new JLabel(form_no);
        fromNo.setFont(new Font("Raleway", Font.BOLD, 20));
        fromNo.setBounds(690, 50, 400, 30);
        add(fromNo);





        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (saving.isSelected()) accountType = "Saving Account";
            else if (fixed.isSelected()) accountType = "Fixed Deposit Account";
            else if (current.isSelected()) accountType = "Current Account";
            else if (recurring.isSelected()) accountType = "Recurring Deposit Account";

            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String services = "";
            if (atm.isSelected()) services += " ATM Card";
            if (internet.isSelected()) services += " Internet Banking";
            if (mobile.isSelected()) services += " Mobile Banking";
            if (email.isSelected()) services += " EMAIL Alerts";
            if (cheque.isSelected()) services += " Cheque Book";
            if (estmt.isSelected()) services += " E-Statement";

            try {
                if (accountType == null) {
                    JOptionPane.showMessageDialog(null, "Please select account type.");
                } else if (!declaration.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please confirm the declaration.");
                } else {
                    Conn c = new Conn();
                    String query = "INSERT INTO Signup3 VALUES('" + form_no + "', '" + accountType + "', '" + cardNumber + "', '" + pinNumber + "', '" + services + "')";
                  


                    String query2 = "insert into Login values('" + form_no + "',  '" + cardNumber + "', '" + pinNumber + "')";

                    c.statement.executeUpdate(query);
                    c.statement.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card No: " + cardNumber + "\nPIN: " + pinNumber);
                   
                    new deposite(pinNumber);
                    // Next step: go to login page or home screen
                    setVisible(false);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login(); // Redirect to login
        }
    }

    public static void main(String[] args) {
        new Signup3(" "); // dummy form_no for testing
    }
}
