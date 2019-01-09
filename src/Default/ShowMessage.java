package Default;
import java.awt.*;
import javax.swing.*;

public class ShowMessage extends JOptionPane{
    
    /**
     * Cette méthode affiche une pop up d'erreur
     *
     * @param errorType Le type de l'erreur
     * @param errorMessage Le message de l'erreur
     */
    public static void showError(String errorType, String errorMessage){
        ShowMessage.showMessageDialog(null, errorMessage, errorType, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Cette méthode affiche une pop up d'informations
     *
     * @param informationType Le type de l'information
     * @param informationMessage Le message de l'information
     */
    public static void showInformation(String informationType, String informationMessage){
        ShowMessage.showMessageDialog(null, informationMessage, informationType, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Cette méthode affiche une pop up de confirmation
     *
     * @param message Le message a afficher
     */
    public static int showConfirmation(String message){
        return ShowMessage.showConfirmDialog(null, message);
    }
    
}
