package com.attendance.frontend;

import javax.swing.*;

public class AttendanceDetailsFrame extends JFrame {
    public AttendanceDetailsFrame() {
        setTitle("Attendance Details");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Detailed Attendance Records");
        titleLabel.setBounds(130, 30, 200, 30);
        add(titleLabel);
    }
}
