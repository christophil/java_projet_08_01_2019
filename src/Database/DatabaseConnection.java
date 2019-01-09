package Database;

import java.sql.*;

public class DatabaseConnection {
    
    private static Connection connexion = null;
    
    private static void constructeur(){
        
        try{
            connexion = DriverManager.getConnection(Constantes.URL, Constantes.USER, Constantes.MDP);
            
        } catch(SQLException sqle){
            
            System.err.println("Erreur connexion BDD : " + sqle.getMessage());
        }
    }
    
    /**
     * Cette méthode récupère l'instance de connexionà la BDD ou en crée une
     *
     * @return connexion Une variable de type Connection
     */
    public static Connection getinstance(){
        
        if(connexion == null){
            constructeur();
            return connexion;
        }
        else{
            return connexion;
        }
    }
    
    /**
     * Cette méthode ferme l'instance de connexion à la BDD si elle existe
     *
     */
    public static void closeConnection(){
        
        if(connexion != null){
            try{
                connexion.close();
            } catch(SQLException sqle2){
                System.err.println("Erreur close connexion : " + sqle2.getMessage());
            }
          
        }
    }
}
