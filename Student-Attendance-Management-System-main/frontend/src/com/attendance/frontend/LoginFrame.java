package com.attendance.frontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginframe extends JFrame {
    public Loginframe() {
        setTitle("Login - Student Attendance System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 25);
        add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 180, 25);
        add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 25);
        add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 180, 25);
        add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loginframe().setVisible(true));
    }
}