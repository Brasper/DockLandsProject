/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class DockLandsGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DockLandsGUI.class.getName());
    
    //ADT Fields
    private DockLinkedList dockList;
    private MaintenancePriorityQueue maintenanceQueue;
    private CompletedStack completedStack;
    
    //Output Fields
    private javax.swing.JTextArea outputArea;

   
    public DockLandsGUI() {
        dockList = new DockLinkedList();
        maintenanceQueue = new MaintenancePriorityQueue();
        completedStack = new CompletedStack();
        
        initComponents();
        
        //Createing the output area
        outputArea = new javax.swing.JTextArea(8,40);
        outputArea.setEditable(false);
        javax.swing.JScrollPane outputScroll = new javax.swing.JScrollPane(outputArea);
        
        // adding the tabbed pane to center and outputArea to the bottom
        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER); 
        getContentPane().add(outputScroll, java.awt.BorderLayout.SOUTH);
        
        setTitle("Mobility Innovation DockLands");
        setSize(900,700);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        DockManagement = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dockIdField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        bikesField = new javax.swing.JTextField();
        scootersField = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        addDockBtn = new javax.swing.JButton();
        removeDockBtn = new javax.swing.JButton();
        updateDockBtn = new javax.swing.JButton();
        findDockBtn = new javax.swing.JButton();
        displayDocksBtn = new javax.swing.JButton();
        MaintenanceRequest = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        requestIdField = new javax.swing.JTextField();
        issueDockIdField = new javax.swing.JTextField();
        issueDescField = new javax.swing.JTextField();
        prioritySlider = new javax.swing.JSlider();
        addRequestBtn = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();
        updateRequestBtn = new javax.swing.JButton();
        deleteRequestBtn = new javax.swing.JButton();
        CompletedHistory = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        viewHistoryBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Vehicles = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        displayVehiclesBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(27, 58, 107));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));
        setSize(new java.awt.Dimension(800, 700));

        tabbedPane.setMaximumSize(new java.awt.Dimension(880, 480));
        tabbedPane.setMinimumSize(new java.awt.Dimension(880, 480));
        tabbedPane.setPreferredSize(new java.awt.Dimension(880, 480));

        DockManagement.setMaximumSize(new java.awt.Dimension(880, 480));
        DockManagement.setMinimumSize(new java.awt.Dimension(880, 480));
        DockManagement.setPreferredSize(new java.awt.Dimension(880, 480));

        jPanel1.setBackground(new java.awt.Color(27, 58, 107));
        jPanel1.setMaximumSize(new java.awt.Dimension(880, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dock ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Location");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bikes Available");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Scooters Available");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");

        statusField.addActionListener(this::statusFieldActionPerformed);

        addDockBtn.setBackground(new java.awt.Color(33, 150, 243));
        addDockBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addDockBtn.setForeground(new java.awt.Color(255, 255, 255));
        addDockBtn.setText("Add Dock");
        addDockBtn.addActionListener(this::addDockBtnActionPerformed);

        removeDockBtn.setBackground(new java.awt.Color(33, 150, 243));
        removeDockBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removeDockBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeDockBtn.setText("Remove Dock");
        removeDockBtn.addActionListener(this::removeDockBtnActionPerformed);

        updateDockBtn.setBackground(new java.awt.Color(33, 150, 243));
        updateDockBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateDockBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateDockBtn.setText("Update Dock");
        updateDockBtn.addActionListener(this::updateDockBtnActionPerformed);

        findDockBtn.setBackground(new java.awt.Color(33, 150, 243));
        findDockBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        findDockBtn.setForeground(new java.awt.Color(255, 255, 255));
        findDockBtn.setText("Find Dock");
        findDockBtn.addActionListener(this::findDockBtnActionPerformed);

        displayDocksBtn.setBackground(new java.awt.Color(33, 150, 243));
        displayDocksBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayDocksBtn.setForeground(new java.awt.Color(255, 255, 255));
        displayDocksBtn.setText("Display All Docks");
        displayDocksBtn.addActionListener(this::displayDocksBtnActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addDockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dockIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(locationField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bikesField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(scootersField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(114, 114, 114)
                                    .addComponent(statusField))))
                        .addGap(18, 18, 18)
                        .addComponent(removeDockBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateDockBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(findDockBtn)
                        .addGap(27, 27, 27)
                        .addComponent(displayDocksBtn)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dockIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bikesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scootersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDockBtn)
                    .addComponent(removeDockBtn)
                    .addComponent(updateDockBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findDockBtn)
                    .addComponent(displayDocksBtn))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        DockManagement.addTab("Main", jPanel1);

        tabbedPane.addTab("Dock Management", DockManagement);

        MaintenanceRequest.setMaximumSize(new java.awt.Dimension(880, 480));
        MaintenanceRequest.setMinimumSize(new java.awt.Dimension(880, 480));
        MaintenanceRequest.setPreferredSize(new java.awt.Dimension(880, 480));

        jPanel2.setBackground(new java.awt.Color(27, 58, 107));
        jPanel2.setMaximumSize(new java.awt.Dimension(880, 460));
        jPanel2.setMinimumSize(new java.awt.Dimension(880, 460));
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 460));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Request ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dock ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Issue Description");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Priority Level");

        prioritySlider.setMaximum(10);
        prioritySlider.setMinimum(1);
        prioritySlider.setMinorTickSpacing(1);
        prioritySlider.setPaintTicks(true);
        prioritySlider.setValue(1);

        addRequestBtn.setBackground(new java.awt.Color(33, 150, 243));
        addRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRequestBtn.setText("Add Request");
        addRequestBtn.addActionListener(this::addRequestBtnActionPerformed);

        processRequestBtn.setBackground(new java.awt.Color(33, 150, 243));
        processRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        processRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(this::processRequestBtnActionPerformed);

        updateRequestBtn.setBackground(new java.awt.Color(33, 150, 243));
        updateRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateRequestBtn.setText("Update Request");
        updateRequestBtn.addActionListener(this::updateRequestBtnActionPerformed);

        deleteRequestBtn.setBackground(new java.awt.Color(33, 150, 243));
        deleteRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteRequestBtn.setText("Delete Request");
        deleteRequestBtn.addActionListener(this::deleteRequestBtnActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prioritySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(issueDockIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(requestIdField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addRequestBtn)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteRequestBtn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(processRequestBtn)
                                .addGap(18, 18, 18)
                                .addComponent(updateRequestBtn))))
                    .addComponent(issueDescField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(requestIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(issueDockIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(issueDescField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(prioritySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRequestBtn)
                    .addComponent(processRequestBtn)
                    .addComponent(updateRequestBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteRequestBtn)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        MaintenanceRequest.addTab("Main", jPanel2);

        tabbedPane.addTab("Maintenance Request", MaintenanceRequest);

        CompletedHistory.setMaximumSize(new java.awt.Dimension(880, 480));
        CompletedHistory.setMinimumSize(new java.awt.Dimension(880, 480));
        CompletedHistory.setPreferredSize(new java.awt.Dimension(880, 480));

        jPanel3.setBackground(new java.awt.Color(27, 58, 107));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(880, 460));
        jPanel3.setMinimumSize(new java.awt.Dimension(880, 460));

        viewHistoryBtn.setBackground(new java.awt.Color(33, 150, 243));
        viewHistoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        viewHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewHistoryBtn.setText("View History");
        viewHistoryBtn.addActionListener(this::viewHistoryBtnActionPerformed);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("View all completed Maintenance repairs!");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(viewHistoryBtn)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewHistoryBtn)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        CompletedHistory.addTab("Main", jPanel3);

        tabbedPane.addTab("Completed History", CompletedHistory);

        Vehicles.setMaximumSize(new java.awt.Dimension(880, 480));
        Vehicles.setMinimumSize(new java.awt.Dimension(880, 480));
        Vehicles.setPreferredSize(new java.awt.Dimension(880, 480));

        jPanel4.setBackground(new java.awt.Color(27, 58, 107));
        jPanel4.setMaximumSize(new java.awt.Dimension(880, 460));
        jPanel4.setMinimumSize(new java.awt.Dimension(880, 460));

        displayVehiclesBtn.setBackground(new java.awt.Color(33, 150, 243));
        displayVehiclesBtn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        displayVehiclesBtn.setForeground(new java.awt.Color(255, 255, 255));
        displayVehiclesBtn.setText("Display Vehicles");
        displayVehiclesBtn.setAlignmentX(340.0F);
        displayVehiclesBtn.setAlignmentY(200.0F);
        displayVehiclesBtn.addActionListener(this::displayVehiclesBtnActionPerformed);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Display all vehicles in the system!");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayVehiclesBtn)
                .addGap(292, 292, 292))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayVehiclesBtn)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        Vehicles.addTab("Main", jPanel4);

        tabbedPane.addTab("Vehicles", Vehicles);

        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDockBtnActionPerformed
      try {
          //getting text fromm each field and parse it to the correct type
          int id  = Integer.parseInt(dockIdField.getText());
          String location = locationField.getText();
          int bikes = Integer.parseInt(bikesField.getText());
          int scooters = Integer.parseInt(scootersField.getText());
          String status = statusField.getText();
          //validate status to only take in active or maintance
          if (!status.equals("Active") && !status.equals("Maintenance")){
              outputArea.setText(
              "=== Error ===\n\n" +
              "Status must be either:\n\n" +
               "Active or Maintenacne"
              
              );
              return;
          }
          // creating neeew dock object wiht the entered details
          Dock d = new Dock(id, location, bikes, scooters, status);
          //add dock to linked list
          dockList.addDock(d);
          //show result in outputarea
          outputArea.setText("===Dock has been Added Successfully ===\n\n" 
          + d.printDetails());
          // clears all fields after adding
          dockIdField.setText("");
          locationField.setText("");
          bikesField.setText("");
          scootersField.setText("");
          statusField.setText("");
          } catch (NumberFormatException e) {
              //shows error if invalid numbers are entered
              outputArea.setText("Error: Please only enter valid numbers");
          }
    
    }//GEN-LAST:event_addDockBtnActionPerformed

    private void viewHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryBtnActionPerformed
        //check if completed stack is empty
        if (completedStack.isEmpty()){
            //Shows message if no comepleted requests yet
            outputArea.setText("No completed requests yet:");
            
        } else {
            //redirect system to output to capture viewhistory output
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            //create new print stream to capture outpuit 
            java.io.PrintStream ps = new java.io.PrintStream(baos);
            //save the orginal system output 
            java.io.PrintStream old = System.out;
            //redirect output to baos
            System.setOut(ps);
            //call viewhistroy on compelted stack
            completedStack.viewHistory();
            //flush output stream 
            System.out.flush();
            //restore oringal system output
            System.setOut(old);
            //show history in output area
            outputArea.setText("=== Completed Maintenance History ===\n\n"
            + baos.toString());
        }
    }//GEN-LAST:event_viewHistoryBtnActionPerformed

    private void displayVehiclesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayVehiclesBtnActionPerformed
      //create bike object extending vehicle 
      // demonstrates inheritence
      Vehicle bike1 = new Bike (1, "Bike" , 6);
      Vehicle bike2 = new Bike (2, "Bike" , 3);
      Vehicle bike3 = new Bike (3, "Bike" , 8);
      //creates scooter object extending vehicle
      // demonstrates inheritence
      Scooter scooter1 = new Scooter(4, "Scooter", 20);
      Scooter scooter2 = new Scooter(5, "Scooter", 350);
      Scooter scooter3 = new Scooter(6, "Scooter", 50);
      //calls printDetails () on both objects
      // demonstrates polyorphism 
      //differnt outputs for each subclass
      outputArea.setText(
              "=== Vehicles in the System ===\n\n" +
              "-- Bikes --\n" +
              bike1.printDetails() + "\n" +
              bike2.printDetails() + "\n" +
              bike3.printDetails() + "\n" +
              "-- Scooters --\n" +
              scooter1.printDetails()+ "\n" +
              scooter2.printDetails()+ "\n" +
              scooter3.printDetails()
      );
    }//GEN-LAST:event_displayVehiclesBtnActionPerformed

    private void removeDockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDockBtnActionPerformed
       try {
           // gets dock id from the field
           int id = Integer.parseInt(dockIdField.getText());
           // remove dock from linked list
           dockList.removeDock(id);
           // shows usccess message
           outputArea.setText("=== Dock Removed ===\n\n" +
           "Dock ID: " + id + "was removed successfully"
           );
           //clears field after removing
           dockIdField.setText("");
           } catch (NumberFormatException e ) {
               //shows error if invalid id is entered
           outputArea.setText("Error: Please enter a valid Dock Id");
           
       }
    }//GEN-LAST:event_removeDockBtnActionPerformed

    private void updateDockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDockBtnActionPerformed
    try{
        // gets teext from each field and pasrees it to correect type
        int id = Integer.parseInt(dockIdField.getText());
        String location = locationField.getText();
        int bikes = Integer.parseInt(bikesField.getText());
        int scooters = Integer.parseInt(scootersField.getText());
        String status = statusField.getText();
         //validate status to only take in active or maintance
          if (!status.equals("Active") && !status.equals("Maintenance")){
              outputArea.setText(
              "=== Error ===\n\n" +
              "Status must be either:\n\n" +
               "Active or Maintenacne"
              
              );
              return;
          }
        // checks if dock exists before updating
        Dock existing = dockList.findDock(id);
        if (existing ==null){
            //show error message if dock does not exist
           outputArea.setText("=== Error ===\n\n" +
           "Dock ID:" + id + " does not exist\n"+
           "Please add a dock first"
           );
           return;
        }
        // creates new dock object wiht the updated details
        Dock d = new Dock(id, location, bikes, scooters, status);
        // updates the dock in linked list
        dockList.updateDock(d);
        //shows the result in the output area
        outputArea.setText(
        "=== Dock Updated Sucessfully ===\n\n" +
         d.printDetails());
        //clears all fields after updating
         dockIdField.setText("");
         locationField.setText("");
         bikesField.setText("");
         scootersField.setText("");
         statusField.setText("");
        
    } catch (NumberFormatException e ) {
        //shows error message if invalid numbers are entered 
        outputArea.setText("Error: Please enter a valid Number:");
    }
    }//GEN-LAST:event_updateDockBtnActionPerformed

    private void findDockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDockBtnActionPerformed
       try {
           // get dock id from the field
           int id = Integer.parseInt(dockIdField.getText());
           // searches for dock in linked list
           Dock d = dockList.findDock(id);
           //check if dock was found
           if( d !=null) {
               //shows dock detials if found
               outputArea.setText(
                "=== Dock was Found ===\n\n" +
                d.printDetails());
               
           } else {
                // shows not found message 
               outputArea.setText("Dock" + id + " was not found:");
           }
           // clears field after searching
           dockIdField.setText("");
       } catch (NumberFormatException e){
           // shows error message if invalid id is entered 
           outputArea.setText("Error: please enter a valid Dock ID:");
       }
    }//GEN-LAST:event_findDockBtnActionPerformed

    private void displayDocksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayDocksBtnActionPerformed
       // redirects system ouytput to capture display dock output
       java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
       java.io.PrintStream ps = new java.io.PrintStream(baos);
       // saves the original system output
       java.io.PrintStream old = System.out;
       // redirect output to baos
       System.setOut(ps);
       //displays all docks
       dockList.displayDocks();
       //flushes and resotres oringal output
       System.out.flush();
       System.setOut(old);
       //shows all docks in output area 
       outputArea.setText("=== All Docks in System ===\n\n"
       + baos.toString());
       
    }//GEN-LAST:event_displayDocksBtnActionPerformed

    private void addRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRequestBtnActionPerformed

        try {
           //get request id from the field and parrse it to int 
           int id = Integer.parseInt(requestIdField.getText());
           int dockId = Integer.parseInt(issueDockIdField.getText());
           
           //get issue desctiption from field
           String issue = issueDescField.getText();
           //get priorirty level from slider
           int priority = prioritySlider.getValue();
           // create new MaintenanceRequest object with entered details
           MaintenanceRequest r = new MaintenanceRequest(id, dockId, issue , priority);
           //add request to priority queue
           maintenanceQueue.addRequest(r);
           //show result in outputarea
           outputArea.setText("=== Request added Successfull ===\n\n"
           + r.printDetails());
           //clear all fields after adding 
           requestIdField.setText("");
           issueDockIdField.setText("");
           issueDescField.setText("");
           //reset slider back to 1
           
          prioritySlider.setValue(1);
      }catch (NumberFormatException e ){
      //show error if any invalid numbers are entered
      outputArea.setText("Error: Please enter valid numebrs for ID and Dock ID:");
      }
    }//GEN-LAST:event_addRequestBtnActionPerformed

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // process the highest priority request from the queue
        MaintenanceRequest r = maintenanceQueue.processRequest();
        //check if a request was returned
        if (r !=null) {
            //push the processed request onto the compelted stack
            completedStack.push(r);
            //show the process request in the output area
            outputArea.setText("=== Request processed and moved into history ===\n\n"
            + r.printDetails());
            
        } else {
            //show message if queue is empty
            outputArea.setText("No requests in the queue");
        }
    }//GEN-LAST:event_processRequestBtnActionPerformed

    private void updateRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRequestBtnActionPerformed
     try {
         // get request ID from the field and parse it into int
         int id = Integer.parseInt(requestIdField.getText());
         // get new priority level from the slider
         int newPriority = prioritySlider.getValue();
         //update the request by the priority in the queue
         maintenanceQueue.updateRequest(id, newPriority);
         // show success message in the output area
         outputArea.setText("=== Request Updated ===\n\n" +
         "Request ID:" + id +
         " Updated to the Priority" + newPriority);
         //clear request Id field after updating
         requestIdField.setText("");
         //reset slider back to 1
         prioritySlider.setValue(1);
         
     } catch (NumberFormatException e ) {
         //show error if invalid id is entered
         outputArea.setText("Error: Please enter a valid ID Request");
     }
    }//GEN-LAST:event_updateRequestBtnActionPerformed

    private void deleteRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRequestBtnActionPerformed
       try{
           //get request id from the field and pass it to parse
           int id = Integer.parseInt(requestIdField.getText());
           // delete request from the priority queue
           maintenanceQueue.deleteRequest(id);
           //show succcess message in output area
           outputArea.setText("=== Request Deleted ===\n\n" +
           "Request ID:" + id +
           " Was deleted Successfully:");
           //clear request Id field after deleting it
           requestIdField.setText("");
           
       } catch (NumberFormatException e ) {
           
           // show error if invalid id is entered
           outputArea.setText("Error: Please entert a valid Request ID");
       }
    }//GEN-LAST:event_deleteRequestBtnActionPerformed

    private void statusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusFieldActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DockLandsGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CompletedHistory;
    private javax.swing.JTabbedPane DockManagement;
    private javax.swing.JTabbedPane MaintenanceRequest;
    private javax.swing.JTabbedPane Vehicles;
    private javax.swing.JButton addDockBtn;
    private javax.swing.JButton addRequestBtn;
    private javax.swing.JTextField bikesField;
    private javax.swing.JButton deleteRequestBtn;
    private javax.swing.JButton displayDocksBtn;
    private javax.swing.JButton displayVehiclesBtn;
    private javax.swing.JTextField dockIdField;
    private javax.swing.JButton findDockBtn;
    private javax.swing.JTextField issueDescField;
    private javax.swing.JTextField issueDockIdField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField locationField;
    private javax.swing.JSlider prioritySlider;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JButton removeDockBtn;
    private javax.swing.JTextField requestIdField;
    private javax.swing.JTextField scootersField;
    private javax.swing.JTextField statusField;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton updateDockBtn;
    private javax.swing.JButton updateRequestBtn;
    private javax.swing.JButton viewHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
