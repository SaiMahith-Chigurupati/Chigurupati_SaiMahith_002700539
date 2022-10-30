/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.House;
import model.HouseDirectory;
import model.Patient;

/**
 *
 * @author mahith
 */



public class CommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminPanel
     */
    
    HouseDirectory houseDirectory;
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
    JSplitPane splitPane;
    
    City selectedCity;
    Community selectedCommunity;
    House selectedHouse;
   
    
    
    public CommunityAdminPanel(HouseDirectory houseDirectory, CommunityDirectory communityDirectory, CityDirectory cityDirectory, JSplitPane splitPane) {
        initComponents();
        
        this.houseDirectory = houseDirectory;
        this.communityDirectory = communityDirectory;
        this.cityDirectory = cityDirectory;
        this.splitPane = splitPane;
        
        populateCities();
        populateCommunities();
        populateHouses();
        
        cityPanel.setVisible(false);
        communityPanel.setVisible(false);
        housePanel.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        btnCreateCity = new javax.swing.JButton();
        btnCreateCommunity = new javax.swing.JButton();
        btnHouse = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        btnUpdateCommunity = new javax.swing.JButton();
        btnUpdateHouse = new javax.swing.JButton();
        btnDeleteCity = new javax.swing.JButton();
        btnDeleteCommunity = new javax.swing.JButton();
        btnDeleteHouse = new javax.swing.JButton();
        cityPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNewCity = new javax.swing.JTextField();
        btnSaveCity = new javax.swing.JButton();
        communityPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNewCommunity = new javax.swing.JTextField();
        btnSaveCommunity = new javax.swing.JButton();
        chComCity = new javax.swing.JComboBox<>();
        housePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNewHouse = new javax.swing.JTextField();
        chCommunity = new javax.swing.JComboBox<>();
        chHouseCity = new javax.swing.JComboBox<>();
        btnSaveHouse = new javax.swing.JButton();

        tblCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCommunities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCommunitiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCommunities);

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Houses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHouses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHousesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHouses);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCitiesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCities);

        btnCreateCity.setText("Create City");
        btnCreateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCityActionPerformed(evt);
            }
        });

        btnCreateCommunity.setText("Create Community");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });

        btnHouse.setText("Create House");
        btnHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseActionPerformed(evt);
            }
        });

        btnUpdateCity.setText("Update City");
        btnUpdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCityActionPerformed(evt);
            }
        });

        btnUpdateCommunity.setText("Update Community");
        btnUpdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommunityActionPerformed(evt);
            }
        });

        btnUpdateHouse.setText("Update House");
        btnUpdateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHouseActionPerformed(evt);
            }
        });

        btnDeleteCity.setText("Delete");
        btnDeleteCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCityActionPerformed(evt);
            }
        });

        btnDeleteCommunity.setText("Delete");
        btnDeleteCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCommunityActionPerformed(evt);
            }
        });

        btnDeleteHouse.setText("Delete");
        btnDeleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHouseActionPerformed(evt);
            }
        });

        jLabel1.setText("City");

        btnSaveCity.setText("Create");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cityPanelLayout = new javax.swing.GroupLayout(cityPanel);
        cityPanel.setLayout(cityPanelLayout);
        cityPanelLayout.setHorizontalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cityPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(txtNewCity, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cityPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnSaveCity)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        cityPanelLayout.setVerticalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNewCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("City");

        jLabel3.setText("Community");

        btnSaveCommunity.setText("Create");
        btnSaveCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommunityActionPerformed(evt);
            }
        });

        chComCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));

        javax.swing.GroupLayout communityPanelLayout = new javax.swing.GroupLayout(communityPanel);
        communityPanel.setLayout(communityPanelLayout);
        communityPanelLayout.setHorizontalGroup(
            communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityPanelLayout.createSequentialGroup()
                .addGroup(communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(communityPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, communityPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, communityPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)))
                        .addGroup(communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewCommunity)
                            .addComponent(chComCity, 0, 112, Short.MAX_VALUE)))
                    .addGroup(communityPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnSaveCommunity)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        communityPanelLayout.setVerticalGroup(
            communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(chComCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(communityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNewCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSaveCommunity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("City");

        jLabel5.setText("Community");

        jLabel6.setText("House");

        chCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));

        chHouseCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        chHouseCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chHouseCityActionPerformed(evt);
            }
        });

        btnSaveHouse.setText("Create");
        btnSaveHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout housePanelLayout = new javax.swing.GroupLayout(housePanel);
        housePanel.setLayout(housePanelLayout);
        housePanelLayout.setHorizontalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(housePanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4))
                            .addGroup(housePanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))))
                        .addGap(23, 23, 23)
                        .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewHouse)
                            .addComponent(chCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chHouseCity, 0, 117, Short.MAX_VALUE)))
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnSaveHouse)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        housePanelLayout.setVerticalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(chHouseCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNewHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnSaveHouse)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCreateCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCity))
                    .addComponent(btnUpdateCity, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateCommunity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCommunity))
                    .addComponent(communityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateCommunity))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteHouse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateHouse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(housePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCity)
                    .addComponent(btnCreateCommunity)
                    .addComponent(btnHouse)
                    .addComponent(btnDeleteCity)
                    .addComponent(btnDeleteCommunity)
                    .addComponent(btnDeleteHouse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateHouse)
                    .addComponent(btnUpdateCity)
                    .addComponent(btnUpdateCommunity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(communityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(housePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCityActionPerformed
        // TODO add your handling code here:
        txtNewCity.setText("");
        cityPanel.setVisible(true);
        
    }//GEN-LAST:event_btnCreateCityActionPerformed

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
        communityPanel.setVisible(true);
        
        btnSaveCity.setText("Create");
                chComCity.setSelectedIndex(0);
                txtNewCommunity.setText("");    
        try{
            chComCity.removeAllItems();
                chComCity.addItem("Select...");
        }catch(Exception e){
            
        }
                
                
                for(City city:cityDirectory.getCityDirectory()){
                    chComCity.addItem(city.getCity());
                }
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void btnHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseActionPerformed
        // TODO add your handling code here:
        housePanel.setVisible(true);
        btnSaveHouse.setText("Create");
        try{
            chHouseCity.removeAllItems();
            chHouseCity.addItem("Select...");
            chCommunity.addItem("Select...");
                
                
        }catch(Exception e){
            
        }
                
        for(City city:cityDirectory.getCityDirectory()){
            chHouseCity.addItem(city.getCity()); 
        }
        
    }//GEN-LAST:event_btnHouseActionPerformed

    private void chHouseCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chHouseCityActionPerformed
        // TODO add your handling code here:
        
        String houseCity= chHouseCity.getSelectedItem().toString();
        
            chCommunity.removeAllItems();
            chCommunity.addItem("Select...");
            chHouseCity.addItem("Select...");
        for(Community community:communityDirectory.getCommunityDirectory()){
            if(community.getCity() == houseCity){
                chCommunity.addItem(community.getCommunity());
            }
                    
                }
    }//GEN-LAST:event_chHouseCityActionPerformed

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
        if(btnSaveCity.getText().equals("Create")){
            City newCity = cityDirectory.addCity();
        
            newCity.setCity(txtNewCity.getText());

            JOptionPane.showMessageDialog(this, "City Created");
            populateCities();
            cityPanel.setVisible(false);
        }else{
           
            
            City upCity = cityDirectory.getCity(selectedCity.getCity());
            upCity.setCity(txtNewCity.getText());
            JOptionPane.showMessageDialog(this, "City Updated");
            populateCities();
            cityPanel.setVisible(false);
            btnSaveCity.setText("Create");
            
        }
        txtNewCity.setText("");
    }//GEN-LAST:event_btnSaveCityActionPerformed

    private void btnSaveCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommunityActionPerformed
        // TODO add your handling code here:
        
        if(btnSaveCommunity.getText().equals("Create")){
            Community newCommunity = communityDirectory.addCommunity();
        
            newCommunity.setCommunity(txtNewCommunity.getText());
            newCommunity.setCity(chComCity.getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(this, "Community Created");
            populateCommunities();
            communityPanel.setVisible(false);
            
        }else{
            Community newCommunity = communityDirectory.getCommunity(selectedCommunity.getCommunity());
            
            newCommunity.setCommunity(txtNewCommunity.getText());
            newCommunity.setCity(chComCity.getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(this, "Community Updated");
            populateCommunities();
            communityPanel.setVisible(false);
            btnSaveCommunity.setText("Create");
        }
        
        
  
    }//GEN-LAST:event_btnSaveCommunityActionPerformed

    private void btnSaveHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHouseActionPerformed
        // TODO add your handling code here:
        if(btnSaveHouse.getText().equals("Create")){
            House newHouse = houseDirectory.addHouse();
        
            newHouse.setCommunity(chCommunity.getSelectedItem().toString());
            newHouse.setCity(chHouseCity.getSelectedItem().toString());
            newHouse.setHouse(txtNewHouse.getText());
            
            JOptionPane.showMessageDialog(this, "House Created");
            populateHouses();
            
            housePanel.setVisible(false);
        }else{
            House newHouse = houseDirectory.getHouse(selectedHouse.getHouse());
        
            newHouse.setCommunity(chCommunity.getSelectedItem().toString());
            newHouse.setCity(chHouseCity.getSelectedItem().toString());
            newHouse.setHouse(txtNewHouse.getText());
            
            JOptionPane.showMessageDialog(this, "House Updated");
            populateHouses();
            
            housePanel.setVisible(false);
            btnSaveHouse.setText("Create");
        }
        chHouseCity.setSelectedIndex(0);
        chCommunity.setSelectedIndex(0);
        txtNewHouse.setText("");
        
    }//GEN-LAST:event_btnSaveHouseActionPerformed

    private void tblCitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCitiesMouseClicked
        // TODO add your handling code here:
        
        
        int index = tblCities.getSelectedRow();
        TableModel model = tblCities.getModel();
        
        String cityName = model.getValueAt(index, 0).toString();
        selectedCity = cityDirectory.getCity(cityName);
        
        
    }//GEN-LAST:event_tblCitiesMouseClicked

    private void tblCommunitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCommunitiesMouseClicked
        // TODO add your handling code here:
        int index = tblCommunities.getSelectedRow();
        TableModel model = tblCommunities.getModel();
        
        String communityName = model.getValueAt(index, 0).toString();
        selectedCommunity = communityDirectory.getCommunity(communityName);
    }//GEN-LAST:event_tblCommunitiesMouseClicked

    private void tblHousesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHousesMouseClicked
        // TODO add your handling code here:
        int index = tblHouses.getSelectedRow();
        TableModel model = tblHouses.getModel();
        
        String houseName = model.getValueAt(index, 0).toString();
        selectedHouse = houseDirectory.getHouse(houseName);
        
    }//GEN-LAST:event_tblHousesMouseClicked

    private void btnDeleteCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCityActionPerformed
        // TODO add your handling code here:
        if(selectedCity!=null){
            cityDirectory.deleteCity(selectedCity);
            
            JOptionPane.showMessageDialog(this, "City Deleted");
            populateCities();
        }else{
            JOptionPane.showMessageDialog(this, "Select a City to Delete");
        }
    }//GEN-LAST:event_btnDeleteCityActionPerformed

    private void btnDeleteCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCommunityActionPerformed
        // TODO add your handling code here:
        if(selectedCommunity!=null){
            communityDirectory.deleteCommunity(selectedCommunity);
            
            JOptionPane.showMessageDialog(this, "Community Deleted");
            populateCommunities();
        }else{
            JOptionPane.showMessageDialog(this, "Select a Community to Delete");
        }
    }//GEN-LAST:event_btnDeleteCommunityActionPerformed

    private void btnDeleteHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHouseActionPerformed
        // TODO add your handling code here:
        if(selectedHouse!=null){
            houseDirectory.deleteHouse(selectedHouse);
            
            JOptionPane.showMessageDialog(this, "House Deleted");
            populateHouses();
        }else{
            JOptionPane.showMessageDialog(this, "Select a House to Delete");
        }
    }//GEN-LAST:event_btnDeleteHouseActionPerformed

    private void btnUpdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCityActionPerformed
        // TODO add your handling code here:
        if(selectedCity!=null){
            cityPanel.setVisible(true);
        
            txtNewCity.setText(selectedCity.getCity());
            btnSaveCity.setText("Update");
            
        }else{
            JOptionPane.showMessageDialog(this, "Select a City to Update");
        }
        
    }//GEN-LAST:event_btnUpdateCityActionPerformed

    private void btnUpdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommunityActionPerformed
        // TODO add your handling code here:
        if(selectedCommunity!=null){
            communityPanel.setVisible(true);
            btnSaveCommunity.setText("Update");
            try{
                chComCity.removeAllItems();
                chComCity.addItem("Select...");
            }catch(Exception e){
                
            }
            
                
                for(City city:cityDirectory.getCityDirectory()){
                    chComCity.addItem(city.getCity());
                }
            
            
        
            chComCity.setSelectedItem(selectedCommunity.getCity());
            txtNewCommunity.setText(selectedCommunity.getCommunity());
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Select a City to Update");
        }
        
        
    }//GEN-LAST:event_btnUpdateCommunityActionPerformed

    private void btnUpdateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHouseActionPerformed
        // TODO add your handling code here:
        if(selectedHouse!=null){
            housePanel.setVisible(true);
            btnSaveHouse.setText("Update");
            try{
                chHouseCity.removeAllItems();
            chHouseCity.addItem("Select...");
            chCommunity.addItem("Select...");
            }catch(Exception e){
                
            }
            
                for(City city:cityDirectory.getCityDirectory()){
                    chHouseCity.addItem(city.getCity());
                }

            chHouseCity.setSelectedItem(selectedHouse.getCity());
            chCommunity.setSelectedItem(selectedHouse.getCommunity());
            txtNewHouse.setText(selectedHouse.getHouse());
        }else{
            JOptionPane.showMessageDialog(this, "Please select a House to update/view");
        }
        
        
        
    }//GEN-LAST:event_btnUpdateHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnDeleteCity;
    private javax.swing.JButton btnDeleteCommunity;
    private javax.swing.JButton btnDeleteHouse;
    private javax.swing.JButton btnHouse;
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JButton btnUpdateCommunity;
    private javax.swing.JButton btnUpdateHouse;
    private javax.swing.JComboBox<String> chComCity;
    private javax.swing.JComboBox<String> chCommunity;
    private javax.swing.JComboBox<String> chHouseCity;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JPanel communityPanel;
    private javax.swing.JPanel housePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtNewCity;
    private javax.swing.JTextField txtNewCommunity;
    private javax.swing.JTextField txtNewHouse;
    // End of variables declaration//GEN-END:variables


    public void populateCities(){
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        
        for(City city: cityDirectory.getCityDirectory()){
            
            Object[] Row =new Object[1];
            Row[0] = city.getCity();
            
            model.addRow(Row);
        }
    }
    
    public void populateCommunities(){
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        model.setRowCount(0);
        
        for(Community community: communityDirectory.getCommunityDirectory()){
            
            Object[] Row =new Object[1];
            Row[0] = community.getCommunity();
            
            model.addRow(Row);
        }
    }
    
    public void populateHouses(){
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        
        for(House house: houseDirectory.getHouseDirectory()){
            
            Object[] Row =new Object[1];
            Row[0] = house.getHouse();
            
            model.addRow(Row);
        }
    }

}
