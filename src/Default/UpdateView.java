package Default;

public class UpdateView extends DefaultView{
    
        public UpdateView(Window w){
        super(w);
        
        this.disableTextField();
        this.reinitialiserButton.setEnabled(false);
        this.validerButton.setEnabled(false);
        
        this.rechercherButton.addActionListener(new ButtonsListener(this, "Modifier"));
        this.reinitialiserButton.addActionListener(new ButtonsListener(this, "Modifier"));
        this.validerButton.addActionListener(new ButtonsListener(this, "Modifier"));
        this.annulerButton.addActionListener(new ButtonsListener(this, "Modifier"));
    }
}
