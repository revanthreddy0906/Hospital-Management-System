package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception() {
        getContentPane().setBackground(Color.WHITE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        panel1.setBounds(0, 0, screenSize.width, 150);
        panel1.setBackground(Color.WHITE);
        add(panel1);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        int borderThickness = 5;
        panel.setBounds(borderThickness, 150 + borderThickness, screenSize.width - (2 * borderThickness), screenSize.height - 150 - (2 * borderThickness) - 30);
        panel.setBackground(Color.BLACK);
        add(panel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(panel1.getWidth() - 250 - 10, 0, 250, 250);
        panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/amb.png"));
        Image image1 = i11.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(panel1.getWidth() - 250 - 10 - 300 - 20, 50, 300, 100);
        panel1.add(label1);


        Font boldFont = new Font("Arial", Font.BOLD, 12);

        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(30, 15, 200, 30);
        btn1.setBackground(new Color(246, 215, 118));
        btn1.setFont(boldFont);
        panel1.add(btn1);
        btn1.addActionListener(e -> {
            new NEW_PATIENT();
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30, 58, 200, 30);
        btn2.setBackground(new Color(246, 215, 118));
        btn2.setFont(boldFont);
        panel1.add(btn2);
        btn2.addActionListener(e -> {
             new Room();
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30, 100, 200, 30);
        btn3.setBackground(new Color(246, 215, 118));
        btn3.setFont(boldFont);
        panel1.add(btn3);
        btn3.addActionListener(e -> {
            new Department();
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(270, 15, 200, 30);
        btn4.setBackground(new Color(246, 215, 118));
        btn4.setFont(boldFont);
        panel1.add(btn4);
        btn4.addActionListener(e -> {
             new Employee_info();
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(270, 58, 200, 30);
        btn5.setBackground(new Color(246, 215, 118));
        btn5.setFont(boldFont);
        panel1.add(btn5);
        btn5.addActionListener(e -> {
             new ALL_Patient_Info();
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270, 100, 200, 30);
        btn6.setBackground(new Color(246, 215, 118));
        btn6.setFont(boldFont);
        panel1.add(btn6);
        btn6.addActionListener(e -> {
             new patient_discharge();
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510, 15, 200, 30);
        btn7.setBackground(new Color(246, 215, 118));
        btn7.setFont(boldFont);
        panel1.add(btn7);
        btn7.addActionListener(e -> {
             new update_patient_details();
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510, 58, 200, 30);
        btn8.setBackground(new Color(246, 215, 118));
        btn8.setFont(boldFont);
        panel1.add(btn8);
        btn8.addActionListener(e -> {
             new Ambulance();
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510, 100, 200, 30);
        btn9.setBackground(new Color(246, 215, 118));
        btn9.setFont(boldFont);
        panel1.add(btn9);
        btn9.addActionListener(e -> {
             new SearchRoom();
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750, 15, 200, 30);
        btn10.setBackground(new Color(246, 215, 118));
        btn10.setFont(boldFont);
        panel1.add(btn10);
        btn10.addActionListener(e -> {
            setVisible(false);
            new Login();
        });

        setSize(screenSize.width, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Reception();
    }
}
