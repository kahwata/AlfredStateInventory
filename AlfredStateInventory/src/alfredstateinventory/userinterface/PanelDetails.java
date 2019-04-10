/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;
import alfredstateinventory.java.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author BHAsus
 */
public class PanelDetails extends javax.swing.JPanel {

    /**
     * Creates new form PanelDetails
     */
    public PanelDetails() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        lblItemNameTitle = new javax.swing.JLabel();
        lblItemAvailableTitle = new javax.swing.JLabel();
        lblLastSeenTitle = new javax.swing.JLabel();
        lblItemDescriptionTitle = new javax.swing.JLabel();
        lblItemId = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        btnAvailable = new javax.swing.JCheckBox();
        lblLastSeen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblItemDescription = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        lblDateOfPurchaseTitle = new javax.swing.JLabel();
        lblDateOfPurchase = new javax.swing.JLabel();
        lblSoftwareDates = new javax.swing.JLabel();
        lblSoftwareDatesTitle = new javax.swing.JLabel();
        lblVersionNumber = new javax.swing.JLabel();
        lblVersionNumberTitle = new javax.swing.JLabel();
        lblBuildDate = new javax.swing.JLabel();
        lblBuildDateTitle = new javax.swing.JLabel();
        lblLifeExpectancy = new javax.swing.JLabel();
        lblLifeExpectancyTitle = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblLocationTitle = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        lblItemIdTitle = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        lblItemNameTitle.setText("Item Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemNameTitle, gridBagConstraints);

        lblItemAvailableTitle.setText("Item Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        add(lblItemAvailableTitle, gridBagConstraints);

        lblLastSeenTitle.setText("Last Seen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLastSeenTitle, gridBagConstraints);

        lblItemDescriptionTitle.setText("Item Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemDescriptionTitle, gridBagConstraints);

        lblItemId.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblItemId, gridBagConstraints);

        lblItemName.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblItemName, gridBagConstraints);

        btnAvailable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnAvailable.setText("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(btnAvailable, gridBagConstraints);

        lblLastSeen.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblLastSeen, gridBagConstraints);

        jScrollPane1.setAutoscrolls(true);

        lblItemDescription.setEditable(false);
        lblItemDescription.setBackground(new java.awt.Color(238, 238, 238));
        lblItemDescription.setColumns(20);
        lblItemDescription.setLineWrap(true);
        lblItemDescription.setRows(5);
        lblItemDescription.setWrapStyleWord(true);
        lblItemDescription.setBorder(null);
        jScrollPane1.setViewportView(lblItemDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 22;
        add(filler1, gridBagConstraints);

        lblDateOfPurchaseTitle.setText("Date of Purchase");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblDateOfPurchaseTitle, gridBagConstraints);

        lblDateOfPurchase.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblDateOfPurchase, gridBagConstraints);

        lblSoftwareDates.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblSoftwareDates, gridBagConstraints);

        lblSoftwareDatesTitle.setText("Software Dates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblSoftwareDatesTitle, gridBagConstraints);

        lblVersionNumber.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblVersionNumber, gridBagConstraints);

        lblVersionNumberTitle.setText("Version Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblVersionNumberTitle, gridBagConstraints);

        lblBuildDate.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblBuildDate, gridBagConstraints);

        lblBuildDateTitle.setText("Build Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblBuildDateTitle, gridBagConstraints);

        lblLifeExpectancy.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblLifeExpectancy, gridBagConstraints);

        lblLifeExpectancyTitle.setText("Life Expectancy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLifeExpectancyTitle, gridBagConstraints);

        lblLocation.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblLocation, gridBagConstraints);

        lblLocationTitle.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLocationTitle, gridBagConstraints);

        btnEdit.setBackground(java.awt.SystemColor.control);
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/GearIcon.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        add(btnEdit, gridBagConstraints);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/SmallBanner.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(imgLogo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 25;
        add(filler7, gridBagConstraints);

        lblItemIdTitle.setText("Item ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemIdTitle, gridBagConstraints);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(btnHome, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        AlfredStateInventory.switchLayout("PanelEdit");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AlfredStateInventory.switchLayout("PanelHome");
    }//GEN-LAST:event_btnHomeActionPerformed

     /**
     * Description: Populates all fields in current inventory item view
     * @param item
     */
    public void populateDetailView(InventoryItem item) {
        lblItemId.setText("" + item.getID());
        lblItemName.setText(item.getItemName());
        btnAvailable.setSelected(item.getItemAvailable());
        lblLastSeen.setText(item.getLastSeen().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        lblDateOfPurchase.setText(item.getDateOfPurchase().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        lblSoftwareDates.setText(item.getSoftwareDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        lblVersionNumber.setText(item.getVersionNum());
        lblBuildDate.setText(item.getBuildDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        lblLifeExpectancy.setText("" + item.getLifeExpectancy());
        lblLocation.setText(item.getLocation());
        lblItemDescription.setText(item.getItemDescription());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnAvailable;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuildDate;
    private javax.swing.JLabel lblBuildDateTitle;
    private javax.swing.JLabel lblDateOfPurchase;
    private javax.swing.JLabel lblDateOfPurchaseTitle;
    private javax.swing.JLabel lblItemAvailableTitle;
    private javax.swing.JTextArea lblItemDescription;
    private javax.swing.JLabel lblItemDescriptionTitle;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblItemIdTitle;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemNameTitle;
    private javax.swing.JLabel lblLastSeen;
    private javax.swing.JLabel lblLastSeenTitle;
    private javax.swing.JLabel lblLifeExpectancy;
    private javax.swing.JLabel lblLifeExpectancyTitle;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocationTitle;
    private javax.swing.JLabel lblSoftwareDates;
    private javax.swing.JLabel lblSoftwareDatesTitle;
    private javax.swing.JLabel lblVersionNumber;
    private javax.swing.JLabel lblVersionNumberTitle;
    // End of variables declaration//GEN-END:variables

}
