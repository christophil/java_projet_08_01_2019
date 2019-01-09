package Database;

public class Programmeur {
    
    private String matricule;
    private String nom;
    private String prenom;
    private String adresse;
    private String pseudo;
    private String responsable;
    private String hobby;
    private String dateNaiss;
    private String dateEmb;


    public Programmeur() {
    
    }

    @Override
    public String toString() {
        String affichage =  this.getMatricule() + " "
                            + this.getNom() + " "
                            + this.getPrenom() + " "
                            + this.getAdresse() + " "
                            + this.getPseudo() + " "
                            + this.getResponsable() + " "
                            + this.getHobby() + " "
                            + this.getDateNaiss() + " "
                            + this.getDateEmb() + " ";

        return affichage;
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

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(String dateEmb) {
        this.dateEmb = dateEmb;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
