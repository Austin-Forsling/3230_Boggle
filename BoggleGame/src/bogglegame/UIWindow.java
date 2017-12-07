/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglegame;

import javax.swing.JOptionPane;

/**
 *
 * @author austi
 */
public class UIWindow extends javax.swing.JFrame {

    Client parent;
    javax.swing.JButton[] fullBoard;

    /**
     * Creates new form NewJFrame
     *
     * @param inClient
     */
    public UIWindow(Client inClient) {
        parent = inClient;
        initComponents();
        fullBoard = new javax.swing.JButton[16];
        fullBoard[0] = bBoard0;
        fullBoard[1] = bBoard1;
        fullBoard[2] = bBoard2;
        fullBoard[3] = bBoard3;
        fullBoard[4] = bBoard4;
        fullBoard[5] = bBoard5;
        fullBoard[6] = bBoard6;
        fullBoard[7] = bBoard7;
        fullBoard[8] = bBoard8;
        fullBoard[9] = bBoard9;
        fullBoard[10] = bBoard10;
        fullBoard[11] = bBoard11;
        fullBoard[12] = bBoard12;
        fullBoard[13] = bBoard13;
        fullBoard[14] = bBoard14;
        fullBoard[15] = bBoard15;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        chatWindow = new javax.swing.JTextArea();
        chatTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        guessedWordsWindow = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        guessWindow = new javax.swing.JTextArea();
        chatLabel = new javax.swing.JLabel();
        gameLabel = new javax.swing.JLabel();
        guessedLabel = new javax.swing.JLabel();
        guessingLabel = new javax.swing.JLabel();
        sendGuessButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        bBoard0 = new javax.swing.JButton();
        bBoard1 = new javax.swing.JButton();
        bBoard2 = new javax.swing.JButton();
        bBoard3 = new javax.swing.JButton();
        bBoard4 = new javax.swing.JButton();
        bBoard5 = new javax.swing.JButton();
        bBoard6 = new javax.swing.JButton();
        bBoard7 = new javax.swing.JButton();
        bBoard8 = new javax.swing.JButton();
        bBoard9 = new javax.swing.JButton();
        bBoard10 = new javax.swing.JButton();
        bBoard11 = new javax.swing.JButton();
        bBoard12 = new javax.swing.JButton();
        bBoard13 = new javax.swing.JButton();
        bBoard14 = new javax.swing.JButton();
        bBoard15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chatWindow.setColumns(20);
        chatWindow.setRows(5);
        chatWindow.setEditable(false);
        jScrollPane2.setViewportView(chatWindow);

        chatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Send Chat");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        guessedWordsWindow.setColumns(20);
        guessedWordsWindow.setRows(5);
        guessedWordsWindow.setEditable(false);
        jScrollPane3.setViewportView(guessedWordsWindow);

        guessWindow.setColumns(20);
        guessWindow.setRows(5);
        guessWindow.setEditable(false);
        jScrollPane4.setViewportView(guessWindow);

        chatLabel.setText("Chat");

        gameLabel.setText("Boggle");

        guessedLabel.setText("Guessed Words");

        guessingLabel.setText("Your Guess");

        sendGuessButton.setText("Send Guess");
        sendGuessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendGuessButtonActionPerformed(evt);
            }
        });

        playButton.setText("PLAY");
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        bBoard0.setFocusable(false);
        bBoard0.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard0.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard0.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard1.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard1.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard1.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard2.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard2.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard2.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard3.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard3.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard3.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard4.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard4.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard4.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard5.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard5.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard5.setPreferredSize(new java.awt.Dimension(80, 60));
        bBoard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoard5ActionPerformed(evt);
            }
        });

        bBoard6.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard6.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard6.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard7.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard7.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard7.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard8.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard8.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard8.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard9.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard9.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard9.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard10.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard10.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard10.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard11.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard11.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard11.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard12.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard12.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard12.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard13.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard13.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard13.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard14.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard14.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard14.setPreferredSize(new java.awt.Dimension(80, 60));

        bBoard15.setMaximumSize(new java.awt.Dimension(80, 60));
        bBoard15.setMinimumSize(new java.awt.Dimension(80, 60));
        bBoard15.setPreferredSize(new java.awt.Dimension(80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBoard12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(bBoard13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(bBoard14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(bBoard15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bBoard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bBoard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bBoard8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bBoard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bBoard9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(bBoard11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(sendGuessButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(guessingLabel)
                                            .addComponent(guessedLabel))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameLabel)
                    .addComponent(guessedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bBoard0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bBoard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bBoard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bBoard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBoard8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBoard12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBoard15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chatLabel)
                    .addComponent(guessingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendGuessButton))
                    .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chatTextFieldActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        parent.sendPlay();
    }//GEN-LAST:event_playButtonActionPerformed

    private void sendGuessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendGuessButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendGuessButtonActionPerformed

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        chatTextField.selectAll();
        String inputString = chatTextField.getSelectedText();
        parent.sendChat(inputString);
        chatTextField.setText(null);
    }//GEN-LAST:event_jButton1MouseClicked

    private void bBoard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoard5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBoard5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBoard0;
    private javax.swing.JButton bBoard1;
    private javax.swing.JButton bBoard10;
    private javax.swing.JButton bBoard11;
    private javax.swing.JButton bBoard12;
    private javax.swing.JButton bBoard13;
    private javax.swing.JButton bBoard14;
    private javax.swing.JButton bBoard15;
    private javax.swing.JButton bBoard2;
    private javax.swing.JButton bBoard3;
    private javax.swing.JButton bBoard4;
    private javax.swing.JButton bBoard5;
    private javax.swing.JButton bBoard6;
    private javax.swing.JButton bBoard7;
    private javax.swing.JButton bBoard8;
    private javax.swing.JButton bBoard9;
    private javax.swing.JLabel chatLabel;
    private javax.swing.JTextField chatTextField;
    private javax.swing.JTextArea chatWindow;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JTextArea guessWindow;
    private javax.swing.JLabel guessedLabel;
    private javax.swing.JTextArea guessedWordsWindow;
    private javax.swing.JLabel guessingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton playButton;
    private javax.swing.JButton sendGuessButton;
    // End of variables declaration//GEN-END:variables

    void couldNotConnect() {
        // TODO: Make new window saying "server can't be reached", close UI on close.
    }

    String getLogin() {
        String login = JOptionPane.showInputDialog("Please select a username:");
        return login;
    }

    String retryLogin() {
        String login = JOptionPane.showInputDialog("Username unavailable, please try again:");
        return login;
    }

    void updateChat(String username, String chatMessage) {
        chatWindow.append(username + ": " + chatMessage + "\n");
    }
    
    void writeBoard(char[] charArray){
        for(int i = 0; i < charArray.length; i++){
            fullBoard[i].setText(Character.toString(charArray[i]));
        }
    }
}
