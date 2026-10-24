package com.attendance.frontend;

import javax.swing.*;

public class OverallAttendanceFrame extends JFrame {
    public OverallAttendanceFrame() {
        setTitle("Overall Attendance");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Overall Attendance Summary: 85%");
        titleLabel.setBounds(110, 50, 250, 30);
        add(titleLabel);
    }
}