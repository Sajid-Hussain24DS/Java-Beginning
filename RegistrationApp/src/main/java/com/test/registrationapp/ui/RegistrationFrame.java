package com.test.registrationapp.ui;

import com.test.registrationapp.dao.UserDAO;
import com.test.registrationapp.model.User;

import javax.swing.*;
import java.awt.*;

public class RegistrationFrame extends JFrame {

    private JTextField nameField, emailField, phoneField;
    private JRadioButton maleButton, femaleButton;
    private JTextArea addressTextArea;
    private JButton submitButton;

    public RegistrationFrame() {
        setTitle("User Registration Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400); // Window size
        setLocationRelativeTo(null); // Center window

        // Main panel with padding
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 1: Name
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        nameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        // Row 2: Email
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Email:"), gbc);
        emailField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(emailField, gbc);

        // Row 3: Phone
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Phone:"), gbc);
        phoneField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(phoneField, gbc);

        // Row 4: Gender
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Gender:"), gbc);
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        gbc.gridx = 1;
        panel.add(genderPanel, gbc);

        // Row 5: Address
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Address:"), gbc);
        addressTextArea = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(addressTextArea);
        gbc.gridx = 1;
        panel.add(scrollPane, gbc);

        // Row 6: Submit Button
        submitButton = new JButton("Submit");
        gbc.gridx = 1; gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        // Add panel to frame
        add(panel);

        // Button action
        submitButton.addActionListener(e -> handleSubmit());

        setVisible(true);
    }

    private void handleSubmit() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();
        String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
        String address = addressTextArea.getText().trim();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || gender.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        User user = new User(name, email, phone, gender, address);
        boolean success = UserDAO.insertUser(user);

        if (success) {
            JOptionPane.showMessageDialog(this, "User registered successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error registering user.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationFrame::new);
    }
}
