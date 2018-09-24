
package supersurviver;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 * @author tonyh
 */
public class MenuPanel extends javax.swing.JPanel {
    
    JFrameAS jFrame; 
    public MenuPanel(JFrameAS jframe) {
        initComponents();
        this.setVisible(true);

        this.jFrame = jframe;
    }
    
    //Draws the Title of the Game 'SuperSurvivor'
    private static Font monoFont = new Font("Copperplate Gothic Bold", Font.BOLD
      | Font.ITALIC, 70);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(monoFont);
        g.drawString("Super", 72, 50);
        g.drawLine(10, 75, 405, 75);
        g.setColor(Color.green);
        g.drawString("Survivor", 8, 92);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlay = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        btnPlay.setBackground(new java.awt.Color(0, 0, 0));
        btnPlay.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(118, 215, 196));
        btnPlay.setText("PLAY");
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.setMinimumSize(new java.awt.Dimension(113, 57));
        btnPlay.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(118, 215, 196));
        btnExit.setText("EXIT");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //Play Button
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        BeginningStoryPanel begPan = new BeginningStoryPanel(jFrame);
        jFrame.remove(this);
        begPan.setVisible(false);
        jFrame.add(begPan);
        jFrame.validate();
        jFrame.repaint();
        begPan.setBackground(Color.white);
        begPan.setSize(jFrame.getWidth() - 20, jFrame.getHeight() - 50);   
        begPan.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exit
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlay;
    // End of variables declaration//GEN-END:variables
}
