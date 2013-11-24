/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Question {
    private int id;
    private String contenu;
    private Client client;
    private Deal deal;

    public Question(int id,String contenu, Client client, Deal deal) {
        this.id=id;
        this.contenu = contenu;
        this.client = client;
        this.deal = deal;
    }

    public Question() {
        client= new Client();
        deal = new Deal();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
    
    
}
