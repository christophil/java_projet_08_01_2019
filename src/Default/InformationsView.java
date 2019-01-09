package Default;
import Database.Transactions;
import Database.Programmeur;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;



public class InformationsView extends JPanel {
        
    protected JTextArea informationsList;
    private Transactions transactions;
    
    public InformationsView(){
        
        this.transactions = new Transactions();

        this.informationsList = new JTextArea();
        this.informationsList.setEditable(false);
        
        JScrollPane scroll = new JScrollPane(this.informationsList);
        
        ArrayList<Programmeur> listeProgrammeurs = transactions.getProgrammeurs();
        
        String listeProg = "";

        for (Programmeur progr : listeProgrammeurs) {
            listeProg = listeProg + progr + "\n";
        }

        this.informationsList.setText(listeProg);
        this.informationsList.setPreferredSize(new Dimension(750, 300));
        
        this.add(this.informationsList);
    }

}
