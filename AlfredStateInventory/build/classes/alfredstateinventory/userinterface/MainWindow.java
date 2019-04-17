/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author BHAsus
 */
public class MainWindow extends javax.swing.JFrame {
    private JPanel lastPane;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        lastPane = new JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alfred State Inventory");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public  void addPanel(JPanel panel) {
         GridBagConstraints gbc = new GridBagConstraints();
         getContentPane().remove(lastPane);
         getContentPane().invalidate();
         getContentPane().validate();
         getContentPane().add(panel, gbc);
         pack();
         setVisible(true);
         lastPane = panel;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
