
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Property_Window extends javax.swing.JFrame {

    PropertyType type = new PropertyType();
    HashMap<String, Integer> map = type.getTypesMap();

    /**
     * Creates new form Property_Window
     */
    public Property_Window() {
        initComponents();
        Border border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.white);
         ProTypeHeadPanel6.setBorder(border);
        addCombo();
    }

    public void addCombo() {

        for (String s : map.keySet()) {
            jComboBoxType.addItem(s);

        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        ProTypeHeadPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        jLabel_Address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        Addbtn = new javax.swing.JButton();
        RomveBtn = new javax.swing.JButton();
        showProperybtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel_OwnerId = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();
        SfeetTextField = new javax.swing.JTextField();
        OwnerIDTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_Bedrooms = new javax.swing.JSpinner();
        jLabel_Bedrooms = new javax.swing.JLabel();
        jSpinner_Age = new javax.swing.JSpinner();
        jLabel_Bathrooms = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner_Bathrooms = new javax.swing.JSpinner();
        jLabel_Comment = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentTextArea = new javax.swing.JTextArea();
        jCheckBoxBackyard = new javax.swing.JCheckBox();
        jCheckBoxBalcony = new javax.swing.JCheckBox();
        jCheckBoxPool = new javax.swing.JCheckBox();
        jCheckBoxGarage = new javax.swing.JCheckBox();
        Editbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        ProTypeHeadPanel6.setBackground(new java.awt.Color(102, 51, 0));

        jLabel7.setBackground(new java.awt.Color(153, 51, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Property");

        javax.swing.GroupLayout ProTypeHeadPanel6Layout = new javax.swing.GroupLayout(ProTypeHeadPanel6);
        ProTypeHeadPanel6.setLayout(ProTypeHeadPanel6Layout);
        ProTypeHeadPanel6Layout.setHorizontalGroup(
            ProTypeHeadPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProTypeHeadPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
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

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Type:");

        IdTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IdTextField.setForeground(new java.awt.Color(0, 0, 0));
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        jLabel_Address.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_Address.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Address.setText("Address:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        AddressTextArea.setBackground(new java.awt.Color(204, 204, 204));
        AddressTextArea.setColumns(20);
        AddressTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AddressTextArea.setForeground(new java.awt.Color(0, 0, 0));
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

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

        showProperybtn.setBackground(new java.awt.Color(153, 153, 153));
        showProperybtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        showProperybtn.setForeground(new java.awt.Color(0, 0, 0));
        showProperybtn.setText("Show Property");
        showProperybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProperybtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Square Feet:");

        jLabel_OwnerId.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_OwnerId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_OwnerId.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_OwnerId.setText("Owner ID:");

        jLabel_Price.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_Price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Price.setText("Price(usd):");

        SfeetTextField.setBackground(new java.awt.Color(204, 204, 204));
        SfeetTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SfeetTextField.setForeground(new java.awt.Color(0, 0, 0));
        SfeetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SfeetTextFieldActionPerformed(evt);
            }
        });

        OwnerIDTextField.setBackground(new java.awt.Color(204, 204, 204));
        OwnerIDTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OwnerIDTextField.setForeground(new java.awt.Color(0, 0, 0));
        OwnerIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerIDTextFieldActionPerformed(evt);
            }
        });

        PriceTextField.setBackground(new java.awt.Color(204, 204, 204));
        PriceTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PriceTextField.setForeground(new java.awt.Color(0, 0, 0));
        PriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextFieldActionPerformed(evt);
            }
        });

        jButton_Search.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jComboBoxType.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxType.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxType.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Age of the house:");

        jSpinner_Bedrooms.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSpinner_Bedrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel_Bedrooms.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Bedrooms.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Bedrooms.setText("            Bedrooms:");

        jSpinner_Age.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSpinner_Age.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel_Bathrooms.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Bathrooms.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Bathrooms.setText("           Bathrooms:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("0* mean brand New");

        jSpinner_Bathrooms.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSpinner_Bathrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel_Comment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Comment.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Comment.setText("Comment/Description");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        CommentTextArea.setBackground(new java.awt.Color(204, 204, 204));
        CommentTextArea.setColumns(20);
        CommentTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CommentTextArea.setForeground(new java.awt.Color(0, 0, 0));
        CommentTextArea.setRows(5);
        jScrollPane2.setViewportView(CommentTextArea);

        jCheckBoxBackyard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxBackyard.setText("Backyard");
        jCheckBoxBackyard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBackyardActionPerformed(evt);
            }
        });

        jCheckBoxBalcony.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxBalcony.setText("Balcony");
        jCheckBoxBalcony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBalconyActionPerformed(evt);
            }
        });

        jCheckBoxPool.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxPool.setText("Pool");
        jCheckBoxPool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPoolActionPerformed(evt);
            }
        });

        jCheckBoxGarage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxGarage.setText("Garage");
        jCheckBoxGarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGarageActionPerformed(evt);
            }
        });

        Editbtn1.setBackground(new java.awt.Color(153, 153, 153));
        Editbtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Editbtn1.setForeground(new java.awt.Color(0, 0, 0));
        Editbtn1.setText("Edit");
        Editbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProTypeHeadPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(IdLabel))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel_Price, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Address, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_OwnerId, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(Editbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showProperybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                                        .addComponent(PriceTextField)
                                                        .addComponent(jButton_Search)
                                                        .addComponent(SfeetTextField))
                                                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(136, 136, 136)
                                                .addComponent(jLabel_Bedrooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel_Bathrooms)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(OwnerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSpinner_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel_Comment, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxBackyard, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxBalcony, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxPool, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(ProTypeHeadPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxBalcony, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SfeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel_OwnerId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(OwnerIDTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxPool, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxBackyard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jCheckBoxGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Comment))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showProperybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RomveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        try {
            int propertyId = Integer.valueOf(IdTextField.getText());
            Property property = new Property().FindbyId(propertyId);
            if (property != null) {
                AddressTextArea.setText(property.getAddress());
                CommentTextArea.setText(property.getDescription());
                PriceTextField.setText(property.getPrice());
                SfeetTextField.setText(String.valueOf(property.getSize()));
                OwnerIDTextField.setText(String.valueOf(property.getOwnerId()));
                
                //showing selected item in the combobox
                for(Object type : map.keySet()){
                    jComboBoxType.setSelectedItem(type);
                }
                jSpinner_Bedrooms.setValue(property.getBedrooms());
                jSpinner_Bathrooms.setValue(property.getBathrooms());
                jSpinner_Age.setValue(property.getAge());
                if (property.isBalcony()) jCheckBoxBalcony.setSelected(true);
                
                if (property.isBalcony()) jCheckBoxBalcony.setSelected(true);
                
                if (property.isBalcony())  jCheckBoxBalcony.setSelected(true);
                
                if (property.isBalcony()) jCheckBoxBalcony.setSelected(true);
                

            }
            else{
                 JOptionPane.showMessageDialog(null,  "Property not Found", "Error", 0);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Please Enter valid Id", "Error", 0);
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextFieldActionPerformed

    private void OwnerIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwnerIDTextFieldActionPerformed

    private void SfeetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SfeetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SfeetTextFieldActionPerformed

    private void showProperybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProperybtnActionPerformed
        // Edit the the property type
         Properties_Window main = new Properties_Window();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_showProperybtnActionPerformed

    private void RomveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomveBtnActionPerformed
        // Remove the property type
           try {
            int Id = Integer.valueOf(IdTextField.getText());
            Property property = new Property();

            if (!IdTextField.getText().trim().equals("")) {
                int Yes_No = JOptionPane.showConfirmDialog(null, "Do you want to Remove this type", "Delete Type", JOptionPane.YES_NO_OPTION);
                if (Yes_No == JOptionPane.YES_OPTION) {
                    property.DeleteProperty(Id);

                    JOptionPane.showMessageDialog(null, "Successfully Removed", "Delete Type", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Type", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter owner Id", "Id Error", 1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Please Enter valid Id", "Error", 1);
        }
       
    }//GEN-LAST:event_RomveBtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed

        try {
            int type = map.get(jComboBoxType.getSelectedItem().toString());
            int ownerId = Integer.valueOf(OwnerIDTextField.getText());
            int squarefeet = Integer.valueOf(SfeetTextField.getText());
            int bedrooms = Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
            int age = Integer.valueOf(jSpinner_Age.getValue().toString());
            boolean Balcony = false;
            boolean Pool = false;
            boolean Garage = false;
            boolean Backyard = false;
            if (jCheckBoxBalcony.isSelected()) {
                Balcony = true;
            }

            if (jCheckBoxBackyard.isSelected()) {
                Backyard = true;
            }

            if (jCheckBoxGarage.isSelected()) {
                Garage = true;
            }

            if (jCheckBoxPool.isSelected()) {
                Pool = true;
            }

            String price = PriceTextField.getText();
            String Address = AddressTextArea.getText();
            String Description = CommentTextArea.getText();
            Property property = new Property(0, type, squarefeet, ownerId, price, Address, bedrooms, bathrooms, age, Balcony, Pool, Backyard, Garage, Description);
            if (new Property().addNewProperty(property)) {
                JOptionPane.showMessageDialog(null, "New property has been added", "Add Type", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ("Please Enter valid data"), "Add Type", 1);
        }

    }//GEN-LAST:event_AddbtnActionPerformed

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void jCheckBoxBackyardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBackyardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBackyardActionPerformed

    private void jCheckBoxBalconyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBalconyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBalconyActionPerformed

    private void jCheckBoxPoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPoolActionPerformed

    private void jCheckBoxGarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGarageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxGarageActionPerformed

    private void Editbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn1ActionPerformed
        // TODO add your handling code here:
         try {
             int id = Integer.valueOf(IdTextField.getText());
            int type = map.get(jComboBoxType.getSelectedItem().toString());
            int ownerId = Integer.valueOf(OwnerIDTextField.getText());
            int squarefeet = Integer.valueOf(SfeetTextField.getText());
            int bedrooms = Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
            int age = Integer.valueOf(jSpinner_Age.getValue().toString());
            boolean Balcony = false;
            boolean Pool = false;
            boolean Garage = false;
            boolean Backyard = false;
           
            if (jCheckBoxBackyard.isSelected())  Backyard = true;
            if (jCheckBoxGarage.isSelected())Garage = true;
            if (jCheckBoxPool.isSelected()) Pool = true;
            
            String price = PriceTextField.getText();
            String Address = AddressTextArea.getText();
            String Description = CommentTextArea.getText();
            Property property = new Property(id, type, squarefeet, ownerId, price, Address, bedrooms, bathrooms, age, Balcony, Pool, Backyard, Garage, Description);
            if (new Property().EditProperty(property)) {
                JOptionPane.showMessageDialog(null, " property has been Updated", "Edit Type", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ("Please Enter valid data"), "Edit Type", 1);
        }
    }//GEN-LAST:event_Editbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextArea AddressTextArea;
    private javax.swing.JTextArea CommentTextArea;
    private javax.swing.JButton Editbtn1;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField OwnerIDTextField;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JPanel ProTypeHeadPanel6;
    private javax.swing.JButton RomveBtn;
    private javax.swing.JTextField SfeetTextField;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JCheckBox jCheckBoxBackyard;
    private javax.swing.JCheckBox jCheckBoxBalcony;
    private javax.swing.JCheckBox jCheckBoxGarage;
    private javax.swing.JCheckBox jCheckBoxPool;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Bathrooms;
    private javax.swing.JLabel jLabel_Bedrooms;
    private javax.swing.JLabel jLabel_Comment;
    private javax.swing.JLabel jLabel_OwnerId;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_Age;
    private javax.swing.JSpinner jSpinner_Bathrooms;
    private javax.swing.JSpinner jSpinner_Bedrooms;
    private javax.swing.JButton showProperybtn;
    // End of variables declaration//GEN-END:variables
}
