/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package realestate;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class KeyInformationTab extends javax.swing.JPanel {
    public String status;
    public String price;
    public String bedrooms;
    public String baths;
    public String area;
    public String block;
    public String subdivisionName;
    
    /**
     * Creates new form KeyInformationTab
     */
    public KeyInformationTab() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        underConstructionButton = new javax.swing.JToggleButton();
        proposedButton = new javax.swing.JToggleButton();
        completeButton = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        bedroomsField = new javax.swing.JTextField();
        bathsField = new javax.swing.JTextField();
        areaField = new javax.swing.JTextField();
        blockField = new javax.swing.JTextField();
        subdivisionField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 217, 185), 5, true));
        setPreferredSize(new java.awt.Dimension(804, 864));

        jPanel1.setBackground(new java.awt.Color(239, 241, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(804, 864));

        jLabel1.setFont(new java.awt.Font("Lato", 1, 25)); // NOI18N
        jLabel1.setText("Key Information");

        jLabel2.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel3.setText("Baths");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel4.setText("Price(PHP)");

        jLabel5.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel5.setText("Bedrooms");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Create a compelling listing, showcasing your property's features, amenities, and");

        buttonGroup1.add(underConstructionButton);
        underConstructionButton.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        underConstructionButton.setForeground(new java.awt.Color(102, 255, 255));
        underConstructionButton.setText("Under Construction");
        underConstructionButton.setBorderPainted(false);
        underConstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underConstructionButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(proposedButton);
        proposedButton.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        proposedButton.setForeground(new java.awt.Color(102, 255, 255));
        proposedButton.setText("Proposed");

        buttonGroup1.add(completeButton);
        completeButton.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        completeButton.setForeground(new java.awt.Color(102, 255, 255));
        completeButton.setText("Complete");

        jLabel7.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel7.setText("Area");

        jLabel8.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel8.setText("Block and Lot/Unit/Floor Number");

        jLabel9.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel9.setText("Subdivision Name");

        jLabel10.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("prime location to attract interested buyers.");

        priceField.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        priceField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        priceField.setText("0.00");
        priceField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        bedroomsField.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        bedroomsField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        bedroomsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedroomsFieldActionPerformed(evt);
            }
        });

        bathsField.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        bathsField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        bathsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathsFieldActionPerformed(evt);
            }
        });

        areaField.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        areaField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        areaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaFieldActionPerformed(evt);
            }
        });

        blockField.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        blockField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        blockField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockFieldActionPerformed(evt);
            }
        });

        subdivisionField.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        subdivisionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 103, 105), 2, true));
        subdivisionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subdivisionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bathsField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addComponent(subdivisionField))))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(underConstructionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(proposedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(blockField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(bedroomsField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(underConstructionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proposedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedroomsField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bathsField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blockField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subdivisionField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void underConstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underConstructionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_underConstructionButtonActionPerformed

    private void bedroomsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedroomsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedroomsFieldActionPerformed

    private void bathsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathsFieldActionPerformed

    private void areaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaFieldActionPerformed

    private void blockFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockFieldActionPerformed

    private void subdivisionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subdivisionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subdivisionFieldActionPerformed
    public String getStatus(){
        
        if ((underConstructionButton.isSelected())){
            status = "Under Construction";
        }else if ((proposedButton.isSelected())){
            status = "Proposed";
        }else if ((completeButton.isSelected())){
            status = "Complete";
        }else {
            status = "null";
        }
        return status;
       
    }
    
    public String getPrice(){
        price = priceField.getText();
        return price;
    }
    
    public String getBedrooms(){
        bedrooms = bedroomsField.getText();
        return bedrooms;
    }
    
    public String getBaths(){
        baths = bathsField.getText();
        return baths;
    }
    
    public String getArea(){
        area = areaField.getText();
        return area;
    }
    public String getBlock(){
        block = blockField.getText();
        return block;
    }
    
    public String getSubdivisionName(){
        subdivisionName = subdivisionField.getText();
        return subdivisionName;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaField;
    private javax.swing.JTextField bathsField;
    private javax.swing.JTextField bedroomsField;
    private javax.swing.JTextField blockField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton completeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField priceField;
    private javax.swing.JToggleButton proposedButton;
    private javax.swing.JTextField subdivisionField;
    private javax.swing.JToggleButton underConstructionButton;
    // End of variables declaration//GEN-END:variables
}
