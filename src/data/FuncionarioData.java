
package data;

import java.sql.Connection;
import model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Matheus
 * essa classe é responsavel pelo cadastro, consulta, alteração e delete de dados da tabela Funcionarios do DB
 */
public class FuncionarioData {
    private Connection con;
    /**
     *
     */
    public FuncionarioData() {
    
        this.con = new conexaoC().getConexao();

}

    /**
     *
     * @param objFunc
     * @return
     * @throws Exception
     * O metodo Incluir cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Incluir (Funcionario objFunc) throws Exception{
        try {
        String SQL = "insert into funcionario values (?,?,?,?,?,?)";
        PreparedStatement ps;
        ps = this.con.prepareStatement(SQL);         
        ps.setString(1, objFunc.getNome_func());
        ps.setString(2, objFunc.getCpf());
        ps.setString(3, objFunc.getEndereco());
        ps.setDouble(4, objFunc.getSalario());
        ps.setInt(5, objFunc.getTipo_funcionario());
        ps.setString(6, objFunc.getSenha());
        if(ps.executeUpdate() > 0)
        return true;
        else
            return false; }   
                catch (Exception e){
                   throw e;
               }
    }
    
    /**
     *
     * @param nome
     * @return
     * @throws Exception
     * O metodo Funcionario cadastrar os dados na tabela do Banco de Dados
     */
    public Funcionario Pesquisar(String nome) throws Exception{
        this.con = new conexaoC().getConexao();
        Funcionario objFunc = null;
        String SQL = "select * from funcionario where nome_func = ?";
       PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           objFunc = new Funcionario();
           objFunc.setNome_func(rs.getString("nome_func"));
           objFunc.setCpf(rs.getString("cpf_func"));
           objFunc.setEndereco(rs.getString("endereco_func"));
           objFunc.setSalario(rs.getDouble("salario"));
           objFunc.setTipo_funcionario(rs.getInt("tipo_funcionario"));
           objFunc.setSenha(rs.getString("senha"));
       }
            return objFunc;
             }

    /**
     *
     * @param objFunc
     * @return
     * @throws Exception
     * O metodo Editar cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Editar (Funcionario objFunc) throws Exception {
         try {
                String SQL = "update funcionario set nome_func = ?, cpf_func = ?, endereco_func = ?, salario = ?, tipo_funcionario = ?, senha = ? where cod_func = ?";
                PreparedStatement ps;
                ps = this.con.prepareStatement(SQL);            
                ps.setString(1, objFunc.getNome_func());
                ps.setString(2, objFunc.getCpf());
                ps.setString(3, objFunc.getEndereco());
                ps.setDouble(4, objFunc.getSalario());
                ps.setInt(5, objFunc.getTipo_funcionario());
                ps.setString(6, objFunc.getSenha());
                ps.setInt(7, objFunc.getCod_func());
                if(ps.executeUpdate() > 0)
                    return true;
                else 
                    return false;
            }
           catch (Exception e){
               throw e;
           }
     }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     * O metodo Excluir cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Excluir (int id) throws Exception {
             this.con = new conexaoC().getConexao();
             String SQL = "delete from funcionario where cod_func = ?";
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0)
                return true; 
                else 
                return false;
            }
}

    


    
    
    




