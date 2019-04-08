/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;

import alfredstateinventory.AlfredStateInventory;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.imageio.*;
import javax.swing.BorderFactory;
import javax.swing.border.*;
import java.awt.event.*;

/**
 *
 * @author BHAsus
 */
public class PanelHome extends javax.swing.JPanel {
    private int scrollPanelY = 0;

    /**
     * Creates new form Home
     */
    public PanelHome() {
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

        imgLogo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        lytScrollView = new javax.swing.JScrollPane();
        pnlScrollPanel = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnQuery = new javax.swing.JButton();
        btnNewItem = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(2147483647, 200));
        setName(""); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/SmallBanner.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(imgLogo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(filler4, gridBagConstraints);

        lytScrollView.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        lytScrollView.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        lytScrollView.setAutoscrolls(true);
        lytScrollView.setMaximumSize(new java.awt.Dimension(32767, 800));
        lytScrollView.setName(""); // NOI18N
        lytScrollView.setPreferredSize(new java.awt.Dimension(500, 300));

        pnlScrollPanel.setMaximumSize(new java.awt.Dimension(500, 500));
        pnlScrollPanel.setLayout(new java.awt.GridBagLayout());
        lytScrollView.setViewportView(pnlScrollPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1;
        add(lytScrollView, gridBagConstraints);

        btnRefresh.setBackground(java.awt.SystemColor.control);
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/RefreshIcon.png"))); // NOI18N
        btnRefresh.setBorder(null);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        add(btnRefresh, gridBagConstraints);

        btnQuery.setBackground(java.awt.SystemColor.control);
        btnQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/SearchIcon.png"))); // NOI18N
        btnQuery.setBorder(null);
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        add(btnQuery, gridBagConstraints);

        btnNewItem.setBackground(java.awt.SystemColor.control);
        btnNewItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/PlusIcon.png"))); // NOI18N
        btnNewItem.setBorder(null);
        btnNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        add(btnNewItem, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewItemActionPerformed
        AlfredStateInventory.switchLayout("PanelEdit");
    }//GEN-LAST:event_btnNewItemActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        AlfredStateInventory.switchLayout("PanelHome");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
        AlfredStateInventory.switchLayout("PanelQuery");
    }//GEN-LAST:event_btnQueryActionPerformed

    /**
     * Description: Creates an inventory item view, populates it, and adds it
     * to the scroll view using proper grid bag constraints
     * @param itemId
     * @param itemName
     * @param available
     * @param lastSeen
     * @param location
     */
    public void populateScrollView(String itemId, String itemName, Boolean available, String lastSeen, String location) {
        ViewItemEquipment inventoryItem = new ViewItemEquipment();
        inventoryItem.populateItemView(itemId, itemName, available, lastSeen, location);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = scrollPanelY;
        pnlScrollPanel.add(inventoryItem, gbc);
        scrollPanelY++;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewItem;
    private javax.swing.JButton btnQuery;
    private javax.swing.JButton btnRefresh;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane lytScrollView;
    private javax.swing.JPanel pnlScrollPanel;
    // End of variables declaration//GEN-END:variables

}
