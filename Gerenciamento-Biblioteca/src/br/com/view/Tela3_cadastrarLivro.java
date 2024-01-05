/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

import br.com.controller.Listas;
import br.com.controller.Livro;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;

public class Tela3_cadastrarLivro extends javax.swing.JFrame {
    
    Listas lista = new Listas();
    
    public Tela3_cadastrarLivro() {
        initComponents();
        Toolkit kit = Toolkit.getDefaultToolkit();
        this.setIconImage(kit.getImage(this.getClass().getResource("images/icon.png")));
        this.setLocationRelativeTo(null);
        this.setSize(1000, 450);
        
        tudoInvisivel();
        tornarGrid();
        tabelaRecentes(lista);
    }
    
    public Tela3_cadastrarLivro(Listas lista) {
        initComponents();
        this.lista = lista;
        Toolkit kit = Toolkit.getDefaultToolkit();
        this.setIconImage(kit.getImage(this.getClass().getResource("images/icon.png")));
        this.setLocationRelativeTo(null);
        this.setSize(1000, 450);
        
        tudoInvisivel();
        tornarGrid();      
        tabelaRecentes(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmenuCadastrar = new javax.swing.JPanel();
        jBcadastrarLivro = new javax.swing.JButton();
        jBcadastrarAluno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBcadastrar = new javax.swing.JButton();
        jTautor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPmenu = new javax.swing.JPanel();
        jBsair = new javax.swing.JButton();
        jTBremover = new javax.swing.JToggleButton();
        jTBcadastrar = new javax.swing.JToggleButton();
        jBsair1 = new javax.swing.JButton();
        jTBbuscar = new javax.swing.JToggleButton();
        jTBlistar = new javax.swing.JToggleButton();
        jTBemprestimo = new javax.swing.JToggleButton();
        jTBdevolucao = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1000, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPmenuCadastrar.setBackground(new java.awt.Color(51, 51, 255));
        jPmenuCadastrar.setLayout(null);

        jBcadastrarLivro.setBackground(new java.awt.Color(51, 51, 255));
        jBcadastrarLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBcadastrarLivro.setText("Cadastrar Livro");
        jBcadastrarLivro.setBorder(null);
        jBcadastrarLivro.setBorderPainted(false);
        jBcadastrarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarLivroActionPerformed(evt);
            }
        });
        jPmenuCadastrar.add(jBcadastrarLivro);
        jBcadastrarLivro.setBounds(19, 41, 115, 23);

        jBcadastrarAluno.setBackground(new java.awt.Color(51, 51, 255));
        jBcadastrarAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBcadastrarAluno.setText("Cadastrar Aluno");
        jBcadastrarAluno.setBorder(null);
        jBcadastrarAluno.setBorderPainted(false);
        jBcadastrarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarAlunoActionPerformed(evt);
            }
        });
        jPmenuCadastrar.add(jBcadastrarAluno);
        jBcadastrarAluno.setBounds(19, 12, 115, 23);

        getContentPane().add(jPmenuCadastrar);
        jPmenuCadastrar.setBounds(60, 40, 140, 70);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Código", "Nome", "Autor"
            }
        ));
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(20);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 100, 430, 110);

        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTnome);
        jTnome.setBounds(140, 140, 220, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 140, 50, 20);

        jBcadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBcadastrar);
        jBcadastrar.setBounds(350, 250, 180, 50);

        jTautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTautorActionPerformed(evt);
            }
        });
        jPanel1.add(jTautor);
        jTautor.setBounds(140, 180, 221, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Autor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 180, 50, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Código");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 100, 50, 20);
        jPanel1.add(jTcodigo);
        jTcodigo.setBounds(140, 100, 220, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastros Livros");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 10, 210, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 60, 850, 310);

        jPmenu.setBackground(new java.awt.Color(0, 0, 255));
        jPmenu.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPmenu.setLayout(null);

        jBsair.setBackground(new java.awt.Color(0, 0, 255));
        jBsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/sair.png"))); // NOI18N
        jBsair.setBorder(null);
        jBsair.setContentAreaFilled(false);
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });
        jPmenu.add(jBsair);
        jBsair.setBounds(940, 0, 40, 40);

        jTBremover.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBremover.setForeground(new java.awt.Color(255, 255, 255));
        jTBremover.setText("Remover");
        jTBremover.setBorder(null);
        jTBremover.setBorderPainted(false);
        jTBremover.setContentAreaFilled(false);
        jTBremover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBremover.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBremoverActionPerformed(evt);
            }
        });
        jPmenu.add(jTBremover);
        jTBremover.setBounds(220, 0, 120, 40);

        jTBcadastrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBcadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jTBcadastrar.setText("Cadastrar");
        jTBcadastrar.setBorder(null);
        jTBcadastrar.setBorderPainted(false);
        jTBcadastrar.setContentAreaFilled(false);
        jTBcadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBcadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBcadastrarActionPerformed(evt);
            }
        });
        jPmenu.add(jTBcadastrar);
        jTBcadastrar.setBounds(70, 0, 130, 40);

        jBsair1.setBackground(new java.awt.Color(0, 0, 255));
        jBsair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/house.png"))); // NOI18N
        jBsair1.setBorder(null);
        jBsair1.setContentAreaFilled(false);
        jBsair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsair1ActionPerformed(evt);
            }
        });
        jPmenu.add(jBsair1);
        jBsair1.setBounds(10, 0, 52, 40);

        jTBbuscar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTBbuscar.setText("Buscar");
        jTBbuscar.setBorder(null);
        jTBbuscar.setBorderPainted(false);
        jTBbuscar.setContentAreaFilled(false);
        jTBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBbuscar.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBbuscarActionPerformed(evt);
            }
        });
        jPmenu.add(jTBbuscar);
        jTBbuscar.setBounds(510, 0, 120, 40);

        jTBlistar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBlistar.setForeground(new java.awt.Color(255, 255, 255));
        jTBlistar.setText("Listar");
        jTBlistar.setBorder(null);
        jTBlistar.setBorderPainted(false);
        jTBlistar.setContentAreaFilled(false);
        jTBlistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBlistar.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBlistarActionPerformed(evt);
            }
        });
        jPmenu.add(jTBlistar);
        jTBlistar.setBounds(370, 0, 120, 40);

        jTBemprestimo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBemprestimo.setForeground(new java.awt.Color(255, 255, 255));
        jTBemprestimo.setText("Empréstimo");
        jTBemprestimo.setBorder(null);
        jTBemprestimo.setBorderPainted(false);
        jTBemprestimo.setContentAreaFilled(false);
        jTBemprestimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBemprestimo.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBemprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBemprestimoActionPerformed(evt);
            }
        });
        jPmenu.add(jTBemprestimo);
        jTBemprestimo.setBounds(660, 0, 120, 40);

        jTBdevolucao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTBdevolucao.setForeground(new java.awt.Color(255, 255, 255));
        jTBdevolucao.setText("Devolução");
        jTBdevolucao.setBorder(null);
        jTBdevolucao.setBorderPainted(false);
        jTBdevolucao.setContentAreaFilled(false);
        jTBdevolucao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTBdevolucao.setPreferredSize(new java.awt.Dimension(120, 40));
        jTBdevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBdevolucaoActionPerformed(evt);
            }
        });
        jPmenu.add(jTBdevolucao);
        jTBdevolucao.setBounds(800, 0, 142, 40);

        getContentPane().add(jPmenu);
        jPmenu.setBounds(0, 0, 1000, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomeActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        String codigo = jTcodigo.getText();
        String nome = null;
        String autor = null;
        boolean veri = true, veri2 = true;

        if (jTnome.getText().trim().equals("") || jTcodigo.getText().trim().equals("") || jTcodigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum campo está vazio.");
        } else {
            try {
                Integer.valueOf(codigo);
                nome = jTnome.getText();
                autor = jTautor.getText();
                veri = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Erro no campo 'Código'");
                veri = false;
            }
            if (veri) {
                
                if (jTcodigo.getText().length() == 6) {
                    
                    for (Livro livro : lista.getLivros()) {
                        if (jTcodigo.getText().equals(livro.getCodigo())) {
                            veri2 = false;
                        }
                    }
                    if (veri2) {
                        lista.armazenaLivro(codigo, nome, autor, "---");

                        tabelaRecentes(lista);

                        jTnome.setText(null);
                        jTcodigo.setText(null);
                        jTautor.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(null,"Já existe um livro com esse código.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O códígo do livro precisa ter 6 dígitos.");
                }
            }
        }
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jTautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTautorActionPerformed

    private void jBcadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarLivroActionPerformed
        dispose();
        Tela3_cadastrarLivro tela = new Tela3_cadastrarLivro(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jBcadastrarLivroActionPerformed

    private void jBcadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarAlunoActionPerformed
        dispose();
        Tela2_cadastrarAluno tela = new Tela2_cadastrarAluno(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jBcadastrarAlunoActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    private void jTBremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBremoverActionPerformed
        tudoInvisivel();
        dispose();
        Tela7_remover tela = new Tela7_remover(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jTBremoverActionPerformed

    private void jTBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBcadastrarActionPerformed
        if (jPmenuCadastrar.isVisible()) {
            tudoInvisivel();
        } else {
            tudoInvisivel();
            jPmenuCadastrar.setVisible(true);
        }
    }//GEN-LAST:event_jTBcadastrarActionPerformed

    private void jBsair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsair1ActionPerformed
        dispose();
        Tela1_menu tela = new Tela1_menu(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jBsair1ActionPerformed

    private void jTBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBbuscarActionPerformed
        tudoInvisivel();
    }//GEN-LAST:event_jTBbuscarActionPerformed

    private void jTBlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBlistarActionPerformed
        tudoInvisivel();
        dispose();
        Tela5_listar tela = new Tela5_listar(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jTBlistarActionPerformed

    private void jTBemprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBemprestimoActionPerformed
        tudoInvisivel();
        dispose();
        Tela4_emprestimo tela = new Tela4_emprestimo(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jTBemprestimoActionPerformed

    private void jTBdevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBdevolucaoActionPerformed
        tudoInvisivel();
        dispose();
        Tela6_devolucao tela = new Tela6_devolucao(lista);
        tela.setVisible(true);
    }//GEN-LAST:event_jTBdevolucaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3_cadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3_cadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3_cadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3_cadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3_cadastrarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBcadastrarAluno;
    private javax.swing.JButton jBcadastrarLivro;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBsair1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JPanel jPmenuCadastrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBbuscar;
    private javax.swing.JToggleButton jTBcadastrar;
    private javax.swing.JToggleButton jTBdevolucao;
    private javax.swing.JToggleButton jTBemprestimo;
    private javax.swing.JToggleButton jTBlistar;
    private javax.swing.JToggleButton jTBremover;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTautor;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables

     public void tabelaRecentes(Listas lista) {
        DefaultTableModel recentes = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < 5; i++) {
            recentes.removeRow(0);
        }

        for (int i = lista.getLivros().size() - 1; i > lista.getLivros().size() - 6; i--) {

            if (i >= 0) {
                recentes.addRow(lista.imprimeLivro(i));
            } else {
                recentes.addRow(new Object[4]);
            }
        }
    }
    
     private void tudoInvisivel() {
        jPmenuCadastrar.setVisible(false);
    }

    private void tornarGrid() {
        jPmenuCadastrar.setLayout(new GridLayout(2,1));
    }
     
}