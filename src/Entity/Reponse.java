/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Reponse {
    private int id;
    private String continu;
    private Question question;
    private Client client;

    public Reponse(int id,String continu, Question question, Client client) {
        this.id=id;
        this.continu = continu;
        this.question = question;
        this.client = client;
    }

    public Reponse() {
        question= new Question();
        client= new Client();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContinu() {
        return continu;
    }

    public void setContinu(String continu) {
        this.continu = continu;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reponse{" + "id=" + id + ", continu=" + continu + ", question=" + question + ", client=" + client + '}';
    }
    
    
}
