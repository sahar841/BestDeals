/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Produit {
    private int id;
    private String description;
    private float prix;
    private int remise;
    private int quantiteInitial;
    private int quantiteDisponible;
    private String nom;
    private String image;
    private Deal deal;

    public Produit(int id, String description, float prix, int remise, int quantiteInitial, int quantiteDisponible, String nom, String image, Deal deal) {
        this.id = id;
        this.description = description;
        this.prix = prix;
        this.remise = remise;
        this.quantiteInitial = quantiteInitial;
        this.quantiteDisponible = quantiteDisponible;
        this.nom = nom;
        this.image = image;
        this.deal = deal;
    }

    

    public Produit() {
        deal=new Deal();
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public int getQuantiteInitial() {
        return quantiteInitial;
    }

    public void setQuantiteInitial(int quantiteInitial) {
        this.quantiteInitial = quantiteInitial;
    }

    public int getQuantiteDisponible() {
        return quantiteDisponible;
    }

    public void setQuantiteDisponible(int quantiteDisponible) {
        this.quantiteDisponible = quantiteDisponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", description=" + description + ", prix=" + prix + ", remise=" + remise + ", quantiteInitial=" + quantiteInitial + ", quantiteDisponible=" + quantiteDisponible + ", nom=" + nom + ", image=" + image + ", deal=" + deal + '}';
    }

    
    
}
