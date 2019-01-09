package Database;

public class Constantes {
    
    public static final String OCCUPATION = "Programmeur";
    public static final String URL = "jdbc:derby://localhost:1527/LSI_L3_JAVA";
    public static final String USER = "adm";
    public static final String MDP = "adm";
    public static final String REQUETE_TOUS = "SELECT * FROM PROGRAMMEUR";
    public static final String REQUETE_UNIQUE = "SELECT * FROM PROGRAMMEUR WHERE matricule = ?";
    public static final String REQUETE_UPDATE = "UPDATE PROGRAMMEUR set NOM = ?, PRENOM = ?, ADRESSE = ?, PSEUDO = ?, RESPONSABLE = ?, HOBBY = ?, DATE_NAISS = ?, DATE_EMB = ? WHERE MATRICULE = ?";
    public static final String REQUETE_DELETE = "DELETE FROM PROGRAMMEUR WHERE MATRICULE = ?";
    public static final String REQUETE_INSERT = "INSERT INTO PROGRAMMEUR (MATRICULE, NOM, PRENOM, ADRESSE, PSEUDO, RESPONSABLE, HOBBY, DATE_NAISS, DATE_EMB) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    
}
