/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.time;

import javax.swing.JOptionPane;


/**
 *
 * @author Mewtwo
 */
public class Aplication extends javax.swing.JFrame {

    Boolean iniciar = false;
    Boolean pausar = false;
    Boolean reiniciar = false;
    Boolean detener = false;
    long  iniciarTime, pausarTime, reiniciarTime, detenerTime;
    double minutos, resultado,   segundos;
    
    
    /**
     * Creates new form Aplication
     */
    public Aplication() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button_Iniciar = new javax.swing.JButton();
        Button_Pausar = new javax.swing.JButton();
        Button_Reiniciar = new javax.swing.JButton();
        Button_Detener = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Button_restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cronometro");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 102, 255)));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Button_Iniciar.setBackground(new java.awt.Color(153, 255, 153));
        Button_Iniciar.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        Button_Iniciar.setForeground(new java.awt.Color(0, 0, 0));
        Button_Iniciar.setText("Iniciar");
        Button_Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IniciarActionPerformed(evt);
            }
        });

        Button_Pausar.setBackground(new java.awt.Color(153, 255, 153));
        Button_Pausar.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        Button_Pausar.setForeground(new java.awt.Color(0, 0, 0));
        Button_Pausar.setText("Pausar");
        Button_Pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PausarActionPerformed(evt);
            }
        });

        Button_Reiniciar.setBackground(new java.awt.Color(153, 255, 153));
        Button_Reiniciar.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        Button_Reiniciar.setForeground(new java.awt.Color(0, 0, 0));
        Button_Reiniciar.setText("Reiniciar");
        Button_Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ReiniciarActionPerformed(evt);
            }
        });

        Button_Detener.setBackground(new java.awt.Color(153, 255, 153));
        Button_Detener.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        Button_Detener.setForeground(new java.awt.Color(0, 0, 0));
        Button_Detener.setText("Detener");
        Button_Detener.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DetenerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para iniciar de click en Iniciar.");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resultado:");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        Button_restart.setBackground(new java.awt.Color(153, 255, 153));
        Button_restart.setForeground(new java.awt.Color(0, 0, 0));
        Button_restart.setText("Reiniciar");
        Button_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_restart)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button_Detener, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Pausar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Reiniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_restart, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Iniciar)
                    .addComponent(Button_Pausar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Detener)
                    .addComponent(Button_Reiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IniciarActionPerformed

        Time operaciones = new Time();

        jLabel4.setText("Tiene un contador en marcha.");
        iniciar = true;
        operaciones.setIniciar(iniciar);
        iniciarTime = operaciones.begin();
        JOptionPane.showMessageDialog(null, "Se inicio el contador.");

    }//GEN-LAST:event_Button_IniciarActionPerformed

    private void Button_PausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PausarActionPerformed

        Time operaciones = new Time();
        if (iniciar == false) {

            JOptionPane.showMessageDialog(null, "Se debe iniciar el contador.");

        } else {

            jLabel4.setText("Pauso su contador. Para continuar seleccione Reiniciar.");
            pausar = true;
            operaciones.setPausar(pausar);
            pausarTime = operaciones.pause();
            JOptionPane.showMessageDialog(null, "Se Pauso el contador.");

        }
    }//GEN-LAST:event_Button_PausarActionPerformed

    private void Button_DetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DetenerActionPerformed

        Time operaciones = new Time();

        if (iniciar == false) {

            JOptionPane.showMessageDialog(null, "Se debe iniciar el contador.");

        } else {

            
            detener = true;
            operaciones.setDetener(detener);
            detenerTime = operaciones.stop();
          
            
            System.out.println(iniciarTime);
            System.out.println(pausarTime);
            System.out.println(reiniciarTime);
            System.out.println(detenerTime);
            
            
            resultado = operaciones.operations(iniciarTime, pausarTime, reiniciarTime, detenerTime);
            
          
            minutos = Math.floor(resultado/60000);
            segundos = Math.round((resultado%60000) /1000);
            
           jLabel4.setText("Minutos: " + minutos + " y segundos: " + segundos);
            JOptionPane.showMessageDialog(null, "Finalizo su contador.");    
              
            
            
        }

    }//GEN-LAST:event_Button_DetenerActionPerformed

    private void Button_ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ReiniciarActionPerformed

        Time operaciones = new Time();

        if (iniciar == false) {

            JOptionPane.showMessageDialog(null, "Se debe iniciar el contador.");

        } else {

            
            jLabel4.setText("Reinicio su contador. Para concluir de click en Detener.");
            reiniciar = true;
            operaciones.setReiniciar(reiniciar);
            reiniciarTime = operaciones.restar();
            JOptionPane.showMessageDialog(null, "Se reinicio el contador.");
        }

    }//GEN-LAST:event_Button_ReiniciarActionPerformed

    private void Button_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_restartActionPerformed

        iniciar = false;
        pausar = false;
        reiniciar = false;
        detener = false;
        resultado = 0;
        iniciarTime = 0;
        pausarTime = 0;
        reiniciarTime = 0;
        detenerTime = 0;
        jLabel4.setText("Para iniciar el contador seleccione Iniciar.");
       


    }//GEN-LAST:event_Button_restartActionPerformed

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
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Detener;
    private javax.swing.JButton Button_Iniciar;
    private javax.swing.JButton Button_Pausar;
    private javax.swing.JButton Button_Reiniciar;
    private javax.swing.JButton Button_restart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
