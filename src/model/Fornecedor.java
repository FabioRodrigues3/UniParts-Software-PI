package model;

/**
 *
 * @author Matheus
 * Classe que tem as declarações de variaveis e gets e sets e construtor
 * referentes aos Fornecedores
 */
public class Fornecedor {

    /**
     *
     */
    public Fornecedor() {
        
    }

    /**
     *
     * @param cod_fornecedor
     * @param nome_empresa
     * @param cnpj_fornecedor
     * @param contato
     * @param endereco
     */
    public Fornecedor(int cod_fornecedor, String nome_empresa, String cnpj_fornecedor, String contato, String endereco) {
        this.cod_fornecedor = cod_fornecedor;
        this.nome_empresa = nome_empresa;
        this.cnpj_fornecedor = cnpj_fornecedor;
        this.contato = contato;
        this.endereco = endereco;
    }

    /**
     *
     * @return
     */
    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    /**
     *
     * @return
     */
    public String getNome_empresa() {
        return nome_empresa;
    }

    /**
     *
     * @return
     */
    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    /**
     *
     * @return
     */
    public String getContato() {
        return contato;
    }

    /**
     *
     * @param cod_fornecedor
     */
    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    /**
     *
     * @param nome_empresa
     */
    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    /**
     *
     * @param cnpj_fornecedor
     */
    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    /**
     *
     * @param contato
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     *
     * @return
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
  private int cod_fornecedor;
  private String nome_empresa;
  private String  cnpj_fornecedor;
  private String contato;   
  private String endereco;
  

    
}
