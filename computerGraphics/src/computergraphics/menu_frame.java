/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computergraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hasal
 */
public class menu_frame extends javax.swing.JFrame {

    /**
     * Creates new form menu_frame
     */
    public menu_frame() {
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

        circle_frame = new javax.swing.JFrame();
        circle_panel = new javax.swing.JPanel();
        triangle_frame = new javax.swing.JFrame();
        triangle_panel = new javax.swing.JPanel();
        rectangle_frame = new javax.swing.JFrame();
        rectangle_panel = new javax.swing.JPanel();
        main_panel = new javax.swing.JPanel();
        image_panel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        triangle_button = new javax.swing.JButton();
        rectangle_button = new javax.swing.JButton();
        circle_button = new javax.swing.JButton();

        circle_frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        circle_frame.setTitle("Circle Frame");
        circle_frame.setMinimumSize(new java.awt.Dimension(300, 300));
        circle_frame.setResizable(false);
        circle_frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                circle_frameComponentShown(evt);
            }
        });
        circle_frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                circle_frameWindowClosing(evt);
            }
        });

        circle_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout circle_panelLayout = new javax.swing.GroupLayout(circle_panel);
        circle_panel.setLayout(circle_panelLayout);
        circle_panelLayout.setHorizontalGroup(
            circle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );
        circle_panelLayout.setVerticalGroup(
            circle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout circle_frameLayout = new javax.swing.GroupLayout(circle_frame.getContentPane());
        circle_frame.getContentPane().setLayout(circle_frameLayout);
        circle_frameLayout.setHorizontalGroup(
            circle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        circle_frameLayout.setVerticalGroup(
            circle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        triangle_frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        triangle_frame.setTitle("Triangle Frame");
        triangle_frame.setMinimumSize(new java.awt.Dimension(300, 300));
        triangle_frame.setResizable(false);
        triangle_frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                triangle_frameComponentShown(evt);
            }
        });
        triangle_frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                triangle_frameWindowClosing(evt);
            }
        });

        triangle_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout triangle_panelLayout = new javax.swing.GroupLayout(triangle_panel);
        triangle_panel.setLayout(triangle_panelLayout);
        triangle_panelLayout.setHorizontalGroup(
            triangle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        triangle_panelLayout.setVerticalGroup(
            triangle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout triangle_frameLayout = new javax.swing.GroupLayout(triangle_frame.getContentPane());
        triangle_frame.getContentPane().setLayout(triangle_frameLayout);
        triangle_frameLayout.setHorizontalGroup(
            triangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(triangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(triangle_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        triangle_frameLayout.setVerticalGroup(
            triangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(triangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(triangle_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rectangle_frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        rectangle_frame.setTitle("Rectangle Frame");
        rectangle_frame.setMinimumSize(new java.awt.Dimension(300, 300));
        rectangle_frame.setPreferredSize(new java.awt.Dimension(300, 300));
        rectangle_frame.setResizable(false);
        rectangle_frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                rectangle_frameComponentShown(evt);
            }
        });
        rectangle_frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                rectangle_frameWindowClosing(evt);
            }
        });

        rectangle_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rectangle_panelLayout = new javax.swing.GroupLayout(rectangle_panel);
        rectangle_panel.setLayout(rectangle_panelLayout);
        rectangle_panelLayout.setHorizontalGroup(
            rectangle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        rectangle_panelLayout.setVerticalGroup(
            rectangle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rectangle_frameLayout = new javax.swing.GroupLayout(rectangle_frame.getContentPane());
        rectangle_frame.getContentPane().setLayout(rectangle_frameLayout);
        rectangle_frameLayout.setHorizontalGroup(
            rectangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(rectangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rectangle_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rectangle_frameLayout.setVerticalGroup(
            rectangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(rectangle_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rectangle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasan Alp Zengin - Menu");
        setLocation(new java.awt.Point(300, 300));

        image_panel.setBackground(new java.awt.Color(255, 255, 255));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/x_icon.png"))); // NOI18N

        javax.swing.GroupLayout image_panelLayout = new javax.swing.GroupLayout(image_panel);
        image_panel.setLayout(image_panelLayout);
        image_panelLayout.setHorizontalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        image_panelLayout.setVerticalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        triangle_button.setBackground(new java.awt.Color(255, 255, 255));
        triangle_button.setText("Triangle");
        triangle_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                triangle_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                triangle_buttonMouseExited(evt);
            }
        });
        triangle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangle_buttonActionPerformed(evt);
            }
        });

        rectangle_button.setBackground(new java.awt.Color(255, 255, 255));
        rectangle_button.setText("Rectangle");
        rectangle_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectangle_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rectangle_buttonMouseExited(evt);
            }
        });
        rectangle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangle_buttonActionPerformed(evt);
            }
        });

        circle_button.setBackground(new java.awt.Color(255, 255, 255));
        circle_button.setText("Circle");
        circle_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                circle_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                circle_buttonMouseExited(evt);
            }
        });
        circle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circle_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(circle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rectangle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triangle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(triangle_button, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(rectangle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(circle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Change shape image when hover button*/
    private void circle_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circle_buttonMouseEntered
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/circle.png")));
    }//GEN-LAST:event_circle_buttonMouseEntered

    private void circle_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circle_buttonMouseExited
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/x_icon.png")));
    }//GEN-LAST:event_circle_buttonMouseExited

    private void rectangle_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangle_buttonMouseEntered
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/rectangle.png")));
    }//GEN-LAST:event_rectangle_buttonMouseEntered

    private void rectangle_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangle_buttonMouseExited
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/x_icon.png")));
    }//GEN-LAST:event_rectangle_buttonMouseExited

    private void triangle_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangle_buttonMouseEntered
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/triangle.png")));
    }//GEN-LAST:event_triangle_buttonMouseEntered

    private void triangle_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangle_buttonMouseExited
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computergraphics/x_icon.png")));
    }//GEN-LAST:event_triangle_buttonMouseExited
    /*show circle frame*/
    private void circle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circle_buttonActionPerformed
        circle_frame.setVisible(true);
    }//GEN-LAST:event_circle_buttonActionPerformed
    /*change button background when exit*/
    private void circle_frameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_circle_frameWindowClosing
        circle_button.setBackground(Color.white);
    }//GEN-LAST:event_circle_frameWindowClosing
    /*change button background and draw circle when it starts vis*/
    private void circle_frameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_circle_frameComponentShown
        circle_button.setBackground(Color.red);
        Graphics2D g2d = (Graphics2D) circle_panel.getGraphics();
             
        
        g2d.setColor(Color.RED);
        g2d.fillOval(10, 10, circle_frame.getWidth()-50, circle_frame.getHeight()-50);
        g2d.setColor(Color.black);
        g2d.drawOval(10, 10, circle_frame.getWidth()-50, circle_frame.getHeight()-50);
    }//GEN-LAST:event_circle_frameComponentShown
    /*start rectangle frame*/
    private void rectangle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangle_buttonActionPerformed
        rectangle_frame.setVisible(true);
    }//GEN-LAST:event_rectangle_buttonActionPerformed
    /*start triangle frame*/
    private void triangle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangle_buttonActionPerformed
        triangle_frame.setVisible(true);
    }//GEN-LAST:event_triangle_buttonActionPerformed
    /*draw triangle and modify button background when triangle frame vis*/
    private void triangle_frameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_triangle_frameComponentShown
        int x[] = new int[3];
        int y[] = new int[3];
        
        triangle_button.setBackground(Color.cyan);
        
        Graphics2D g2d = (Graphics2D) triangle_panel.getGraphics();
             
        
        x[0] = 20;
        y[0] = triangle_frame.getHeight()-70;
        x[1] = triangle_frame.getWidth()/2-20;
        y[1] = 10;
        x[2] = triangle_frame.getWidth()-60;
        y[2] = triangle_frame.getHeight()-70;
        
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(x,y,3);
        g2d.setColor(Color.black);
        g2d.drawPolygon(x,y,3);
        
    }//GEN-LAST:event_triangle_frameComponentShown
    /*modify background color when close triangle frame*/
    private void triangle_frameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_triangle_frameWindowClosing
        triangle_button.setBackground(Color.white);
    }//GEN-LAST:event_triangle_frameWindowClosing
    /*modify background color when close rectangle frame*/
    private void rectangle_frameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_rectangle_frameWindowClosing
        rectangle_button.setBackground(Color.white);
    }//GEN-LAST:event_rectangle_frameWindowClosing
    /*draw rectangle and modify background of rectangle button when frame is vis*/
    private void rectangle_frameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rectangle_frameComponentShown
        rectangle_button.setBackground(Color.green);
        
        Graphics2D g2d = (Graphics2D) rectangle_panel.getGraphics();
        
        g2d.setColor(Color.green);
        g2d.fillRect(15, 15, rectangle_frame.getWidth()-70, rectangle_frame.getHeight()-120);
        g2d.setColor(Color.black);
        g2d.drawRect(15, 15, rectangle_frame.getWidth()-70, rectangle_frame.getHeight()-120);
    }//GEN-LAST:event_rectangle_frameComponentShown

    
    
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
            java.util.logging.Logger.getLogger(menu_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_frame().setVisible(true);
                
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circle_button;
    private javax.swing.JFrame circle_frame;
    private javax.swing.JPanel circle_panel;
    private javax.swing.JLabel image;
    private javax.swing.JPanel image_panel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton rectangle_button;
    private javax.swing.JFrame rectangle_frame;
    private javax.swing.JPanel rectangle_panel;
    private javax.swing.JButton triangle_button;
    private javax.swing.JFrame triangle_frame;
    private javax.swing.JPanel triangle_panel;
    // End of variables declaration//GEN-END:variables
}
