/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Client {
    private int id;
    private String login;
    private String motDePasse;
    private String adresse;
    private String nom;
    private String prenom;
    private String email;
    private String CIN;
    private int age;
    private String sexe;
    private String phoneNumber;

    public Client(int id,String login, String motDePasse, String adresse, String nom, String prenom, String email, String CIN, int age, String sexe, String phoneNumber) {
        this.id=id;
        this.login = login;
        this.motDePasse = motDePasse;
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.CIN = CIN;
        this.age = age;
        this.sexe = sexe;
        this.phoneNumber = phoneNumber;
    }

    public Client() {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + ", adresse=" + adresse + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", CIN=" + CIN + ", age=" + age + ", sexe=" + sexe + ", phoneNumber=" + phoneNumber + '}';
    }
    
            
    
}
