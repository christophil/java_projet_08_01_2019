package Default;

import Database.Programmeur;
import Database.Transactions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonsListener implements ActionListener{

    private DefaultView view;
    private String viewType;
    private Transactions transactions;
                
    public ButtonsListener(DefaultView v, String vt){
        
        this.view = v;
        this.viewType = vt;
        this.transactions = new Transactions();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(this.viewType == "Ajouter"){
            
            if(e.getSource() == this.view.getValiderButton()){
            
                boolean res;
                
                res = transactions.addProgrammeur(this.view.getProgrammeurInformations());
                
                if(res == false){
                    
                    this.view.cleanTextField();
                    ShowMessage.showInformation("Succès", "Ajout réussi !");
                    
                }
                else{
                    
                    ShowMessage.showError("Erreur", "L'ajout à échouer.");
                }
            }
        }
        
        if(this.viewType == "Supprimer"){
            
            if(e.getSource() == this.view.getValiderButton()){
                
                int m;
                
                try {
                    m = Integer.parseInt(this.view.getProgrammeurInformations().getMatricule());
                    
                    transactions.deleteProgrammeur(this.view.getProgrammeurInformations().getMatricule());
                    
                    ShowMessage.showInformation("Succès", "Suppression réussie.");
                    
                } catch (NumberFormatException ex) {
                    m = -1;
                    ShowMessage.showError("Matricule invalide", "Veuillez rentrer un matricule valide.");
                }
            }
        }
        
        if(this.viewType == "Modifier"){
            
            if(e.getSource() == this.view.getRechercherButton()){
            
                Programmeur p;
                
                p = transactions.getProgrammeur(this.view.getProgrammeurInformations().getMatricule());
                
                if(p.getMatricule().length() > 1){
                    
                    this.view.enableTextField();
                    this.view.reinitialiserButton.setEnabled(true);
                    this.view.validerButton.setEnabled(true);
                    this.view.setTextField(p);
                    
                }
                else{
                    
                    this.view.disableTextField();
                    ShowMessage.showError("Erreur", "Programmeur introuvable.");
                }
            }
            
            if(e.getSource() == this.view.getValiderButton()){
            
                int res;
                
                res = transactions.updateProgrammeur(this.view.getProgrammeurInformations());
                
                if(res > 0){
                    
                    ShowMessage.showInformation("Succès", "Modification réussie !");
                }
                else{
                    
                    ShowMessage.showError("Erreur", "La modification a échouée.");
                }
                
            }
        }
        
        
        if(e.getSource() == this.view.getReinitialiserButton()){
            
            this.view.cleanTextField();
        }
        
        if(e.getSource() == this.view.getAnnulerButton()){
            
            this.view.window.getContentPane().removeAll();
            this.view.window.add(new WelcomeView());
            this.view.window.revalidate();
        }
    }
    
}
