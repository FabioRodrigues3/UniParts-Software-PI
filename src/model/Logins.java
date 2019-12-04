
package model;

/**
 *
 * @author Matheus
 * Classe que tem as declarações de variaveis e gets e sets e construtor
 * referente ao Login
 */
public class Logins {
    
    /**
     *
     */
    public Logins(){
        
    }    

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     * @param usuario
     * @param senha
     */
    public Logins(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    String usuario, senha;
}
