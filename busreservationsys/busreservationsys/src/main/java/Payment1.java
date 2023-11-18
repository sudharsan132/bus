/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cool
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Payment1 extends JFrame {

    private JPanel contentPane;
    private JLabel lblPayment;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton btnPay;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Payment1 frame = new Payment1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Payment1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblPayment = new JLabel("Payment");
        lblPayment.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPayment.setBounds(171, 11, 87, 20);
        contentPane.add(lblPayment);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(25, 56, 381, 141);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        btnPay = new JButton("Pay");
        btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the number of passengers and class selected
                int numPassengers = 0;
                String travelClassTextField = "";
                try (Scanner scanner = new Scanner(new File("route.txt"))) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(" ");
                        numPassengers = Integer.parseInt(parts[6]);
                        travelClassTextField = parts[7];
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // Calculate the total amount
                double amount = 0;
                if (travelClassTextField.equals("AC")) {
                    amount = numPassengers * 1000.0;
                } else {
                    amount = numPassengers * 500.0;
                }

                // Display the payment details in the text area
                String paymentDetails = "Number of Passengers: " + numPassengers + "\nClass: " + travelClassTextField
                        + "\nAmount: $" + amount;
                textArea.setText(paymentDetails);
            }
        });
        btnPay.setBounds(171, 223, 89, 23);
        contentPane.add(btnPay);
    }
}
