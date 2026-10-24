
package com.attendance.frontend;

import com.attendance.model.Student;
import com.attendance.service.LoginService;

import javax.swing.*;

public class LoginFrame extends JFrame {

    private JTextField userText;
    private JPasswordField passText;
    private LoginService loginService;

    public LoginFrame() {
        loginService = new LoginService();

        setTitle("Login - Student Attendance System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 25);
        add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 50, 180, 25);
        add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 25);
        add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 100, 180, 25);
        add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        add(loginButton);

        loginButton.addActionListener(e -> validateLogin());
    }

    private void validateLogin() {
        String username = userText.getText().trim();
        String password = new String(passText.getPassword());

        Student student = loginService.login(username, password);

        if (student != null) {
            JOptionPane.showMessageDialog(
                this,
                "Login successful! Welcome, " + student.getStudentName()
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Invalid username or password!",
                "Login Failed",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new LoginFrame().setVisible(true)
        );
    }
}
