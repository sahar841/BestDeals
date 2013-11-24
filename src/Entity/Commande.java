/*
 pas encore fini
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Commande {
    private int id;
    private String ref;
    private String dateDebut;
    private int prix;
    private Client client;
    

    public Commande() {
        client =new Client();
        
    }

    public Commande(int id,String ref, String dat_com,int prix, Client client) {
        this.id=id;
        this.ref = ref;
        this.dateDebut = dat_com;
        this.prix=prix;
        this.client = client;
        
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dat_com) {
        this.dateDebut = dat_com;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", ref=" + ref + ", dateDebut=" + dateDebut + ", prix=" + prix + ", client=" + client + '}';
    }

   

    
    
    
}
