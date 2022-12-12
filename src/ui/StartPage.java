/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;
import model.databaseConnection;
import model.sendEmail;
import model.sendSMS;

/**
 *
 * @author shrey
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    sendEmail emailNotification;
    sendSMS smsNotification;
    private final Admin foodStoreAdmin;
    private final Admin hospitalAdmin;
    public databaseConnection databaseConnection;
    private final Admin kennelAdmin;
    private final Admin accessoryAdmin;
    private final Admin productSupplier;
    private final Admin groomingServiceAdmin;
    private final Admin shelterAdmin;
    
    public StartPage() {
        initComponents();
        this.emailNotification = new sendEmail();
        this.smsNotification = new sendSMS();
        this.foodStoreAdmin = new Admin("Food Store Admin", "Food Store Admin", "Food Store Admin");
        this.hospitalAdmin = new Admin("Hospital Admin", "Hospital Admin", "Hospital Admin");
        this.kennelAdmin = new Admin("Kennel Admin", "Kennel Admin", "Kennel Admin");
        this.accessoryAdmin = new Admin("Accessory Admin", "Accessory Admin", "Accessory Admin");
        this.productSupplier = new Admin("Product Supplier", "Product Supplier", "Product Supplier");
        this.groomingServiceAdmin = new Admin("Grooming Service Admin", "Grooming Service Admin", "Grooming Service Admin");
        this.shelterAdmin = new Admin("Shelter Admin", "Shelter Admin", "Shelter Admin");
        this.databaseConnection = new databaseConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        buttonLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        loginlblUserName = new javax.swing.JLabel();
        txtloginUserName = new javax.swing.JTextField();
        loginlblPassword = new javax.swing.JLabel();
        txtloginPassword = new javax.swing.JPasswordField();
        loginAs = new javax.swing.JLabel();
        selectRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(120);

        controlPanel.setBackground(new java.awt.Color(0, 51, 103));

        buttonLogOut.setBackground(new java.awt.Color(51, 204, 255));
        buttonLogOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonLogOut.setForeground(new java.awt.Color(0, 51, 103));
        buttonLogOut.setText("Log Out");
        buttonLogOut.setPreferredSize(new java.awt.Dimension(76, 30));
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(51, 204, 255));

        lbl.setBackground(new java.awt.Color(255, 255, 255));
        lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl.setForeground(new java.awt.Color(0, 51, 103));
        lbl.setText("                                                                                  Pet Management System");

        btnLogIn.setBackground(new java.awt.Color(0, 51, 103));
        btnLogIn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(51, 204, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setPreferredSize(new java.awt.Dimension(76, 30));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 51, 103));
        btnSignUp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(51, 204, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setPreferredSize(new java.awt.Dimension(76, 30));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblEmailID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmailID.setText("Email ID :");

        txtEmailID.setPreferredSize(new java.awt.Dimension(71, 30));
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPhoneNumber.setText("Phone Number :");

        txtPhoneNumber.setPreferredSize(new java.awt.Dimension(71, 30));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserName.setText("User Name :");

        txtUserName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFirstName.setText("First Name :");

        lblPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassword.setText("Password :");

        txtFirstName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLastName.setText("Last Name :");

        txtLastName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        loginlblUserName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginlblUserName.setText("User Name :");

        txtloginUserName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtloginUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginUserNameActionPerformed(evt);
            }
        });

        loginlblPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginlblPassword.setText("Password :");

        txtloginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginPasswordActionPerformed(evt);
            }
        });

        loginAs.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginAs.setText("Role : ");

        selectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Food Store Admin", "Hospital Admin", "Kennel Admin", "Accessory Admin", "Product Supplier", "Doctor", "Grooming Service Admin", "Shelter Admin" }));
        selectRole.setMinimumSize(new java.awt.Dimension(72, 30));
        selectRole.setPreferredSize(new java.awt.Dimension(72, 30));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addComponent(lblEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(workAreaLayout.createSequentialGroup()
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(workAreaLayout.createSequentialGroup()
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(workAreaLayout.createSequentialGroup()
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPassword))
                        .addGroup(workAreaLayout.createSequentialGroup()
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addComponent(loginlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtloginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginlblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtloginPassword)
                                    .addGroup(workAreaLayout.createSequentialGroup()
                                        .addComponent(selectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtloginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginlblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtloginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        if (selectRole.getSelectedItem().toString().equals("User"))
        {
            try{
                int userID = checkCredentials(txtloginUserName.getText(), txtloginPassword.getText());
                if(userID == 0)
                {
                    JOptionPane.showMessageDialog(this, "Invalid Credentials!");
                    txtloginUserName.setText("");
                    txtloginPassword.setText("");
                }
                else
                {
                     userJPanel userPanel = new userJPanel(databaseConnection, userID, emailNotification, smsNotification);
                     splitPane.setRightComponent(userPanel);
                     buttonLogOut.setVisible(true);
                }

            } catch(Exception e){System.out.println(e);}
        }
        else if(foodStoreAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && foodStoreAdmin.getAdminUserName().equals(txtloginUserName.getText()) && foodStoreAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Food Store Admin");
                petFoodAdmin petFoodAdminJPanel = new petFoodAdmin(databaseConnection);
                splitPane.setRightComponent(petFoodAdminJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        else if(hospitalAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && hospitalAdmin.getAdminUserName().equals(txtloginUserName.getText()) && hospitalAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Hospital Admin");
                hospitalAdmin hospitalAdminJPanel = new hospitalAdmin(databaseConnection);
                splitPane.setRightComponent(hospitalAdminJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        else if(selectRole.getSelectedItem().toString().equals("Doctor")) 
        {
            try{
                ResultSet result =  databaseConnection.executeSelect("SELECT * FROM doctors");
                boolean flag = false;
                
                while(result.next())
                {
                    if(result.getString("username").equals(txtloginUserName.getText()) && result.getString("password").equals(txtloginPassword.getText()))
                    {
                        flag = true;
                        String fullName = result.getString("first_name") + " " + result.getString("last_name");
                        doctorJPanel doctor = new doctorJPanel(databaseConnection, fullName);
                        splitPane.setRightComponent(doctor);
                        buttonLogOut.setVisible(true);
                    }
                }
                if(flag == false)
                {
                    JOptionPane.showMessageDialog(this, "Invalid Credentials!");
                    txtloginUserName.setText("");
                    txtloginPassword.setText("");
                }

            } catch(Exception e){System.out.println(e);}
        }
        else if(kennelAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && kennelAdmin.getAdminUserName().equals(txtloginUserName.getText()) && kennelAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Kennel Admin");
                kennelAdmin kennelAdminJPanel = new kennelAdmin(databaseConnection);
                splitPane.setRightComponent(kennelAdminJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        
        else if(accessoryAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && accessoryAdmin.getAdminUserName().equals(txtloginUserName.getText()) && accessoryAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Accessory Admin");
                petAccessoryAdmin petAccessoryJPanel = new petAccessoryAdmin(databaseConnection);
                splitPane.setRightComponent(petAccessoryJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        
        else if(productSupplier.getAdminRole().equals(selectRole.getSelectedItem().toString()) && productSupplier.getAdminUserName().equals(txtloginUserName.getText()) && productSupplier.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Product Supplier");
                productSupplier productSupply = new productSupplier(databaseConnection);
                splitPane.setRightComponent(productSupply);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        else if(groomingServiceAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && groomingServiceAdmin.getAdminUserName().equals(txtloginUserName.getText()) && groomingServiceAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Grooming Service Admin");
                petGroomingServiceAdmin petGroomingServiceAdminJPanel = new petGroomingServiceAdmin(databaseConnection);
                splitPane.setRightComponent(petGroomingServiceAdminJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        
        else if(shelterAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && shelterAdmin.getAdminUserName().equals(txtloginUserName.getText()) && shelterAdmin.getAdminPassWord().equals(txtloginPassword.getText()))
        {
            try{
                JOptionPane.showMessageDialog(this, "Logged In As Shelter Admin");
                petShelterAdmin shelterAdminJPanel = new petShelterAdmin(databaseConnection);
                splitPane.setRightComponent(shelterAdminJPanel);
                buttonLogOut.setVisible(true);
            } catch(Exception e){System.out.println(e);}
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Credentials!");
        }
    }//GEN-LAST:event_btnLogInActionPerformed
    
    private int checkCredentials(String userName, String password) throws Exception
    {
        ResultSet result = databaseConnection.executeSelect("SELECT * FROM usertable");
        int userID = 0;
        while(result.next()){
            
            if(result.getString("user_name").equals(userName) && result.getString("password").equals(password))
            {
                userID = result.getInt("id");
                return userID;
            }
        }
        return userID;
    }
    
    private int checkUserNameExists(String userName) throws Exception
    {
        ResultSet result = databaseConnection.executeSelect("SELECT * FROM usertable");
        int userID = 0;
        while(result.next()){
            
            if(result.getString("user_name").equals(userName))
            {
                userID = result.getInt("id");
                return userID;
            }
        }
        return userID;
    }
    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(workArea);
        buttonLogOut.setVisible(false);
        txtloginUserName.setText("");
        txtloginPassword.setText("");
    }//GEN-LAST:event_buttonLogOutActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String emailID = txtEmailID.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String extensionPhoneNumber = "+1" + phoneNumber;
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        try {
            int userID = checkUserNameExists(userName);
            if(userID != 0)
            {
                JOptionPane.showMessageDialog(this, "Username already exists!");
                clearText();
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            databaseConnection.executeInsert("INSERT INTO usertable (first_name, last_name, email_id, phone_number, user_name, password) VALUES ('"+firstName+"', '"+lastName+"', '"+emailID+"', '"+phoneNumber+"', '"+userName+"', '"+password+"')");
            JOptionPane.showMessageDialog(this, "Sign Up successful!");
            clearText();
            emailNotification.sendEmail("Welcome " + firstName + " " + lastName, "Thanks for signing up! We look forward to serving you!", emailID);
            smsNotification.sendSMS(extensionPhoneNumber, "Thanks for signing up! We look forward to serving you!");
        } catch (SQLException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnSignUpActionPerformed
    
    private void clearText()
    {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmailID.setText("");
        txtPhoneNumber.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }
    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtloginUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginUserNameActionPerformed

    private void txtloginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel loginAs;
    private javax.swing.JLabel loginlblPassword;
    private javax.swing.JLabel loginlblUserName;
    private javax.swing.JComboBox<String> selectRole;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtloginPassword;
    private javax.swing.JTextField txtloginUserName;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

}
