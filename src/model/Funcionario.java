
package model;

/**
 *
 * @author Matheus
 * Classe que tem as declarações de variaveis e gets e sets e construtor
 * referentes aos Funcionarios
 */
public class Funcionario {

  private int cod_func;
  private String nome_func;
  private String  cpf;
  private String endereco;
  private double salario;
  private int tipo_funcionario;
  private String senha;
    
    /**
     *
     * @return
     */
    public int getCod_func() {
        return cod_func;
    }

    /**
     * @param cod_func the cod_func to set
     */
    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    /**
     * @return the nome_func
     */
    public String getNome_func() {
        return nome_func;
    }

    /**
     * @param nome_func the nome_func to set
     */
    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the tipo_funcionario
     */
    public int getTipo_funcionario() {
        return tipo_funcionario;
    }

    /**
     * @param tipo_funcionario the tipo_funcionario to set
     */
    public void setTipo_funcionario(int tipo_funcionario) {
        this.tipo_funcionario = tipo_funcionario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     */
    public Funcionario() {
        
    }

    /**
     *
     * @param cod_func
     * @param nome_func
     * @param cpf
     * @param endereco
     * @param salario
     * @param tipo_funcionario
     * @param senha
     */
    public Funcionario(int cod_func, String nome_func, String cpf, String endereco, double salario, int tipo_funcionario, String senha) {
        this.cod_func = cod_func;
        this.nome_func = nome_func;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
        this.tipo_funcionario = tipo_funcionario;
        this.senha = senha;
    }
    
  
  }
  

