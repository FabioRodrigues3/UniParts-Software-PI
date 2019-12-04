
package data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Produto;

/**
 *
 * @author Matheus
 * essa classe é responsavel pelo cadastro, consulta, alteração e delete de dados da tabela Funcionarios do DB
 */
public class ProdutoData {
    private Connection con;
    
    /**
     *
     */
    public ProdutoData(){
    
    this.con = new conexaoC().getConexao();
    }

    /**
     *
     * @param objPro
     * @return
     * @throws Exception
     * * O metodo Incluir cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Incluir (Produto objPro) throws Exception{
        try {
            String SQL = "insert into produto values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps;
            ps = this.con.prepareStatement(SQL);           
            ps.setString(1, objPro.getNome_produto());
            ps.setString(2, objPro.getTipo_produto());
            ps.setString(3, objPro.getMarca());
            ps.setString(4, objPro.getModelo());
            ps.setString(5, objPro.getNucleos());
            ps.setString(6, objPro.getThreads());
            ps.setString(7, objPro.getSocket());
            ps.setString(8, objPro.getCache());
            ps.setString(9, objPro.getPotencia());
            ps.setString(10, objPro.getChipset());
            ps.setString(11, objPro.getMem_comp());
            ps.setString(12, objPro.getComp_cpu());
            ps.setString(13, objPro.getGb());
            ps.setInt(14, objPro.getQuantidade());
            ps.setDouble(15, objPro.getValor());
            ps.setString(16, objPro.getFrequencia());

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
    public Produto Pesquisar(String nome) throws Exception{
        try {
            this.con = new conexaoC().getConexao();
            Produto objPro = null;
            String SQL = "select * from produto where nome_produto = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               objPro = new Produto();
               objPro.setCod_produto(rs.getInt("cod_produto")); 
               objPro.setNome_produto(rs.getString("nome_produto"));
               objPro.setTipo_produto(rs.getString("tipo_produto"));
               objPro.setMarca(rs.getString("marca"));
               objPro.setModelo(rs.getString("modelo"));
               objPro.setNucleos(rs.getString("nucleos"));
               objPro.setThreads(rs.getString("threads"));
               objPro.setSocket(rs.getString("socket"));
               objPro.setCache(rs.getString("cache"));
               objPro.setPotencia(rs.getString("potencia"));
               objPro.setChipset(rs.getString("chipset"));
               objPro.setMem_comp(rs.getString("mem_compativel"));
               objPro.setComp_cpu(rs.getString("comp_cpu"));
               objPro.setGb(rs.getString("gb"));
               objPro.setQuantidade(rs.getInt("quantidade"));
               objPro.setValor(rs.getDouble("valor"));
               objPro.setFrequencia(rs.getString("frequencia"));           
       }
       return objPro;                                                        
       } catch (Exception e){
            throw e;
        }
    }

    /**
     *
     * @param objPro
     * @return
     * @throws Exception
     * O metodo Editar cadastrar os dados na tabela do Banco de Dados
     */
    public boolean Editar (Produto objPro) throws Exception {
         try {
                String SQL = "update produto set nome_produto = ?, tipo_produto = ?, marca = ?, modelo = ?, nucleos = ?,"
                        + "threads = ?, socket = ?, cache = ?, potencia = ?, chipset = ?, mem_compativel = ?, comp_cpu = ?,"
                        + "gb = ?, quantidade = ?, valor = ?, frequencia = ? where cod_produto = ?";
                PreparedStatement ps;
                ps = this.con.prepareStatement(SQL);            
                ps.setString(1, objPro.getNome_produto());
                ps.setString(2, objPro.getTipo_produto());
                ps.setString(3, objPro.getMarca());
                ps.setString(4, objPro.getModelo());
                ps.setString(5, objPro.getNucleos());
                ps.setString(6, objPro.getThreads());
                ps.setString(7, objPro.getSocket());
                ps.setString(8, objPro.getCache());
                ps.setString(9, objPro.getPotencia());
                ps.setString(10, objPro.getChipset());
                ps.setString(11, objPro.getMem_comp());
                ps.setString(12, objPro.getComp_cpu());
                ps.setString(13, objPro.getGb());
                ps.setInt(14, objPro.getQuantidade());
                ps.setDouble(15, objPro.getValor());
                ps.setString(16, objPro.getFrequencia());
                ps.setInt(17, objPro.getCod_produto());
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
             String SQL = "delete from produto where cod_produto = ?";
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0)
                return true; 
                else 
                return false;
            }
}
    

