/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author HAMZA
 */
public class Deal {
    private int id;
    private String description;
    private String dateCreation;
    private String dateLimit;
    private String nom;
    private String type;
    private String image;
    private ResponsableSociete responsableSociete;
    private Catalogue catalogue;

  
    public Deal( String description, String dateCreation, String dateLimit, String nom,ResponsableSociete responsableSociete, Catalogue catalogue) {
     
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateLimit = dateLimit;
        this.nom = nom;
        this.responsableSociete = responsableSociete;
        this.catalogue = catalogue;
        
        
    }

  public Deal(int id, String description, String dateCreation, String dateLimit, String nom, String type, String image, ResponsableSociete responsableSociete, Catalogue catalogue) {
        this.id = id;
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateLimit = dateLimit;
        this.nom = nom;
        this.type = type;
        this.image = image;
        this.responsableSociete = responsableSociete;
        this.catalogue = catalogue;
    }
 
    
     public Deal( String description, String dateCreation, String dateLimit, String nom, String type, String image, ResponsableSociete responsableSociete, Catalogue catalogue) {
       
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateLimit = dateLimit;
        this.nom = nom;
        this.type = type;
        this.image = image;
        this.responsableSociete = responsableSociete;
        this.catalogue = catalogue;
    }
    

    public Deal() {
        responsableSociete=new ResponsableSociete();
        catalogue=new Catalogue();
        
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

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateLimit() {
        return dateLimit;
    }

    public void setDateLimit(String dateLimit) {
        this.dateLimit = dateLimit;
    }

    public ResponsableSociete getResponsableSociete() {
        return responsableSociete;
    }

    public void setResponsableSociete(ResponsableSociete responsableSociete) {
        this.responsableSociete = responsableSociete;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Deal{" + "id=" + id + ", description=" + description + ", dateCreation=" + dateCreation + ", dateLimit=" + dateLimit + ", nom=" + nom + ", type=" + type + ", image=" + image + ", responsableSociete=" + responsableSociete + ", catalogue=" + catalogue + '}';
    }

   

    
    
    
    
    
}
