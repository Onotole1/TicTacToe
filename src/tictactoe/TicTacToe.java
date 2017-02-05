/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author anatoliy
 */
public class TicTacToe extends javax.swing.JFrame {
   
    public static class AsciiCodes {
        public static final int TIC = 79;
        public static final int TAC = 88;
        public static final String DEFAULT = "Ваш ход";
        public static final String STANDOFF = "Ничья";
    }
    
    int[][][] field = new int[3][3][1];
    ArrayList<Integer> ticTac;
    Object gameStatus;
    
    static enum STATUS {
        STARTED,
        FINISHED,
        CHECKED,
    }

    
    
    public TicTacToe() {
        initComponents();
        InitGameTable();
        ticTac = new ArrayList<>();
        ticTac.add(AsciiCodes.TIC);
        ticTac.add(AsciiCodes.TAC);
        gameStatus = jComboBox1.getSelectedItem();
    }
    
    private void InitGameTable() {
       for (int x = 0; x < 3; x++) {
           for (int y = 0; y < 3; y++) {
               field[x][y][0] = 0;
           }
       }
       enableFieldViews();
    }
    
    private void enableFieldViews() {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    
    private void disableFieldViews() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(94, 94));
        jButton1.setMinimumSize(new java.awt.Dimension(94, 94));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton7.setFocusPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton8.setFocusPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton9.setFocusPainted(false);
        jButton9.setPreferredSize(new java.awt.Dimension(94, 94));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ваш ход");

        jButton10.setText("Заново");
        jButton10.setFocusPainted(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Крестики", "Нолики"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (this.jButton1.isEnabled()) {
            gameStep(0, 0, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (this.jButton2.isEnabled()) {
            gameStep(0, 1, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (this.jButton3.isEnabled()) {
            gameStep(0, 2, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (this.jButton4.isEnabled()) {
            gameStep(1, 0, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (this.jButton5.isEnabled()) {
            gameStep(1, 1, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (this.jButton6.isEnabled()) {
            gameStep(1, 2, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (this.jButton7.isEnabled()) {
            gameStep(2, 0, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (this.jButton8.isEnabled()) {
            gameStep(2, 1, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (this.jButton9.isEnabled()) {
            gameStep(2, 2, ticTac.get(1));
            compStep();
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if (!jComboBox1.getSelectedItem().equals(gameStatus)) {
            Collections.reverse(ticTac);
            System.out.println("Reverse");
            System.out.println(ticTac.get(0));
            System.out.println(ticTac.get(1));
            //startAgain(true);
            gameStatus = jComboBox1.getSelectedItem();
        }
        else {
            System.out.println("No reverse");
            System.out.println(ticTac.get(0));
            System.out.println(ticTac.get(1));
            //startAgain(false);
        }
        if (ticTac.get(0) == AsciiCodes.TIC)
            startAgain(false);
        else
            startAgain(true);
    }//GEN-LAST:event_jButton10MouseClicked

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe().setVisible(true);
        });
    }
    
    private void gameStep(int x, int y, int our) {
        if (x == 0 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton1.setText("" + (char)our);
                jButton1.setEnabled(false);
            }
            if (x == 0 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton2.setText("" + (char)our);
                jButton2.setEnabled(false);
            }
            if (x == 0 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton3.setText("" + (char)our);
                jButton3.setEnabled(false);
            }
            if (x == 1 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton4.setText("" + (char)our);
                jButton4.setEnabled(false);
            }
            if (x == 1 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton5.setText("" + (char)our);
                jButton5.setEnabled(false);
            }
            if (x == 1 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton6.setText("" + (char)our);
                jButton6.setEnabled(false);
            }
            if (x == 2 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton7.setText("" + (char)our);
                jButton7.setEnabled(false);
            }
            if (x == 2 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton8.setText("" + (char)our);
                jButton8.setEnabled(false);
            }
            if (x == 2 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = our;
                jButton9.setText("" + (char)our);
                jButton9.setEnabled(false);
            }
            if (checkWinner() == STATUS.FINISHED)
                disableFieldViews();
            if (checkForStandOff() == STATUS.FINISHED)
                jLabel1.setText(AsciiCodes.STANDOFF);
    }
    
    void compStep() {
        if (checkRowsForNoLose(ticTac.get(1), ticTac.get(0)) != STATUS.STARTED) {
        } else if (checkColumnsForNoLose(ticTac.get(1), ticTac.get(0)) != STATUS.STARTED) {
        } else if (checkDiagonalsForNoLose(ticTac.get(1), ticTac.get(0)) != STATUS.STARTED) {
        } else if (checkRowsForStepToWin(ticTac.get(0)) != STATUS.STARTED) {
        } else if (checkColumnsForStepToWin(ticTac.get(0)) != STATUS.STARTED) {
        } else if (checkDiagonalsForStepToWin(ticTac.get(0)) != STATUS.STARTED) {
        } else if (stepUp(ticTac.get(0)) != STATUS.STARTED) {
        }
    }
    
    STATUS checkWinner() {
        int win = 0;
        win += checkRowsForWin(ticTac.get(0));
        win += checkColumnsForWin(ticTac.get(0));
        win += checkDiagonalsForWin(ticTac.get(0));
        win += checkRowsForWin(ticTac.get(1));
        win += checkColumnsForWin(ticTac.get(1));
        win += checkDiagonalsForWin(ticTac.get(1));
        if (win == AsciiCodes.TAC*3) {
            jLabel1.setText("Выиграли крестики");
            return STATUS.FINISHED;
        }
        else if (win == AsciiCodes.TIC*3) {
            jLabel1.setText("Выиграли нолики");
            return STATUS.FINISHED;
        }
        return STATUS.STARTED;
    }
    
    STATUS stepUp(int our) {
        if (field[1][1][0] == 0) {
            gameStep(1, 1, our);
            return STATUS.CHECKED;
        }
        for (int i = 0; i < 2; i+=2) {
            for (int j = 0; j < 2; j+=2) {
                if (field[i][j][0] == 0) {
                    gameStep(i, j, our);
                    return STATUS.CHECKED;
                }
            }
        }
        if (field[0][1][0] == 0) {
            gameStep(0, 1, our);
            return STATUS.CHECKED;
        }
        else if (field[1][2][0] == 0) {
            gameStep(1, 2, our);
            return STATUS.CHECKED;
        }
        else if (field[2][1][0] == 0) {
            gameStep(2, 1, our);
            return STATUS.CHECKED;
        }
        else if (field[1][0][0] == 0) {
            gameStep(1, 0, our);
            return STATUS.CHECKED;
        }
        return STATUS.STARTED;
    }
    
    private STATUS checkRowsForNoLose(int their, int our) {
    for (int i = 0; i < 3; i++) {
        if (field[i][0][0] + field[i][1][0] == their*2 && field[i][2][0] == 0) {
            gameStep(i, 2, our);
            return STATUS.CHECKED;
        }
        else if (field[i][2][0] + field[i][1][0] == their*2 && field[i][0][0] == 0) {
            gameStep(i, 0, our);
            return STATUS.CHECKED;
        }
        else if (field[i][0][0] + field[i][2][0] == their*2 && field[i][1][0] == 0) {
            gameStep(i, 1, our);
            return STATUS.CHECKED;
        }
    }
    return STATUS.STARTED;
}
    
    private STATUS checkColumnsForNoLose(int their, int our) {
    for (int i = 0; i < 3; i++) {
        if (field[0][i][0] + field[1][i][0] == their*2 && field[2][i][0] == 0) {
            gameStep(2, i, our);
            return STATUS.CHECKED;
        }
        else if (field[0][i][0] + field[2][i][0] == their*2 && field[1][i][0] == 0) {
            gameStep(1, i, our);
            return STATUS.CHECKED;
        }
        else if (field[1][i][0] + field[2][i][0] == their*2 && field[0][i][0] == 0) {
            gameStep(0, i, our);
            return STATUS.CHECKED;
        }
    }
    return STATUS.STARTED;
}
    
    private STATUS checkDiagonalsForNoLose(int their, int our) {
    if (field[0][0][0] + field[1][1][0] == their*2 && field[2][2][0] == 0) {
        gameStep(2, 2, our);
        return STATUS.CHECKED;
    }
    else if (field[2][2][0] + field[1][1][0] == their*2 && field[0][0][0] == 0) {
        gameStep(0, 0, our);
        return STATUS.CHECKED;
    }
    else if (field[2][2][0] + field[0][0][0] == their*2 && field[1][1][0] == 0) {
        gameStep(1, 1, our);
        return STATUS.CHECKED;
    }
    else if (field[2][0][0] + field[1][1][0] == their*2 && field[0][2][0] == 0) {
        gameStep(0, 2, our);
        return STATUS.CHECKED;
    }
    else if (field[1][1][0] + field[0][2][0] == their*2 && field[2][0][0] == 0) {
        gameStep(2, 0, our);
        return STATUS.CHECKED;
    }
    else if (field[2][0][0] + field[0][2][0] == their*2 && field[1][1][0] == 0) {
        gameStep(1, 1, our);
        return STATUS.CHECKED;
    }
    return STATUS.STARTED;
}
    
    private STATUS checkRowsForStepToWin(int our) {
    for (int i = 0; i < 3; i++) {
        if (field[i][0][0] + field[i][1][0] == our*2 && field[i][2][0] == 0) {
            gameStep(i, 2, our);
            return STATUS.CHECKED;
        }
        else if (field[i][2][0] + field[i][1][0] == our*2 && field[i][0][0] == 0) {
            gameStep(i, 0, our);
            return STATUS.CHECKED;
        }
        else if (field[i][0][0] + field[i][2][0] == our*2 && field[i][1][0] == 0) {
            gameStep(i, 1, our);
            return STATUS.CHECKED;
        }
    }
    return STATUS.STARTED;
}
    
    private STATUS checkColumnsForStepToWin(int our) {
    for (int i = 0; i < 3; i++) {
        if (field[0][i][0] + field[1][i][0] == our*2 && field[2][i][0] == 0) {
            gameStep(i, 2, our);
            return STATUS.CHECKED;
        }
        else if (field[0][i][0] + field[2][i][0] == our*2 && field[1][i][0] == 0) {
            gameStep(1, i, our);
            return STATUS.CHECKED;
        }
        else if (field[1][i][0] + field[2][i][0] == our*2 && field[0][i][0] == 0) {
            gameStep(0, i, our);
            return STATUS.CHECKED;
        }
    }
    return STATUS.STARTED;
}
    
    private STATUS checkDiagonalsForStepToWin(int our) {
    if (field[0][0][0] + field[1][1][0] == our*2 && field[2][2][0] == 0) {
        gameStep(2, 2, our);
        return STATUS.CHECKED;
    }
    else if (field[2][2][0] + field[1][1][0] == our*2 && field[0][0][0] == 0) {
        gameStep(0, 0, our);
        return STATUS.CHECKED;
    }
    else if (field[2][2][0] + field[0][0][0] == our*2 && field[1][1][0] == 0) {
        gameStep(1, 1, our);
        return STATUS.CHECKED;
    }
    return STATUS.STARTED;
}
    
private int checkRowsForWin(int value) {
    for (int i = 0; i < 3; i++) {
        if (field[i][0][0] + field[i][1][0] + field[i][2][0] == value*3) {
            return value*3;
        }
    }
    return 0;
}

private int checkColumnsForWin(int value) {
    for (int i = 0; i < 3; i++) {
        if (field[0][i][0] + field[1][i][0] + field[2][i][0] == value*3) {
            return value*3;
        }
    }
    return 0;
}

private int checkDiagonalsForWin(int value) {
    if (field[0][0][0] + field[1][1][0] + field[2][2][0] == value*3 || 
            field[0][2][0] + field[1][1][0] + field[2][0][0] == value*3)
        return value*3;
    else
        return 0;
}

private STATUS checkForStandOff() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (field[i][j][0] == 0)
                return STATUS.STARTED;
        }
    }
    return STATUS.FINISHED;
}

private void deleteStep(int x, int y) {
        if (x == 0 && y == 0) {
                field[x][y][0] = 0;
                jButton1.setText("");
            }
            if (x == 0 && y == 1) {
                field[x][y][0] = 0;
                jButton2.setText("");
            }
            if (x == 0 && y == 2) {
                field[x][y][0] = 0;
                jButton3.setText("");
            }
            if (x == 1 && y == 0) {
                field[x][y][0] = 0;
                jButton4.setText("");
            }
            if (x == 1 && y == 1) {
                field[x][y][0] = 0;
                jButton5.setText("");
            }
            if (x == 1 && y == 2) {
                field[x][y][0] = 0;
                jButton6.setText("");
            }
            if (x == 2 && y == 0) {
                field[x][y][0] = 0;
                jButton7.setText("");
            }
            if (x == 2 && y == 1) {
                field[x][y][0] = 0;
                jButton8.setText("");
            }
            if (x == 2 && y == 2) {
                field[x][y][0] = 0;
                jButton9.setText("");
            }
    }

void startAgain(boolean isCompX) {
    enableFieldViews();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            deleteStep(i, j);
        }
    }
    if (isCompX)
        compStep();
    jLabel1.setText(AsciiCodes.DEFAULT);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}