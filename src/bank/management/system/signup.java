package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.*;
import javax.swing.*;

public class signup extends JFrame implements ActionListener{

    JButton next;

    JTextField textName, textFName, textEmail, textAddress, textCity, textState, textPin;

    JDateChooser dateChooser;

    JRadioButton male, female, other, married, unmarried;

    Random random = new Random(); 
    long first5digit = (random.nextLong() % 9000L) + 1000L;
    
    String first = " "+ Math.abs(first5digit);

    signup(){

        super("Application From");

        ImageIcon bank_image = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image2 = bank_image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image3 = new ImageIcon(bank_image2);
        JLabel image = new JLabel(bank_image3);
        image.setBounds(25,10,100,100);
        add(image);



        JLabel label1 = new JLabel("Application From No"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,22)); 
        label2.setBounds(330,70,600,30);
        add(label2);
        
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(200,90,600,30);
        add(label3);


        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);


        
        JLabel labelName1 = new JLabel("Father's Name :");
        labelName1.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName1.setBounds(100,240,200,30);
        add(labelName1);
        

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300,240,400,30);
        add(textFName);



        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,300,200,30);
        add(DOB);

        
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,400,30);
        add(dateChooser);



         // Gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 350, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);


       //male.setFont(new Font("Raleway", Font.BOLD, 20));
       male.setBackground(new Color(222,255,228));
       //female.setFont(new Font("Raleway", Font.BOLD, 20));
       female.setBackground(new Color(222,255,228));
       //other.setFont(new Font("Raleway", Font.BOLD, 20));
       other.setBackground(new Color(222,255,228));

        male.setBounds(300, 350, 90, 30);
        female.setBounds(400, 350, 100, 30);
        other.setBounds(520, 350, 90, 30);

        add(male);
        add(female);
        add(other);


         // Email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 400, 200, 30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.PLAIN, 16));
        textEmail.setBounds(300, 400, 400, 30);
        add(textEmail);


         // Marital Status

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 450, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        unmarried = new JRadioButton("Unmarried");

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);

        married.setBounds(300, 450, 100, 30);
        married.setBackground(new Color(222,255,228));
        unmarried.setBounds(400, 450, 200, 30);
        unmarried.setBackground(new Color(222,255,228));

        add(married);
        add(unmarried);


        // Address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 500, 200, 30);
        add(address);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.PLAIN, 16));
        textAddress.setBounds(300, 500, 400, 30);
        add(textAddress);

        // City
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 548, 200, 30);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.PLAIN, 16));
        textCity.setBounds(300, 550, 400, 30);
        add(textCity);

        // State
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 600, 200, 30);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.PLAIN, 16));
        textState.setBounds(300, 600, 400, 30);
        add(textState);

        // Pin Code
        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 650, 200, 30);
        add(pin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.PLAIN, 16));
        textPin.setBounds(300, 650, 400, 30);
        add(textPin);

        

        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
     public void actionPerformed(ActionEvent e){

     }

    public static void main(String[] args) {
        new signup();
    }
}
