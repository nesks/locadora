/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceGrafica;

/**
 *
 * @author ind
 */
public class PainelAdm extends javax.swing.JFrame {
private String n;
    /** Creates new form Painel */
    public PainelAdm(String nome) {
        initComponents();
        n=nome;
        helloworld.setText("Olá, "+nome);
          this.setLocationRelativeTo(null);
    }

    private PainelAdm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloworld = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        clientes = new javax.swing.JMenu();
        addCliente = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenu();
        addFuncionario = new javax.swing.JMenuItem();
        midias = new javax.swing.JMenu();
        dvd = new javax.swing.JMenu();
        addDvd = new javax.swing.JMenuItem();
        game = new javax.swing.JMenu();
        addGame = new javax.swing.JMenuItem();
        cd = new javax.swing.JMenu();
        addCd = new javax.swing.JMenuItem();
        busca = new javax.swing.JMenu();
        codigo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        devolucao = new javax.swing.JMenu();
        devolver = new javax.swing.JMenuItem();
        locacao = new javax.swing.JMenu();
        alugar = new javax.swing.JMenuItem();
        remove = new javax.swing.JMenu();
        editarPreco = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        fechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helloworld.setAlignmentY(0.0F);

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(56, 35));

        clientes.setText("Clientes");
        clientes.setAlignmentX(1.0F);

        addCliente.setText("Adicionar cliente");
        addCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClienteActionPerformed(evt);
            }
        });
        clientes.add(addCliente);

        jMenuBar2.add(clientes);

        funcionarios.setText("Funcionários");

        addFuncionario.setText("Adicionar");
        addFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncionarioActionPerformed(evt);
            }
        });
        funcionarios.add(addFuncionario);

        jMenuBar2.add(funcionarios);

        midias.setText("Mídias");

        dvd.setText("DVD");

        addDvd.setText("Adicionar");
        addDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDvdActionPerformed(evt);
            }
        });
        dvd.add(addDvd);

        midias.add(dvd);

        game.setText("Game");

        addGame.setText("Adicionar");
        addGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGameActionPerformed(evt);
            }
        });
        game.add(addGame);

        midias.add(game);

        cd.setText("CD");

        addCd.setText("Adicionar");
        addCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCdActionPerformed(evt);
            }
        });
        cd.add(addCd);

        midias.add(cd);

        busca.setText("Buscar Midias");

        codigo.setText("Codigo");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        busca.add(codigo);

        jMenuItem1.setText("Genero de DVD");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        busca.add(jMenuItem1);

        midias.add(busca);

        jMenuBar2.add(midias);

        devolucao.setText("Devolucao");

        devolver.setText("Devolver");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });
        devolucao.add(devolver);

        jMenuBar2.add(devolucao);

        locacao.setText("Locação");

        alugar.setText("Nova locação");
        alugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alugarActionPerformed(evt);
            }
        });
        locacao.add(alugar);

        jMenuBar2.add(locacao);

        remove.setText("Preços");

        editarPreco.setText("Editar preços");
        editarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPrecoActionPerformed(evt);
            }
        });
        remove.add(editarPreco);

        jMenuBar2.add(remove);

        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        sair.setText("Trocar usuario");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        exit.add(sair);

        fechar.setText("fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        exit.add(fechar);

        jMenuBar2.add(exit);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(helloworld, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(helloworld, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClienteActionPerformed
        CadastrarCliente cadCliente = new CadastrarCliente();
        cadCliente.setVisible(true);
    }//GEN-LAST:event_addClienteActionPerformed

    private void addFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastrarFuncionario cadFunc = new CadastrarFuncionario();
        cadFunc.setVisible(true);
    }//GEN-LAST:event_addFuncionarioActionPerformed

    private void addDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDvdActionPerformed
        // TODO add your handling code here:
        CadastrarDvd cadDvd = new CadastrarDvd();
        cadDvd.setVisible(true);
    }//GEN-LAST:event_addDvdActionPerformed

    private void addGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameActionPerformed
        // TODO add your handling code here:
        CadastrarGame cadGame = new CadastrarGame();
        cadGame.setVisible(true);
    }//GEN-LAST:event_addGameActionPerformed

    private void addCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCdActionPerformed
        // TODO add your handling code here:
        CadastrarCd cadCd = new CadastrarCd();
        cadCd.setVisible(true);
    }//GEN-LAST:event_addCdActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
       Devolver dev = new Devolver();
       dev.setVisible(true);
        
    }//GEN-LAST:event_devolverActionPerformed

    private void alugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alugarActionPerformed
        // TODO add your handling code here:
        Alugar aloc = new Alugar();
        aloc.setVisible(true);
    }//GEN-LAST:event_alugarActionPerformed

    private void editarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPrecoActionPerformed
        // TODO add your handling code here:
        EditarPreco edit = new EditarPreco();
        edit.setVisible(true);
    }//GEN-LAST:event_editarPrecoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       new Main().show();
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        new Main().show();
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);

    }//GEN-LAST:event_fecharActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        BuscarCodigo_1 b1 = new BuscarCodigo_1();
        b1.setVisible(true);
    }//GEN-LAST:event_codigoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BuscarGenero b1 = new BuscarGenero();
        b1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCd;
    private javax.swing.JMenuItem addCliente;
    private javax.swing.JMenuItem addDvd;
    private javax.swing.JMenuItem addFuncionario;
    private javax.swing.JMenuItem addGame;
    private javax.swing.JMenuItem alugar;
    private javax.swing.JMenu busca;
    private javax.swing.JMenu cd;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem codigo;
    private javax.swing.JMenu devolucao;
    private javax.swing.JMenuItem devolver;
    private javax.swing.JMenu dvd;
    private javax.swing.JMenuItem editarPreco;
    private javax.swing.JMenu exit;
    private javax.swing.JMenuItem fechar;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JMenu game;
    private javax.swing.JLabel helloworld;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu locacao;
    private javax.swing.JMenu midias;
    private javax.swing.JMenu remove;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables

}
