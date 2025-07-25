package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class deposit extends JFrame implements ActionListener{
    String pinNumber;
    TextField textField;
    JButton b1,b2;

    deposit(String pinNumber){
        this.pinNumber = pinNumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        b1= new JButton("DEPOSITE");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65,125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);


        b2= new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65,125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
         setSize(1550,1080);
         setLocation(0,0);
         setVisible(true);
    }
   
      @Override
      public void actionPerformed(ActionEvent e){

        try{
        String amount = textField.getText();
        Date  date = new Date();
        if(e.getSource()==b1){
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount to deposit");
            }else{
                Conn c= new Conn();
                c.statement.executeUpdate("insert into bank values('"+pinNumber+"','"+ date+"' ,'deposit' ,'" + amount +"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit Succesfully");
                setVisible(false);
                new main_class(pinNumber);
            }
        }
        else if(e.getSource()==b2){
            setVisible(false);
            new main_class(pinNumber);

        }
      }catch(Exception E){
          E.printStackTrace();
      }
      }


    public static void main(String[] args) {
        new deposit(" ");
    }
}
