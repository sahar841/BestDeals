/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Catalogue {
    private int id;
    private String description;
    private String nom;
    

    public Catalogue() {
    }

    public Catalogue(int id, String description, String nom) {
        this.id=id;
        this.description = description;
        this.nom = nom;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    

    @Override
    public String toString() {
        return "Catalogue{" + "id=" + id + ", discription=" + description + ", nom=" + nom  + '}';
    }
    
    
    
}
