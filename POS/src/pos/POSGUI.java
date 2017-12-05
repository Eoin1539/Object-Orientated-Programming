/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 *  POSGUI.java
 * 
 *  Rev 2
 *
 *  02/12/2017

 * @author Eoin Kirwan, x16472486
 *
 */

public class POSGUI extends javax.swing.JFrame {

    /**
     * Creates new form POSGUI
     */
    public POSGUI() {
        initComponents();
        this.getContentPane().setBackground(Color.gray);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxOfficeBtn = new javax.swing.JButton();
        barBtn = new javax.swing.JButton();
        myButton = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        boxOfficeBtn.setBackground(new java.awt.Color(51, 255, 255));
        boxOfficeBtn.setFont(new java.awt.Font("PT Sans Caption", 1, 36)); // NOI18N
        boxOfficeBtn.setForeground(new java.awt.Color(255, 255, 255));
        boxOfficeBtn.setText("Box Office");
        boxOfficeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOfficeBtnActionPerformed(evt);
            }
        });

        barBtn.setBackground(new java.awt.Color(51, 255, 255));
        barBtn.setFont(new java.awt.Font("PT Sans Caption", 1, 36)); // NOI18N
        barBtn.setForeground(new java.awt.Color(255, 255, 255));
        barBtn.setText("Bar");
        barBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barBtnActionPerformed(evt);
            }
        });

        myButton.setBackground(new java.awt.Color(0, 255, 255));
        myButton.setFont(new java.awt.Font("PT Sans Caption", 1, 36)); // NOI18N
        myButton.setForeground(new java.awt.Color(255, 255, 255));
        myButton.setText("Restaurant");
        myButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButtonActionPerformed(evt);
            }
        });

        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Created By Eoin Kirwan, Karl McSherry & Andrew McBride");

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\Year 2\\Semester 1\\Object Orientated Programming\\Project\\POS\\images\\Welcome.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(boxOfficeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(barBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(myButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxOfficeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(myButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(nameLbl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxOfficeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOfficeBtnActionPerformed
        try {
            // TODO add your handling code here:
            BOGUI myGUI3 = new BOGUI(); 
            myGUI3.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(POSGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boxOfficeBtnActionPerformed

    private void barBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barBtnActionPerformed
        // TODO add your handling code here:
         
          BarGUI myGUI1 = new BarGUI();
          myGUI1.setVisible(true); 
          
    }//GEN-LAST:event_barBtnActionPerformed

    private void myButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButtonActionPerformed
        // TODO add your handling code here:
        RestaurantGUI myGUI2 = new RestaurantGUI();
          myGUI2.setVisible(true); 
    }//GEN-LAST:event_myButtonActionPerformed

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
            java.util.logging.Logger.getLogger(POSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POSGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barBtn;
    private javax.swing.JButton boxOfficeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton myButton;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
