
package br.com.view;

import br.com.controller.Agenda;
import java.awt.Toolkit;

public class Tela1_menu extends javax.swing.JFrame {

    private Agenda agenda = new Agenda();
    
    public Tela1_menu(Agenda agenda) {
        this.agenda = agenda;
        initComponents();
        Toolkit kit = Toolkit.getDefaultToolkit();
        setIconImage(kit.getImage(this.getClass().getResource("icone.png")));
        setLocationRelativeTo(null);
    }
    
    public Tela1_menu() {
        initComponents();
        Toolkit kit = Toolkit.getDefaultToolkit();
        setIconImage(kit.getImage(this.getClass().getResource("icone.png")));
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBremover = new javax.swing.JButton();
        jBarmazenar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBimprimir = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu da Agenda");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LPT1 - 2F", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBremover.setBackground(java.awt.Color.gray);
        jBremover.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jBremover.setForeground(new java.awt.Color(0, 0, 0));
        jBremover.setText("Remover");
        jBremover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBremover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBremover.setFocusable(false);
        jBremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverActionPerformed(evt);
            }
        });

        jBarmazenar.setBackground(java.awt.Color.gray);
        jBarmazenar.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jBarmazenar.setForeground(new java.awt.Color(0, 0, 0));
        jBarmazenar.setText("Armazenar");
        jBarmazenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBarmazenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBarmazenar.setFocusable(false);
        jBarmazenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBarmazenarActionPerformed(evt);
            }
        });

        jBbuscar.setBackground(java.awt.Color.gray);
        jBbuscar.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBbuscar.setText("Buscar");
        jBbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBbuscar.setFocusable(false);
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBimprimir.setBackground(java.awt.Color.gray);
        jBimprimir.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jBimprimir.setForeground(new java.awt.Color(0, 0, 0));
        jBimprimir.setText("Imprimir");
        jBimprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBimprimir.setFocusable(false);
        jBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirActionPerformed(evt);
            }
        });

        jBsair.setBackground(java.awt.Color.gray);
        jBsair.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jBsair.setForeground(new java.awt.Color(0, 0, 0));
        jBsair.setText("Sair");
        jBsair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsair.setFocusable(false);
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBsair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBimprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBarmazenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBremover, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jBarmazenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBremover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverActionPerformed
        Tela3_remover tela = new Tela3_remover(agenda);
        dispose();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jBremoverActionPerformed

    private void jBarmazenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBarmazenarActionPerformed
        Tela2_armazenar tela = new Tela2_armazenar(agenda);
        dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_jBarmazenarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        Tela4_buscar tela = new Tela4_buscar(agenda);
        dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirActionPerformed
        Tela5_imprimir tela = new Tela5_imprimir(agenda);
        dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_jBimprimirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBarmazenar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBimprimir;
    private javax.swing.JButton jBremover;
    private javax.swing.JButton jBsair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
