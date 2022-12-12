/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.databaseConnection;

/**
 *
 * @author shrey
 */
public class petFoodAdminUpdatePrice extends javax.swing.JPanel {

    /**
     * Creates new form petFoodAdminUpdatePrice
     */
    databaseConnection databaseConnection;
    
    public petFoodAdminUpdatePrice(databaseConnection databaseConnection) {
        initComponents();
        this.databaseConnection = databaseConnection;
        txtFoodName.setEditable(false);
        populateTable();
    }
    
    private void populateTable()
    {
        try {
            ResultSet result = databaseConnection.executeSelect("SELECT * FROM petfood");
            DefaultTableModel model = (DefaultTableModel) tablePetFood.getModel();
            model.setRowCount(0);
            while(result.next())
            {
                Object[] row = new Object[4];
                row[0] = result.getInt("id");
                row[1] = result.getString("food_name");
                row[2] = result.getInt("food_price");
                row[3] = result.getInt("available_quantity");
                model.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(petFoodAdminUpdatePrice.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tablePetFood = new javax.swing.JTable();
        lblUpdateFoodPrice = new javax.swing.JLabel();
        lblFoodName = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        lblFoodNewPrice = new javax.swing.JLabel();
        txtFoodNewPrice = new javax.swing.JTextField();
        btnUpdateFoodPrice = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        tablePetFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Product Price", "Quantity Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePetFood.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePetFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePetFoodMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePetFood);

        lblUpdateFoodPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblUpdateFoodPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUpdateFoodPrice.setForeground(new java.awt.Color(255, 0, 0));
        lblUpdateFoodPrice.setText("                                                                  Select a Product to Update Price");

        lblFoodName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFoodName.setText("Product Name :");

        txtFoodName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtFoodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodNameActionPerformed(evt);
            }
        });

        lblFoodNewPrice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFoodNewPrice.setText("New Price :");

        txtFoodNewPrice.setPreferredSize(new java.awt.Dimension(71, 30));
        txtFoodNewPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodNewPriceActionPerformed(evt);
            }
        });

        btnUpdateFoodPrice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdateFoodPrice.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdateFoodPrice.setText("Update Price");
        btnUpdateFoodPrice.setPreferredSize(new java.awt.Dimension(76, 30));
        btnUpdateFoodPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFoodPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUpdateFoodPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFoodNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtFoodNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(246, 246, 246))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblUpdateFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(btnUpdateFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFoodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodNameActionPerformed

    private void txtFoodNewPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodNewPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodNewPriceActionPerformed

    private void btnUpdateFoodPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFoodPriceActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tablePetFood.getModel();
            int selectedRowIndex = tablePetFood.getSelectedRow();
            int productID = (int) model.getValueAt(selectedRowIndex, 0);
            int newPrice = Integer.parseInt(txtFoodNewPrice.getText());
            
            databaseConnection.executePetFoodUpdate("UPDATE petfood SET food_price = ? WHERE id = ?", newPrice, productID);
   
            JOptionPane.showMessageDialog(this, "Price Updated Successfully!");
            txtFoodName.setText("");
            txtFoodNewPrice.setText("");
            populateTable();
        } catch (Exception ex) {
            Logger.getLogger(petFoodAdminUpdatePrice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateFoodPriceActionPerformed

    private void tablePetFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePetFoodMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablePetFood.getModel();
        int selectedRowIndex = tablePetFood.getSelectedRow();
        String productName = (String) model.getValueAt(selectedRowIndex, 1);
        txtFoodName.setText(productName);
    }//GEN-LAST:event_tablePetFoodMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateFoodPrice;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFoodName;
    private javax.swing.JLabel lblFoodNewPrice;
    private javax.swing.JLabel lblUpdateFoodPrice;
    private javax.swing.JTable tablePetFood;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodNewPrice;
    // End of variables declaration//GEN-END:variables
}
