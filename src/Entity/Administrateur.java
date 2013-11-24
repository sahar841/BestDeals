/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Administrateur {
    private int id;
    private String login;
    private String motDePasse;

    public Administrateur(int id,String login, String motDePasse) {
        this.id=id;
        this.login = login;
        this.motDePasse = motDePasse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + '}';
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    
}
