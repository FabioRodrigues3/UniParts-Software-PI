
package model;

/**
 *
 * @author Matheus
 * Classe que tem as declarações de variaveis e gets e sets e construtor
 * referentes aos produtos
 */
public class Produto {

    /**
     *
     */
    public Produto() {   
    }
    
    /**
     *
     * @return
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     *
     * @param cod_produto
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     *
     * @return
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     *
     * @param nome_produto
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     *
     * @return
     */
    public String getTipo_produto() {
        return tipo_produto;
    }

    /**
     *
     * @param tipo_produto
     */
    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getNucleos() {
        return nucleos;
    }

    /**
     *
     * @param nucleos
     */
    public void setNucleos(String nucleos) {
        this.nucleos = nucleos;
    }

    /**
     *
     * @return
     */
    public String getThreads() {
        return threads;
    }

    /**
     *
     * @param threads
     */
    public void setThreads(String threads) {
        this.threads = threads;
    }

    /**
     *
     * @return
     */
    public String getSocket() {
        return socket;
    }

    /**
     *
     * @param socket
     */
    public void setSocket(String socket) {
        this.socket = socket;
    }

    /**
     *
     * @return
     */
    public String getCache() {
        return cache;
    }

    /**
     *
     * @param cache
     */
    public void setCache(String cache) {
        this.cache = cache;
    }

    /**
     *
     * @return
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     *
     * @param potencia
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     *
     * @return
     */
    public String getChipset() {
        return chipset;
    }

    /**
     *
     * @param chipset
     */
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    /**
     *
     * @return
     */
    public String getMem_comp() {
        return mem_comp;
    }

    /**
     *
     * @param mem_comp
     */
    public void setMem_comp(String mem_comp) {
        this.mem_comp = mem_comp;
    }

    /**
     *
     * @return
     */
    public String getComp_cpu() {
        return comp_cpu;
    }

    /**
     *
     * @param comp_cpu
     */
    public void setComp_cpu(String comp_cpu) {
        this.comp_cpu = comp_cpu;
    }

    /**
     *
     * @return
     */
    public String getGb() {
        return gb;
    }

    /**
     *
     * @param gb
     */
    public void setGb(String gb) {
        this.gb = gb;
    }

    /**
     *
     * @return
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public String getFrequencia() {
        return frequencia;
    }

    /**
     *
     * @param frequencia
     */
    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    
    /**
     *
     * @param cod_produto
     * @param nome_produto
     * @param tipo_produto
     * @param marca
     * @param modelo
     * @param nucleos
     * @param threads
     * @param socket
     * @param cache
     * @param potencia
     * @param chipset
     * @param mem_comp
     * @param comp_cpu
     * @param gb
     * @param quantidade
     * @param valor
     * @param frequencia
     */
    public Produto(int cod_produto, String nome_produto, String tipo_produto, String marca, String modelo, String nucleos, String threads, String socket, String cache, String potencia, String chipset, String mem_comp, String comp_cpu, String gb, int quantidade, double valor, String frequencia) {
        this.cod_produto = cod_produto;
        this.nome_produto = nome_produto;
        this.tipo_produto = tipo_produto;
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.threads = threads;
        this.socket = socket;
        this.cache = cache;
        this.potencia = potencia;
        this.chipset = chipset;
        this.mem_comp = mem_comp;
        this.comp_cpu = comp_cpu;
        this.gb = gb;
        this.quantidade = quantidade;
        this.valor = valor;
        this.frequencia = frequencia;
    }

    int cod_produto;
    String nome_produto;
    String tipo_produto;
    String marca;
    String modelo;
    String nucleos;
    String threads;
    String socket;
    String cache;
    String potencia;
    String chipset;
    String mem_comp;
    String comp_cpu;
    String gb;
    int quantidade;
    double valor;
    String frequencia;   
}
