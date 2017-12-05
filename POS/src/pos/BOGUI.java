/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 *  BOGUI.java
 * 
 *  Rev 3
 *
 *  02/12/2017

 * @author Karl McSherry, x16401714
 * @design Eoin Kirwan, x16472486  
 *
 */

public class BOGUI extends javax.swing.JFrame {

    int section;
    String stand;
    String seatOutput;
    int seat;
    double totalPrice;
    double individualPrice;
    int quantity;
    int stdASec1;
    int stdASec2;
    int stdASec3;
    int stdBSec1;
    int stdBSec2;
    int stdBSec3;
    int stdCSec1;
    int stdCSec2;
    int stdCSec3;
    private final String EURO;
    String seatString;
    StringBuffer strBuff;

    /**
     *
     * @throws IOException
     */
    public BOGUI() throws IOException {
        section = 0;
        stand = "";
        seatOutput = "";
        totalPrice = 0;
        individualPrice = 0;
        quantity = 0;
        EURO = "\u20AC";

        strBuff = new StringBuffer();
        initComponents();
    }
    DecimalFormat df = new DecimalFormat("#.##");

    public void calculatePrice() {
        switch (section) {
            case 1:
                individualPrice = 80.50;
                totalPrice = individualPrice * quantity;
                break;
            case 2:
                individualPrice = 62.20;
                totalPrice = individualPrice * quantity;
                break;
            default:
                individualPrice = 37.50;
                totalPrice = individualPrice * quantity;
                break;
        }
    }

    public void allocateSeats() {
        strBuff.delete(0, strBuff.length());
        switch (stand) {
            case "A":
                switch (section) {
                    case 1:
                        if ((stdASec1 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdASec1 + 1);
                                stdASec1++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 2:
                        if ((stdASec2 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdASec2 + 1);
                                stdASec2++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 3:
                        if ((stdASec3 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdASec3 + 1);
                                stdASec3++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;
                }
                break;

            case "B":
                switch (section) {
                    case 1:
                        if ((stdBSec1 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdBSec1 + 1);
                                stdBSec1++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 2:
                        if ((stdBSec2 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdBSec2 + 1);
                                stdBSec2++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 3:
                        if ((stdBSec3 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdBSec3 + 1);
                                stdBSec3++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;
                }
                break;

            case "C":
                switch (section) {
                    case 1:
                        if ((stdCSec1 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdCSec1 + 1);
                                stdCSec1++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 2:
                        if ((stdCSec2 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdCSec2 + 1);
                                stdASec2++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;

                    case 3:
                        if ((stdCSec3 + quantity) > 100) {
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                        } else {
                            for (int i = 0; i < quantity; i++) {
                                seat = (stdCSec3 + 1);
                                stdCSec3++;
                                strBuff.append(seat);
                                strBuff.append(" ");
                            }
                            seatOutput = strBuff.toString();
                        }
                        break;
                }
                break;

        }
    }

    public void writeFile() throws IOException {
        try {
            File outFile = new File("BoxOffice.txt");
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(stdASec1));
            bw.newLine();
            bw.write(String.valueOf(stdASec2));
            bw.newLine();
            bw.write(String.valueOf(stdASec3));
            bw.newLine();
            bw.write(String.valueOf(stdBSec1));
            bw.newLine();
            bw.write(String.valueOf(stdBSec2));
            bw.newLine();
            bw.write(String.valueOf(stdBSec3));
            bw.newLine();
            bw.write(String.valueOf(stdCSec1));
            bw.newLine();
            bw.write(String.valueOf(stdCSec2));
            bw.newLine();
            bw.write(String.valueOf(stdCSec3));

            bw.close();
            System.out.println("Saved to file successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file:" + e);
        }

    }

    /**
     *
     * @throws IOException
     */
    public void readFile() throws IOException {
        try {
            File inFile = new File("BoxOffice.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);

            String[] ticketsSold = new String[100];
            String line = "";
            int i = 0;
            while (line != null) {
                line = br.readLine();
                ticketsSold[i] = line;
                i = i + 1;
            }
            br.close();
            stdASec1 = Integer.parseInt(ticketsSold[0]);
            stdASec2 = Integer.parseInt(ticketsSold[1]);
            stdASec3 = Integer.parseInt(ticketsSold[2]);
            stdBSec1 = Integer.parseInt(ticketsSold[3]);
            stdBSec2 = Integer.parseInt(ticketsSold[4]);
            stdBSec3 = Integer.parseInt(ticketsSold[5]);
            stdCSec1 = Integer.parseInt(ticketsSold[6]);
            stdCSec2 = Integer.parseInt(ticketsSold[7]);
            stdCSec3 = Integer.parseInt(ticketsSold[8]);

            System.out.println(stdASec1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sorry, there was an error reading from the file, please try closing and opening the application again " + e);

        }

    }

    public void clearData() {
        stdASec1 = 0;
        stdASec2 = 0;
        stdASec3 = 0;
        stdBSec1 = 0;
        stdBSec2 = 0;
        stdBSec3 = 0;
        stdCSec1 = 0;
        stdCSec2 = 0;
        stdCSec3 = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOLbl = new javax.swing.JLabel();
        standLbl = new javax.swing.JLabel();
        sectionLbl = new javax.swing.JLabel();
        quantityLbl = new javax.swing.JLabel();
        pricePerTicketLbl = new javax.swing.JLabel();
        pricePerTicketOutLbl = new javax.swing.JLabel();
        seatsLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        priceOutLbl = new javax.swing.JLabel();
        seatsOutLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        standCB = new javax.swing.JComboBox<>();
        sectionCB = new javax.swing.JComboBox<>();
        quantityCB = new javax.swing.JComboBox<>();
        computeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BOLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BOLbl.setIcon(new javax.swing.ImageIcon("H:\\Year 2\\Semester 1\\Object Orientated Programming\\Project\\POS\\images\\Box Office.png")); // NOI18N

        standLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        standLbl.setText("Stand:");

        sectionLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        sectionLbl.setText("Section:");

        quantityLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        quantityLbl.setText("Quantity:");

        pricePerTicketLbl.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        pricePerTicketLbl.setText("Price per ticket:");

        pricePerTicketOutLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        pricePerTicketOutLbl.setText("€ 0.00");

        seatsLbl.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        seatsLbl.setText("Seats:");

        priceLbl.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        priceLbl.setText("Price:");

        priceOutLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        priceOutLbl.setText("€ 0.00");

        seatsOutLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        clearBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        clearBtn.setText("Clear");

        standCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        standCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standCBActionPerformed(evt);
            }
        });

        sectionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        quantityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        computeBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        computeBtn.setText("Get tickets");
        computeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(pricePerTicketLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pricePerTicketOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(standLbl)
                                    .addComponent(sectionLbl)
                                    .addComponent(quantityLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sectionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(standCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(computeBtn)
                                    .addComponent(priceLbl)
                                    .addComponent(seatsLbl))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seatsOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(clearBtn)))))
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BOLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOLbl)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standLbl))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionLbl))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityLbl)
                    .addComponent(quantityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricePerTicketLbl)
                    .addComponent(pricePerTicketOutLbl))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(priceOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatsLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatsOutLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(computeBtn))
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standCBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_standCBActionPerformed

    private void computeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeBtnActionPerformed
        // TODO add your handling code here:
         stand = standCB.getSelectedItem() + "";
         section = Integer.valueOf((String)sectionCB.getSelectedItem());
         quantity =  Integer.valueOf((String)quantityCB.getSelectedItem());

        calculatePrice();
        allocateSeats();
        pricePerTicketOutLbl.setText(EURO + " " + String.valueOf(df.format(individualPrice)));
        priceOutLbl.setText(EURO + " " + String.valueOf(df.format(totalPrice)));
        seatsOutLbl.setText(seatOutput);
        
        try {
            writeFile();
        } catch (IOException ex) {
            Logger.getLogger(BOGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_computeBtnActionPerformed
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
            try {
                new BOGUI().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(BOGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOLbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton computeBtn;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel priceOutLbl;
    private javax.swing.JLabel pricePerTicketLbl;
    private javax.swing.JLabel pricePerTicketOutLbl;
    private javax.swing.JComboBox<String> quantityCB;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JLabel seatsLbl;
    private javax.swing.JLabel seatsOutLbl;
    private javax.swing.JComboBox<String> sectionCB;
    private javax.swing.JLabel sectionLbl;
    private javax.swing.JComboBox<String> standCB;
    private javax.swing.JLabel standLbl;
    // End of variables declaration//GEN-END:variables
}
