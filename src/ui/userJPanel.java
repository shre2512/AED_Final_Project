/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.databaseConnection;
import model.sendEmail;
import model.sendSMS;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.Color;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author shrey
 */
public class userJPanel extends javax.swing.JPanel {

    /**
     * Creates new form userJPanel
     */
    int userID;
    sendEmail emailNotification;
    sendSMS smsNotification;
    databaseConnection databaseConnection;
    
    public userJPanel(databaseConnection databaseConnection, int userID, sendEmail emailNotification, sendSMS smsNotification) {
        initComponents();
        this.userID = userID;
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
        this.databaseConnection = databaseConnection;
        init();
    }

        public void init(){
        try {
            // TODO add your handling code here:
           kennelJPanel kennelPanel = new kennelJPanel(databaseConnection,  userID, emailNotification, smsNotification);
           kennelSplitPane.setRightComponent(kennelPanel);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        tabbedPane = new javax.swing.JTabbedPane();
        foodAccsJPanel = new javax.swing.JPanel();
        foodAccsSplitPane = new javax.swing.JSplitPane();
        foodAccsControlArea = new javax.swing.JPanel();
        btnPetFood = new javax.swing.JButton();
        btnPetGrooming = new javax.swing.JButton();
        btnPetAccessories = new javax.swing.JButton();
        foodAccsWorkArea = new javax.swing.JPanel();
        userPastActivity = new javax.swing.JPanel();
        userPastActivitySplitPane = new javax.swing.JSplitPane();
        userPastActivityControlArea = new javax.swing.JPanel();
        btnAccessoryPurchase = new javax.swing.JButton();
        btnFoodPurchase = new javax.swing.JButton();
        userPastActivityWorkArea = new javax.swing.JPanel();
        kennelJPanel = new javax.swing.JPanel();
        kennelSplitPane = new javax.swing.JSplitPane();
        kennelWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 102));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 102));
        tabbedPane.setForeground(new java.awt.Color(0, 0, 255));
        tabbedPane.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        foodAccsSplitPane.setDividerLocation(135);

        foodAccsControlArea.setBackground(new java.awt.Color(102, 255, 102));

        btnPetFood.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPetFood.setForeground(new java.awt.Color(255, 0, 0));
        btnPetFood.setText("Pet Food");
        btnPetFood.setPreferredSize(new java.awt.Dimension(76, 35));
        btnPetFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetFoodActionPerformed(evt);
            }
        });

        btnPetGrooming.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPetGrooming.setForeground(new java.awt.Color(255, 0, 0));
        btnPetGrooming.setText("Pet Grooming");
        btnPetGrooming.setPreferredSize(new java.awt.Dimension(76, 35));
        btnPetGrooming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetGroomingActionPerformed(evt);
            }
        });

        btnPetAccessories.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPetAccessories.setForeground(new java.awt.Color(255, 0, 0));
        btnPetAccessories.setText("Pet Accessories");
        btnPetAccessories.setPreferredSize(new java.awt.Dimension(76, 35));
        btnPetAccessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetAccessoriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodAccsControlAreaLayout = new javax.swing.GroupLayout(foodAccsControlArea);
        foodAccsControlArea.setLayout(foodAccsControlAreaLayout);
        foodAccsControlAreaLayout.setHorizontalGroup(
            foodAccsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodAccsControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodAccsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPetFood, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnPetGrooming, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnPetAccessories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        foodAccsControlAreaLayout.setVerticalGroup(
            foodAccsControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodAccsControlAreaLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnPetFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnPetAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnPetGrooming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        foodAccsSplitPane.setLeftComponent(foodAccsControlArea);

        foodAccsWorkArea.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout foodAccsWorkAreaLayout = new javax.swing.GroupLayout(foodAccsWorkArea);
        foodAccsWorkArea.setLayout(foodAccsWorkAreaLayout);
        foodAccsWorkAreaLayout.setHorizontalGroup(
            foodAccsWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        foodAccsWorkAreaLayout.setVerticalGroup(
            foodAccsWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        foodAccsSplitPane.setRightComponent(foodAccsWorkArea);

        javax.swing.GroupLayout foodAccsJPanelLayout = new javax.swing.GroupLayout(foodAccsJPanel);
        foodAccsJPanel.setLayout(foodAccsJPanelLayout);
        foodAccsJPanelLayout.setHorizontalGroup(
            foodAccsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodAccsSplitPane)
        );
        foodAccsJPanelLayout.setVerticalGroup(
            foodAccsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodAccsSplitPane)
        );

        tabbedPane.addTab("Food & Accessories", foodAccsJPanel);

        userPastActivity.setBackground(new java.awt.Color(0, 255, 255));

        userPastActivitySplitPane.setDividerLocation(60);
        userPastActivitySplitPane.setDividerSize(0);
        userPastActivitySplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        userPastActivityControlArea.setBackground(new java.awt.Color(102, 255, 102));

        btnAccessoryPurchase.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAccessoryPurchase.setForeground(new java.awt.Color(255, 0, 0));
        btnAccessoryPurchase.setText("Accessory Purchase");
        btnAccessoryPurchase.setPreferredSize(new java.awt.Dimension(76, 35));
        btnAccessoryPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessoryPurchaseActionPerformed(evt);
            }
        });

        btnFoodPurchase.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFoodPurchase.setForeground(new java.awt.Color(255, 0, 0));
        btnFoodPurchase.setText("Food Purchase");
        btnFoodPurchase.setPreferredSize(new java.awt.Dimension(76, 35));
        btnFoodPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodPurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPastActivityControlAreaLayout = new javax.swing.GroupLayout(userPastActivityControlArea);
        userPastActivityControlArea.setLayout(userPastActivityControlAreaLayout);
        userPastActivityControlAreaLayout.setHorizontalGroup(
            userPastActivityControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPastActivityControlAreaLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnFoodPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnAccessoryPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        userPastActivityControlAreaLayout.setVerticalGroup(
            userPastActivityControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPastActivityControlAreaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(userPastActivityControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccessoryPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoodPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        userPastActivitySplitPane.setTopComponent(userPastActivityControlArea);

        userPastActivityWorkArea.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout userPastActivityWorkAreaLayout = new javax.swing.GroupLayout(userPastActivityWorkArea);
        userPastActivityWorkArea.setLayout(userPastActivityWorkAreaLayout);
        userPastActivityWorkAreaLayout.setHorizontalGroup(
            userPastActivityWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        userPastActivityWorkAreaLayout.setVerticalGroup(
            userPastActivityWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        userPastActivitySplitPane.setRightComponent(userPastActivityWorkArea);

        javax.swing.GroupLayout userPastActivityLayout = new javax.swing.GroupLayout(userPastActivity);
        userPastActivity.setLayout(userPastActivityLayout);
        userPastActivityLayout.setHorizontalGroup(
            userPastActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPastActivitySplitPane)
        );
        userPastActivityLayout.setVerticalGroup(
            userPastActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPastActivitySplitPane)
        );

        tabbedPane.addTab("Past Activity", userPastActivity);

        kennelSplitPane.setDividerLocation(0);
        kennelSplitPane.setDividerSize(0);

        javax.swing.GroupLayout kennelWorkAreaLayout = new javax.swing.GroupLayout(kennelWorkArea);
        kennelWorkArea.setLayout(kennelWorkAreaLayout);
        kennelWorkAreaLayout.setHorizontalGroup(
            kennelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        kennelWorkAreaLayout.setVerticalGroup(
            kennelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        kennelSplitPane.setRightComponent(kennelWorkArea);

        javax.swing.GroupLayout kennelJPanelLayout = new javax.swing.GroupLayout(kennelJPanel);
        kennelJPanel.setLayout(kennelJPanelLayout);
        kennelJPanelLayout.setHorizontalGroup(
            kennelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kennelSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        kennelJPanelLayout.setVerticalGroup(
            kennelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kennelSplitPane)
        );

        tabbedPane.addTab("Kennel", kennelJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPetFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetFoodActionPerformed
        try {
            // TODO add your handling code here:
            petFoodJPanel petfoodPanel = new petFoodJPanel(databaseConnection, userID, emailNotification, smsNotification);
            foodAccsSplitPane.setRightComponent(petfoodPanel);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPetFoodActionPerformed

    private void btnPetGroomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetGroomingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPetGroomingActionPerformed

    private void btnPetAccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetAccessoriesActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            petAccessoryJPanel petAccessoryPanel = new petAccessoryJPanel(databaseConnection, userID, emailNotification, smsNotification);
            foodAccsSplitPane.setRightComponent(petAccessoryPanel);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPetAccessoriesActionPerformed

    private void btnAccessoryPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessoryPurchaseActionPerformed
        try {
            // TODO add your handling code here:
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            ResultSet result = databaseConnection.executeSelect(userID);
            while(result.next())
            {
                if(result.getString("item_type").equals("Accessory"))
                {
                    dataset.setValue(result.getInt("total_user_orders"), "Price", result.getString("product"));
                }
            }

            JFreeChart barChart = ChartFactory.createBarChart3D("Spending By Accessories", "Accessory Name", "Total Spent", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChrt = barChart.getCategoryPlot();
            barChrt.setRangeGridlinePaint(Color.BLUE);
            ChartFrame frame = new ChartFrame("Spending by Accessories", barChart);
            frame.setVisible(true);
            frame.setSize(800, 550);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccessoryPurchaseActionPerformed

    private void btnFoodPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodPurchaseActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DefaultPieDataset dataset = new DefaultPieDataset();
            ResultSet result = databaseConnection.executeSelect(userID);
            while(result.next())
            {
                if(result.getString("item_type").equals("Food"))
                {
                    dataset.setValue(result.getString("product"), result.getInt("total_user_orders"));
                }
            }

            JFreeChart pieChart = ChartFactory.createPieChart3D("Spending By Food Item", dataset, false, true, false);
            PiePlot3D pie = (PiePlot3D)pieChart.getPlot();
            ChartFrame frame = new ChartFrame("Spending by Accessories", pieChart);
            frame.setVisible(true);
            frame.setSize(800, 550);
        } catch (Exception ex) {
            Logger.getLogger(userJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFoodPurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccessoryPurchase;
    private javax.swing.JButton btnFoodPurchase;
    private javax.swing.JButton btnPetAccessories;
    private javax.swing.JButton btnPetFood;
    private javax.swing.JButton btnPetGrooming;
    private javax.swing.JPanel foodAccsControlArea;
    private javax.swing.JPanel foodAccsJPanel;
    private javax.swing.JSplitPane foodAccsSplitPane;
    private javax.swing.JPanel foodAccsWorkArea;
    private javax.swing.JPanel kennelJPanel;
    private javax.swing.JSplitPane kennelSplitPane;
    private javax.swing.JPanel kennelWorkArea;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel userPastActivity;
    private javax.swing.JPanel userPastActivityControlArea;
    private javax.swing.JSplitPane userPastActivitySplitPane;
    private javax.swing.JPanel userPastActivityWorkArea;
    // End of variables declaration//GEN-END:variables
}
