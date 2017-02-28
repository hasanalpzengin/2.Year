/*
Created by Hasan Alp ZENGIN
Language : Java
 */
package numbertranslator;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class NumberTranslatorGui extends javax.swing.JFrame {

    /**
     * Creates new form NumberTranslatorGui
     */
    public NumberTranslatorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        info_frame = new javax.swing.JFrame();
        infomain_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        maku_image = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        innerPanel = new javax.swing.JPanel();
        numberText = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        mainRadixCB = new javax.swing.JComboBox<>();
        mainRadixText = new javax.swing.JLabel();
        targetRadixText = new javax.swing.JLabel();
        targetRadixCB = new javax.swing.JComboBox<>();
        newNumberText = new javax.swing.JLabel();
        translateButton = new javax.swing.JButton();
        newNumberTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        school_logo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();

        info_frame.setMinimumSize(new java.awt.Dimension(252, 242));
        info_frame.setPreferredSize(new java.awt.Dimension(252, 242));
        info_frame.getContentPane().setLayout(null);

        infomain_panel.setBackground(new java.awt.Color(254, 254, 254));
        infomain_panel.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("<html>Bu Program Hasan Alp ZENGIN\nTarafından Sayısal Sistemler\nDersi İçin Yapılmıştır. 10 Çeşit Sayı Tabanı Çevirisi Mevcuttur. Rakamlar : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y</html>");
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout infomain_panelLayout = new javax.swing.GroupLayout(infomain_panel);
        infomain_panel.setLayout(infomain_panelLayout);
        infomain_panelLayout.setHorizontalGroup(
            infomain_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infomain_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        infomain_panelLayout.setVerticalGroup(
            infomain_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infomain_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        info_frame.getContentPane().add(infomain_panel);
        infomain_panel.setBounds(0, 0, 250, 240);

        maku_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maku_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbertranslator/school_logo.png"))); // NOI18N
        info_frame.getContentPane().add(maku_image);
        maku_image.setBounds(0, 10, 240, 220);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sayı Tabanı Çevirici - Hasan Alp Zengin");

        mainPanel.setBackground(new java.awt.Color(241, 241, 241));

        title.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(1, 1, 1));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Sayı Tabanı Çevirici");

        innerPanel.setBackground(new java.awt.Color(254, 254, 254));
        innerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numberText.setText("Sayı : ");

        numberTextField.setBackground(new java.awt.Color(254, 254, 254));

        mainRadixCB.setBackground(new java.awt.Color(254, 254, 254));
        mainRadixCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Selected", "Binary (2)", "Ternary (3)", "Quaternary (4)", "(5)", "(6)", "(7)", "Octal (8)", "(9)", "Decimal (10)", "(11)", "(12)", "(13)", "(14)", "(15)", "Hexadecimal (16)", "(17)", "(18)", "(19)", "(20)", "(21)", "(22)", "(23)", "(24)", "(25)", "(26)", "(27)", "(28)", "(29)", "(30)", "(31)", "(32)", "(33)", "(34)", "(35)", "BCD" }));

        mainRadixText.setText("Sayı Tabanı : ");

        targetRadixText.setText("Hedef Taban :");

        targetRadixCB.setBackground(new java.awt.Color(254, 254, 254));
        targetRadixCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Selected", "Binary (2)", "Ternary (3)", "Quaternary (4)", "(5)", "(6)", "(7)", "Octal (8)", "(9)", "Decimal (10)", "Hexadecimal (16)", "BCD" }));

        newNumberText.setText("Yeni Sayı : ");

        translateButton.setBackground(new java.awt.Color(254, 254, 254));
        translateButton.setText("Çevir");
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });

        newNumberTextField.setEditable(false);
        newNumberTextField.setBackground(new java.awt.Color(254, 254, 254));

        clearButton.setBackground(new java.awt.Color(254, 254, 254));
        clearButton.setText("Temizle");
        clearButton.setOpaque(true);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        infoButton.setBackground(new java.awt.Color(254, 254, 254));
        infoButton.setText("?");
        infoButton.setOpaque(true);
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        school_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbertranslator/school_logo.png"))); // NOI18N

        javax.swing.GroupLayout innerPanelLayout = new javax.swing.GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addComponent(newNumberText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newNumberTextField))
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberText)
                            .addComponent(mainRadixText)
                            .addComponent(targetRadixText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainRadixCB, 0, 180, Short.MAX_VALUE)
                            .addComponent(numberTextField)
                            .addComponent(targetRadixCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(translateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton)
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addComponent(school_logo)
                        .addGap(6, 6, 6)
                        .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        innerPanelLayout.setVerticalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberText)
                            .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoButton))
                        .addGap(18, 18, 18)
                        .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainRadixCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainRadixText))
                        .addGap(18, 18, 18)
                        .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(targetRadixText)
                            .addComponent(targetRadixCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(translateButton))
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(school_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newNumberTextField)
                    .addGroup(innerPanelLayout.createSequentialGroup()
                        .addComponent(newNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbertranslator/calculator.png"))); // NOI18N

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbertranslator/calculator.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        //choice control
        getChoice();
        
    }//GEN-LAST:event_translateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        newNumberTextField.setText("");
        targetRadixCB.setSelectedIndex(0);
        mainRadixCB.setSelectedIndex(0);
        numberTextField.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        info_frame.setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    public void getChoice(){
        //get choices
        int selected_mainRadix = mainRadixCB.getSelectedIndex();
        int selected_targetRadix = targetRadixCB.getSelectedIndex();
        //this variable created for result
        String result;
        
        if(selected_mainRadix == 0){
            JOptionPane.showMessageDialog(rootPane, "Sayı Tabanı Seçilmedi !");
            Toolkit.getDefaultToolkit().beep();
        }else if(selected_targetRadix == 0){
            JOptionPane.showMessageDialog(rootPane, "Hedef Sayı Tabanı Seçilmedi !");
            Toolkit.getDefaultToolkit().beep();
        }else{
            //mainRadix combobox to real radixes.
            switch(selected_mainRadix){
                case 1:{selected_mainRadix=2;break;}
                case 2:{selected_mainRadix=3;break;}
                case 3:{selected_mainRadix=4;break;}
                case 4:{selected_mainRadix=5;break;}
                case 5:{selected_mainRadix=6;break;}
                case 6:{selected_mainRadix=7;break;}
                case 7:{selected_mainRadix=8;break;}
                case 8:{selected_mainRadix=9;break;}
                case 9:{selected_mainRadix=10;break;}
                case 10:{selected_mainRadix=11;break;}
                case 11:{selected_mainRadix=12;break;}
                case 12:{selected_mainRadix=13;break;}
                case 13:{selected_mainRadix=14;break;}
                case 14:{selected_mainRadix=15;break;}
                case 15:{selected_mainRadix=16;break;}
                case 16:{selected_mainRadix=17;break;}
                case 17:{selected_mainRadix=18;break;}
                case 18:{selected_mainRadix=19;break;}
                case 19:{selected_mainRadix=20;break;}
                case 20:{selected_mainRadix=21;break;}
                case 21:{selected_mainRadix=22;break;}
                case 22:{selected_mainRadix=23;break;}
                case 23:{selected_mainRadix=24;break;}
                case 24:{selected_mainRadix=25;break;}
                case 25:{selected_mainRadix=26;break;}
                case 26:{selected_mainRadix=27;break;}
                case 27:{selected_mainRadix=28;break;}
                case 28:{selected_mainRadix=29;break;}
                case 39:{selected_mainRadix=30;break;}
                case 30:{selected_mainRadix=31;break;}
                case 31:{selected_mainRadix=32;break;}
                case 32:{selected_mainRadix=33;break;}
                case 33:{selected_mainRadix=34;break;}
                case 34:{selected_mainRadix=35;break;}
                case 35:{selected_mainRadix=36;break;}
            }
            //targetRadix combobox to real radixes
            switch(selected_targetRadix){
                case 1:{selected_targetRadix=2;break;}
                case 2:{selected_targetRadix=3;break;}
                case 3:{selected_targetRadix=4;break;}
                case 4:{selected_targetRadix=5;break;}
                case 5:{selected_targetRadix=6;break;}
                case 6:{selected_targetRadix=7;break;}
                case 7:{selected_targetRadix=8;break;}
                case 8:{selected_targetRadix=9;break;}
                case 9:{selected_targetRadix=10;break;}
                case 10:{selected_targetRadix=16;break;}
                case 11:{selected_targetRadix=36;break;}
            }
            
            result = translate(selected_mainRadix, selected_targetRadix);
            //change text of newNumber
            newNumberTextField.setText(result);
        }
        
    }
    
    public String translate(int main,int target){
        String result = "Error";
        String number = numberTextField.getText();
        
        if(main==target){
            result = number;
        }else if(target == 36){
            result = toBCD(main);
        }else if(main == 36){
            result = BCDto(target);
        }else if(target == 16){
            result = tohexa(main);
        }else if(main == 16){
            result = hexato(target);
        }else{
            try{
                StringBuilder sBuild = new StringBuilder();
                //if number is float
                try{
                    String[] numbers = number.split("\\W+");
                    //main,target
                    sBuild.append(Integer.toString(Integer.parseInt(numbers[0],main),target));
                    //float part
                    sBuild.append(",");
                    sBuild.append(Integer.toString(Integer.parseInt(numbers[1],main),target));
        
                    result = sBuild.toString();
                    //number is float else
                }catch(ArrayIndexOutOfBoundsException ex){
                    result = Integer.toString(Integer.parseInt(number, main), target);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Sayı Seçilen Tabanda Değil !");
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
        return result;
    }
    
    public String tohexa(int main){
        String result = "error";
        //get text from text field
        String number = numberTextField.getText();
        
        try{
                StringBuilder sBuild = new StringBuilder();
                //if number is float
                try{
                    String[] numbers = number.split("\\W+");
                    //main,target
                    sBuild.append(Integer.toHexString(Integer.parseInt(numbers[0], main)));
                    //float part
                    sBuild.append(",");
                    sBuild.append(Integer.toHexString(Integer.parseInt(numbers[1], main)));
        
                    result = sBuild.toString();
                    //number is float else
                }catch(ArrayIndexOutOfBoundsException ex){
                    result = Integer.toHexString(Integer.parseInt(number, main));
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Sayı Seçilen Tabanda Değil !");
                Toolkit.getDefaultToolkit().beep();
            }
        
        return result;
        
        
    }
    
    public String hexato(int target){
        String result = "error";
        //get number from text field
        String number = numberTextField.getText();
        //hexato
        try{
                StringBuilder sBuild = new StringBuilder();
                //if number is float
                try{
                    String[] numbers = number.split("\\W+");
                    //main,target
                    sBuild.append(Integer.toString(Integer.parseInt(numbers[0], 16), target));
                    //float part
                    sBuild.append(",");
                    sBuild.append(Integer.toString(Integer.parseInt(numbers[1], 16), target));
        
                    result = sBuild.toString();
                    //number is float else
                }catch(ArrayIndexOutOfBoundsException ex){
                    result = Integer.toString(Integer.parseInt(number, 16), target);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Sayı Seçilen Tabanda Değil !");
                Toolkit.getDefaultToolkit().beep();
            }
        
        return result;
        
    }
    
    public String toBCD(int main){
        //get number from textfield
        String strnumber = numberTextField.getText();
        //convert main to decimal
        strnumber = Integer.toString(Integer.parseInt(strnumber, main), 10);
        
        //import string builder for final result
        StringBuilder sbuild = new StringBuilder();
        int charnumAt;
        String binaryCharnumAt;
        String finalbinary;
        
        for(int i = 0; i<strnumber.length(); i++){
            
            //char to int selected
            charnumAt = Character.getNumericValue(strnumber.charAt(i));
            //char to binaryChar
            binaryCharnumAt = Integer.toBinaryString(charnumAt);
            
            int lenght = binaryCharnumAt.length();
            
            for(int j = 0; j<4-lenght; j++){
                
                binaryCharnumAt = "0"+binaryCharnumAt;
                
            }
            
            sbuild.append(binaryCharnumAt);
            sbuild.append(" ");
            
        }
        
        
        
        return sbuild.toString();
        
        
    }
    
    public String BCDto(int target){
        
        String result;
        String number = numberTextField.getText();
        
        StringBuilder sBuild = new StringBuilder();
        //seperate BCD by space
        String[] sArray = number.split("\\s+");
        //get count of number.
        int lenght = sArray.length;
        //convert binary to decimal and append it
        for(int i = 0; i<lenght ; i++){
            sBuild.append(Integer.parseInt(sArray[i],2));
        }
        //if target is hexadecimal
        if(target != 16){
            result = String.valueOf(Integer.parseInt(sBuild.toString(), target));
        }
        else{
            result = Integer.toHexString(Integer.parseInt(sBuild.toString()));
        }
        
        return result;
        
    }
    
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
            java.util.logging.Logger.getLogger(NumberTranslatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberTranslatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberTranslatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberTranslatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberTranslatorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JFrame info_frame;
    private javax.swing.JPanel infomain_panel;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> mainRadixCB;
    private javax.swing.JLabel mainRadixText;
    private javax.swing.JLabel maku_image;
    private javax.swing.JLabel newNumberText;
    private javax.swing.JTextField newNumberTextField;
    private javax.swing.JLabel numberText;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JLabel school_logo;
    private javax.swing.JComboBox<String> targetRadixCB;
    private javax.swing.JLabel targetRadixText;
    private javax.swing.JLabel title;
    private javax.swing.JButton translateButton;
    // End of variables declaration//GEN-END:variables
}
