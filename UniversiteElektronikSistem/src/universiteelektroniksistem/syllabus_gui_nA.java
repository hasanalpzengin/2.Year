/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universiteelektroniksistem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hasalp
 */
public class syllabus_gui_nA extends javax.swing.JFrame {

    /**
     * Creates new form syllabus_gui
     */
    public syllabus_gui_nA() {
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

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        department_cb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        grade_cb = new javax.swing.JComboBox<>();
        mainMenu_button = new javax.swing.JButton();
        viewSyllabus = new javax.swing.JButton();
        season_cb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        syllabus_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EU - Ders Programı");
        setIconImage(new ImageIcon(getClass().getResource("/images/logo50x50.png")).getImage());
        setMinimumSize(new java.awt.Dimension(750, 454));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setText("Ders Programı İşlemleri");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bölüm");

        jLabel3.setText("Sınıf");

        grade_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hazırlık", "1", "2", "3", "4", "5", "6", "7" }));

        mainMenu_button.setBackground(new java.awt.Color(254, 254, 254));
        mainMenu_button.setText("Ana Menü");
        mainMenu_button.setOpaque(true);
        mainMenu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu_buttonActionPerformed(evt);
            }
        });

        viewSyllabus.setText("Program Görüntüle");
        viewSyllabus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSyllabusActionPerformed(evt);
            }
        });

        season_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Güz", "Bahar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grade_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(department_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(season_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewSyllabus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(department_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grade_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(season_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(viewSyllabus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenu_button)
                .addContainerGap())
        );

        syllabus_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9:30", null, null, null, null, null},
                {"10:30", null, null, null, null, null},
                {"11:30", null, null, null, null, null},
                {"13:30", null, null, null, null, null},
                {"14:30", null, null, null, null, null},
                {"15:30", null, null, null, null, null},
                {"16:30", null, null, null, null, null}
            },
            new String [] {
                "Saat\\Gün", "PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA"
            }
        ));
        syllabus_table.setRowHeight(40);
        jScrollPane1.setViewportView(syllabus_table);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Connection connect = new db_connection().connect;
            Statement stm = (Statement) connect.createStatement();
            ResultSet rs = (ResultSet) stm.executeQuery("SELECT bolum_ismi FROM bolumler");
            
            while(rs.next()){
                department_cb.addItem(rs.getString("bolum_ismi"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(syllabus_gui_nA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(syllabus_gui_nA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void mainMenu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu_buttonActionPerformed
        mainMenu_nA gui = new mainMenu_nA();
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mainMenu_buttonActionPerformed

    private void viewSyllabusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSyllabusActionPerformed
        try {
            Connection connect = new db_connection().connect;
            PreparedStatement prep_stm = (PreparedStatement) connect.prepareStatement("SELECT ders_ismi,ders_saati,ders_gunu,ders_derslik FROM ders_program WHERE ders_sinifi=? AND bolum_id=? AND ders_donemi=?");
            prep_stm.setInt(1, grade_cb.getSelectedIndex());
            prep_stm.setInt(2, department_cb.getSelectedIndex());
            prep_stm.setInt(3, season_cb.getSelectedIndex());
            ResultSet rs = (ResultSet) prep_stm.executeQuery();
            
            while(rs.next()){
                switch(rs.getString("ders_saati")){
                    case "9:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),0,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "10:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),1,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "11:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),2,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "13:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),3,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "14:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),4,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "15:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),5,rs.getInt("ders_gunu"));
                        break;
                    }
                    case "16:30":{
                        syllabus_table.setValueAt(rs.getString("ders_ismi")+"--"+rs.getString("ders_derslik"),6,rs.getInt("ders_gunu"));
                        break;
                    }
                }
            }
            
            connect.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(syllabus_gui_nA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewSyllabusActionPerformed

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
            java.util.logging.Logger.getLogger(syllabus_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(syllabus_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(syllabus_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(syllabus_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new syllabus_gui_nA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> department_cb;
    private javax.swing.JComboBox<String> grade_cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenu_button;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> season_cb;
    private javax.swing.JTable syllabus_table;
    private javax.swing.JButton viewSyllabus;
    // End of variables declaration//GEN-END:variables
}
