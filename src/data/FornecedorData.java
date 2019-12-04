
package data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Fornecedor;

/**
 *
 * @author Matheus
* essa classe é responsavel pelo cadastro, consulta, alteração e delete de dados da tabela Fornecedor do DB
 */
public class FornecedorData {
    
    private Connection con;
    
    /**
     *
     */
    public FornecedorData(){
    
    this.con = new conexaoC().getConexao();
    }

    /**
     *
     * @param objFor
     * @return
     * @throws Exception
     * O metodo Incluir cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Incluir (Fornecedor objFor) throws Exception{
        try {
            String SQL = "insert into fornecedor values (?,?,?,?)";
            PreparedStatement ps;
            ps = this.con.prepareStatement(SQL);           
            ps.setString(1, objFor.getNome_empresa());
            ps.setString(2, objFor.getCnpj_fornecedor());
            ps.setString(3, objFor.getContato());
            ps.setString(4, objFor.getEndereco());
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
     * O metodo Pesquisar cadastrar os dados na tabela do Banco de Dados
     */
    public Fornecedor Pesquisar(String nome) throws Exception{
        this.con = new conexaoC().getConexao();
        Fornecedor objFor = null;
        String SQL = "select * from fornecedor where nome_empresa = ?";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           objFor = new Fornecedor();
           objFor.setCod_fornecedor(rs.getInt("cod_fornecedor"));
           objFor.setNome_empresa(rs.getString("nome_empresa"));
           objFor.setCnpj_fornecedor(rs.getString("cnpj_fornecedor"));
           objFor.setContato(rs.getString("contato"));
           objFor.setEndereco(rs.getString("endereco"));
       }
       return objFor;                                                        
       }

    /**
     *
     * @param objFor
     * @return
     * @throws Exception
     * O metodo Editar cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Editar (Fornecedor objFor) throws Exception {
         try {
                String SQL = "update fornecedor set nome_empresa = ?, cnpj_fornecedor = ?, contato = ?, endereco = ? where cod_fornecedor = ?";
                PreparedStatement ps;
                ps = this.con.prepareStatement(SQL);            
                ps.setString(1, objFor.getNome_empresa());
                ps.setString(2, objFor.getCnpj_fornecedor());
                ps.setString(3, objFor.getContato());
                ps.setString(4, objFor.getEndereco());
                ps.setInt(5, objFor.getCod_fornecedor());
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
             String SQL = "delete from fornecedor where cod_fornecedor = ?";
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0)
                return true; 
                else 
                return false;
            }
}