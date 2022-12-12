/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.databaseConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author shrey
 */
public class productSupplierClosedOrders extends javax.swing.JPanel {

    /**
     * Creates new form petFoodAdminUpdatePrice
     */
    databaseConnection databaseConnection;
    
    public productSupplierClosedOrders(databaseConnection databaseConnection) {
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

        btnSuppliedFoodItems = new javax.swing.JButton();
        btnSuppliedAccessoryItems = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));

        btnSuppliedFoodItems.setBackground(new java.awt.Color(0, 51, 103));
        btnSuppliedFoodItems.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSuppliedFoodItems.setForeground(new java.awt.Color(51, 204, 255));
        btnSuppliedFoodItems.setText("Supplied Food Items");
        btnSuppliedFoodItems.setPreferredSize(new java.awt.Dimension(76, 30));
        btnSuppliedFoodItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliedFoodItemsActionPerformed(evt);
            }
        });

        btnSuppliedAccessoryItems.setBackground(new java.awt.Color(0, 51, 103));
        btnSuppliedAccessoryItems.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSuppliedAccessoryItems.setForeground(new java.awt.Color(51, 204, 255));
        btnSuppliedAccessoryItems.setText("Supplied Accessories");
        btnSuppliedAccessoryItems.setPreferredSize(new java.awt.Dimension(76, 30));
        btnSuppliedAccessoryItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliedAccessoryItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnSuppliedFoodItems, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(btnSuppliedAccessoryItems, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuppliedFoodItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuppliedAccessoryItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(540, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuppliedFoodItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliedFoodItemsActionPerformed
        
        try {
            // TODO add your handling code here:
            DefaultPieDataset dataset = new DefaultPieDataset();
            ResultSet result = databaseConnection.executeSelect("Select product_name, SUM(ordered_quantity) AS total_orders FROM closedordersfood GROUP BY product_name");
            while(result.next())
            {
                dataset.setValue(result.getString("product_name"), result.getInt("total_orders"));   
            }

            JFreeChart pieChart = ChartFactory.createPieChart3D("Food Items Supplied", dataset, false, true, false);
            PiePlot3D pie = (PiePlot3D)pieChart.getPlot();
            ChartFrame frame = new ChartFrame("Food Items Supplied", pieChart);
            frame.setVisible(true);
            frame.setSize(800, 550);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuppliedFoodItemsActionPerformed

    private void btnSuppliedAccessoryItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliedAccessoryItemsActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            ResultSet result = databaseConnection.executeSelect("Select product_name, SUM(ordered_quantity) AS total_orders FROM closedordersaccessory GROUP BY product_name");
            while(result.next())
            {
                dataset.setValue(result.getInt("total_orders"), "Quantity Supplied", result.getString("product_name"));
            }

            JFreeChart barChart = ChartFactory.createBarChart3D("Accessories Supplied", "Accessory Name", "Quantity Supplied", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChrt = barChart.getCategoryPlot();
            barChrt.setRangeGridlinePaint(Color.BLUE);
            ChartFrame frame = new ChartFrame("Accessories Supplied", barChart);
            frame.setVisible(true);
            frame.setSize(800, 550);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuppliedAccessoryItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuppliedAccessoryItems;
    private javax.swing.JButton btnSuppliedFoodItems;
    // End of variables declaration//GEN-END:variables
}
