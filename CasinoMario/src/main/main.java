/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    // creacion de los hilos
    Hilo Hilo1 = new Hilo();
    Hilo Hilo2 = new Hilo();
    Hilo Hilo3 = new Hilo();

    public main() {
        initComponents();
        // apariencia inicial de las ventanas 
        Image img = new ImageIcon(this.getClass().getResource("/img/estrella.jpg")).getImage();
        img = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        lbca1.setIcon(new ImageIcon(img));
        lbca2.setIcon(new ImageIcon(img));
        lbca3.setIcon(new ImageIcon(img));
        // iniciar los hilos 
        Hilo1.celda = 1;
        Hilo1.start();

        Hilo2.celda = 2;
        Hilo2.start();

        Hilo3.celda = 3;
        Hilo3.start();

    }

    // clase del que extiende del hilo para que cada casilla sea un proceso independiente
    public class Hilo extends Thread {

        public int celda = 0;
        // todas empiezan detenidas
        private boolean run = false;
        private int foto;

        public void startRunning() {
            run = true;
           
        }

        public void stopRunning() {
            run = false;
            
        }
        
        public boolean getRun(){
            return this.run;
        }

        public int getRandom() {
            int random = (int) (Math.random() * 3 + 1);
            return random;
        }
        
        public int getFoto(){
            return this.foto;
        }

        @Override
        public void run() {
            Image img;
            // se asigno la primera celda
            while (celda == 1) {
                 
                while (run) {
                    foto = this.getRandom();
                    
                    if (foto == 1) {
                        img = new ImageIcon(this.getClass().getResource("/img/Flor.jpg")).getImage();
                    } else if (foto == 2) {
                        img = new ImageIcon(this.getClass().getResource("/img/hongo.jpg")).getImage();
                    } else {
                        img = new ImageIcon(this.getClass().getResource("/img/estrella.jpg")).getImage();
                    }
                    img = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
                    lbca1.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            // se asigno la segunda celda
            while (celda == 2) {
                while (run) {
                    foto = this.getRandom();
                    if (foto == 1) {
                        img = new ImageIcon(this.getClass().getResource("/img/Flor.jpg")).getImage();
                    } else if (foto == 2) {
                        img = new ImageIcon(this.getClass().getResource("/img/hongo.jpg")).getImage();
                    } else {
                        img = new ImageIcon(this.getClass().getResource("/img/estrella.jpg")).getImage();
                    }
                    img = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
                    lbca2.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            // se asigno la tercera celda
            while (celda == 3) {
                while (run) {
                    foto = this.getRandom();
                    if (foto == 1) {
                        img = new ImageIcon(this.getClass().getResource("/img/Flor.jpg")).getImage();
                    } else if (foto == 2) {
                        img = new ImageIcon(this.getClass().getResource("/img/hongo.jpg")).getImage();
                    } else {
                        img = new ImageIcon(this.getClass().getResource("/img/estrella.jpg")).getImage();
                    }
                    img = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
                    lbca3.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbca1 = new javax.swing.JLabel();
        lbca2 = new javax.swing.JLabel();
        lbca3 = new javax.swing.JLabel();
        btnStop1 = new javax.swing.JButton();
        btnStop2 = new javax.swing.JButton();
        btnStop3 = new javax.swing.JButton();
        btnStopAll = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(40, 15));
        setMinimumSize(new java.awt.Dimension(40, 15));

        lbca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbca1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        lbca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbca2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        lbca3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbca3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        btnStop1.setText("STOP");
        btnStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop1ActionPerformed(evt);
            }
        });

        btnStop2.setText("STOP");
        btnStop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop2ActionPerformed(evt);
            }
        });

        btnStop3.setText("STOP");
        btnStop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop3ActionPerformed(evt);
            }
        });

        btnStopAll.setText("STOP ALL");
        btnStopAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopAllActionPerformed(evt);
            }
        });

        btnIniciar.setText("INICIAR TODOS");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnStop1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnStop2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStop3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbca1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbca3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lbca2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopAll, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbca1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbca2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbca3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStop1)
                    .addComponent(btnStop2)
                    .addComponent(btnStop3))
                .addGap(18, 18, 18)
                .addComponent(btnStopAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        // TODO add your handling code here:
        Hilo1.stopRunning();
        ganar();
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void btnStop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop2ActionPerformed
        // TODO add your handling code here:
        Hilo3.stopRunning();
        ganar();
    }//GEN-LAST:event_btnStop2ActionPerformed

    private void btnStop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop3ActionPerformed
        // TODO add your handling code here:
        Hilo2.stopRunning();
        ganar();
    }//GEN-LAST:event_btnStop3ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        Hilo1.startRunning();
        Hilo2.startRunning();
        Hilo3.startRunning();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnStopAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopAllActionPerformed
        // TODO add your handling code here:
        Hilo1.stopRunning();
        Hilo2.stopRunning();
        Hilo3.stopRunning();
        ganar();
    }//GEN-LAST:event_btnStopAllActionPerformed

    //ver si el jugador gano
    public void ganar(){
        // verificar que todas las casillas esten detenidas
        if ((Hilo1.getRun() == false) && (Hilo2.getRun() == false) && (Hilo3.getRun() == false)) {
            // si lo estan ver si tiene la misma imagen
            if ((Hilo1.getFoto() == Hilo2.getFoto()) && (Hilo2.getFoto() == Hilo3.getFoto())    ) {
                // las tres son iguales 
                JOptionPane.showMessageDialog( this,"Ganaste Felicidades");
               
            }
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnStop2;
    private javax.swing.JButton btnStop3;
    private javax.swing.JButton btnStopAll;
    private javax.swing.JLabel lbca1;
    private javax.swing.JLabel lbca2;
    private javax.swing.JLabel lbca3;
    // End of variables declaration//GEN-END:variables
}
