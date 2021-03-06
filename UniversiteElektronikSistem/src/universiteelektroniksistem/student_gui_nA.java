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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasalp
 */
public class student_gui_nA extends javax.swing.JFrame {

    /**
     * Creates new form student_gui
     */
    int selectedStudent;
    
    public student_gui_nA() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainMenu_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        update_button = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        search_tf = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EU - Öğrenci İşlemleri");
        setIconImage(new ImageIcon(getClass().getResource("/images/logo50x50.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setText("Öğrenci Görüntüle");

        mainMenu_button.setBackground(new java.awt.Color(254, 254, 254));
        mainMenu_button.setText("Ana Menü");
        mainMenu_button.setOpaque(true);
        mainMenu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu_buttonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(225, 232, 255));

        update_button.setBackground(new java.awt.Color(254, 254, 254));
        update_button.setText("Tüm Tabloyu Görüntüle");
        update_button.setOpaque(true);
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Aranacak Kelime");

        search_button.setBackground(new java.awt.Color(254, 254, 254));
        search_button.setText("Arama Yap");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_tf)
                    .addComponent(search_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğrenci No", "Ad", "Soyad", "Sınıf", "Bölüm İsmi", "Ortalama", "E-mail", "Tel No", "Kayıt Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(student_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenu_button)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainMenu_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        
        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğrenci No", "Ad", "Soyad", "Sınıf", "Bölüm İsmi", "Ortalama", "E-mail", "Tel No", "Kayıt Tarihi"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        
        try {
            Connection connect = new db_connection().connect;
            Statement stm = (Statement) connect.createStatement();
            ResultSet rs = (ResultSet) stm.executeQuery("SELECT ogrenci_id,ogrenci_ismi,ogrenci_soyismi,ogrenci_sinifi,bolum_ismi,ogrenci_ortalamasi,ogrenci_email,ogrenci_telno,ogrenci_kayittarihi FROM ogrenciler,bolumler where bolumler.bolum_id=ogrenciler.bolum_id");
            
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getInt("ogrenci_id"),
                    rs.getString("ogrenci_ismi"),
                    rs.getString("ogrenci_soyismi"),
                    rs.getInt("ogrenci_sinifi"),
                    rs.getString("bolum_ismi"),
                    rs.getFloat("ogrenci_ortalamasi"),
                    rs.getString("ogrenci_email"),
                    rs.getString("ogrenci_telno"),
                    rs.getString("ogrenci_kayittarihi")
                });
            }
            
            student_table.setModel(model);
            
            connect.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(student_gui_nA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void mainMenu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu_buttonActionPerformed
        mainMenu_nA menu = new mainMenu_nA();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_mainMenu_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        search(search_tf.getText());
    }//GEN-LAST:event_search_buttonActionPerformed

    public void search(String search_element){
        int count = 0;
        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
            "Öğrenci No", "Ad", "Soyad", "Sınıf", "Bölüm İsmi", "Ortalama", "E-mail", "Tel No", "Kayıt Tarihi"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        
        try {
            Connection connect = new db_connection().connect;
            Statement stm = (Statement) connect.createStatement();
            ResultSet rs = (ResultSet) stm.executeQuery("SELECT ogrenci_id,ogrenci_ismi,ogrenci_soyismi,ogrenci_sinifi,bolum_ismi,ogrenci_ortalamasi,ogrenci_email,ogrenci_telno,ogrenci_kayittarihi FROM ogrenciler,bolumler where bolumler.bolum_id=ogrenciler.bolum_id");
            
            while(rs.next()){
                if(String.valueOf(rs.getInt("ogrenci_id")).contains(search_element) || rs.getString("ogrenci_ismi").contains(search_element) || rs.getString("ogrenci_soyismi").contains(search_element) || String.valueOf(rs.getInt("ogrenci_sinifi")).contains(search_element) || rs.getString("bolum_ismi").contains(search_element) || String.valueOf(rs.getFloat("ogrenci_ortalamasi")).contains(search_element) || rs.getString("ogrenci_email").contains(search_element) || rs.getString("ogrenci_telno").contains(search_element) || rs.getString("ogrenci_kayittarihi").contains(search_element)){
                    model.addRow(new Object[]{
                        rs.getInt("ogrenci_id"),
                        rs.getString("ogrenci_ismi"),
                        rs.getString("ogrenci_soyismi"),
                        rs.getInt("ogrenci_sinifi"),
                        rs.getString("bolum_ismi"),
                        rs.getFloat("ogrenci_ortalamasi"),
                        rs.getString("ogrenci_email"),
                        rs.getString("ogrenci_telno"),
                        rs.getString("ogrenci_kayittarihi")
                    });
                    
                    count++;
                }
            }
            
            student_table.setModel(model);
            
            JOptionPane.showMessageDialog(rootPane, "Aramanız için "+count+" kadar veri bulundu.");
            
            connect.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(student_gui_nA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(student_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_gui_nA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_gui_nA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenu_button;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTable student_table;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
