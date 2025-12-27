package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){


        getContentPane().setBackground(Color.BLACK);


        int frameWidth = 700;
        int frameHeight = 500;
        int panelWidth = 690;
        int panelHeight = 490;

        int x = (frameWidth - panelWidth) / 2;
        int y = (frameHeight - panelHeight) / 2;

        JPanel panel = new JPanel();
        panel.setBounds(x, y, panelWidth, panelHeight);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        add(panel);


        JTable table = new JTable();
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Tahoma", Font.BOLD, 14));
        table.setRowHeight(25);


        table.getTableHeader().setBackground(new Color(3, 45, 48));
        table.getTableHeader().setForeground(Color.WHITE);


        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 40, panelWidth, 350);
        scrollPane.setBackground(Color.BLACK);
        panel.add(scrollPane);


        try{
            connection c = new connection();
            String q = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel label1 = new JLabel("Department");
        label1.setBounds(145,11,105,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Phone Number");
        label2.setBounds(431,11,150,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);


        JButton b1 = new JButton("BACK");
        b1.setBounds(300,410,130,30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setSize(frameWidth, frameHeight);
        setLayout(null);
        setLocation(450,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Department();
    }
}