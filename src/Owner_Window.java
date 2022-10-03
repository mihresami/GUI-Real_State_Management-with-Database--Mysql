
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
public class Owner_Window extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Window
     */
    public Owner_Window() {
        initComponents();
        Border border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.white);
         ProTypeHeadPanel.setBorder(border);
        ShowOwnerDataofTable();

    }

    //A function to list the table with all the owner 
    public void ShowOwnerDataofTable() {
        Owner owner = new Owner();
        ArrayList<Owner> list = owner.ownereList();
        //table columns
        String[] ColNames = {"ID", "First Name", "Last Name", "Phone No", "Email", "Address"};
        Object[][] rows = new Object[list.size()][6];
        //add data form the list to the rows
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getFname();
            rows[i][2] = list.get(i).getLname();
            rows[i][3] = list.get(i).getphoneNo();
            rows[i][4] = list.get(i).getEmail();
            rows[i][5] = list.get(i).getAddress();

        }
        DefaultTableModel model = new DefaultTableModel(rows, ColNames);
        jTabel1.setModel(model);
        jTabel1.setRowHeight(35);
        jTabel1.setSelectionBackground(Color.red);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProTypeHeadPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        FNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        Refreshbtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        RomveBtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LNameTextField = new javax.swing.JTextField();
        PnoTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        ProTypeHeadPanel.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Owners");

        javax.swing.GroupLayout ProTypeHeadPanelLayout = new javax.swing.GroupLayout(ProTypeHeadPanel);
        ProTypeHeadPanel.setLayout(ProTypeHeadPanelLayout);
        ProTypeHeadPanelLayout.setHorizontalGroup(
            ProTypeHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProTypeHeadPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        ProTypeHeadPanelLayout.setVerticalGroup(
            ProTypeHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProTypeHeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IdLabel.setBackground(new java.awt.Color(153, 153, 153));
        IdLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdLabel.setText("Id:");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("First Name:");

        IdTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IdTextField.setForeground(new java.awt.Color(0, 0, 0));
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        FNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        FNameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        FNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        AddressTextArea.setBackground(new java.awt.Color(204, 204, 204));
        AddressTextArea.setColumns(20);
        AddressTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AddressTextArea.setForeground(new java.awt.Color(0, 0, 0));
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

        Refreshbtn.setBackground(new java.awt.Color(153, 153, 153));
        Refreshbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Refreshbtn.setForeground(new java.awt.Color(0, 0, 0));
        Refreshbtn.setText("Refrsh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        Addbtn.setBackground(new java.awt.Color(153, 153, 153));
        Addbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(0, 0, 0));
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        RomveBtn.setBackground(new java.awt.Color(153, 153, 153));
        RomveBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RomveBtn.setForeground(new java.awt.Color(0, 0, 0));
        RomveBtn.setText("Remove");
        RomveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RomveBtnActionPerformed(evt);
            }
        });

        Editbtn.setBackground(new java.awt.Color(153, 153, 153));
        Editbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Editbtn.setForeground(new java.awt.Color(0, 0, 0));
        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Last Name:");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone No:");

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");

        LNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        LNameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        LNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTextFieldActionPerformed(evt);
            }
        });

        PnoTextField.setBackground(new java.awt.Color(204, 204, 204));
        PnoTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PnoTextField.setForeground(new java.awt.Color(0, 0, 0));
        PnoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnoTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.setBackground(new java.awt.Color(204, 204, 204));
        EmailTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmailTextField.setForeground(new java.awt.Color(0, 0, 0));
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        jTabel1.setBackground(new java.awt.Color(204, 204, 204));
        jTabel1.setForeground(new java.awt.Color(0, 0, 0));
        jTabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProTypeHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ProTypeHeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void FNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTextFieldActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed

        try {

            String Fname = FNameTextField.getText();
            String Lname = LNameTextField.getText();
            String Phone_No = PnoTextField.getText();
            String Email = EmailTextField.getText();
            String Address = AddressTextArea.getText();
            Owner owner = new Owner(0, Fname, Lname, Phone_No, Email, Address);
            if (Fname.trim().equals("") || Lname.trim().equals("") || Phone_No.trim().equals("") || Email.trim().equals("") || Address.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter required data", "Data Error", 1);
            } else {
                if (owner.Addowner(owner)) {
                    JOptionPane.showMessageDialog(null, "New Owner Added Successfully", "Owner Type", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Owner Type", 2);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ("Please Enter valid data"), "Add Type", 1);
        }


    }//GEN-LAST:event_AddbtnActionPerformed

    private void RomveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomveBtnActionPerformed
        // Remove the property type
        try {
            int Id = Integer.valueOf(IdTextField.getText());
            Owner owner = new Owner();

            if (!IdTextField.getText().trim().equals("")) {
                int Yes_No = JOptionPane.showConfirmDialog(null, "Do you want to Remove this type", "Delete Type", JOptionPane.YES_NO_OPTION);
                if (Yes_No == JOptionPane.YES_OPTION) {
                    owner.DeleteOwner(Id);

                    JOptionPane.showMessageDialog(null, "Successfully Removed", "Edit Type", 1);
                    IdTextField.setText("");
                    FNameTextField.setText("");
                    LNameTextField.setText("");
                    PnoTextField.setText("");
                    EmailTextField.setText("");
                    AddressTextArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Remove Type", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter owner Id", "Id Error", 1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Please Enter valid Id", "Error", 1);
        }


    }//GEN-LAST:event_RomveBtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        // Edit the the property type
        try {
            int Id = Integer.valueOf(IdTextField.getText());
            String Fname = FNameTextField.getText();
            String Lname = LNameTextField.getText();
            String Phone_No = PnoTextField.getText();
            String Email = EmailTextField.getText();
            String Address = AddressTextArea.getText();
            Owner owner = new Owner(Id, Fname, Lname, Phone_No, Email, Address);
            if (Fname.trim().equals("") || Lname.trim().equals("") || Phone_No.trim().equals("") || Email.trim().equals("") || Address.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter required data", "Data Error", 1);
            } else {
                if (owner.EditOwner(owner)) {
                    JOptionPane.showMessageDialog(null, "Successfully Edited", "Owner Type", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Owner Type", 2);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Operation Failed", "value Error", 1);
        }

    }//GEN-LAST:event_EditbtnActionPerformed

    private void LNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTextFieldActionPerformed

    private void PnoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnoTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void jTabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabel1MouseClicked

        int selectedRowIndex = jTabel1.getSelectedRow();
        IdTextField.setText(jTabel1.getValueAt(selectedRowIndex, 0).toString());
        FNameTextField.setText(jTabel1.getValueAt(selectedRowIndex, 1).toString());
        LNameTextField.setText(jTabel1.getValueAt(selectedRowIndex, 2).toString());
        PnoTextField.setText(jTabel1.getValueAt(selectedRowIndex, 3).toString());
        EmailTextField.setText(jTabel1.getValueAt(selectedRowIndex, 4).toString());
        AddressTextArea.setText(jTabel1.getValueAt(selectedRowIndex, 5).toString());

    }//GEN-LAST:event_jTabel1MouseClicked

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        // Refreshes the table
        ShowOwnerDataofTable();
    }//GEN-LAST:event_RefreshbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextArea AddressTextArea;
    private javax.swing.JButton Editbtn;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField FNameTextField;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField LNameTextField;
    private javax.swing.JTextField PnoTextField;
    private javax.swing.JPanel ProTypeHeadPanel;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JButton RomveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabel1;
    // End of variables declaration//GEN-END:variables
}
