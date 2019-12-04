package view;

import data.FuncionarioData;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author Matheus
* Tela de cadastro e consulta dos clientes, também faz alterações e delete dos cadastros
 */
public class FuncionarioView extends javax.swing.JFrame {
    private FuncionarioData DAO;
    private Funcionario objFunc;
  
    /**
     *
     */
    public FuncionarioView() {       
        initComponents();
        id.setVisible(false);
       jLabel2.setVisible(false);
       jLabel1.setVisible(false);
       nome.setVisible(false);
       cpf.setVisible(true);
       endereco.setVisible(false);
       salario.setVisible(false);
       func.setVisible(false);
       consulta.setVisible(false);
       nomeBox.setVisible(false);
       cpfBox.setVisible(false);
       endereco.setVisible(false);
       salarioBox.setVisible(false);
       funcBox.setVisible(false);
       idBox.setVisible(false);
       cpf.setVisible(false);
       senhaBox.setVisible(false);
       cadastrar.setVisible(false);
       enderecoBox.setVisible(false);
       editar.setVisible(false);
       excluir.setVisible(false);
        DAO = new FuncionarioData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        nomeBox = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        cpfBox = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        enderecoBox = new javax.swing.JTextField();
        salario = new javax.swing.JLabel();
        salarioBox = new javax.swing.JTextField();
        func = new javax.swing.JLabel();
        funcBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senhaBox = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        idBox = new javax.swing.JTextField();
        consulta = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Funcionário");

        nome.setText("Nome:");

        nomeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeBoxActionPerformed(evt);
            }
        });

        cpf.setText("Cpf:");

        endereco.setText("Endereço:");

        salario.setText("Salário:");

        salarioBox.setToolTipText("");

        func.setText("Tipo de Funcionario:");

        jLabel2.setText("Senha:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        idBox.setEditable(false);

        consulta.setText("Consultar");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        id.setText("ID:");

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
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
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
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endereco)
                            .addComponent(nome)
                            .addComponent(nomeBox)
                            .addComponent(cpf)
                            .addComponent(cpfBox)
                            .addComponent(enderecoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consulta)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(func)
                            .addComponent(salarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(funcBox, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senhaBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(func))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(consulta)
                    .addComponent(editar)
                    .addComponent(excluir))
                .addContainerGap(60, Short.MAX_VALUE))
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
                    this.DAO = new FuncionarioData();
                    if(DAO.Incluir(objFunc))
                        JOptionPane.showMessageDialog(this,"Salvo!");
                        jLabel1.setVisible(true);       
                                nomeBox.setText("");
                                cpfBox.setText("");
                                enderecoBox.setText("");
                                salarioBox.setText("");
                                funcBox.setText("");
                                senhaBox.setText("");
                    }
            }
       } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar");
               System.out.println(erro.getMessage());
    }//GEN-LAST:event_cadastrarActionPerformed
    }
    private void nomeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeBoxActionPerformed

    }//GEN-LAST:event_nomeBoxActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
            /**
    * Comando que faz a consulta e exibi nas textBox
    */
        try{
        if(nomeBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencher o campo Nome!");
            nomeBox.requestFocus();
        }else{ Funcionario objFunc = DAO.Pesquisar(nomeBox.getText());           
            if(objFunc == null){
                JOptionPane.showMessageDialog(this, "Não foi encontrado o registro!");
                nomeBox.setText("");
                nomeBox.requestFocus();
            }else{
                nomeBox.setText(objFunc.getNome_func());
                cpfBox.setText(objFunc.getCpf());
                enderecoBox.setText(objFunc.getEndereco());
                salarioBox.setText(String.valueOf((objFunc.getSalario())));
                funcBox.setText(Integer.toString(objFunc.getTipo_funcionario()));
                senhaBox.setText(objFunc.getSenha());
            }
        }
        }catch(Exception erro){
                JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage() );
                }
    }//GEN-LAST:event_consultaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       id.setVisible(false);
       idBox.setVisible(false);
       jLabel2.setVisible(true);
       jLabel1.setVisible(true);
       nome.setVisible(true);
       cpf.setVisible(true);
       endereco.setVisible(true);
       salario.setVisible(true);
       func.setVisible(true);
       consulta.setVisible(false);
       nomeBox.setVisible(true);
       cpfBox.setVisible(true);
       endereco.setVisible(true);
       salarioBox.setVisible(true);
       funcBox.setVisible(true);
       cpf.setVisible(true);
       senhaBox.setVisible(true);
       cadastrar.setVisible(true);
       enderecoBox.setVisible(true);
       editar.setVisible(false);
       excluir.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       id.setVisible(true);
       jLabel2.setVisible(true);
       jLabel1.setVisible(true);
       nome.setVisible(true);
       cpf.setVisible(true);
       endereco.setVisible(true);
       salario.setVisible(true);
       func.setVisible(true);
       consulta.setVisible(true);
       nomeBox.setVisible(true);
       cpfBox.setVisible(true);
       endereco.setVisible(true);
       salarioBox.setVisible(true);
       funcBox.setVisible(true);
       idBox.setVisible(true);
       cpf.setVisible(true);
       senhaBox.setVisible(true);
       cadastrar.setVisible(false);
       enderecoBox.setVisible(true);
       editar.setVisible(true);
       excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        /**
    * Comando que edita as informações
    */  
        try{
            if(validarCampos()){
                if(preencherObj2()){
                    this.DAO = new FuncionarioData();
                    if(DAO.Editar(objFunc))
                        JOptionPane.showMessageDialog(this,"Alterado com sucesso");
                    
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
                        
       } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel apagar");
              }
       }
       catch (Exception erro){ 
               System.out.println(  erro.getMessage());
               } 
    }//GEN-LAST:event_excluirActionPerformed
    
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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FuncionarioView().setVisible(true);
            }
        });    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consulta;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfBox;
    private javax.swing.JButton editar;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField enderecoBox;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel func;
    private javax.swing.JTextField funcBox;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeBox;
    private javax.swing.JLabel salario;
    private javax.swing.JTextField salarioBox;
    private javax.swing.JTextField senhaBox;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return
     */
    public boolean preencherObj(){
        objFunc = new Funcionario();
        objFunc.setNome_func(nomeBox.getText());
        objFunc.setCpf(cpfBox.getText());
        objFunc.setEndereco(enderecoBox.getText());
        objFunc.setSalario(Double.parseDouble(salarioBox.getText()));
        objFunc.setTipo_funcionario(Integer.parseInt(funcBox.getText()));
        objFunc.setSenha(senhaBox.getText());             
        return true;
    }

    /**
     *
     * @return
     */
    public boolean preencherObj2(){
        objFunc = new Funcionario();        
        objFunc.setNome_func(nomeBox.getText());
        objFunc.setCpf(cpfBox.getText());
        objFunc.setEndereco(enderecoBox.getText());
        objFunc.setSalario(Double.parseDouble(salarioBox.getText()));
        objFunc.setTipo_funcionario(Integer.parseInt(funcBox.getText()));
        objFunc.setSenha(senhaBox.getText());
        objFunc.setCod_func(Integer.parseInt(idBox.getText()));
        return true;
    }

    /**
     *
     * @return
     * Validar campos é para garantir que os campos estejam preenchidos
     */
    public boolean validarCampos(){
           if (nomeBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha Nome");
               nomeBox.requestFocus();
               return false;
           }
           if (cpfBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha CPF");
               cpfBox.requestFocus();
               return false;
           }
           if (enderecoBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha Endereço");
               enderecoBox.requestFocus();
               return false;
           }
           if (salarioBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha Salário");
               salarioBox.requestFocus();
               return false;
           }
           if (funcBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha Tipo de Funcionario");
               funcBox.requestFocus();
               return false;
           }
           if (senhaBox.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Preencha Senha");
               senhaBox.requestFocus();
               return false;
           }
          return true;
     }
}




