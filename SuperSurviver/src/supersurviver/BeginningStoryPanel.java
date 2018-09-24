//This java class is the beginning of the story until the Cabin in the Woods
package supersurviver;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BeginningStoryPanel extends javax.swing.JPanel {
    JFrameAS jFrame;
    
    private int intOptions = 0; //Counter for User button choices (rarely used)
    private int clickedNext = 0; //Counter for user clicks on the TextArea of Story
    private int addClicked = 0; //2nd Counter of clickedNext to help //might have not needed this counter
    private boolean check = false, intoWoods = false; //boolean values
    
    private ArrayList<String> listStory = new ArrayList<String>(); //Array list to store Story in String format
    
    //Method that contains the strings of the story in ArrayList format
    private void Story(){
        //The start of the story
        listStory.add("You have been stressed for quite some time now because you got a lot going on");
        listStory.add("You've decided to go on a drive to take your mind off of things");
        listStory.add("3 hours later . . .");
        listStory.add("You're still driving but you notice something is not right.");
        listStory.add("*Your car starts to breakdown*");
        listStory.add("You got out of the car and you have no idea where you are");
        //Queue FIRST options after 0-5. //6-8 are OPTIONS
        listStory.add("Your Phone has no signal");
        listStory.add("You waited but no one is in sight");
        listStory.add("Went into woods");
        //9-10 Woods story
        listStory.add("After walking for some time, you hear steps somewhere in front of you. But the path in front of you is blocked.");
        listStory.add("What do you do?");
        //11-13 SECOND options //13 Death Scene
        listStory.add("You walked back");
        listStory.add("You quickly dropped and hid in a bush");
        listStory.add("You yelled who's there?!");
        //14 continue story
        listStory.add("Quite some time after, you see it was just a squirrel");
        //15-19 FIREPLACE story
        listStory.add("You venture on continuing your march deeper into the woods hoping to find someone. Something.");
        listStory.add("While walking around for some time, you stumbled upon an unexpected fireplace.");
        listStory.add("You searched around and the first thing that caught your attention was a folded piece of paper.");
        listStory.add("You opened it and it barely was legible. . .");
        listStory.add("Your choice");
    }
    
    //Set options to be unviewable
    private void MakeOptFalse(){
        firstOption.setVisible(false);
        secondOption.setVisible(false);
        thirdOption.setVisible(false);
    }
  
    //Set options to be viewable
    private void MakeOptTrue(){
        firstOption.setVisible(true);
        secondOption.setVisible(true);
        thirdOption.setVisible(true);
    }
    
    //Set the text of the option buttons
    private void MakeOptions(){
        if(addClicked == 6){
            firstOption.setText("Check Phone");
            secondOption.setText("Go to Woods");
            thirdOption.setText("Wait for Help");
        }else if(addClicked == 11){
            firstOption.setText("Go Back");
            secondOption.setText("Hide");
            thirdOption.setText("Yell 'Who's there'");
        }else if(addClicked == 19){
            firstOption.setText("Leave woods");
            secondOption.setText("Venture on");
            thirdOption.setVisible(false);
        }
    }
    
    BufferedImage img;
    
    //Constructor to initialize stuff
    public BeginningStoryPanel(JFrameAS jframe) {
        initComponents();
        this.jFrame = jframe;
        
        Story();
        
        //To set the beginning of the story //This snippit of code was used when using a 2nd panel for User Choices. //Might have not needed this if statement anymore except to set the beginning (0).
        if(clickedNext > 0){
            txtStory.setText(listStory.get(clickedNext));
        }else{
            txtStory.setText(listStory.get(0));
        }
        
        MakeOptFalse();
        
        //A quick tip for first time Users
        if(clickedNext == 0){
            txtOfOptions.setVisible(true);
            txtOfOptions.setText("*TIP: Click the box of the story to continue.");
        }else{
            txtOfOptions.setVisible(false); 
        }
        
        try {
            img = ImageIO.read(new File("Images\\roadimg.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CabinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtStory = new javax.swing.JTextArea();
        txtOfOptions = new javax.swing.JTextField();
        firstOption = new javax.swing.JButton();
        secondOption = new javax.swing.JButton();
        thirdOption = new javax.swing.JButton();

        txtStory.setEditable(false);
        txtStory.setColumns(20);
        txtStory.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtStory.setLineWrap(true);
        txtStory.setRows(5);
        txtStory.setWrapStyleWord(true);
        txtStory.setAutoscrolls(false);
        txtStory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtStory);

        txtOfOptions.setEditable(false);
        txtOfOptions.setText("empty");
        txtOfOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfOptionsActionPerformed(evt);
            }
        });

        firstOption.setText("first");
        firstOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstOptionActionPerformed(evt);
            }
        });

        secondOption.setText("jButton1");
        secondOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondOptionActionPerformed(evt);
            }
        });

        thirdOption.setText("jButton1");
        thirdOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtOfOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(firstOption, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(secondOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdOption, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txtOfOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstOption, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirdOption, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secondOption, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStoryMouseClicked
        txtOfOptions.setVisible(false); 
        check = false; //reset so it won't keep going into else if statements
        
        //Stop to make choice for User in a certain amount of clicks from textArea (story)
        if (addClicked == 6 || addClicked == 11 || addClicked == 19){
            check = true;
            clickedNext = addClicked;
        }else if(addClicked == 17){
            txtOfOptions.setText("134v3");
            txtOfOptions.setVisible(true);
            MakeOptFalse();
        }
        
        //Continute on Story
        if(check == false){
            clickedNext++;
            addClicked = clickedNext;
            if(clickedNext <= 5){
                txtStory.setText(listStory.get(clickedNext));
            }else if((clickedNext >= 9 && clickedNext <=10) || (clickedNext >=14 && clickedNext <= 19)){
                txtStory.setText(listStory.get(clickedNext));
            }else if(addClicked == 12){
                txtStory.setText("Few minutes later you got bit by a venomous snake. \n You died. \n\n Click to replay scene");
                txtOfOptions.setText("You Died");
                txtOfOptions.setVisible(true);
                clickedNext = 8;
                addClicked = clickedNext;
                
            }else{
                check = true;
            }
        }else if(intoWoods == true){
            check = false;
            clickedNext = 9;
            addClicked = clickedNext;
            txtStory.setText(listStory.get(clickedNext));
            MakeOptFalse();
        }else if(intOptions == 3){
            check = false;
            clickedNext = 14;
            addClicked = clickedNext;
            txtStory.setText(listStory.get(clickedNext));
        }
     
        //Get the Choices for the User
        if(check == true){
            intoWoods = false;
            MakeOptTrue();
            MakeOptions();
            
        }
        intOptions = 0; //reset so it won't keep going into else if statements
        System.out.print(" " + addClicked + " CHECK: " + check);
        
    }//GEN-LAST:event_txtStoryMouseClicked

    private void txtOfOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfOptionsActionPerformed
        //empty
    }//GEN-LAST:event_txtOfOptionsActionPerformed

    
    //Second User choice button
    private void secondOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondOptionActionPerformed
        if(addClicked == 6){
            intoWoods = true;

            txtOfOptions.setText("WENT INTO WOODS");
            txtOfOptions.setVisible(true);

            txtStory.setText(listStory.get(8));
            
        }else if(addClicked == 11){
            txtOfOptions.setText("You Hid");
            txtOfOptions.setVisible(true);
            txtStory.setText(listStory.get(12));
            addClicked = 12;
        }else if(addClicked == 19){
            intOptions = 7;
            txtOfOptions.setText(":]");
            txtOfOptions.setVisible(true);
            txtStory.setText("You continued on.");
            
            //Saleh's Panel goes here
            CabinPanel begPan = new CabinPanel(jFrame);
            jFrame.remove(this);
            begPan.setVisible(false);
            jFrame.add(begPan);
            jFrame.validate();
            jFrame.repaint();
            begPan.setBackground(Color.white);
            begPan.setSize(jFrame.getWidth() - 20, jFrame.getHeight() - 50);   
            begPan.setVisible(true);
        }
        MakeOptFalse();
    }//GEN-LAST:event_secondOptionActionPerformed

    
    //First User choice button
    private void firstOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstOptionActionPerformed
        if(addClicked == 6){
            txtOfOptions.setText("CHECKED PHONE");
            txtOfOptions.setVisible(true);
            txtStory.setText(listStory.get(6));
        }else if(addClicked == 11){
            txtOfOptions.setText("Walked back");
            txtOfOptions.setVisible(true);
            txtStory.setText(listStory.get(11));
            addClicked = 6;
        }else if(addClicked == 19){
            txtOfOptions.setText("Try Again.");
            txtOfOptions.setVisible(true);
            txtStory.setText("You tried to leave, but you are lost");
        }
        MakeOptFalse();
    }//GEN-LAST:event_firstOptionActionPerformed

    
    //Third User choice button
    private void thirdOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdOptionActionPerformed
        if(addClicked == 6){
            txtOfOptions.setText("WAITED FOR HELP");
            txtOfOptions.setVisible(true);
            txtStory.setText(listStory.get(7));
        }else if(addClicked == 11){
            intOptions = 3;
            txtOfOptions.setText("Yelled");
            txtOfOptions.setVisible(true);
            txtStory.setText(listStory.get(13));
        }
        MakeOptFalse();
    }//GEN-LAST:event_thirdOptionActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton firstOption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton secondOption;
    private javax.swing.JButton thirdOption;
    private javax.swing.JTextField txtOfOptions;
    private javax.swing.JTextArea txtStory;
    // End of variables declaration//GEN-END:variables
}
