package bank.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

   JLabel label_1,label_2,label_3;

   JTextField textField;

   JPasswordField passwordField;

   JButton button1, button2, button3;
   Login(){


      //bank icon add
      ImageIcon bank_image = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
      Image bank_image2 = bank_image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
      ImageIcon bank_image3 = new ImageIcon(bank_image2);
      JLabel image = new JLabel(bank_image3);
      image.setBounds(350,10,100,100);
      add(image);

      
      //card icon add
      ImageIcon card_image = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
      Image card_image2 = card_image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
      ImageIcon card_image3 = new ImageIcon(card_image2);
      JLabel image_2 = new JLabel(card_image3);
      image_2.setBounds(630,350,100,100);
      add(image_2);
      

      //only for show "welcome to the atm"
      label_1 = new JLabel("WELCOME TO THE ATM");
      label_1.setForeground(Color.WHITE);
      label_1.setFont(new Font("AvantGarde",Font.BOLD,38));
      label_1.setBounds(230,125,450,40);
      add(label_1);


      //label for card no enter
      label_2 = new JLabel("CARD NO:");
      label_2.setForeground(Color.WHITE);
      label_2.setFont(new Font("Ralway", Font.BOLD,28));
      label_2.setBounds(150,190,375,30);
      add(label_2);

      textField= new JTextField(15);
      textField.setBounds(325,190,230,30);
      textField.setFont(new Font("Arial", Font.BOLD, 14));
      add(textField);


     //label for  pin no enter
      label_3= new JLabel("PIN:");
      label_3 .setForeground(Color.WHITE);
      label_3.setFont(new Font("Ralway", Font.BOLD,28));
      label_3.setBounds(150,250,375,30);
      add(label_3);
  
      passwordField = new JPasswordField(15);
      passwordField.setBounds(325,250,230,30);
      passwordField.setFont(new Font("Arial", Font.BOLD,14));
      add(passwordField);
      

      button1 = new JButton("SIGN IN");
      button1.setFont(new Font("Arial",Font.BOLD,14));
      button1.setForeground(Color.WHITE);
      button1.setBackground(Color.BLACK);
      button1.setBounds(300,300,100,30);
      button1.addActionListener(this);
      add(button1);

      button2 = new JButton("CLEAR");
      button2.setFont(new Font("Arial",Font.BOLD,14));
      button2.setForeground(Color.WHITE);
      button2.setBackground(Color.BLACK);
      button2.setBounds(430,300,100,30);
      button2.addActionListener(this);
      add(button2);

      button3 = new JButton("SIGN UP");
      button3.setFont(new Font("Arial",Font.BOLD,14));
      button3.setForeground(Color.WHITE);
      button3.setBackground(Color.BLACK);
      button3.setBounds(300,350,230,30);
      button3.addActionListener(this);
      add(button3);        

      //its for creat back 
      ImageIcon back_image = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
      Image back_image2 = back_image.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
      ImageIcon back_image3 = new ImageIcon(back_image2);
      JLabel image_3 = new JLabel(back_image3);
      image_3.setBounds(0,0,850,480);
      add(image_3);

      
      //its for hradline and the window size
      setLayout(null);
      setTitle("Bank Management System- Login");    
      setSize(850,480);
      setLocation(450,200);
      setVisible(true);
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
       
       try{
          if(e.getSource() == button1){

          }
          else if (e.getSource() == button2) {
            
          }
          else if(e.getSource() == button3){
             new signup();
             setVisible(false);
          }
       }catch(Exception E){
         E.printStackTrace();
       }
       
   }
    public static void main(String[] args) {
      new Login();    
    }
}