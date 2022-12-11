
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
import waypoint.EventWaypoint;
import waypoint.MyWaypoint;
import waypoint.WaypointRender;
import java.util.Date; 
import java.util.logging.Level;
import java.util.logging.Logger;
import model.databaseConnection;
import model.sendEmail;
import model.sendSMS;


/**
 *
 * @author babsybabu
 */
public class kennelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form kennelJPanel
     */
    private Set<MyWaypoint> waypoints = new HashSet<>();
    private EventWaypoint event;
    private Date fromDate;
    private Date toDate;
    private int numberOfDays;
    private String name;
    private String address;
    private String pickup;
    private int pricePerDay;
    private int rent;
    private int userID;
    sendEmail emailNotification;
    sendSMS smsNotification;
    databaseConnection databaseConnection;
    
    
    public kennelJPanel(databaseConnection databaseConnection, int userID, sendEmail emailNotification, sendSMS smsNotification) {
       initComponents();
       init();
       this.userID=userID;
       this.databaseConnection=databaseConnection;
    }
    private void init(){
        TileFactoryInfo info =new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer1.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(42.361145,-71.057083);
        jXMapViewer1.setAddressLocation(geo);
        jXMapViewer1.setZoom(5);
        
        txtKennelName.setEditable(false);
        txtKennelAddress.setEditable(false);
        txtPricePerDay.setEditable(false);
        
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer1);
        jXMapViewer1.addMouseListener(mm);
        jXMapViewer1.addMouseMotionListener(mm);
        jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));
        event=getEvent();
    }
    
        private void populateFields(String kennel_name)
    {
        try {
            ResultSet result = databaseConnection.executeSelectKennel(kennel_name);
            
            while(result.next())
            {
                int kennelPrice = result.getInt("price_per_day");
                txtPricePerDay.setText(String.valueOf(kennelPrice));
            }
        }catch (Exception ex) {
            Logger.getLogger(kennelAdminUpdatePrice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initWaypoint(){
        WaypointPainter<MyWaypoint> wp =new WaypointRender();
        wp.setWaypoints(waypoints);
        jXMapViewer1.setOverlayPainter(wp);
          for (MyWaypoint d : waypoints) {
            jXMapViewer1.add(d.getButton());
        }
    }
    
    private EventWaypoint getEvent(){
        return new EventWaypoint(){
            @Override
            public void selected(MyWaypoint waypoint){
                txtKennelName.setText(waypoint.getName());
                txtKennelAddress.setText(waypoint.getAddress());
                populateFields(waypoint.getName());
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();
        btnKennelsOnMap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKennelName = new javax.swing.JTextField();
        txtKennelAddress = new javax.swing.JTextField();
        dateChooserToDateKennel = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dateChooserFromDateKennel = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtPricePerDay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPickup = new javax.swing.JLabel();
        cmbPickup = new javax.swing.JComboBox<>();

        btnKennelsOnMap.setText("View kennels");
        btnKennelsOnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKennelsOnMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewer1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnKennelsOnMap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewer1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnKennelsOnMap)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jLabel1.setText("Address");

        jLabel2.setText("Name");

        txtKennelName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtKennelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKennelNameActionPerformed(evt);
            }
        });

        txtKennelAddress.setPreferredSize(new java.awt.Dimension(71, 30));
        txtKennelAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKennelAddressActionPerformed(evt);
            }
        });

        jLabel3.setText("From");

        jLabel4.setText("To");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtPricePerDay.setPreferredSize(new java.awt.Dimension(71, 30));
        txtPricePerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerDayActionPerformed(evt);
            }
        });

        jLabel5.setText("Price per day");

        lblPickup.setText("Pickup required?");

        cmbPickup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserToDateKennel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKennelName, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtPricePerDay, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblPickup)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKennelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(dateChooserFromDateKennel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(btnSave)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtKennelName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtKennelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateChooserFromDateKennel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateChooserToDateKennel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblPickup)
                    .addComponent(cmbPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKennelsOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKennelsOnMapActionPerformed
        // TODO add your handling code here:
        waypoints.add(new MyWaypoint("The Mindful Mutt","16 Harvard Ave, Allston, MA 02134",event,new GeoPosition(42.36114667727058, -71.13242913502957)));
        waypoints.add(new MyWaypoint("The Urban Hound Hotel & Daycare","129 W Malden St, Boston, MA 02118",event,new GeoPosition(42.3441904832612, -71.06726660373947)));
        waypoints.add(new MyWaypoint("The Dog Port","236 Sumner St, East Boston, MA 02128",event,new GeoPosition(42.376150664565635, -71.03823688912777)));
        waypoints.add(new MyWaypoint("Tails","385 Centre St, Jamaica Plain, MA 02130",event,new GeoPosition(42.36757788354394, -71.05820710298593)));

        initWaypoint();
    }//GEN-LAST:event_btnKennelsOnMapActionPerformed

    private void txtKennelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKennelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKennelNameActionPerformed

    private void txtKennelAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKennelAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKennelAddressActionPerformed

    private void txtPricePerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerDayActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        name=txtKennelName.getText();
        address=txtKennelAddress.getText();
        toDate=dateChooserToDateKennel.getDate();
        System.out.println(toDate);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String toDateString = dateFormat.format(toDate);
        System.out.println(toDateString);
        fromDate=dateChooserFromDateKennel.getDate();
        String fromDateString = dateFormat.format(fromDate);
        numberOfDays=(int)( (fromDate.getTime() - toDate.getTime()) / (1000 * 60 * 60 * 24));
        pricePerDay=Integer.parseInt(txtPricePerDay.getText());
        rent=numberOfDays*pricePerDay;
        System.out.println(numberOfDays);
        System.out.println(rent);
        pickup=cmbPickup.getSelectedItem().toString();
        
        try {
            databaseConnection.insertKennelBooking(userID,name,address,toDateString,fromDateString,pricePerDay,numberOfDays,rent,pickup);
        } catch (Exception ex) {
            Logger.getLogger(petFoodJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKennelsOnMap;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbPickup;
    private com.toedter.calendar.JDateChooser dateChooserFromDateKennel;
    private com.toedter.calendar.JDateChooser dateChooserToDateKennel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    private javax.swing.JLabel lblPickup;
    private javax.swing.JTextField txtKennelAddress;
    private javax.swing.JTextField txtKennelName;
    private javax.swing.JTextField txtPricePerDay;
    // End of variables declaration//GEN-END:variables
}
