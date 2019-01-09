package Default;
import java.awt.*;
import javax.swing.*;

public class AddView extends DefaultView{
    
    public AddView(Window w){
        
        super(w);
        
        this.rechercherButton.setEnabled(false);
        this.reinitialiserButton.addActionListener(new ButtonsListener(this, "Ajouter"));
        this.validerButton.addActionListener(new ButtonsListener(this, "Ajouter"));
        this.annulerButton.addActionListener(new ButtonsListener(this, "Ajouter"));
    }
    
    
}
