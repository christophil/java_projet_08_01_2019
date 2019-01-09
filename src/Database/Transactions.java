package Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Transactions implements ActionsBDD{
    
    private static Connection dbConn;
    private static Statement stmt;
    private static PreparedStatement pstmt;
    private static ArrayList<Programmeur> listeProgrammeurs;
    private static Programmeur prog;


    public Transactions() {
    }

    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne une
     * liste de l'ensemble des programmeurs
     *
     * @return listeProgrammeurs Une variable de type ArryList
     */
    @Override
    public ArrayList getProgrammeurs() {
        
        dbConn = DatabaseConnection.getinstance();
        
        listeProgrammeurs = new ArrayList<>();
        
        
        try {
            stmt = dbConn.createStatement();
            
            ResultSet rs;
            rs = stmt.executeQuery(Constantes.REQUETE_TOUS);
            
            try {
                while (rs.next()) {
                    prog = new Programmeur();
                    prog.setMatricule(rs.getString("MATRICULE"));
                    prog.setNom(rs.getString("NOM"));
                    prog.setPrenom(rs.getString("PRENOM"));
                    prog.setAdresse(rs.getString("ADRESSE"));
                    prog.setPseudo(rs.getString("PSEUDO"));
                    prog.setResponsable(rs.getString("RESPONSABLE"));
                    prog.setHobby(rs.getString("HOBBY"));
                    prog.setDateNaiss(rs.getString("DATE_NAISS"));
                    prog.setDateEmb(rs.getString("DATE_EMB"));

                    
                    listeProgrammeurs.add(prog);
                }
            } catch (SQLException sqle) {
                System.err.println("SQL error: " + sqle.getMessage());
            }
            
        } catch (SQLException sqle) {
            System.err.println("SQL error: " + sqle.getMessage());
        }
        
        return listeProgrammeurs;
    }

    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne ce
     * programmeur.
     *
     * @param matricule Le matricule saisi par l'utilisateur pour lancer la recherche
     * @return prog Une variable de type Programmeur
     *
     */
    @Override
    public Programmeur getProgrammeur(String matricule) {
        
        dbConn = DatabaseConnection.getinstance();
        
        try {
            pstmt = dbConn.prepareStatement(Constantes.REQUETE_UNIQUE);
            pstmt.setString(1, matricule);
            
            ResultSet rs;
            rs = pstmt.executeQuery();

            while (rs.next()) {
                prog = new Programmeur();
                prog.setMatricule(rs.getString("MATRICULE"));
                    prog.setNom(rs.getString("NOM"));
                    prog.setPrenom(rs.getString("PRENOM"));
                    prog.setAdresse(rs.getString("ADRESSE"));
                    prog.setPseudo(rs.getString("PSEUDO"));
                    prog.setResponsable(rs.getString("RESPONSABLE"));
                    prog.setHobby(rs.getString("HOBBY"));
                    prog.setDateNaiss(rs.getString("DATE_NAISS"));
                    prog.setDateEmb(rs.getString("DATE_EMB"));
            }
        } catch (SQLException sqle) {
            System.err.println("SQL error: " + sqle.getMessage());
        }
        return prog;
    }

    /**
     * Cette méthode modifie les infos d'un programmeur et renvoie le status de la
     * modification.
     *
     * @param prog Les informations du programmeur
     * @return res Une variable de type int
     *
     */
    @Override
    public int updateProgrammeur(Programmeur prog){
        
        int res = -1;
        
        dbConn = DatabaseConnection.getinstance();
        
         try {
            pstmt = dbConn.prepareStatement(Constantes.REQUETE_UPDATE);
            pstmt.setString(1, prog.getNom());
            pstmt.setString(2, prog.getPrenom());
            pstmt.setString(3, prog.getAdresse());
            pstmt.setString(4, prog.getPseudo());
            pstmt.setString(5, prog.getResponsable());
            pstmt.setString(6, prog.getHobby());
            pstmt.setString(7, prog.getDateNaiss());
            pstmt.setString(8, prog.getDateEmb());
            pstmt.setString(9, prog.getMatricule());
            
            ResultSet rs;
            res = pstmt.executeUpdate();

            return res;
            
        } catch (SQLException sqle) {
            System.err.println("SQL error: " + sqle.getMessage());
        }

        return res;
    }
    
    /**
     * Cette méthode ajoute un programmeur et renvoie le status de l'ajout
     *
     * @param prog Les informations du programmeur
     * @return res Une variable de type boolean
     *
     */
    @Override
    public boolean addProgrammeur(Programmeur prog){
        
        boolean res;
        
        dbConn = DatabaseConnection.getinstance();
        
         try {

            pstmt = dbConn.prepareStatement(Constantes.REQUETE_INSERT);
  
            pstmt.setString(1, prog.getMatricule());
            pstmt.setString(2, prog.getNom());
            pstmt.setString(3, prog.getPrenom());
            pstmt.setString(4, prog.getAdresse());
            pstmt.setString(5, prog.getPseudo());
            pstmt.setString(6, prog.getResponsable());
            pstmt.setString(7, prog.getHobby());
            pstmt.setString(8, prog.getDateNaiss());
            pstmt.setString(9, prog.getDateEmb());

            res = pstmt.execute();

            return res;
            
        } catch (SQLException sqle) {
            System.err.println("SQL error: " + sqle.getMessage());
        }
        return true;
    }
    
    /**
     * Cette méthode supprime un programmeur et renvoie le status de la
     * suppression.
     *
     * @param matricule Le matricule du programmeur
     * @return res Une variable de type int
     *
     */
    @Override
    public int deleteProgrammeur(String matricule){
        
        int res = -1;
        
        dbConn = DatabaseConnection.getinstance();
        
         try {
            pstmt = dbConn.prepareStatement(Constantes.REQUETE_DELETE);
            pstmt.setString(1, matricule);

            res = pstmt.executeUpdate();
            
            return res;
        } catch (SQLException sqle) {
            
            System.err.println("SQL error : " + sqle.getMessage());
        }
        return res;
    }

}
