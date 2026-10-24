package com.attendance.frontend;

import javax.swing.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Dashboard - Student Attendance System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to Student Dashboard");
        welcomeLabel.setBounds(150, 30, 250, 30);
        add(welcomeLabel);

        JButton viewAttendanceBtn = new JButton("View Attendance");
        viewAttendanceBtn.setBounds(150, 100, 200, 40);
        add(viewAttendanceBtn);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(150, 160, 200, 40);
        add(logoutBtn);
    }
}