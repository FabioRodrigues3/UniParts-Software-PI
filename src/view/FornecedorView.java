
package view;

import data.FornecedorData;
import javax.swing.JOptionPane;
import model.Fornecedor;

/**
 *
 * @author Matheus
 * Tela de cadastro e consulta dos fornecedores, também faz alterações e delete dos cadastros
 */
public class FornecedorView extends javax.swing.JFrame {
    private FornecedorData DAO;
    private Fornecedor objFor;

    /**
     *
     */
    public FornecedorView(){    
         initComponents();
         fornecedorBox.setVisible(false);
         cnpjBox.setVisible(false);
         fornecedor.setVisible(false);
         id.setVisible(false);
         idBox.setVisible(false);
         jLabel2.setVisible(false);
         enderecoBox.setVisible(false);
         cadastrar.setVisible(false);
         consultar.setVisible(false);
         editar.setVisible(false);
         excluir.setVisible(false);
         cnpj.setVisible(false);
         contato.setVisible(false);
         contatoBox.setVisible(false);
         DAO = new FornecedorData();
        }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fornecedor = new javax.swing.JLabel();
        fornecedorBox = new javax.swing.JTextField();
        cnpj = new javax.swing.JLabel();
        cnpjBox = new javax.swing.JTextField();
        contato = new javax.swing.JLabel();
        contatoBox = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        idBox = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enderecoBox = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fornecedor.setText("Nome do Fornecedor:");

        cnpj.setText("CNPJ:");

        contato.setText("Contato:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        idBox.setEditable(false);

        id.setText("id:");

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consultar/Alterar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(enderecoBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fornecedor)
                                    .addComponent(cnpj)
                                    .addComponent(contato)
                                    .addComponent(fornecedorBox)
                                    .addComponent(cnpjBox)
                                    .addComponent(contatoBox, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(consultar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornecedorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnpjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contatoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar)
                    .addComponent(consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar)
                    .addComponent(excluir))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        /**
    * Comando que faz o cadastro pegando os valores das textBox
    */
        try{
            if(validarCampos()){
                if(preencherObj()){
                    this.DAO = new FornecedorData();
                    if(DAO.Incluir(objFor))
                        JOptionPane.showMessageDialog(this,"Salvo!");
                    cnpjBox.setText("");
                    enderecoBox.setText("");
                    contatoBox.setText("");
                    fornecedorBox.setText("");
                    idBox.setText("");
                    
                }
            }
       } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar");
               System.out.println(erro.getMessage());
    }//GEN-LAST:event_cadastrarActionPerformed
}
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        /**
    * Comando que faz a consulta e exibi nas textBox
    */
        try{
        if(fornecedorBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencher o campo Nome!");
            fornecedorBox.requestFocus();
        }else{ Fornecedor objFor = DAO.Pesquisar(fornecedorBox.getText());
          
            if(objFor == null){
                JOptionPane.showMessageDialog(this, "Não foi encontrado o registro!");
                fornecedorBox.setText("");
                fornecedorBox.requestFocus();
            }else{
                idBox.setText(Integer.toString(objFor.getCod_fornecedor()));
                fornecedorBox.setText(objFor.getNome_empresa());
                cnpjBox.setText(objFor.getCnpj_fornecedor());
                contatoBox.setText(objFor.getContato());
                enderecoBox.setText(objFor.getEndereco());
                editar.setVisible(true);
                excluir.setVisible(true);
            }
        }
        }catch(Exception erro){
                JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage() );
                }
    }//GEN-LAST:event_consultarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    /**
    * Comando que faz a exclusão
    */
        try {
        if(DAO.Excluir(Integer.parseInt(idBox.getText()))){
           JOptionPane.showMessageDialog(this, "Apagado com sucesso");
                        fornecedorBox.setText("");
                        enderecoBox.setText("");
                        cnpjBox.setText("");
                        contatoBox.setText("");
                        idBox.setText("");
       } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel apagar");
              }
       }
       catch (Exception erro){ 
               System.out.println(  erro.getMessage());
               } 
    }//GEN-LAST:event_excluirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    /**
    * Comando que edita as informações
    */         
        try{
            if(validarCampos()){
                if(preencherObj2()){
                    this.DAO = new FornecedorData();
                    if(DAO.Editar(objFor))
                        JOptionPane.showMessageDialog(this,"Alterado com sucesso");
                    cnpjBox.setText("");
                    enderecoBox.setText("");
                    contatoBox.setText("");
                    fornecedorBox.setText("");
                    idBox.setText("");
                     }
            }           
        } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar a alteração");
               System.out.println(erro.getMessage());
               }
    }//GEN-LAST:event_editarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        fornecedorBox.setVisible(true);
         cnpjBox.setVisible(true);
         fornecedor.setVisible(true);
         id.setVisible(true);
         idBox.setVisible(true);
         jLabel2.setVisible(true);
         enderecoBox.setVisible(true);
         cadastrar.setVisible(true);
         consultar.setVisible(false);
         editar.setVisible(false);
         excluir.setVisible(false);
         cnpj.setVisible(true);
         contato.setVisible(true);
         contatoBox.setVisible(true);
         id.setVisible(false);
         idBox.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fornecedorBox.setVisible(true);
         cnpjBox.setVisible(true);
         fornecedor.setVisible(true);
         id.setVisible(true);
         idBox.setVisible(true);
         jLabel2.setVisible(true);
         enderecoBox.setVisible(true);
         cadastrar.setVisible(false);
         consultar.setVisible(true);
         editar.setVisible(true);
         excluir.setVisible(true);
         cnpj.setVisible(true);
         contato.setVisible(true);
         contatoBox.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel cnpj;
    private javax.swing.JTextField cnpjBox;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel contato;
    private javax.swing.JTextField contatoBox;
    private javax.swing.JButton editar;
    private javax.swing.JTextField enderecoBox;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel fornecedor;
    private javax.swing.JTextField fornecedorBox;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return
     ** Validar campos é para garantir que os campos estejam preenchidos
     */
    public boolean validarCampos(){
        if(fornecedorBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Nome");
            fornecedorBox.requestFocus();
            return false;
        }
        if(cnpjBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha CNPJ");
            cnpjBox.requestFocus();
            return false;
        }
        if(enderecoBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Endereco");
            enderecoBox.requestFocus();
            return false;
        }  
        if(contatoBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Contato");
            contatoBox.requestFocus();
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public boolean preencherObj(){
     objFor = new Fornecedor();
     objFor.setNome_empresa(fornecedorBox.getText());
     objFor.setCnpj_fornecedor(cnpjBox.getText());
     objFor.setContato(contatoBox.getText());
     objFor.setEndereco(enderecoBox.getText());
     return true;
 }

    /**
     *
     * @return
     */
    public boolean preencherObj2(){
     objFor = new Fornecedor();
     objFor.setCod_fornecedor(Integer.parseInt(idBox.getText()));
     objFor.setNome_empresa(fornecedorBox.getText());
     objFor.setCnpj_fornecedor(cnpjBox.getText());
     objFor.setContato(contatoBox.getText());
     objFor.setEndereco(enderecoBox.getText());
     return true;
 }

}
