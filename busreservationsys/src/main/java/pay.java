
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class pay extends javax.swing.JFrame {
private Connection connection;
    /**
     * Creates new form pay
     */
    public pay() {
        initComponents();
        connection=dbcon.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cust = new javax.swing.JTextField();
        cardno = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 100, -1));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel1.setText("ENTER  CARD INFORMATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, -1, -1));
        jPanel2.add(cust, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 133, 244, -1));
        jPanel2.add(cardno, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 203, 242, -1));
        jPanel2.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 273, 71, -1));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setText("Card Holder Name -");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 132, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setText("Enter Card Number -");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 202, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setText("cvv -");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 272, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setText("Expiry Date -");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 272, -1, -1));
        jPanel2.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 273, 127, -1));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 510, 120));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setText("Enter The amount:");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 76, 160, 30));

        amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtActionPerformed(evt);
            }
        });
        jPanel2.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 240, -1));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
       new welcome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String amount=amt.getText().toString();
        String cardh=cust.getText().toString();
        String cardn=cardno.getText().toString();
        String cvvs=cvv.getText().toString();
        String expd=exp.getText().toString();
        if(amount.equals(""))
        {
            JOptionPane.showMessageDialog(null," AMOUNT IS MANDATORY.");
        }
        else if(!amount.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"AMOUNT ONLY CONTAINS NUMERIC CHARACTERS.");
        }
        if(cardh.equals(""))
        {
            JOptionPane.showMessageDialog(null," CARD HOLDER NAME IS MANDATORY.");
        }
        else if(!cardh.matches("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null,"CARD HOLDER NAME ONLY CONTAINS ALPHABETIC CHARACTERS.");
        }
        if(cardn.equals("")&&cardn.length()!=16)
        {
            JOptionPane.showMessageDialog(null,"CARD NUMBER IS MANDATORY AND ONLY 16 NUMBERS.");
        }
        else if(!cardn.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"CARD NUMBER ONLY CONTAINS NUMERIC CHARACTERS.");
        }
        
        if(expd.equals(""))
        {
            JOptionPane.showMessageDialog(null,"EXPIRY DATE IS MANDATORY.");
        }
        if(cvvs.equals(""))
        {
            JOptionPane.showMessageDialog(null,"CVV NUMBER IS MANDATORY.");
        }
        else if(!(cvvs.matches("[0-9]+")&&cvvs.length()==3))
        {
            JOptionPane.showMessageDialog(null,"CVV NUMBERS ONLY CONTAINS NUMBERS & 3 NUMBERS ONLY.");
        }
        else{
        try{
                            String query = "INSERT INTO pay(amount,holdername , cardno,cvv,expdate) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, amount);
            preparedStatement.setString(2, cardh);
            preparedStatement.setString(3, cardn);
            preparedStatement.setString(4, cvvs);
            preparedStatement.setString(5, expd);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

          
        } catch (SQLException e) {
            e.printStackTrace();
        }
         JOptionPane.showMessageDialog(null,"PAYMENT SUCCESSFULLY PAID");
        new welcome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    private void amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        amt.setText(null);
        cust.setText(null);
        cardno.setText(null);
        cvv.setText(null);
        exp.setText(null);
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardno;
    private javax.swing.JTextField cust;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField exp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
