
package view;

import data.ClienteData;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Matheus
 * Tela de cadastro e consulta dos clientes, também faz alterações e delete dos cadastros
 */
public class ClienteView extends javax.swing.JFrame {
      private ClienteData DAO;
      private Cliente objCli;
      
    /**
     *
     */
    public ClienteView() {
        initComponents();
        cadastrar.setVisible(false);
        consultar.setVisible(false);
        cpf.setVisible(false);
        cpfBox.setVisible(false);
        endereco.setVisible(false);
        enderecoBox.setVisible(false);
        id.setVisible(false);
        idBox.setVisible(false);
        nome.setVisible(false);
        nomeBox.setVisible(false);
        telefone.setVisible(false);
        telefoneBox.setVisible(false);
        editar.setVisible(false);
        excluir.setVisible(false);
        DAO = new ClienteData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        nomeBox = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        cpfBox = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        enderecoBox = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        telefoneBox = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        idBox = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nome.setText("Nome:");

        nomeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeBoxActionPerformed(evt);
            }
        });

        cpf.setText("CPF:");

        endereco.setText("Endereço:");

        enderecoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoBoxActionPerformed(evt);
            }
        });

        telefone.setText("Telefone:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        id.setText("ID:");

        idBox.setEditable(false);

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

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

        jMenuItem2.setText("Consultar/Alterar/Deletar");
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(endereco)
                        .addComponent(cpf)
                        .addComponent(nome)
                        .addComponent(enderecoBox)
                        .addComponent(cpfBox)
                        .addComponent(nomeBox)
                        .addComponent(telefoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefone))
                    .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf)
                .addGap(2, 2, 2)
                .addComponent(cpfBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(consultar)
                    .addComponent(editar)
                    .addComponent(excluir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeBoxActionPerformed
    
    }//GEN-LAST:event_nomeBoxActionPerformed

    private void enderecoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoBoxActionPerformed
    
    }//GEN-LAST:event_enderecoBoxActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
    /**
    * Comando que faz a consulta e exibi nas textBox
    */
        try{
        if(nomeBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencher o campo Nome!");
            idBox.requestFocus();
        }else{
            Cliente objCli = DAO.Pesquisar(nomeBox.getText());
            if(objCli == null){
                JOptionPane.showMessageDialog(this, "Não foi encontrado o registro!");
                idBox.setText("");
                idBox.requestFocus();
            }else{
                idBox.setText(Integer.toString(objCli.getCod_cliente()));
                nomeBox.setText(objCli.getNome_cliente());
                cpfBox.setText(objCli.getCpf_cliente());
                enderecoBox.setText(objCli.getEndereco_cliente());
                telefoneBox.setText(String.valueOf((objCli.getTelefone_cliente())));
                editar.setVisible(true);
                excluir.setVisible(true);
            }
        }
        }catch(Exception erro){
                JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage() );
                }        
    }//GEN-LAST:event_consultarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
    /**
    * Comando que faz o cadastro pegando os valores das textBox
    */
        try{
            if(validarCampos()){
                if(preencherObj()){
                    this.DAO = new ClienteData();
                    if(DAO.Incluir(objCli))
                        JOptionPane.showMessageDialog(this,"Salvo!");
                        nomeBox.setText("");
                        enderecoBox.setText("");
                        cpfBox.setText("");
                        telefoneBox.setText("");
                }
            }           
        } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar");
               System.out.println(erro.getMessage());
               
               }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        cadastrar.setVisible(true);
        consultar.setVisible(false);
        cpf.setVisible(true);
        cpfBox.setVisible(true);
        endereco.setVisible(true);
        enderecoBox.setVisible(true);
        id.setVisible(false);
        idBox.setVisible(false);
        nome.setVisible(true);
        nomeBox.setVisible(true);
        telefone.setVisible(true);
        telefoneBox.setVisible(true);
        editar.setVisible(false);
        excluir.setVisible(false);
                        nomeBox.setText("");
                        enderecoBox.setText("");
                        cpfBox.setText("");
                        telefoneBox.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cadastrar.setVisible(false);
        consultar.setVisible(true);
        cpf.setVisible(true);
        cpfBox.setVisible(true);
        endereco.setVisible(true);
        enderecoBox.setVisible(true);
        id.setVisible(true);
        idBox.setVisible(true);
        nome.setVisible(true);
        nomeBox.setVisible(true);
        telefone.setVisible(true);
        telefoneBox.setVisible(true);       
        excluir.setVisible(true);
        editar.setVisible(true);       
                        nomeBox.setText("");
                        enderecoBox.setText("");
                        cpfBox.setText("");
                        telefoneBox.setText("");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    /**
    * Comando que edita as informações
    */    
        try{
            if(validarCampos()){
                if(preencherObj2()){
                    this.DAO = new ClienteData();
                    if(DAO.Editar(objCli))
                        JOptionPane.showMessageDialog(this,"Alterado com sucesso");
                        nomeBox.setText("");
                        enderecoBox.setText("");
                        cpfBox.setText("");
                        telefoneBox.setText("");
                }
            }           
        } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar a alteração");
               System.out.println(erro.getMessage());
               }
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    /**
    * Comando que faz a exclusão
    */
        try {
        if(DAO.Excluir(Integer.parseInt(idBox.getText()))){
           JOptionPane.showMessageDialog(this, "Apagado com sucesso");
                        nomeBox.setText("");
                        enderecoBox.setText("");
                        cpfBox.setText("");
                        telefoneBox.setText("");
       } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel apagar");
              }
       }
       catch (Exception erro){ 
               System.out.println(  erro.getMessage());
               } 
    }//GEN-LAST:event_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfBox;
    private javax.swing.JButton editar;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField enderecoBox;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idBox;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeBox;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField telefoneBox;
    // End of variables declaration//GEN-END:variables
 
    /**
     *
     * @return
     * Validar campos é para garantir que os campos estejam preenchidos
     */
    public boolean validarCampos(){
        if(nomeBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Nome");
            nomeBox.requestFocus();
            return false;
        }
        if(cpfBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha CPF");
            cpfBox.requestFocus();
            return false;
        }
        if(enderecoBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Endereco");
            enderecoBox.requestFocus();
            return false;
        }  
        if(telefoneBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha Telefone");
            telefoneBox.requestFocus();
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public boolean preencherObj(){
        objCli = new Cliente();
        objCli.setNome_cliente(nomeBox.getText());
        objCli.setCpf_cliente(cpfBox.getText());
        objCli.setEndereco_cliente(enderecoBox.getText());
        objCli.setTelefone_cliente(telefoneBox.getText());
        return true;
}
    
    /**
     *
     * @return
     */
    public boolean preencherObj2(){
        objCli = new Cliente();
        objCli.setCod_cliente(Integer.parseInt(idBox.getText()));
        objCli.setNome_cliente(nomeBox.getText());
        objCli.setCpf_cliente(cpfBox.getText());
        objCli.setEndereco_cliente(enderecoBox.getText());
        objCli.setTelefone_cliente(telefoneBox.getText());
        return true;
}
}
