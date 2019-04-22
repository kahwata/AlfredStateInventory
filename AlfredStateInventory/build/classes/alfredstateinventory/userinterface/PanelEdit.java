/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;

import alfredstateinventory.java.*;
import alfredstateinventory.sql.*;
import com.google.zxing.WriterException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author BHAsus
 */
public class PanelEdit extends javax.swing.JPanel {

    private boolean newItem;

    /**
     * Creates new form PanelDetails
     */
    public PanelEdit(Boolean newItem) {
        this.newItem = newItem;
        initComponents();
        txtItemId.setEditable(false);
        if (newItem) {
            try {
                int id = SQLQueries.queryId();
                txtItemId.setText("" + id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Could not get ItemId for new item");
            }
        }
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

        lblItemName = new javax.swing.JLabel();
        lblItemAvailable = new javax.swing.JLabel();
        lblLastSeen = new javax.swing.JLabel();
        lblItemDescription = new javax.swing.JLabel();
        btnAvailable = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtItemDescription = new javax.swing.JTextArea();
        lblDateOfPurchase = new javax.swing.JLabel();
        lblSoftwareDates = new javax.swing.JLabel();
        lblVersionNumber = new javax.swing.JLabel();
        lblBuildDate = new javax.swing.JLabel();
        lblLifeExpectancy = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        txtItemId = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtSoftwareDates = new javax.swing.JTextField();
        txtLastSeen = new javax.swing.JTextField();
        txtDateOfPurchase = new javax.swing.JTextField();
        txtBuildDate = new javax.swing.JTextField();
        txtVersionNumber = new javax.swing.JTextField();
        txtLifeExpectancy = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        lblItemId1 = new javax.swing.JLabel();
        lblLSDFormat = new javax.swing.JLabel();
        lblPDFormat = new javax.swing.JLabel();
        lblSDFormat = new javax.swing.JLabel();
        lblBDFormat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(350, 700));
        setPreferredSize(new java.awt.Dimension(350, 700));
        setLayout(new java.awt.GridBagLayout());

        lblItemName.setText("Item Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemName, gridBagConstraints);

        lblItemAvailable.setText("Item Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        add(lblItemAvailable, gridBagConstraints);

        lblLastSeen.setText("Last Seen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLastSeen, gridBagConstraints);

        lblItemDescription.setText("Item Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemDescription, gridBagConstraints);

        btnAvailable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnAvailable.setText("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(btnAvailable, gridBagConstraints);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(150, 100));

        txtItemDescription.setColumns(20);
        txtItemDescription.setLineWrap(true);
        txtItemDescription.setRows(5);
        txtItemDescription.setWrapStyleWord(true);
        txtItemDescription.setBorder(null);
        jScrollPane1.setViewportView(txtItemDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        lblDateOfPurchase.setText("Date of Purchase");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblDateOfPurchase, gridBagConstraints);

        lblSoftwareDates.setText("Software Dates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblSoftwareDates, gridBagConstraints);

        lblVersionNumber.setText("Version Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblVersionNumber, gridBagConstraints);

        lblBuildDate.setText("Build Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblBuildDate, gridBagConstraints);

        lblLifeExpectancy.setText("Life Expectancy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLifeExpectancy, gridBagConstraints);

        lblLocation.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLocation, gridBagConstraints);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        add(btnSubmit, gridBagConstraints);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/SmallBanner.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
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

        txtItemId.setMinimumSize(new java.awt.Dimension(300, 20));
        txtItemId.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtItemId, gridBagConstraints);

        txtItemName.setMinimumSize(new java.awt.Dimension(100, 20));
        txtItemName.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtItemName, gridBagConstraints);

        txtSoftwareDates.setMinimumSize(new java.awt.Dimension(100, 20));
        txtSoftwareDates.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtSoftwareDates, gridBagConstraints);

        txtLastSeen.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLastSeen.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtLastSeen, gridBagConstraints);

        txtDateOfPurchase.setToolTipText("Format yyyy-");
        txtDateOfPurchase.setMinimumSize(new java.awt.Dimension(100, 20));
        txtDateOfPurchase.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtDateOfPurchase, gridBagConstraints);

        txtBuildDate.setMinimumSize(new java.awt.Dimension(100, 20));
        txtBuildDate.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtBuildDate, gridBagConstraints);

        txtVersionNumber.setMinimumSize(new java.awt.Dimension(100, 20));
        txtVersionNumber.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtVersionNumber, gridBagConstraints);

        txtLifeExpectancy.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLifeExpectancy.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtLifeExpectancy, gridBagConstraints);

        txtLocation.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLocation.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtLocation, gridBagConstraints);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(btnHome, gridBagConstraints);

        lblItemId1.setText("Item ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemId1, gridBagConstraints);

        lblLSDFormat.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblLSDFormat.setText("yyyy-mm-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblLSDFormat, gridBagConstraints);

        lblPDFormat.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblPDFormat.setText("yyyy-mm-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblPDFormat, gridBagConstraints);

        lblSDFormat.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblSDFormat.setText("yyyy-mm-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblSDFormat, gridBagConstraints);

        lblBDFormat.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblBDFormat.setText("yyyy-mm-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(lblBDFormat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 0);
        add(jPanel1, gridBagConstraints);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/TrashIcon.png"))); // NOI18N
        btnDelete.setText("Delete Item");
        btnDelete.setToolTipText("Remove this item");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        add(btnDelete, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        UserInterface.switchLayout(new Object[]{"PanelHome"});
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        InventoryItemBuilder itemBuilder = new InventoryItemBuilder(Integer.parseInt(txtItemId.getText()));
        itemBuilder.itemName(txtItemName.getText());
        itemBuilder.itemAvailable(btnAvailable.isSelected());
        
        try {
             itemBuilder.lastSeen(LocalDate.parse(txtLastSeen.getText()).plusDays(1));
        } catch (Exception e) {}
        
         try {
             itemBuilder.dateOfPurchase(LocalDate.parse(txtDateOfPurchase.getText()).plusDays(1));
        } catch (Exception e) {}
       
         try {
              itemBuilder.softwareDates(LocalDate.parse(txtSoftwareDates.getText()).plusDays(1));
        } catch (Exception e) {}
         
        try {
            itemBuilder.buildDate(LocalDate.parse(txtBuildDate.getText()).plusDays(1));
        } catch (Exception e) {}
        
         try {
            itemBuilder.lifeExpectancy(Integer.parseInt(txtLifeExpectancy.getText()));
        } catch (Exception e) {}
       
       
        itemBuilder.versionNum(txtVersionNumber.getText());
        itemBuilder.location(txtLocation.getText());
        itemBuilder.itemDescription(txtItemDescription.getText());
        
        InventoryItem item = itemBuilder.create();

        if (newItem) {
            if (SQLQueries.queryNew(item)) {
                UserInterface.switchLayout(new Object[]{"PanelHome"});
            }
        } else {
            if (SQLQueries.queryEdit(item)) {
                UserInterface.switchLayout(new Object[]{"PanelHome"});
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            SQLQueries.queryDelete(Integer.parseInt(txtItemId.getText()));
            UserInterface.switchLayout(new Object[]{"PanelHome"});
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Description: Populates all fields in current inventory item edit view
     *
     * @param itemId
     * @param itemName
     * @param available
     * @param lastSeen
     * @param dateOfPurchase
     * @param softwareDates
     * @param versionNum
     * @param buildDate
     * @param lifeExpectancy
     * @param location
     * @param description
     */
    public void populateEditView(InventoryItem item) {
        txtItemId.setText("" + item.getID());
        txtItemName.setText(item.getItemName());
        btnAvailable.setSelected(item.getItemAvailable());
        txtLastSeen.setText(item.getLastSeen().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtDateOfPurchase.setText(item.getDateOfPurchase().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtSoftwareDates.setText(item.getSoftwareDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtVersionNumber.setText(item.getVersionNum());
        txtBuildDate.setText(item.getBuildDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtLifeExpectancy.setText("" + item.getLifeExpectancy());
        txtLocation.setText(item.getLocation());
        txtItemDescription.setText(item.getItemDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnAvailable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBDFormat;
    private javax.swing.JLabel lblBuildDate;
    private javax.swing.JLabel lblDateOfPurchase;
    private javax.swing.JLabel lblItemAvailable;
    private javax.swing.JLabel lblItemDescription;
    private javax.swing.JLabel lblItemId1;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblLSDFormat;
    private javax.swing.JLabel lblLastSeen;
    private javax.swing.JLabel lblLifeExpectancy;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPDFormat;
    private javax.swing.JLabel lblSDFormat;
    private javax.swing.JLabel lblSoftwareDates;
    private javax.swing.JLabel lblVersionNumber;
    private javax.swing.JTextField txtBuildDate;
    private javax.swing.JTextField txtDateOfPurchase;
    private javax.swing.JTextArea txtItemDescription;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtLastSeen;
    private javax.swing.JTextField txtLifeExpectancy;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSoftwareDates;
    private javax.swing.JTextField txtVersionNumber;
    // End of variables declaration//GEN-END:variables
}
