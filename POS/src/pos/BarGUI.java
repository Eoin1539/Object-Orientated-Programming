/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author x16472486
 */
public class BarGUI extends javax.swing.JFrame {

    /**
     * Creates new form BarGUI
     */
    public BarGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barLbl = new javax.swing.JLabel();
        beerLbl = new javax.swing.JLabel();
        ciderLbl = new javax.swing.JLabel();
        heinekenBtn = new javax.swing.JButton();
        orchardBtn = new javax.swing.JButton();
        guinnessLbl = new javax.swing.JButton();
        carlsbergLbl = new javax.swing.JButton();
        bulmersBtn = new javax.swing.JButton();
        kopparbergBtn = new javax.swing.JButton();
        rumBtn = new javax.swing.JButton();
        spiritsLbl = new javax.swing.JLabel();
        foodLbl = new javax.swing.JLabel();
        vodkaBtn = new javax.swing.JButton();
        ginBtn = new javax.swing.JButton();
        whiskeyBtn = new javax.swing.JButton();
        tequilaBtn = new javax.swing.JButton();
        wineLbl = new javax.swing.JLabel();
        fantaBtn = new javax.swing.JButton();
        whiteBtn = new javax.swing.JButton();
        redBtn = new javax.swing.JButton();
        softLbl = new javax.swing.JLabel();
        cokeBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        spriteBtn = new javax.swing.JButton();
        dietcBtn = new javax.swing.JButton();
        pepsiBtn = new javax.swing.JButton();
        burgerBtn = new javax.swing.JButton();
        hotdBtn = new javax.swing.JButton();
        chipsBtn = new javax.swing.JButton();
        tcostLbl = new javax.swing.JLabel();
        tcostTF = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        amountTF = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        barLbl.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        barLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barLbl.setText("Bar");

        beerLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        beerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beerLbl.setText("Beer");

        ciderLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        ciderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciderLbl.setText("Cider");

        heinekenBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        heinekenBtn.setText("Heineken");
        heinekenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heinekenBtnActionPerformed(evt);
            }
        });

        orchardBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        orchardBtn.setText("Orchard Thieves");
        orchardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orchardBtnActionPerformed(evt);
            }
        });

        guinnessLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guinnessLbl.setText("Guinness");
        guinnessLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guinnessLblActionPerformed(evt);
            }
        });

        carlsbergLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        carlsbergLbl.setText("Carlsberg");
        carlsbergLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carlsbergLblActionPerformed(evt);
            }
        });

        bulmersBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bulmersBtn.setText("Bulmers");
        bulmersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulmersBtnActionPerformed(evt);
            }
        });

        kopparbergBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kopparbergBtn.setText("Kopparberg");
        kopparbergBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopparbergBtnActionPerformed(evt);
            }
        });

        rumBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rumBtn.setText("Rum");
        rumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rumBtnActionPerformed(evt);
            }
        });

        spiritsLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        spiritsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spiritsLbl.setText("Spirits");

        foodLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        foodLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodLbl.setText("Food");

        vodkaBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vodkaBtn.setText("Vodka");
        vodkaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vodkaBtnActionPerformed(evt);
            }
        });

        ginBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ginBtn.setText("Gin");
        ginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ginBtnActionPerformed(evt);
            }
        });

        whiskeyBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        whiskeyBtn.setText("Whiskey");
        whiskeyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiskeyBtnActionPerformed(evt);
            }
        });

        tequilaBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tequilaBtn.setText("Tequila");
        tequilaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tequilaBtnActionPerformed(evt);
            }
        });

        wineLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        wineLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wineLbl.setText("Wine");

        fantaBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fantaBtn.setText("Fanta");
        fantaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaBtnActionPerformed(evt);
            }
        });

        whiteBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        whiteBtn.setText("White wine");
        whiteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteBtnActionPerformed(evt);
            }
        });

        redBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        redBtn.setText("Red wine");
        redBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBtnActionPerformed(evt);
            }
        });

        softLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        softLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        softLbl.setText("Soft Drinks");

        cokeBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cokeBtn.setText("Coke");
        cokeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeBtnActionPerformed(evt);
            }
        });

        changeBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeBtn.setText("Calculate Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        spriteBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spriteBtn.setText("Sprite");
        spriteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteBtnActionPerformed(evt);
            }
        });

        dietcBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dietcBtn.setText("Diet Coke");
        dietcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietcBtnActionPerformed(evt);
            }
        });

        pepsiBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pepsiBtn.setText("Pepsi");
        pepsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiBtnActionPerformed(evt);
            }
        });

        burgerBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        burgerBtn.setText("Burger");
        burgerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerBtnActionPerformed(evt);
            }
        });

        hotdBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hotdBtn.setText("Hot Dog");
        hotdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotdBtnActionPerformed(evt);
            }
        });

        chipsBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chipsBtn.setText("Chips");
        chipsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsBtnActionPerformed(evt);
            }
        });

        tcostLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tcostLbl.setText("Total Cost:");

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        amountTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amountTF.setText("Enter amount");

        amountLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        amountLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLbl.setText("Amount given:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(beerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(redBtn)
                                .addGap(159, 159, 159)
                                .addComponent(whiteBtn))
                            .addComponent(whiskeyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(heinekenBtn)
                                .addComponent(orchardBtn)
                                .addComponent(vodkaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(burgerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fantaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dietcBtn)))
                                .addGap(82, 82, 82)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(guinnessLbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bulmersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tequilaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(364, 364, 364))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pepsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                        .addComponent(hotdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(161, 161, 161)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kopparbergBtn)
                                    .addComponent(carlsbergLbl)
                                    .addComponent(ginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(chipsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52))))))
            .addComponent(foodLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(softLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wineLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(spiritsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ciderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tcostLbl)
                        .addGap(15, 15, 15)
                        .addComponent(tcostTF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(changeBtn)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLbl))))
                .addGap(28, 28, 28)
                .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(barLbl)
                        .addGap(50, 50, 50)
                        .addComponent(beerLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heinekenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guinnessLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carlsbergLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addComponent(ciderLbl)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orchardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulmersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kopparbergBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(spiritsLbl)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vodkaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiskeyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tequilaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(wineLbl)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(softLbl)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dietcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(foodLbl)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcostTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcostLbl))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heinekenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heinekenBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heinekenBtnActionPerformed

    private void orchardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orchardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orchardBtnActionPerformed

    private void guinnessLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guinnessLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guinnessLblActionPerformed

    private void carlsbergLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carlsbergLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carlsbergLblActionPerformed

    private void bulmersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulmersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulmersBtnActionPerformed

    private void kopparbergBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopparbergBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kopparbergBtnActionPerformed

    private void rumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rumBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rumBtnActionPerformed

    private void vodkaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vodkaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vodkaBtnActionPerformed

    private void ginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ginBtnActionPerformed

    private void whiskeyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiskeyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiskeyBtnActionPerformed

    private void tequilaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tequilaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tequilaBtnActionPerformed

    private void fantaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fantaBtnActionPerformed

    private void whiteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteBtnActionPerformed

    private void redBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redBtnActionPerformed

    private void cokeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeBtnActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeBtnActionPerformed

    private void spriteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spriteBtnActionPerformed

    private void dietcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietcBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietcBtnActionPerformed

    private void pepsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pepsiBtnActionPerformed

    private void burgerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerBtnActionPerformed

    private void hotdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotdBtnActionPerformed

    private void chipsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTF;
    private javax.swing.JLabel barLbl;
    private javax.swing.JLabel beerLbl;
    private javax.swing.JButton bulmersBtn;
    private javax.swing.JButton burgerBtn;
    private javax.swing.JButton carlsbergLbl;
    private javax.swing.JButton changeBtn;
    private javax.swing.JButton chipsBtn;
    private javax.swing.JLabel ciderLbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cokeBtn;
    private javax.swing.JButton dietcBtn;
    private javax.swing.JButton fantaBtn;
    private javax.swing.JLabel foodLbl;
    private javax.swing.JButton ginBtn;
    private javax.swing.JButton guinnessLbl;
    private javax.swing.JButton heinekenBtn;
    private javax.swing.JButton hotdBtn;
    private javax.swing.JButton kopparbergBtn;
    private javax.swing.JButton orchardBtn;
    private javax.swing.JButton pepsiBtn;
    private javax.swing.JButton redBtn;
    private javax.swing.JButton rumBtn;
    private javax.swing.JLabel softLbl;
    private javax.swing.JLabel spiritsLbl;
    private javax.swing.JButton spriteBtn;
    private javax.swing.JLabel tcostLbl;
    private javax.swing.JTextField tcostTF;
    private javax.swing.JButton tequilaBtn;
    private javax.swing.JButton vodkaBtn;
    private javax.swing.JButton whiskeyBtn;
    private javax.swing.JButton whiteBtn;
    private javax.swing.JLabel wineLbl;
    // End of variables declaration//GEN-END:variables
}
