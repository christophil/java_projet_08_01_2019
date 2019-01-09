package Default;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

    public class MenuListener implements ActionListener {
    
    private Window window;
    private String menuItem;
    
    public MenuListener(Window w, String mi){
       this.window = w;
       this.menuItem = mi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.menuItem) {
            case "Quitter":
                
                int res = ShowMessage.showConfirmation("Voulez vous vraiment quitter ?");
                
                if(res == 0){
                    
                    this.window.getContentPane().removeAll();
                    this.window.dispatchEvent(new WindowEvent (this.window, WindowEvent.WINDOW_CLOSING));
                }
                
                break;
            case "Tous":
                this.window.getContentPane().removeAll();
                this.window.add(new InformationsView());
                this.window.revalidate();
                break;
            case "Modifier":  
                this.window.getContentPane().removeAll();
                this.window.add(new UpdateView(this.window));
                this.window.revalidate();
                break;
            case "Ajouter":  
                this.window.getContentPane().removeAll();
                this.window.add(new AddView(this.window));
                this.window.revalidate();
                break;
            case "Supprimer": 
                this.window.getContentPane().removeAll();
                this.window.add(new DeleteView(this.window));
                this.window.revalidate();
                break;
            default: 
                break;
        }
    }

}