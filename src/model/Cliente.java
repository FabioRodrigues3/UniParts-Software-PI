
package model;

/**
 *
 * @author Matheus
 * Classe que tem as declarações de variaveis e gets e sets e construtor
 * referentes aos Clientes
 */
public class Cliente {

    /**
     *
     */
    public Cliente() {
        
    }

    /**
     *
     * @return
     */
    public int getCod_cliente() {
        return cod_cliente;
    }

    /**
     *
     * @param cod_cliente
     */
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    /**
     *
     * @return
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     *
     * @param nome_cliente
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     *
     * @return
     */
    public String getCpf_cliente() {
        return cpf_cliente;
    }

    /**
     *
     * @param cpf_cliente
     */
    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    /**
     *
     * @return
     */
    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    /**
     *
     * @param endereco_cliente
     */
    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    /**
     *
     * @return
     */
    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    /**
     *
     * @param telefone_cliente
     */
    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    /**
     *
     * @param cod_cliente
     * @param nome_cliente
     * @param cpf_cliente
     * @param endereco_cliente
     * @param telefone_cliente
     */
    public Cliente(int cod_cliente, String nome_cliente, String cpf_cliente, String endereco_cliente, String telefone_cliente) {
        this.cod_cliente = cod_cliente;
        this.nome_cliente = nome_cliente;
        this.cpf_cliente = cpf_cliente;
        this.endereco_cliente = endereco_cliente;
        this.telefone_cliente = telefone_cliente;
    }
    private int cod_cliente;
    private String nome_cliente;
    private String cpf_cliente;
    private String endereco_cliente;
    private String telefone_cliente;
            
    
}
