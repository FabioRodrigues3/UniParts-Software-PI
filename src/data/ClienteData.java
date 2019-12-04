
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Cliente;

/**
 *
 * @author Matheus
 * essa classe é responsavel pelo cadastro, consulta, alteração e delete de dados da tabela Clientes do DB
 */
public class ClienteData {
    
    private Connection con;
 
    /**
     *
     */
    public ClienteData(){ 
    this.con = new conexaoC().getConexao();
        }

    /**
     *
     * @param objCli
     * @return
     * @throws Exception
     */
    
    /**
     * O metodo Incluir cadastrar os dados na tabela do Banco de Dados
     * @param objCli
     * @return 
     * @throws java.lang.Exception
     */
    public boolean Incluir (Cliente objCli) throws Exception{
        try {
                String SQL = "insert into cliente values (?,?,?,?)";
                PreparedStatement ps;
                ps = this.con.prepareStatement(SQL);
                ps.setString(1, objCli.getNome_cliente());
                ps.setString(2, objCli.getCpf_cliente());
                ps.setString(3, objCli.getEndereco_cliente());
                ps.setString(4, objCli.getTelefone_cliente());
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
     * @param nome
     * @return
     * @throws Exception
     * 
     * O metodo Pesquisar cadastrar os dados na tabela do Banco de Dados
     */
     
    public Cliente Pesquisar(String nome) throws Exception {
        try {
            this.con = new conexaoC().getConexao();
            Cliente objCli = null;
            String SQL = "select * from cliente where nome_cliente = ?" ;
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               objCli = new Cliente();
               objCli.setCod_cliente(rs.getInt("cod_cliente"));
               objCli.setNome_cliente(rs.getString("nome_cliente"));
               objCli.setCpf_cliente(rs.getString("cpf_cliente"));
               objCli.setEndereco_cliente(rs.getString("endereco_cliente"));
               objCli.setTelefone_cliente(rs.getString("telefone_cliente"));
           }
           return objCli;                                                           
        } catch (Exception e){
            throw e;
        }
    }
    
    /**
     *
     * @param objCli
     * @return
     * @throws Exception
     * O metodo Editar cadastrar os dados na tabela do Banco de Dados  
     */
    public boolean Editar (Cliente objCli) throws Exception {
         try {
                String SQL = "update cliente set nome_cliente = ?, cpf_cliente = ?, endereco_cliente = ?, telefone_cliente = ? where cod_cliente = ?";
                PreparedStatement ps;
                ps = this.con.prepareStatement(SQL);            
                ps.setString(1, objCli.getNome_cliente());
                ps.setString(2, objCli.getCpf_cliente());
                ps.setString(3, objCli.getEndereco_cliente());
                ps.setString(4, objCli.getTelefone_cliente());
                ps.setInt(5, objCli.getCod_cliente());
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
             String SQL = "delete from cliente where cod_cliente = ?";
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0)
                return true; 
                else 
                return false;
            }
            
            }



    
    