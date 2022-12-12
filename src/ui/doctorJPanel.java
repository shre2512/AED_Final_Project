/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.databaseConnection;

/**
 *
 * @author shrey
 */
public class doctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createDoctor
     */
    databaseConnection databaseConnection;
    String fullName;
    
    public doctorJPanel(databaseConnection databaseConnection, String fullName) {
        initComponents();
        this.databaseConnection = databaseConnection;
        this.fullName = fullName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorSplitPane = new javax.swing.JSplitPane();
        doctorControlArea = new javax.swing.JPanel();
        btnViewEncounters = new javax.swing.JButton();
        doctorWorkArea = new javax.swing.JPanel();

        doctorSplitPane.setDividerLocation(140);

        doctorControlArea.setBackground(new java.awt.Color(0, 51, 103));

        btnViewEncounters.setBackground(new java.awt.Color(51, 204, 255));
        btnViewEncounters.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnViewEncounters.setForeground(new java.awt.Color(0, 51, 103));
        btnViewEncounters.setText("Vital Signs");
        btnViewEncounters.setPreferredSize(new java.awt.Dimension(76, 30));
        btnViewEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncountersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorControlAreaLayout = new javax.swing.GroupLayout(doctorControlArea);
        doctorControlArea.setLayout(doctorControlAreaLayout);
        doctorControlAreaLayout.setHorizontalGroup(
            doctorControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewEncounters, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        doctorControlAreaLayout.setVerticalGroup(
            doctorControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorControlAreaLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(btnViewEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );

        doctorSplitPane.setLeftComponent(doctorControlArea);

        doctorWorkArea.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout doctorWorkAreaLayout = new javax.swing.GroupLayout(doctorWorkArea);
        doctorWorkArea.setLayout(doctorWorkAreaLayout);
        doctorWorkAreaLayout.setHorizontalGroup(
            doctorWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        doctorWorkAreaLayout.setVerticalGroup(
            doctorWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        doctorSplitPane.setRightComponent(doctorWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncountersActionPerformed
        // TODO add your handling code here:
        createVitalSigns createVitals = new createVitalSigns(databaseConnection, fullName);
        doctorSplitPane.setRightComponent(createVitals);
    }//GEN-LAST:event_btnViewEncountersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewEncounters;
    private javax.swing.JPanel doctorControlArea;
    private javax.swing.JSplitPane doctorSplitPane;
    private javax.swing.JPanel doctorWorkArea;
    // End of variables declaration//GEN-END:variables
}
