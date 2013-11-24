/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class ResponsableSociete {
    private int id;
    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String email;
    private String adresseSociete;
    private String phoneNumber;
    private String nomSociete;
    private String cin;

    public ResponsableSociete() {
    }

    public ResponsableSociete(int id,String login, String motDePasse, String nom, String prenom, String email, String adresseSociete, String phoneNumber, String nomSociete, String cin) {
        
        this.id=id;
        this.login = login;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresseSociete = adresseSociete;
        this.phoneNumber = phoneNumber;
        this.nomSociete = nomSociete;
        this.cin = cin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresseSociete() {
        return adresseSociete;
    }

    public void setAdresseSociete(String adresseSociete) {
        this.adresseSociete = adresseSociete;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "ResponsableSociete{" + "id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresseSociete=" + adresseSociete + ", phoneNumber=" + phoneNumber + ", nomSociete=" + nomSociete + ", cin=" + cin + '}';
    }
    
    
}
