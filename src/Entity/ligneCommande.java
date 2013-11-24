/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class ligneCommande {
    private int id;
    private Commande commande;
    private Produit produit;
    private int quantite;
    private float prix;

    public ligneCommande() {
    }

   

    public ligneCommande(int id, Commande commande, Produit produit, int quantite, float prix) {
        this.id = id;
        this.commande = commande;
        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Commande getCommande() {
        return commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "ligneCommande{" + "idLigneCommande=" + id + ", commande=" + commande + ", produit=" + produit + ", quantite=" + quantite + ", prix=" + prix + '}';
    }
    
    
    
    
    
}
