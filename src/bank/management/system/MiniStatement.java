package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MiniStatement extends JFrame implements ActionListener{
    
    String pin;
    JButton button;

    MiniStatement(String pin){
     
     this.pin = pin;

      getContentPane().setBackground(new Color(255,204,204));
      setSize(400,600);
      setLocation(20,20);
      setLayout(null);


      /*JLabel label1= new JLabel(); 
      label1.setBounds(20,140,400,250);
      add(label1);*/

      JLabel label2= new JLabel("BANK OF DAS");
      label2.setFont(new Font("System",Font.BOLD,15));
      label2.setBounds(150,20,400,20);
      add(label2);

      JLabel label3= new JLabel();
      label3.setBounds(20,80,350,20);
      add(label3);

      JLabel label4= new JLabel(); 
      label4.setBounds(20,420,300,20);
      add(label4);


      JTextArea transactionArea = new JTextArea();
        transactionArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        transactionArea.setEditable(false);
        transactionArea.setBackground(new Color(255, 204, 204));

        JScrollPane scrollPane = new JScrollPane(transactionArea);
        scrollPane.setBounds(20, 160, 350, 250);
        add(scrollPane);


      try {
        Conn c= new Conn();
        ResultSet resultSet = c.statement.executeQuery("select * from Login where pinNumber= '"+pin+"'");
        while(resultSet.next()){
            label3.setText("Card Number: "+resultSet.getString("cardNumber").substring(0,4)+"-XXXX-XXXX-"+resultSet.getString("cardNumber").substring(12));

        }
      } catch (Exception e) {
        e.printStackTrace();
      }

      try {
        int BALANCE = 0;
        Conn c= new Conn();

        ResultSet resultset = c.statement.executeQuery("select * from bank where pinNumber='"+pin+"'");
                   
            StringBuilder textBuilder = new StringBuilder();
            textBuilder.append(String.format("%-30s %-12s %10s\n", "Date", "Type", "Amount"));
            textBuilder.append("---------------------------------------------------------------\n");


                while (resultset.next()) {
                String date = resultset.getString("date");
                String type = resultset.getString("type");
                String amount = resultset.getString("amount");

               
                 textBuilder.append(String.format("%-30s %-12s %10s\n", date, type, amount));


                if (type.equalsIgnoreCase("deposit")) {
                    BALANCE += Integer.parseInt(amount);
                } else {
                    BALANCE -= Integer.parseInt(amount);
                }
            }

            transactionArea.setText(textBuilder.toString());
            label4.setText("Your Total Balance Is Rs: " + BALANCE);

               /*while (resultset.next()) {
                
                
                label1.setText(label1.getText()+"<html>"+resultset.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("amount")+"<br><br><html>");

                 if(resultset.getString("type").equalsIgnoreCase("deposit")){
                    BALANCE += Integer.parseInt(resultset.getString("amount"));
                 }
                 else{
                    BALANCE -= Integer.parseInt(resultset.getString("amount"));
                 }
               }   

               label4.setText("Your Total Balance Is Rs"+BALANCE);*/
      } catch (Exception a) {
        a.printStackTrace();
      }
      button = new JButton("Exit");
      button.setBounds(20,500,100,25);
      button.addActionListener(this);
      button.setBackground(Color.BLACK);
      button.setForeground(Color.WHITE);
      add(button);

      
      setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent E){
        setVisible(false);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
    
}
