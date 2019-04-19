/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;

import alfredstateinventory.java.*;
import alfredstateinventory.sql.SQLQueries;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author BHAsus
 */
public class PanelQuery extends javax.swing.JPanel {
    private boolean interactedWithAvailable = false;

    /**
     * Creates new form PanelDetails
     */
    public PanelQuery() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblItemName = new javax.swing.JLabel();
        lblItemAvailable = new javax.swing.JLabel();
        lblLastSeen = new javax.swing.JLabel();
        lblItemDescription = new javax.swing.JLabel();
        btnNotAvailable = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtItemDescription = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        lblDateOfPurchase = new javax.swing.JLabel();
        lblSoftwareDates = new javax.swing.JLabel();
        lblVersionNumber = new javax.swing.JLabel();
        lblBuildDate = new javax.swing.JLabel();
        lblLifeExpectancy = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        lblItemId = new javax.swing.JLabel();
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
        btnStrictSearch = new javax.swing.JCheckBox();
        lblStrictSearch = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        btnAvailable = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        lblItemName.setText("Item Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblItemName, gridBagConstraints);

        lblItemAvailable.setText("Item Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        add(lblItemAvailable, gridBagConstraints);

        lblLastSeen.setText("Last Seen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblLastSeen, gridBagConstraints);

        lblItemDescription.setText("Item Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblItemDescription, gridBagConstraints);

        btnNotAvailable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnNotAvailable.setText("Not Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(btnNotAvailable, gridBagConstraints);

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
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(filler1, gridBagConstraints);

        lblDateOfPurchase.setText("Date of Purchase");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblDateOfPurchase, gridBagConstraints);

        lblSoftwareDates.setText("Software Dates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblSoftwareDates, gridBagConstraints);

        lblVersionNumber.setText("Version Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblVersionNumber, gridBagConstraints);

        lblBuildDate.setText("Build Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblBuildDate, gridBagConstraints);

        lblLifeExpectancy.setText("Life Expectancy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblLifeExpectancy, gridBagConstraints);

        lblLocation.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblLocation, gridBagConstraints);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        add(btnSearch, gridBagConstraints);

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

        lblItemId.setText("Item ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(lblItemId, gridBagConstraints);

        txtItemId.setMinimumSize(new java.awt.Dimension(100, 20));
        txtItemId.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtItemId, gridBagConstraints);

        txtItemName.setMinimumSize(new java.awt.Dimension(100, 20));
        txtItemName.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtItemName, gridBagConstraints);

        txtSoftwareDates.setMinimumSize(new java.awt.Dimension(100, 20));
        txtSoftwareDates.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtSoftwareDates, gridBagConstraints);

        txtLastSeen.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLastSeen.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtLastSeen, gridBagConstraints);

        txtDateOfPurchase.setMinimumSize(new java.awt.Dimension(100, 20));
        txtDateOfPurchase.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtDateOfPurchase, gridBagConstraints);

        txtBuildDate.setMinimumSize(new java.awt.Dimension(100, 20));
        txtBuildDate.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtBuildDate, gridBagConstraints);

        txtVersionNumber.setMinimumSize(new java.awt.Dimension(100, 20));
        txtVersionNumber.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtVersionNumber, gridBagConstraints);

        txtLifeExpectancy.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLifeExpectancy.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(txtLifeExpectancy, gridBagConstraints);

        txtLocation.setMinimumSize(new java.awt.Dimension(100, 20));
        txtLocation.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(txtLocation, gridBagConstraints);

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

        btnStrictSearch.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnStrictSearch.setText("Strict Search On");
        btnStrictSearch.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(btnStrictSearch, gridBagConstraints);

        lblStrictSearch.setText("Strict Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lblStrictSearch, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        add(filler2, gridBagConstraints);

        btnAvailable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnAvailable.setText("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(btnAvailable, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        UserInterface.switchLayout("PanelHome");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<String> query = new ArrayList<>();
        query.add(txtItemId.getText());
        query.add(txtItemName.getText());
        
        if (btnNotAvailable.isSelected() == btnAvailable.isSelected())
             query.add("");
        else if (btnAvailable.isSelected())
            query.add(Boolean.toString(btnAvailable.isSelected()));
        else if (btnNotAvailable.isSelected())
            query.add(Boolean.toString(false));
           
        query.add(txtLastSeen.getText());
        query.add(txtDateOfPurchase.getText());
        query.add(txtSoftwareDates.getText());
        query.add(txtVersionNumber.getText());
        query.add(txtBuildDate.getText());
        query.add(txtLifeExpectancy.getText());
        query.add(txtLocation.getText());
        query.add(txtItemDescription.getText());
      
        ArrayList<InventoryItem> inventory = new ArrayList<>(); 
        SQLQueries sql = new SQLQueries();
        inventory = sql.querySearch(query, btnStrictSearch.isSelected());
        UserInterface.displayInventory(inventory);
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnAvailable;
    private javax.swing.JButton btnHome;
    private javax.swing.JCheckBox btnNotAvailable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox btnStrictSearch;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuildDate;
    private javax.swing.JLabel lblDateOfPurchase;
    private javax.swing.JLabel lblItemAvailable;
    private javax.swing.JLabel lblItemDescription;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblLastSeen;
    private javax.swing.JLabel lblLifeExpectancy;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblSoftwareDates;
    private javax.swing.JLabel lblStrictSearch;
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
