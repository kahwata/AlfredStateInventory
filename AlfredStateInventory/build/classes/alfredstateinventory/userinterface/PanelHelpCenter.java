/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;

import java.awt.GridBagConstraints;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.SwingUtilities;
/**
 *
 * @author BHAsus
 */
public class PanelHelpCenter extends javax.swing.JPanel {
    private javax.swing.JScrollPane scrlHelpTopic;
    /**
     * Creates new form PanelHelpCenter
     */
    public PanelHelpCenter() {
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
        lblTopics = new javax.swing.JLabel();
        pnlCurrentTopic = new javax.swing.JPanel();
        comboArticles = new javax.swing.JComboBox<>();
        pnlHelpTopic = new javax.swing.JPanel();
        lblTopics1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(1500, 1000));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(new java.awt.GridBagLayout());

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/SmallBanner.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(imgLogo, gridBagConstraints);

        lblTopics.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTopics.setText("Help Center");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(lblTopics, gridBagConstraints);

        pnlCurrentTopic.setAutoscrolls(true);
        pnlCurrentTopic.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(pnlCurrentTopic, gridBagConstraints);

        comboArticles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction", "Navigating the Home Screen", "Navigating the Search Screen", "Navigating the Detail Screen" }));
        comboArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArticlesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(comboArticles, gridBagConstraints);

        pnlHelpTopic.setMinimumSize(new java.awt.Dimension(1050, 850));
        pnlHelpTopic.setName(""); // NOI18N
        pnlHelpTopic.setPreferredSize(new java.awt.Dimension(1050, 850));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(pnlHelpTopic, gridBagConstraints);

        lblTopics1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTopics1.setText("Articles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(lblTopics1, gridBagConstraints);

        btnHome.setText("Return Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        add(btnHome, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void populateHelpArticle(String articleToView) {
        createScrollPanel();
      
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridy = 1;
          
        if (articleToView.isBlank() || articleToView.equals("Introduction")) {
            PanelHelpCenterDefault article = new PanelHelpCenterDefault();
            pnlCurrentTopic.add(article, gbc);
        } else if (articleToView.equals("Navigating the Home Screen")) {
            PanelHelpHome article = new PanelHelpHome();
            pnlCurrentTopic.add(article, gbc);
        } else if (articleToView.equals("Navigating the Search Screen")) {
            PanelHelpQuery article = new PanelHelpQuery();
            pnlCurrentTopic.add(article, gbc);
        } else if (articleToView.equals("Navigating the Detail Screen")) {
            PanelHelpDetail article = new PanelHelpDetail();
            pnlCurrentTopic.add(article, gbc);
        } 
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              scrlHelpTopic.getVerticalScrollBar().setValue(0);
              revalidate();
              repaint();
            }
        });
        
         
        scrlHelpTopic.repaint();
        this.repaint();
    }
    
    private void comboArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArticlesActionPerformed
        String chosenArticle = comboArticles.getSelectedItem().toString();
        UserInterface.switchLayout(new Object[]{"PanelHelpCenter", chosenArticle});
    }//GEN-LAST:event_comboArticlesActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        UserInterface.switchLayout(new Object[]{"PanelHome"});
    }//GEN-LAST:event_btnHomeActionPerformed

    
    private void createScrollPanel() {
        scrlHelpTopic = new javax.swing.JScrollPane();
        scrlHelpTopic.setAutoscrolls(true);
        scrlHelpTopic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrlHelpTopic.setMinimumSize(new java.awt.Dimension(1000, 800));
        scrlHelpTopic.setName(""); // NOI18N
        scrlHelpTopic.setPreferredSize(new java.awt.Dimension(1000, 800));
        scrlHelpTopic.setViewportBorder(null);
        scrlHelpTopic.setBorder(null);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        pnlHelpTopic.add(scrlHelpTopic);   
        scrlHelpTopic.setViewportView(pnlCurrentTopic);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JComboBox<String> comboArticles;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lblTopics;
    private javax.swing.JLabel lblTopics1;
    private javax.swing.JPanel pnlCurrentTopic;
    private javax.swing.JPanel pnlHelpTopic;
    // End of variables declaration//GEN-END:variables
}
