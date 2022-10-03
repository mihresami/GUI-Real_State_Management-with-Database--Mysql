
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.chart.PieChart.Data;
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
public class Sale_Window extends javax.swing.JFrame {

    /**
     * Creates new form Sale_Window
     */
    public Sale_Window() {
        initComponents();
         Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
         ProTypeHeadPanel6.setBorder(border);
         showProperties();
         ShowClient();
         ShowSaleData();
    }
    
     public void showProperties() {
        Property property = new Property();
        ArrayList<Property> list = property.PropertyList();
        //table columns
        String[] ColNames = {"ID", "Owner Id","Price"};
        Object[][] rows = new Object[list.size()][3];
        //add data form the list to the rows
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getOwnerId();
            rows[i][2] = list.get(i).getPrice();
           

        }
        DefaultTableModel model = new DefaultTableModel(rows, ColNames);
        jTabel_property.setModel(model);
        jTabel_property.setRowHeight(35);
        jTabel_property.setSelectionBackground(Color.red);

    }
      public void ShowClient() {
        Client client = new Client();
        ArrayList<Client> list = client.clientList();
        //table columns
        String[] ColNames = {"ID", "First Name", "Last Name"};
        Object[][] rows = new Object[list.size()][3];
        //add data form the list to the rows
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getFname();
            rows[i][2] = list.get(i).getLname();
       

        }
        DefaultTableModel model = new DefaultTableModel(rows, ColNames);
        jTabel_client.setModel(model);
        jTabel_client.setRowHeight(35);
        jTabel_client.setSelectionBackground(Color.red);

    }
      public void ShowSaleData() {
        Sale sale = new Sale();
        ArrayList<Sale> list = sale.saleList();
        //table columns
        String[] ColNames = {"ID", "Property Id","Client Id","Final Price","Date"};
        Object[][] rows = new Object[list.size()][5];
        //add data form the list to the rows
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getPropertyId();
            rows[i][2] = list.get(i).getClientId();
             rows[i][3] = list.get(i).getFinalPrice();
              rows[i][4] = list.get(i).getSellingDate();
            
       

        }
        DefaultTableModel model = new DefaultTableModel(rows, ColNames);
        jTabel_Sale.setModel(model);
        jTabel_Sale.setRowHeight(35);
        jTabel_Sale.setSelectionBackground(Color.red);

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        ProTypeHeadPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        jLabel_propertyId = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        TextField_PropertyId = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        RomveBtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        jLabel_clientId = new javax.swing.JLabel();
        jLabel_finalPrice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextField_clientId = new javax.swing.JTextField();
        TextField_finalPrice = new javax.swing.JTextField();
        jDateChooser_SaleaDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabel_property = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabel_client = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabel_Sale = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(102, 102, 0));

        ProTypeHeadPanel6.setBackground(new java.awt.Color(102, 51, 0));

        jLabel7.setBackground(new java.awt.Color(153, 51, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sale");

        javax.swing.GroupLayout ProTypeHeadPanel6Layout = new javax.swing.GroupLayout(ProTypeHeadPanel6);
        ProTypeHeadPanel6.setLayout(ProTypeHeadPanel6Layout);
        ProTypeHeadPanel6Layout.setHorizontalGroup(
            ProTypeHeadPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProTypeHeadPanel6Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProTypeHeadPanel6Layout.setVerticalGroup(
            ProTypeHeadPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProTypeHeadPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        IdLabel.setBackground(new java.awt.Color(153, 153, 153));
        IdLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdLabel.setText("Id:");

        jLabel_propertyId.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_propertyId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_propertyId.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_propertyId.setText("Property ID:");

        IdTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IdTextField.setForeground(new java.awt.Color(0, 0, 0));
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        TextField_PropertyId.setBackground(new java.awt.Color(204, 204, 204));
        TextField_PropertyId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_PropertyId.setForeground(new java.awt.Color(0, 0, 0));
        TextField_PropertyId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PropertyIdActionPerformed(evt);
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

        jLabel_clientId.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_clientId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_clientId.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_clientId.setText("Client  ID:");

        jLabel_finalPrice.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_finalPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_finalPrice.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_finalPrice.setText("Final Price:");

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("           Date:");

        TextField_clientId.setBackground(new java.awt.Color(204, 204, 204));
        TextField_clientId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_clientId.setForeground(new java.awt.Color(0, 0, 0));
        TextField_clientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_clientIdActionPerformed(evt);
            }
        });

        TextField_finalPrice.setBackground(new java.awt.Color(204, 204, 204));
        TextField_finalPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_finalPrice.setForeground(new java.awt.Color(0, 0, 0));
        TextField_finalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_finalPriceActionPerformed(evt);
            }
        });

        jDateChooser_SaleaDate.setDateFormatString("dd/MM/ yyyy");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Property List");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clients List");

        jTabel_property.setBackground(new java.awt.Color(204, 204, 204));
        jTabel_property.setForeground(new java.awt.Color(0, 0, 0));
        jTabel_property.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabel_property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabel_propertyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabel_property);

        jTabel_client.setBackground(new java.awt.Color(204, 204, 204));
        jTabel_client.setForeground(new java.awt.Color(0, 0, 0));
        jTabel_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabel_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabel_clientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabel_client);

        jTabel_Sale.setBackground(new java.awt.Color(204, 204, 204));
        jTabel_Sale.setForeground(new java.awt.Color(0, 0, 0));
        jTabel_Sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabel_Sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabel_SaleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTabel_Sale);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Saled List");

        RefreshBtn.setBackground(new java.awt.Color(153, 153, 153));
        RefreshBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProTypeHeadPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IdLabel)
                            .addComponent(jLabel_propertyId)
                            .addComponent(jLabel_clientId)
                            .addComponent(jLabel_finalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser_SaleaDate, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(TextField_PropertyId)
                                    .addComponent(TextField_clientId)
                                    .addComponent(TextField_finalPrice)
                                    .addComponent(IdTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RomveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                        .addComponent(Editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 23, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(ProTypeHeadPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel_propertyId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_clientId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_finalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(TextField_PropertyId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextField_clientId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextField_finalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser_SaleaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void TextField_PropertyIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PropertyIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PropertyIdActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
     
        try{
      int propertyId = Integer.valueOf(TextField_PropertyId.getText());
     int clientId = Integer.valueOf(TextField_clientId.getText());
     String finalPrice = TextField_finalPrice.getText();
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     String sellingdate = dateFormat.format(jDateChooser_SaleaDate.getDate());
     Sale sale = new Sale(0,propertyId,clientId,finalPrice,sellingdate);
     if(new Sale().addSale(sale)){
         JOptionPane.showMessageDialog(null, "A New sale Has been added","Add sale Type",1);
         
     }
     else{
         JOptionPane.showMessageDialog(null, "A sale has not been added","Add Type",2);
     }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please Enter valid Data","Error",2);
        }
       
    }//GEN-LAST:event_AddbtnActionPerformed

    private void RomveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomveBtnActionPerformed
        // Remove the property type
        try{
        int id = Integer.valueOf(IdTextField.getText());
       
     if(new Sale().deleteSale(id)){
         JOptionPane.showMessageDialog(null, "A New sale Has been Deleted","Add sale Type",1);
         
     }
     else{
         JOptionPane.showMessageDialog(null, "A sale has not been Deleted","Add Type",2);
     }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select valid data","Error",2);
        }
       
    }//GEN-LAST:event_RomveBtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        // Edit the the property type
        try{
     int id = Integer.valueOf(IdTextField.getText());
     int propertyId = Integer.valueOf(TextField_PropertyId.getText());
     int clientId = Integer.valueOf(TextField_clientId.getText());
     String finalPrice = TextField_finalPrice.getText();
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     String sellingdate = dateFormat.format(jDateChooser_SaleaDate.getDate());
     Sale sale = new Sale(id,propertyId,clientId,finalPrice,sellingdate);
     if(new Sale().editSale(sale)){
         JOptionPane.showMessageDialog(null, "A New sale Has been Updated","Add sale Type",1);
         
     }
     else{
         JOptionPane.showMessageDialog(null, "A sale has not been updated","Add Type",2);
     }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Enter Valid Data Type","Error",2);
        }
    }//GEN-LAST:event_EditbtnActionPerformed

    private void TextField_clientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_clientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_clientIdActionPerformed

    private void TextField_finalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_finalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_finalPriceActionPerformed

    private void jTabel_propertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabel_propertyMouseClicked

        int selectedRowIndex = jTabel_property.getSelectedRow();
        IdTextField.setText(jTabel_property.getValueAt(selectedRowIndex, 0).toString());
        TextField_PropertyId.setText(jTabel_property.getValueAt(selectedRowIndex, 1).toString());
        TextField_finalPrice.setText(jTabel_property.getValueAt(selectedRowIndex, 2).toString());
        
    }//GEN-LAST:event_jTabel_propertyMouseClicked

    private void jTabel_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabel_clientMouseClicked
        // TODO add your handling code here:
         int selectedRowIndex = jTabel_client.getSelectedRow();
         TextField_clientId.setText(jTabel_client.getValueAt(selectedRowIndex, 0).toString());
         
        
    }//GEN-LAST:event_jTabel_clientMouseClicked

    private void jTabel_SaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabel_SaleMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTabel_Sale.getSelectedRow();
        IdTextField.setText(jTabel_Sale.getValueAt(selectedRowIndex, 0).toString());
        TextField_PropertyId.setText(jTabel_Sale.getValueAt(selectedRowIndex, 1).toString());
        TextField_clientId.setText(jTabel_Sale.getValueAt(selectedRowIndex, 2).toString());
         TextField_finalPrice.setText(jTabel_Sale.getValueAt(selectedRowIndex, 3).toString());
         Date saleDate;
         try{
             saleDate = new SimpleDateFormat("yyyy-MM-dd").parse(jTabel_Sale.getValueAt(selectedRowIndex,4).toString());
             jDateChooser_SaleaDate.setDate(saleDate);
             
         }
         catch(Exception ex){
             
         }
         
         
    }//GEN-LAST:event_jTabel_SaleMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        // TODO add your handling code here:
        ShowSaleData();
        showProperties();
         ShowClient();
    }//GEN-LAST:event_RefreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JPanel ProTypeHeadPanel6;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton RomveBtn;
    private javax.swing.JTextField TextField_PropertyId;
    private javax.swing.JTextField TextField_clientId;
    private javax.swing.JTextField TextField_finalPrice;
    private com.toedter.calendar.JDateChooser jDateChooser_SaleaDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_clientId;
    private javax.swing.JLabel jLabel_finalPrice;
    private javax.swing.JLabel jLabel_propertyId;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTabel_Sale;
    private javax.swing.JTable jTabel_client;
    private javax.swing.JTable jTabel_property;
    // End of variables declaration//GEN-END:variables
}
