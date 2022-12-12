/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import static java.lang.String.format;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.databaseConnection;
/**
 *
 * @author babsybabu
 */
public class petShelterJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form petShelterJPanel
     */
    databaseConnection databaseConnection;
       private ImageIcon format=null;
   String fname=null;
   int s=0;
   byte[] pimage=null;

    public petShelterJPanel1(databaseConnection databaseConnection) {
        initComponents();
        this.databaseConnection=databaseConnection;
        populateTable();
    }
    
        private void populateTable() {
         try {
            ResultSet result = databaseConnection.executeSelect("SELECT * FROM shelterPets");
            DefaultTableModel model = (DefaultTableModel) tblPetAdoptionRecords.getModel();
            model.setRowCount(0);
            while(result.next())
            {
                
            Object[]row=new Object[10];
                row[0] = result.getInt("id");
                row[1] = result.getString("pet_id");
                row[2] = result.getString("pet_name");
                row[3] = result.getString("pet_date_of_birth");
                row[4] = result.getInt("pet_age");
                row[5] = result.getString("pet_gender");
                row[6] = result.getString("pet_type");
                row[7] = result.getInt("pet_height");
                row[8] = result.getInt("pet_weight");
                row[9] = result.getString("pet_vaccination_status");
            
            model.addRow(row);
                    
            
        }
        } catch (Exception ex) {
            Logger.getLogger(kennelAdminUpdatePrice.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPetAdoptionRecords = new javax.swing.JTable();
        btnAdopt = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        btnViewImage = new javax.swing.JButton();

        tblPetAdoptionRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Pet ID", "Name", "Date of Birth", "Age", "Gender", "Type", "Height", "Weight", "Vaccination Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPetAdoptionRecords.setBounds(new java.awt.Rectangle(0, 0, 568, 191));
        jScrollPane1.setViewportView(tblPetAdoptionRecords);

        btnAdopt.setText("Adopt");
        btnAdopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptActionPerformed(evt);
            }
        });

        btnViewImage.setText("View Image");
        btnViewImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAdopt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdopt)
                            .addComponent(btnViewImage)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewImageActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblPetAdoptionRecords.getSelectedRow();
        String selectedCellValue = (String) tblPetAdoptionRecords.getValueAt(tblPetAdoptionRecords.getSelectedRow() , tblPetAdoptionRecords.getSelectedColumn());
        System.out.println(selectedCellValue);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view");
            return;
        }
        
        try {
            String sql="SELECT `pet_image` FROM `shelterPets` WHERE pet_id='"+selectedCellValue+"'";          
           ResultSet rs=databaseConnection.executeSelect(sql);
           System.out.println(rs);
           if(rs.next())
           {          
               byte[] imagedata=rs.getBytes("pet_image");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(lblImg.getWidth(),lblImg.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon image=new ImageIcon(img2);
               lblImg.setIcon(image);
            } 
           else
           {
          
           }
        } catch (Exception e) {
           
        }       
    }//GEN-LAST:event_btnViewImageActionPerformed

    private void btnAdoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAdoptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdopt;
    private javax.swing.JButton btnViewImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTable tblPetAdoptionRecords;
    // End of variables declaration//GEN-END:variables
}
