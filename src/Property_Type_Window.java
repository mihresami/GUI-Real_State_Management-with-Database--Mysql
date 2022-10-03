
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Property_Type_Window extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type_Window
     */
    public Property_Type_Window() {
        initComponents();
        Border menu_items = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        ProTypeHeadPanel.setBorder(menu_items);
        fillTypeList();

    }

    public void fillTypeList() {
        PropertyType type = new PropertyType();
        HashMap<String, Integer> map = type.getTypesMap();
        DefaultListModel listModel = new DefaultListModel();
        int i = 0;
        for (String s : map.keySet()) {
            listModel.add(i, s);
            i++;

        }
        jList1.setModel(listModel);

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
        NameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescTextArea = new javax.swing.JTextArea();
        Refreshbtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        RomveBtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        ProTypeHeadPanel.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Type");

        javax.swing.GroupLayout ProTypeHeadPanelLayout = new javax.swing.GroupLayout(ProTypeHeadPanel);
        ProTypeHeadPanel.setLayout(ProTypeHeadPanelLayout);
        ProTypeHeadPanelLayout.setHorizontalGroup(
            ProTypeHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProTypeHeadPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProTypeHeadPanelLayout.setVerticalGroup(
            ProTypeHeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProTypeHeadPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        IdLabel.setBackground(new java.awt.Color(153, 153, 153));
        IdLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdLabel.setText("Id:");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name:");

        IdTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IdTextField.setForeground(new java.awt.Color(0, 0, 0));
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        NameTextField.setBackground(new java.awt.Color(204, 204, 204));
        NameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameTextField.setForeground(new java.awt.Color(0, 0, 0));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Description");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        DescTextArea.setBackground(new java.awt.Color(204, 204, 204));
        DescTextArea.setColumns(20);
        DescTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DescTextArea.setForeground(new java.awt.Color(0, 0, 0));
        DescTextArea.setRows(5);
        jScrollPane1.setViewportView(DescTextArea);

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

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProTypeHeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(IdLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane2)
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ProTypeHeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        String name = NameTextField.getText();
        String descrption = DescTextArea.getText();
        PropertyType type = new PropertyType(0, name, descrption);
        if (!name.trim().equals("")) {
            if (type.ExcuteTypeQuery("add", type)) {
                JOptionPane.showMessageDialog(null, "Successfully Added", "Add Type", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter property type", "Add Type", 2);

        }

    }//GEN-LAST:event_AddbtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        // Edit the the property type

        try {
            Integer id = Integer.valueOf(IdTextField.getText());
            String name = NameTextField.getText();
            String descrption = DescTextArea.getText();
            PropertyType type = new PropertyType(id, name, descrption);
            if (!name.trim().equals("")) {
                if (type.ExcuteTypeQuery("edit", type)) {
                    JOptionPane.showMessageDialog(null, "Successfully Updated", "Edit Type", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter property type", "Edit Type", 2);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Please enter property type ID", "ID error", 0);

        }
    }//GEN-LAST:event_EditbtnActionPerformed

    private void RomveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomveBtnActionPerformed
        // Remove the property type
        try {
            Integer id = Integer.valueOf(IdTextField.getText());
            PropertyType type = new PropertyType(id, "", "");

            if (!IdTextField.getText().trim().equals("")) {
                int Yes_NO = JOptionPane.showConfirmDialog(null, "Do you want to Remove this type", "Delete Type", JOptionPane.YES_NO_OPTION);
                if (Yes_NO == JOptionPane.YES_OPTION) {
                    if (type.ExcuteTypeQuery("remove", type)) {
                        JOptionPane.showMessageDialog(null, "Successfuly Removed", "Edit Type", 1);
                        IdTextField.setText("");
                        NameTextField.setText("");
                        DescTextArea.setText("");
    
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);
                    }

                }
                
            }
            else {
                    JOptionPane.showMessageDialog(null, "Please Enter valid Id", "Remove Type", 2);
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Please enter property type", "ID error", 0);

        }


    }//GEN-LAST:event_RomveBtnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        //display the selected type from the list type
        PropertyType type = new PropertyType();
        HashMap<String, Integer> map = type.getTypesMap();
        Integer typeid = map.get(jList1.getSelectedValue());
        type = type.getTypeById(typeid);
        IdTextField.setText(type.getId().toString());
        NameTextField.setText(type.getName());
        DescTextArea.setText(type.getDescrption());


    }//GEN-LAST:event_jList1MouseClicked

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        // TODO add your handling code here:
        fillTypeList();
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
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Type_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Type_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextArea DescTextArea;
    private javax.swing.JButton Editbtn;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPanel ProTypeHeadPanel;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JButton RomveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
