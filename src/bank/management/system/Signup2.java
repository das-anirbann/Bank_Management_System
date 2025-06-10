package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener{

    JComboBox<String> religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    JTextField panField, aadharField;
    JRadioButton yesSenior, noSenior, yesAccount, noAccount;
    JButton next;
    String form_no;
    
    Signup2(String form_no) {
        this.form_no = form_no;
        setTitle("Signup - Page 2");

         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        ImageIcon bank_image = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank_image2 = bank_image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank_image3 = new ImageIcon(bank_image2);
        JLabel image = new JLabel(bank_image3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label = new JLabel("Page 2: Additional Details");
        label.setFont(new Font("Raleway", Font.BOLD, 22));
        label.setBounds(290, 80, 400, 30);
        add(label);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String[] religions = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionBox = new JComboBox<>(religions);
        religionBox.setBounds(300, 140, 400, 30);
        add(religionBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] categories = {"General", "OBC", "SC", "ST", "Other"};
        categoryBox = new JComboBox<>(categories);
        categoryBox.setBounds(300, 190, 400, 30);
        add(categoryBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] incomes = {"< 1,50,000", "< 2,50,000", "< 5,00,000", ">= 5,00,000"};
        incomeBox = new JComboBox<>(incomes);
        incomeBox.setBounds(300, 240, 400, 30);
        add(incomeBox);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String[] educationOptions = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationBox = new JComboBox<>(educationOptions);
        educationBox.setBounds(300, 305, 400, 30);
        add(educationBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 360, 200, 30);
        add(occupation);

        String[] occupations = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationBox = new JComboBox<>(occupations);
        occupationBox.setBounds(300, 360, 400, 30);
        add(occupationBox);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 410, 200, 30);
        add(pan);

        panField = new JTextField();
        panField.setFont(new Font("Raleway", Font.PLAIN, 16));
        panField.setBounds(300, 410, 400, 30);
        add(panField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 460, 200, 30);
        add(aadhar);

        aadharField = new JTextField();
        aadharField.setFont(new Font("Raleway", Font.PLAIN, 16));
        aadharField.setBounds(300, 460, 400, 30);
        add(aadharField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 510, 200, 30);
        add(senior);

        yesSenior = new JRadioButton("Yes");
        noSenior = new JRadioButton("No");
        yesSenior.setBackground(new Color(222, 255, 228));
        noSenior.setBackground(new Color(222, 255, 228));
        yesSenior.setBounds(300, 510, 100, 30);
        noSenior.setBounds(400, 510, 100, 30);
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yesSenior);
        seniorGroup.add(noSenior);
        add(yesSenior);
        add(noSenior);

        JLabel account = new JLabel("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(100, 560, 200, 30);
        add(account);

        yesAccount = new JRadioButton("Yes");
        noAccount = new JRadioButton("No");
        yesAccount.setBackground(new Color(222, 255, 228));
        noAccount.setBackground(new Color(222, 255, 228));
        yesAccount.setBounds(300, 560, 100, 30);
        noAccount.setBounds(400, 560, 100, 30);
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(yesAccount);
        accountGroup.add(noAccount);
        add(yesAccount);
        add(noAccount);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


         
        JLabel  fromNol = new JLabel("Form no:");
        fromNol.setFont(new Font("Raleway", Font.BOLD, 20));
        fromNol.setBounds(290, 50, 400, 30);
        add(fromNol);

        JLabel  fromNo = new JLabel(form_no);
        fromNo.setFont(new Font("Raleway", Font.BOLD, 20));
        fromNo.setBounds(385, 50, 400, 30);
        add(fromNo);



        setLayout(null);
        getContentPane().setBackground(new Color(252, 208, 76));
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String education = (String) educationBox.getSelectedItem();
        String occupation = (String) occupationBox.getSelectedItem();

        String pan = panField.getText();
        String aadhar = aadharField.getText();

        String seniorCitizen = yesSenior.isSelected() ? "Yes" : "No";
        String existingAccount = yesAccount.isSelected() ? "Yes" : "No";

        try {
            if (panField.getText().equals("") || aadharField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the feilds");
            }
            else
            {
            Conn c = new Conn();
            String query = "INSERT INTO Signup2 VALUES('" + form_no + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "')";
            c.statement.executeUpdate(query);

            // proceed to next signup page (Signup3)
            new Signup3(form_no); // create Signup3 class similarly
            setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Signup2(" ");
    }
}
