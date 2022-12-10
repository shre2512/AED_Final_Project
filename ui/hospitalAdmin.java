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
public class hospitalAdmin extends javax.swing.JPanel {

    /**
     * Creates new form createHospital
     */

    databaseConnection databaseConnection;
    
    public hospitalAdmin(databaseConnection databaseConnection) {
        initComponents();
        this.databaseConnection = databaseConnection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalAdminSplitPane = new javax.swing.JSplitPane();
        hospitalAdminControlArea = new javax.swing.JPanel();
        btnCreateDoctor = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        hospitalAdminWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 255, 255));

        hospitalAdminSplitPane.setDividerLocation(130);

        hospitalAdminControlArea.setBackground(new java.awt.Color(0, 51, 153));

        btnCreateDoctor.setBackground(new java.awt.Color(51, 204, 255));
        btnCreateDoctor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(0, 51, 153));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setPreferredSize(new java.awt.Dimension(76, 30));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnCreateHospital.setBackground(new java.awt.Color(51, 204, 255));
        btnCreateHospital.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateHospital.setForeground(new java.awt.Color(0, 51, 153));
        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.setPreferredSize(new java.awt.Dimension(76, 30));
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hospitalAdminControlAreaLayout = new javax.swing.GroupLayout(hospitalAdminControlArea);
        hospitalAdminControlArea.setLayout(hospitalAdminControlAreaLayout);
        hospitalAdminControlAreaLayout.setHorizontalGroup(
            hospitalAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalAdminControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hospitalAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hospitalAdminControlAreaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        hospitalAdminControlAreaLayout.setVerticalGroup(
            hospitalAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalAdminControlAreaLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
            .addGroup(hospitalAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalAdminControlAreaLayout.createSequentialGroup()
                    .addContainerGap(297, Short.MAX_VALUE)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );

        hospitalAdminSplitPane.setLeftComponent(hospitalAdminControlArea);

        hospitalAdminWorkArea.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout hospitalAdminWorkAreaLayout = new javax.swing.GroupLayout(hospitalAdminWorkArea);
        hospitalAdminWorkArea.setLayout(hospitalAdminWorkAreaLayout);
        hospitalAdminWorkAreaLayout.setHorizontalGroup(
            hospitalAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        hospitalAdminWorkAreaLayout.setVerticalGroup(
            hospitalAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        hospitalAdminSplitPane.setRightComponent(hospitalAdminWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalAdminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalAdminSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        createDoctorJPanel createDoctor = new createDoctorJPanel(databaseConnection);
        hospitalAdminSplitPane.setRightComponent(createDoctor);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        createHospitalJPanel createHospital = new createHospitalJPanel(databaseConnection);
        hospitalAdminSplitPane.setRightComponent(createHospital);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JPanel hospitalAdminControlArea;
    private javax.swing.JSplitPane hospitalAdminSplitPane;
    private javax.swing.JPanel hospitalAdminWorkArea;
    // End of variables declaration//GEN-END:variables
}
