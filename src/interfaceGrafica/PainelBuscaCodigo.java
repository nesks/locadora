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
public class PainelBuscaCodigo extends javax.swing.JFrame {

    /**
     * Creates new form PainelBusca
     */
    public PainelBuscaCodigo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void montarDVD(String titulo, int censura, double preco, String idioma, String genero, int quantidade, int quantidadeA ){
    jLTitulo.setText(titulo);
    jLCensura.setText(String.valueOf(censura));
    jLAux.setText(String.valueOf(preco));
    jLAux2.setText(idioma);
    jLAux3.setText(genero);
    jLQuantidadeE.setText(String.valueOf(quantidade));
    jLQuantidadeA.setText(String.valueOf(quantidadeA)); 
    }
    
    public void montarCD(String grupo, int numeroDeMusicas,  int censura, String titulo, int quantidade, int quantidadeA, double preco){
    jLTitulo.setText(titulo);
    jLCensura.setText(String.valueOf(censura));
    jLQuantidadeE.setText(String.valueOf(quantidade));
    jLQuantidadeA.setText(String.valueOf(quantidadeA)); 
         jLAux.setText(String.valueOf(preco));


     Aux2.setText("Numero de Musicas:");
    jLAux2.setText(String.valueOf(numeroDeMusicas));
    Aux3.setText("Grupo:");
    jLAux3.setText(grupo);
    }
      public void montarGAME(String nomeDoConsole, int censura, String titulo, int quantidade, int quantidadeA, double preco){
    jLTitulo.setText(titulo);
    jLCensura.setText(String.valueOf(censura));
    jLQuantidadeE.setText(String.valueOf(quantidade));
    jLQuantidadeA.setText(String.valueOf(quantidadeA)); 
    jLAux.setText(String.valueOf(preco));
   
   
     Aux2.setText("Nome do Console:");
    jLAux2.setText(nomeDoConsole);
    Aux3.setText("");
    jLAux3.setText("");
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
        jLTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLCensura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLQuantidadeE = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLQuantidadeA = new javax.swing.JLabel();
        Aux3 = new javax.swing.JLabel();
        jLAux3 = new javax.swing.JLabel();
        Aux2 = new javax.swing.JLabel();
        jLAux2 = new javax.swing.JLabel();
        Aux = new javax.swing.JLabel();
        jLAux = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 255, 255), null, null), "Resultados:"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLTitulo.setText("titulo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Censura:");

        jLCensura.setText("censura");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade(estoque):");

        jLQuantidadeE.setText("quantidade");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade(alugado):");

        jLQuantidadeA.setText("quantidade");

        Aux3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aux3.setText("Genero:");

        jLAux3.setText("genero");

        Aux2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aux2.setText("Idioma:");

        jLAux2.setText("idioma");

        Aux.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aux.setText("Preco(unidade):");

        jLAux.setText("preco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(Aux3)
                    .addComponent(Aux2)
                    .addComponent(Aux))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLQuantidadeA)
                            .addComponent(jLQuantidadeE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAux3)
                            .addComponent(jLAux2)
                            .addComponent(jLAux)
                            .addComponent(jLCensura)
                            .addComponent(jLTitulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLTitulo))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLCensura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLQuantidadeE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLQuantidadeA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAux, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Aux, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aux2)
                    .addComponent(jLAux2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aux3)
                    .addComponent(jLAux3))
                .addContainerGap())
        );

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelBuscaCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelBuscaCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelBuscaCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelBuscaCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelBuscaCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aux;
    private javax.swing.JLabel Aux2;
    private javax.swing.JLabel Aux3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAux;
    private javax.swing.JLabel jLAux2;
    private javax.swing.JLabel jLAux3;
    private javax.swing.JLabel jLCensura;
    private javax.swing.JLabel jLQuantidadeA;
    private javax.swing.JLabel jLQuantidadeE;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
