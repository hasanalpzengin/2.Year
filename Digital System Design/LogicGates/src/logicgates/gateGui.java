/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicgates;

import javax.swing.JOptionPane;

/**
 *
 * @author hasalp
 */
public class gateGui extends javax.swing.JFrame {
    
    gates gates = new gates();

    public gateGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        schemeImage = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        orbutton = new javax.swing.JToggleButton();
        andbutton = new javax.swing.JToggleButton();
        norbutton = new javax.swing.JToggleButton();
        nandbutton = new javax.swing.JToggleButton();
        xorbutton = new javax.swing.JToggleButton();
        xnorbutton = new javax.swing.JToggleButton();
        notbutton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        gate1 = new javax.swing.JLabel();
        output1_gui = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        gate2 = new javax.swing.JLabel();
        output2_gui = new javax.swing.JTextField();
        resultButton = new javax.swing.JButton();
        infogate1 = new javax.swing.JButton();
        infogate2 = new javax.swing.JButton();
        attention = new javax.swing.JLabel();

        infoFrame.setMinimumSize(new java.awt.Dimension(470, 400));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 400));

        text.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schemeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schemeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logic Gates");

        mainPanel.setBackground(new java.awt.Color(254, 254, 254));

        mainTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mainTitle.setText("Mantıksal Kapılar");

        orbutton.setBackground(new java.awt.Color(254, 254, 254));
        orbutton.setText("OR");
        orbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orbuttonActionPerformed(evt);
            }
        });

        andbutton.setBackground(new java.awt.Color(254, 254, 254));
        andbutton.setText("AND");
        andbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andbuttonActionPerformed(evt);
            }
        });

        norbutton.setBackground(new java.awt.Color(254, 254, 254));
        norbutton.setText("NOR");
        norbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norbuttonActionPerformed(evt);
            }
        });

        nandbutton.setBackground(new java.awt.Color(254, 254, 254));
        nandbutton.setText("NAND");
        nandbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nandbuttonActionPerformed(evt);
            }
        });

        xorbutton.setBackground(new java.awt.Color(254, 254, 254));
        xorbutton.setText("XOR");
        xorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xorbuttonActionPerformed(evt);
            }
        });

        xnorbutton.setBackground(new java.awt.Color(254, 254, 254));
        xnorbutton.setText("XNOR");
        xnorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnorbuttonActionPerformed(evt);
            }
        });

        notbutton.setBackground(new java.awt.Color(254, 254, 254));
        notbutton.setText("NOT");
        notbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(andbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(norbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nandbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xorbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xnorbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(notbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addComponent(orbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(norbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nandbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xorbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xnorbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notbutton))
        );

        input1.setBackground(new java.awt.Color(254, 254, 254));
        input1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        input2.setEditable(false);
        input2.setBackground(new java.awt.Color(254, 254, 254));
        input2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png"))); // NOI18N

        output1_gui.setEditable(false);
        output1_gui.setBackground(new java.awt.Color(230, 230, 230));
        output1_gui.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        input3.setEditable(false);
        input3.setBackground(new java.awt.Color(254, 254, 254));
        input3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png"))); // NOI18N

        output2_gui.setEditable(false);
        output2_gui.setBackground(new java.awt.Color(236, 231, 231));
        output2_gui.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        resultButton.setBackground(new java.awt.Color(254, 254, 254));
        resultButton.setText("Sonuçlandır");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        infogate1.setBackground(new java.awt.Color(254, 254, 254));
        infogate1.setText("?");
        infogate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogate1ActionPerformed(evt);
            }
        });

        infogate2.setBackground(new java.awt.Color(254, 254, 254));
        infogate2.setText("?");
        infogate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogate2ActionPerformed(evt);
            }
        });

        attention.setText("Not : Default Değer \"false\" 'dir.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(gate1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(output1_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(infogate1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gate2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(output2_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(infogate2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(attention)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gate1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attention))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(infogate1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(infogate2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(output2_gui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(output1_gui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(gate2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(resultButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mainTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xorbuttonActionPerformed
        if(xorbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xor.png")));
                        gates.gate1="XOR";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xor.png")));
                        gates.gate2="XOR";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                xorbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="XOR"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_xorbuttonActionPerformed

    private void notbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notbuttonActionPerformed
        if(notbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(false);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/not.png")));
                        gates.gate1="NOT";
                        break;
                    }
                    default:{
                        input3.setEditable(false);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/not.png")));
                        gates.gate2="NOT";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                notbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="NOT"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));;
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_notbuttonActionPerformed

    private void orbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orbuttonActionPerformed
        if(orbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/or.png")));
                        gates.gate1="OR";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/or.png")));
                        gates.gate2="OR";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                orbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="OR"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_orbuttonActionPerformed

    private void andbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andbuttonActionPerformed
        if(andbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/and.png")));
                        gates.gate1="AND";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/and.png")));
                        gates.gate2="AND";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                andbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="AND"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_andbuttonActionPerformed

    private void norbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norbuttonActionPerformed
        if(norbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nor.png")));
                        gates.gate1="NOR";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nor.png")));
                        gates.gate2="NOR";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                norbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="NOR"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_norbuttonActionPerformed

    private void nandbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nandbuttonActionPerformed
        if(nandbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nand.png")));
                        gates.gate1="NAND";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nand.png")));
                        gates.gate2="NAND";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                nandbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="NAND"){
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
                input3.setEditable(false);
            }else{
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
                input2.setEditable(false);
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_nandbuttonActionPerformed

    private void xnorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnorbuttonActionPerformed
        if(xnorbutton.isSelected()){
            if(gates.buttoncount!=2){
                switch(gates.gate1){
                    case "":{
                        input2.setEditable(true);
                        gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xnor.png")));
                        gates.gate1="XNOR";
                        break;
                    }
                    default:{
                        input3.setEditable(true);
                        gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xnor.png")));
                        gates.gate2="XNOR";
                        break;
                    }
                }
                gates.buttoncount++;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fazla Seçim Yaptınız.");
                xnorbutton.setSelected(false);
            }
        }else{
            if(gates.gate2=="XNOR"){
                input3.setEditable(false);
                gate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate2="";
            }else{
                input2.setEditable(false);
                gate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/cable.png")));
                gates.gate1="";
            }
            gates.buttoncount--;
        }
    }//GEN-LAST:event_xnorbuttonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        
        boolean input_1 = false;
        boolean input_2 = false;
        boolean input_3 = false;
        boolean output1 = false;
        boolean output2 = false;
        //set boolean for input1
        if(input1.getText().contains("1")){
            input_1=true;
        }else if(input1.getText().contains("0")){
            input_1=false;
        }else{
            JOptionPane.showMessageDialog(rootPane, "1 ya da 0 girmelisiniz...");
        }
        
        if(gates.gate1!="" && gates.gate1!="NOT"){
            //set boolean for input2
            if(input2.getText().contains("1")){
                input_2=true;
            }else if(input2.getText().contains("0")){
                input_2=false;
            }else{
                JOptionPane.showMessageDialog(rootPane, "1 ya da 0 girmelisiniz...");
            }
        }
        
        if(gates.gate2!="" && gates.gate1!="NOT"){
            //set boolean for input3
            if(input3.getText().contains("1")){
                input_3=true;
            }else if(input3.getText().contains("0")){
                input_3=false;
            }else{
                JOptionPane.showMessageDialog(rootPane, "1 ya da 0 girmelisiniz...");
            }
        }
        
        switch(gates.gate1){
            case "AND":{
                output1 = gates.and(input_1, input_2);
                break;
            }
            case "OR":{
                output1 = gates.or(input_1, input_2);
                break;
            }
            case "NAND":{
                output1 = gates.nand(input_1, input_2);
                break;
            }
            case "NOR":{
                output1 = gates.nor(input_1, input_2);
                break;
            }
            case "XOR":{
                output1 = gates.xor(input_1, input_2);
                break;
            }
            case "XNOR":{
                output1 = gates.xnor(input_1, input_2);
                break;
            }
            case "NOT":{
                output1 = !input_1;
                break;
            }
            case "":{
                output1 = input_1;
                break;
            }
        }
        
        if(output1==false){
            output1_gui.setText("0");
        }else{
            output1_gui.setText("1");
        }
        
            switch(gates.gate2){
            case "AND":{
                output2 = gates.and(output1, input_3);
                break;
            }
            case "OR":{
                output2 = gates.or(output1, input_3);
                break;
            }
            case "NAND":{
                output2 = gates.nand(output1, input_3);
                break;
            }
            case "NOR":{
                output2 = gates.nor(output1, input_3);
                break;
            }
            case "XOR":{
                output2 = gates.xor(output1, input_3);
                break;
            }
            case "XNOR":{
                output2 = gates.xnor(output1, input_3);
                break;
            }
            case "NOT":{
                output2 = !output1;
                break;
            }
            case "":{
                output2 = output1;
                break;
            }
            }
            
            if(output2==false){
                output2_gui.setText("0");
            }else{
                output2_gui.setText("1");
            }
        
    }//GEN-LAST:event_resultButtonActionPerformed

    private void infogate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogate1ActionPerformed
        
        switch(gates.gate1){
            case "AND":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/and7408.png")));
                text.setText("https://www.google.com.tr/search?&q=7408");
                break;
            }
            case "OR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/or7432.png")));
                text.setText("https://www.google.com.tr/search?&q=7432");
                break;
            }
            case "NAND":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nand7400.png")));
                text.setText("https://www.google.com.tr/search?&q=7400");
                break;
            }
            case "NOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nor7402.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7402");
                break;
            }
            case "XOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xor7486.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7486");
                break;
            }
            case "XNOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xnor74266.png")));
                text.setText("https://www.google.com.tr/search?&q=74266");
                break;
            }
            case "NOT":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/not7404.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7404");
                break;
            }
            case "":{
                schemeImage.setText("KAPI SEÇİLMEDİ");
                schemeImage.setIcon(null);
                text.setText("Kapı Seçilmedi");
                JOptionPane.showMessageDialog(rootPane, "Mantık Kapısı Seçilmedi ...");
                break;
            }
        }
        
        infoFrame.setVisible(true);
        
    }//GEN-LAST:event_infogate1ActionPerformed

    private void infogate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogate2ActionPerformed
        switch(gates.gate2){
            case "AND":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/and7408.png")));
                text.setText("https://www.google.com.tr/search?&q=7408");
                break;
            }
            case "OR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/or7432.png")));
                text.setText("https://www.google.com.tr/search?&q=7432");
                break;
            }
            case "NAND":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nand7400.png")));
                text.setText("https://www.google.com.tr/search?&q=7400");
                break;
            }
            case "NOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/nor7402.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7402");
                break;
            }
            case "XOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xor7486.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7486");
                break;
            }
            case "XNOR":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/xnor74266.png")));
                text.setText("https://www.google.com.tr/search?&q=74266");
                break;
            }
            case "NOT":{
                schemeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicgates/gates/not7404.PNG")));
                text.setText("https://www.google.com.tr/search?&q=7404");
                break;
            }
            case "":{
                schemeImage.setText("KAPI SEÇİLMEDİ");
                schemeImage.setIcon(null);
                text.setText("Kapı Seçilmedi");
                JOptionPane.showMessageDialog(rootPane, "Mantık Kapısı Seçilmedi ...");
                break;
            }
        }
        
        infoFrame.setVisible(true);
    }//GEN-LAST:event_infogate2ActionPerformed

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
            java.util.logging.Logger.getLogger(gateGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gateGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gateGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gateGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gateGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton andbutton;
    private javax.swing.JLabel attention;
    private javax.swing.JLabel gate1;
    private javax.swing.JLabel gate2;
    private javax.swing.JFrame infoFrame;
    private javax.swing.JButton infogate1;
    private javax.swing.JButton infogate2;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JToggleButton nandbutton;
    private javax.swing.JToggleButton norbutton;
    private javax.swing.JToggleButton notbutton;
    private javax.swing.JToggleButton orbutton;
    private javax.swing.JTextField output1_gui;
    private javax.swing.JTextField output2_gui;
    private javax.swing.JButton resultButton;
    private javax.swing.JLabel schemeImage;
    private javax.swing.JTextField text;
    private javax.swing.JToggleButton xnorbutton;
    private javax.swing.JToggleButton xorbutton;
    // End of variables declaration//GEN-END:variables
}
