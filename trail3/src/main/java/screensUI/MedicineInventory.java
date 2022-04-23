/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package screensUI;

/**
 *
 * @author Sreyoshi
 */
public class MedicineInventory extends javax.swing.JPanel {

    /**
     * Creates new form MedicineInventory
     */
    public MedicineInventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlinventory = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        lblmedicinepic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblenterq = new javax.swing.JLabel();
        cmbenterq = new javax.swing.JComboBox<>();
        btnsaveinventory = new javax.swing.JButton();
        lblnewmedicine = new javax.swing.JLabel();
        txtnewmedicine = new javax.swing.JTextField();
        scrlpnlpharmatable = new javax.swing.JScrollPane();
        tblmedicineview = new javax.swing.JTable();
        lblpicquantity = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        pnlinventory.setBackground(new java.awt.Color(51, 0, 102));

        lblheading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheading.setForeground(new java.awt.Color(255, 255, 255));
        lblheading.setText("DRUG STORE-  Always Available Pharma");

        lblmedicinepic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sreyoshi\\Documents\\AED_Assignments\\AED-finalProject\\Image\\medicine 1.jpg")); // NOI18N

        javax.swing.GroupLayout pnlinventoryLayout = new javax.swing.GroupLayout(pnlinventory);
        pnlinventory.setLayout(pnlinventoryLayout);
        pnlinventoryLayout.setHorizontalGroup(
            pnlinventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblheading, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmedicinepic, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlinventoryLayout.setVerticalGroup(
            pnlinventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinventoryLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblheading, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblmedicinepic, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Medicine Name-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paracetamol", "EcoSprin", "FlavadonMR.CaberGolin" }));

        lblenterq.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblenterq.setForeground(new java.awt.Color(0, 0, 153));
        lblenterq.setText("Enter Quanity-");

        cmbenterq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnsaveinventory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsaveinventory.setText("Save");
        btnsaveinventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveinventoryActionPerformed(evt);
            }
        });

        lblnewmedicine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblnewmedicine.setForeground(new java.awt.Color(0, 0, 153));
        lblnewmedicine.setText("New Medicine-");

        tblmedicineview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Quantity"
            }
        ));
        scrlpnlpharmatable.setViewportView(tblmedicineview);

        lblpicquantity.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sreyoshi\\Documents\\AED_Assignments\\AED-finalProject\\Image\\graph.PNG")); // NOI18N

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnupdate.setText("Update");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("<< Go back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrlpnlpharmatable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lblnewmedicine)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnsaveinventory)
                                                .addComponent(lblenterq)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtnewmedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnupdate)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(cmbenterq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblpicquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlinventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlinventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblpicquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnewmedicine)
                            .addComponent(txtnewmedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblenterq)
                            .addComponent(cmbenterq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsaveinventory)
                            .addComponent(btnupdate))
                        .addGap(41, 41, 41)
                        .addComponent(scrlpnlpharmatable, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveinventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveinventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveinventoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsaveinventory;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbenterq;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblenterq;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblmedicinepic;
    private javax.swing.JLabel lblnewmedicine;
    private javax.swing.JLabel lblpicquantity;
    private javax.swing.JPanel pnlinventory;
    private javax.swing.JScrollPane scrlpnlpharmatable;
    private javax.swing.JTable tblmedicineview;
    private javax.swing.JTextField txtnewmedicine;
    // End of variables declaration//GEN-END:variables
}
