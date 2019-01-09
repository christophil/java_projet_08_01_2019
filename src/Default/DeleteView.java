package Default;

public class DeleteView extends DefaultView {
        public DeleteView(Window w){
            
        super(w);
        
        this.disableTextField();
        this.rechercherButton.setEnabled(false);
        this.reinitialiserButton.setEnabled(false);

        this.validerButton.addActionListener(new ButtonsListener(this, "Supprimer"));
        this.annulerButton.addActionListener(new ButtonsListener(this, "Supprimer"));
    }
}
