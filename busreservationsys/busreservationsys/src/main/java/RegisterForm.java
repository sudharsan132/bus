/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cool
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegisterForm extends javax.swing.JFrame {
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton registerButton;

    public RegisterForm() {
        initComponents();
    }

    private void initComponents() {
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");

        javax.swing.JLabel nameLabel = new javax.swing.JLabel();
        nameLabel.setText("Name:");

        javax.swing.JLabel passwordLabel = new javax.swing.JLabel();
        passwordLabel.setText("Password:");

        javax.swing.JLabel emailLabel = new javax.swing.JLabel();
        emailLabel.setText("Email:");

        javax.swing.JLabel phoneLabel = new javax.swing.JLabel();
        phoneLabel.setText("Phone:");

        registerButton.setText("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField)
                    .addComponent(passwordField)
                    .addComponent(emailField)
                    .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }

    private void registerUser() {
        String name = nameField.getText();
        String password = new String(passwordField.getPassword());
        String email = emailField.getText();
        String phone = phoneField.getText();

    // Write user's information to a text file
    try {
        FileWriter fw = new FileWriter("users.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + "," + password + "," + email + "," + phone);
            bw.newLine();
            bw.close();
            fw.close();
        
         login  l = new login();
        l.setVisible(true);
        this.dispose();
    } catch (IOException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}

private void clearFields() {
    nameField.setText("");
    passwordField.setText("");
    emailField.setText("");
    phoneField.setText("");
}

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new RegisterForm().setVisible(true);
        }
    });
}
}
