/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasixthtask;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author hasalp
 */
public class sixthtask_gui extends javax.swing.JFrame {

    File selected;
    BufferedImage image;
    
    public sixthtask_gui() {
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        simage_text = new javax.swing.JTextField();
        simage_button = new javax.swing.JButton();
        bimage_button = new javax.swing.JButton();
        dimage_button = new javax.swing.JButton();
        clean_button = new javax.swing.JButton();
        threshold_slider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        mbinarization_button = new javax.swing.JButton();
        image_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selected Image");

        simage_button.setBackground(new java.awt.Color(255, 255, 255));
        simage_button.setText("Select Image");
        simage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simage_buttonActionPerformed(evt);
            }
        });

        bimage_button.setBackground(new java.awt.Color(255, 255, 255));
        bimage_button.setText("Automatic Binarization");
        bimage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimage_buttonActionPerformed(evt);
            }
        });

        dimage_button.setBackground(new java.awt.Color(255, 255, 255));
        dimage_button.setText("Draw Image");
        dimage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimage_buttonActionPerformed(evt);
            }
        });

        clean_button.setBackground(new java.awt.Color(255, 255, 255));
        clean_button.setText("Clean All");
        clean_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clean_buttonActionPerformed(evt);
            }
        });

        threshold_slider.setMaximum(255);
        threshold_slider.setValue(120);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Threshold");

        mbinarization_button.setBackground(new java.awt.Color(255, 255, 255));
        mbinarization_button.setText("Manual Binarization");
        mbinarization_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbinarization_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(simage_text)
            .addComponent(bimage_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simage_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dimage_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(clean_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(threshold_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mbinarization_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simage_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simage_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dimage_button)
                .addGap(5, 5, 5)
                .addComponent(bimage_button)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threshold_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbinarization_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clean_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout image_panelLayout = new javax.swing.GroupLayout(image_panel);
        image_panel.setLayout(image_panelLayout);
        image_panelLayout.setHorizontalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        image_panelLayout.setVerticalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void simage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simage_buttonActionPerformed
        fileChooser.showOpenDialog(null);
        selected = fileChooser.getSelectedFile();
        if(selected.isFile()){
            simage_text.setText(selected.getAbsolutePath());
        }
        
        try {
            image = ImageIO.read(selected);
        } catch (IOException ex) {
            Logger.getLogger(sixthtask_gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simage_buttonActionPerformed

    private BufferedImage original, grayscale, binarized, binarizedmanual;
    
    private void bimage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimage_buttonActionPerformed
      
        grayscale = toGray(image);
        binarized = binarize(grayscale);
        
        Graphics2D graphics = (Graphics2D) image_panel.getGraphics();
        graphics.drawImage(binarized, 0, 0, image_panel.getWidth(), image_panel.getHeight(), null);
        
    }//GEN-LAST:event_bimage_buttonActionPerformed

    private BufferedImage toGray(BufferedImage original) {
 
        int alpha, red, green, blue;
        int newPixel;
 
        BufferedImage lum = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
 
        for(int i=0; i<original.getWidth(); i++) {
            for(int j=0; j<original.getHeight(); j++) {
 
                // Get pixels by R, G, B
                alpha = new Color(original.getRGB(i, j)).getAlpha();
                red = new Color(original.getRGB(i, j)).getRed();
                green = new Color(original.getRGB(i, j)).getGreen();
                blue = new Color(original.getRGB(i, j)).getBlue();
 
                red = (int) (0.21 * red + 0.71 * green + 0.07 * blue);
                // Return back to original format
                newPixel = colorToRGB(alpha, red, red, red);
 
                // Write pixels into image
                lum.setRGB(i, j, newPixel);
 
            }
        }
 
        return lum;
 
    }
    
    private BufferedImage binarize(BufferedImage original) {
 
    int red;
    int newPixel;
 
    int threshold = otsuTreshold(original);
 
    BufferedImage binarized = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
 
    for(int i=0; i<original.getWidth(); i++) {
        for(int j=0; j<original.getHeight(); j++) {
 
            // Get pixels
            red = new Color(original.getRGB(i, j)).getRed();
            int alpha = new Color(original.getRGB(i, j)).getAlpha();
            if(red > threshold) {
                newPixel = 255;
            }
            else {
                newPixel = 0;
            }
            newPixel = colorToRGB(alpha, newPixel, newPixel, newPixel);
            binarized.setRGB(i, j, newPixel); 
 
        }
    }
 
    return binarized;
 
}
    
    private BufferedImage binarizemanuel(BufferedImage original) {
 
    int red;
    int newPixel;
 
    int threshold = threshold_slider.getValue();
 
    BufferedImage binarizedmanual = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
 
    for(int i=0; i<original.getWidth(); i++) {
        for(int j=0; j<original.getHeight(); j++) {
 
            // Get pixels
            red = new Color(original.getRGB(i, j)).getRed();
            int alpha = new Color(original.getRGB(i, j)).getAlpha();
            if(red > threshold) {
                newPixel = 255;
            }
            else {
                newPixel = 0;
            }
            newPixel = colorToRGB(alpha, newPixel, newPixel, newPixel);
            binarizedmanual.setRGB(i, j, newPixel); 
 
        }
    }
 
    return binarizedmanual;
 
}
    
private int otsuTreshold(BufferedImage original) {
 
    int[] histogram = imageHistogram(original);
    int total = original.getHeight() * original.getWidth();
 
    float sum = 0;
    for(int i=0; i<256; i++) sum += i * histogram[i];
 
    float sumB = 0;
    int wB = 0;
    int wF = 0;
 
    float varMax = 0;
    int threshold = 0;
 
    for(int i=0 ; i<256 ; i++) {
        wB += histogram[i];
        if(wB == 0) continue;
        wF = total - wB;
 
        if(wF == 0) break;
 
        sumB += (float) (i * histogram[i]);
        float mB = sumB / wB;
        float mF = (sum - sumB) / wF;
 
        float varBetween = (float) wB * (float) wF * (mB - mF) * (mB - mF);
 
        if(varBetween > varMax) {
            varMax = varBetween;
            threshold = i;
        }
    }
 
    return threshold;
 
}

public int[] imageHistogram(BufferedImage input) {
 
        int[] histogram = new int[256];
 
        for(int i=0; i<histogram.length; i++) histogram[i] = 0;
 
        for(int i=0; i<input.getWidth(); i++) {
            for(int j=0; j<input.getHeight(); j++) {
                int red = new Color(input.getRGB (i, j)).getRed();
                histogram[red]++;
            }
        }
 
        return histogram;
 
    }

private int colorToRGB(int alpha, int red, int green, int blue) {
 
        int newPixel = 0;
        newPixel += alpha;
        newPixel = newPixel << 8;
        newPixel += red; newPixel = newPixel << 8;
        newPixel += green; newPixel = newPixel << 8;
        newPixel += blue;
 
        return newPixel;
 
    }
    
    private void dimage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimage_buttonActionPerformed
        Graphics2D graphics = (Graphics2D) image_panel.getGraphics();
        
            try {
            image = ImageIO.read(selected);
            } catch (IOException ex) {
            Logger.getLogger(sixthtask_gui.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            if(image == null){
                JOptionPane.showMessageDialog(null, "Selected Image Unavailable");
            }
            
            graphics.drawImage(image, 0, 0, image_panel.getWidth(), image_panel.getHeight(), null);
            
            image.flush();
    }//GEN-LAST:event_dimage_buttonActionPerformed

    private void clean_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clean_buttonActionPerformed
        
        image_panel.repaint();
        
    }//GEN-LAST:event_clean_buttonActionPerformed

    private void mbinarization_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbinarization_buttonActionPerformed
        
        grayscale = toGray(image);
        binarized = binarizemanuel(grayscale);
        
        Graphics2D graphics = (Graphics2D) image_panel.getGraphics();
        graphics.drawImage(binarized, 0, 0, image_panel.getWidth(), image_panel.getHeight(), null);
        
    }//GEN-LAST:event_mbinarization_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(sixthtask_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sixthtask_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sixthtask_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sixthtask_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sixthtask_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bimage_button;
    private javax.swing.JButton clean_button;
    private javax.swing.JButton dimage_button;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel image_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mbinarization_button;
    private javax.swing.JButton simage_button;
    private javax.swing.JTextField simage_text;
    private javax.swing.JSlider threshold_slider;
    // End of variables declaration//GEN-END:variables
}
