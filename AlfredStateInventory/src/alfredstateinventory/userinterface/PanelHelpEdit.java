/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;

/**
 *
 * @author BHAsus
 */
public class PanelHelpEdit extends javax.swing.JPanel {

    /**
     * Creates new form PanelHelpQuery
     */
    public PanelHelpEdit() {
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

        jLabel5 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTextArea6 = new javax.swing.JTextArea();

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Figures Listed");
        jLabel5.setToolTipText("");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(java.awt.SystemColor.control);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(7);
        jTextArea2.setText("Fig. 1: Log-out button\nFig. 2: Export QR button, requires admin login\nFig. 3: New Item button, requires admin login\nFig. 4: Refresh button\nFig. 5: Search button\nFig. 6: View Item buttons\nFig. 7: Field selector checkboxes");
        jTextArea2.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Logging Out");
        jLabel6.setToolTipText("");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(java.awt.SystemColor.control);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(2);
        jTextArea3.setText("To log out, simply click the Log-out button (Fig. 1) in the top right corner of the home screen. This will take you to a screen allowing you to either login as a guest, or login as an admin given the proper credentials.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);

        setMinimumSize(new java.awt.Dimension(500, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(366, 1100));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Navigating the Edit Screen");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pictured: Annotated Edit Screen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel3, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfredstateinventory/drawable/HelpCenter_Edit.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(jLabel2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Figures Listed");
        jLabel7.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(jLabel7, gridBagConstraints);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(java.awt.SystemColor.control);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(1);
        jTextArea4.setText("Fig. 1: Delete button");
        jTextArea4.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jTextArea4, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Editing");
        jLabel8.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(jLabel8, gridBagConstraints);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(java.awt.SystemColor.control);
        jTextArea5.setColumns(2);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(7);
        jTextArea5.setTabSize(2);
        jTextArea5.setText("In order to edit an item, you simply change the fields as you desire and hit submit. To return home without saving any changes, simply hit Home. If you do not follow the formatting rules listed for each date (yyyy-mm-dd, eg: 2019-01-31 for January 31st 2019) then an error message may be generated and displayed. Besides enforced and explicitly listed standards, company standards should be refered to when editing or creating fields. ");
        jTextArea5.setToolTipText("");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(jTextArea5, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Deletion");
        jLabel9.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(jLabel9, gridBagConstraints);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(java.awt.SystemColor.control);
        jTextArea6.setColumns(2);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(2);
        jTextArea6.setTabSize(2);
        jTextArea6.setText("To delete an item, simply click the Delete button (Fig. 1). If it succeeds, you will be redirected to the homescreen. Otherwise, you will be given an error message detailing what has happened.");
        jTextArea6.setToolTipText("");
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setBorder(null);
        jTextArea6.setPreferredSize(new java.awt.Dimension(200, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(jTextArea6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
