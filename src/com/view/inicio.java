/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.view.doctor.pnlCuatro;
import com.view.doctor.pnlDos;
import com.view.doctor.pnlTres;
import com.view.doctor.pnlUno;
import java.awt.Color;
import paneles.CambiaPanel;

/**
 *
 * @author gemma
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Permite cambiar las opciones del menu 
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.uno.setSelected(true);
        new CambiaPanel(pnlPrincipal, new pnlUno());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new rsbuttom.RSButtonMetro();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uno = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        bg.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1410, 680));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE CITAS MEDICAS DEL CENTRO DE SALUD \"JAIME ZUBIETA\"");

        btnMenu.setBackground(new java.awt.Color(0, 102, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/menu.png"))); // NOI18N
        btnMenu.setColorHover(new java.awt.Color(0, 102, 255));
        btnMenu.setColorNormal(new java.awt.Color(0, 102, 255));
        btnMenu.setColorPressed(new java.awt.Color(0, 102, 255));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 70));

        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/home.png"))); // NOI18N
        uno.setText("INICIO");
        uno.setAlignmentY(0.0F);
        uno.setAutoscrolls(true);
        uno.setColorHover(new java.awt.Color(166, 166, 166));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(166, 166, 166));
        uno.setColorTextHover(new java.awt.Color(128, 128, 131));
        uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
        uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        pnlMenu.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 60));

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/home.png"))); // NOI18N
        dos.setText("VER HORARIO");
        dos.setAlignmentY(0.0F);
        dos.setAutoscrolls(true);
        dos.setColorHover(new java.awt.Color(204, 204, 204));
        dos.setColorNormal(new java.awt.Color(214, 217, 223));
        dos.setColorPressed(new java.awt.Color(204, 204, 204));
        dos.setColorTextHover(new java.awt.Color(128, 128, 131));
        dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        pnlMenu.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 60));

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/home.png"))); // NOI18N
        tres.setText("GENERAR CITA");
        tres.setAlignmentY(0.0F);
        tres.setAutoscrolls(true);
        tres.setColorHover(new java.awt.Color(204, 204, 204));
        tres.setColorNormal(new java.awt.Color(214, 217, 223));
        tres.setColorPressed(new java.awt.Color(204, 204, 204));
        tres.setColorTextHover(new java.awt.Color(128, 128, 131));
        tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
        tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(25);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        pnlMenu.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 60));

        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/home.png"))); // NOI18N
        cinco.setText("CERRAR SESIÓN");
        cinco.setAlignmentY(0.0F);
        cinco.setAutoscrolls(true);
        cinco.setColorHover(new java.awt.Color(204, 204, 204));
        cinco.setColorNormal(new java.awt.Color(214, 217, 223));
        cinco.setColorPressed(new java.awt.Color(204, 204, 204));
        cinco.setColorTextHover(new java.awt.Color(128, 128, 131));
        cinco.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cinco.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.setIconTextGap(25);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        pnlMenu.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 260, 60));

        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/imagenes/home.png"))); // NOI18N
        cuatro.setText("BUSQUEDA DE CITA");
        cuatro.setAlignmentY(0.0F);
        cuatro.setAutoscrolls(true);
        cuatro.setColorHover(new java.awt.Color(204, 204, 204));
        cuatro.setColorNormal(new java.awt.Color(214, 217, 223));
        cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
        cuatro.setColorTextHover(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.setIconTextGap(25);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        pnlMenu.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 60));

        bg.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlDos());
        if(this.dos.isSelected()){
            this.uno.setColorNormal(new Color(214,217,223));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(214,217,223));
            
            this.dos.setColorNormal(new Color(204,204,204));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(214,217,223));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(214,217,223));
            
            this.cuatro.setColorNormal(new Color(214,217,223));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(214,217,223));
            
            this.cinco.setColorNormal(new Color(214,217,223));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(214,217,223));
        }else{
            this.dos.setColorNormal(new Color(214,217,223));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_dosActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
        int posicion = this.pnlMenu.getX();
        if(posicion > -1){
        Animacion.Animacion.mover_izquierda(0, -288, 2, 2, pnlMenu);
        }else{
        Animacion.Animacion.mover_derecha(-288, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlUno());
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(204,204,204));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(214,217,223));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(214,217,223));
            
            this.tres.setColorNormal(new Color(214,217,223));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(214,217,223));
            
            this.cuatro.setColorNormal(new Color(214,217,223));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(214,217,223));
            
            this.cinco.setColorNormal(new Color(214,217,223));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(214,217,223));
        }else{
            this.uno.setColorNormal(new Color(214,217,223));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
      this.uno.setSelected(true);
      this.dos.setSelected(false);
      this.tres.setSelected(false);
      this.cuatro.setSelected(false);
      this.cinco.setSelected(false);      
    }//GEN-LAST:event_unoMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
      this.uno.setSelected(false);
      this.dos.setSelected(true);
      this.tres.setSelected(false);
      this.cuatro.setSelected(false);
      this.cinco.setSelected(false);
      }//GEN-LAST:event_dosMousePressed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
      this.uno.setSelected(false);
      this.dos.setSelected(false);
      this.tres.setSelected(true);
      this.cuatro.setSelected(false);
      this.cinco.setSelected(false);
    }//GEN-LAST:event_tresMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
      this.uno.setSelected(false);
      this.dos.setSelected(false);
      this.tres.setSelected(false);
      this.cuatro.setSelected(true);
      this.cinco.setSelected(false);
    }//GEN-LAST:event_cuatroMousePressed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
      this.uno.setSelected(false);
      this.dos.setSelected(false);
      this.tres.setSelected(false);
      this.cuatro.setSelected(false);
      this.cinco.setSelected(true);
    }//GEN-LAST:event_cincoMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlTres());
        if(this.tres.isSelected()){
            this.uno.setColorNormal(new Color(214,217,223));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(214,217,223));
            
            this.dos.setColorNormal(new Color(214,217,223));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(214,217,223));
            
            this.tres.setColorNormal(new Color(204,204,204));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(214,217,223));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(214,217,223));
            
            this.cinco.setColorNormal(new Color(214,217,223));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(214,217,223));
        }else{
            this.tres.setColorNormal(new Color(214,217,223));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlCuatro());
        if(this.cuatro.isSelected()){
            this.uno.setColorNormal(new Color(214,217,223));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(214,217,223));
            
            this.dos.setColorNormal(new Color(214,217,223));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(214,217,223));
            
            this.tres.setColorNormal(new Color(214,217,223));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(214,217,223));
            
            this.cuatro.setColorNormal(new Color(204,204,204));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(214,217,223));
            this.cinco.setColorHover(new Color(204,204,204));
            this.cinco.setColorPressed(new Color(214,217,223));
        }else{
            this.cuatro.setColorNormal(new Color(214,217,223));
            this.cuatro.setColorHover(new Color(204,204,204));
            this.cuatro.setColorPressed(new Color(214,217,223));
        }

    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        
    }//GEN-LAST:event_cincoActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private rsbuttom.RSButtonMetro btnMenu;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
