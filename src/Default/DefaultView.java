package Default;
import Database.Programmeur;
import java.awt.*;
import javax.swing.*;

public class DefaultView extends JPanel {
    
    protected Window window;
    
    // Matricule Panel
    protected JLabel matricule;
    protected JPanel matriculePanel;
    protected JTextField matriculeTextField;
    
    // Boutons Panel
    protected JPanel buttonsPanel;
    protected JButton rechercherButton;
    protected JButton reinitialiserButton;
    protected JButton validerButton;
    protected JButton annulerButton;
    
    //Inputs Panel
    protected JPanel inputsPanel;
    
    protected JLabel nom;
    protected JLabel prenom;
    protected JLabel adresse;
    protected JLabel pseudo;
    protected JLabel responsable;
    protected JLabel dateNaissance;
    protected JLabel hobby;
    protected JLabel dateEmbauche;
    
    protected JTextField nomTextField;
    protected JTextField prenomTextField;
    protected JTextField adresseTextField;
    protected JTextField pseudoTextField;
    protected JTextField responsableTextField;
    protected JTextField hobbyTextField;
    
    protected JTextField dateEmbaucheAnneeTextField;
    protected JComboBox dateEmbaucheMoisComboBox;
    protected JTextField dateEmbaucheJourTextField;
    
    protected JTextField dateNaissanceAnneeTextField;
    protected JComboBox dateNaissanceMoisComboBox;
    protected JTextField dateNaissanceJourTextField;
    
    
    
    public DefaultView(Window w){
        
        this.window = w;
        
        this.setLayout(new BorderLayout());
        
        /****** MATRICULE PANEL ****/
        
        this.matriculePanel = new JPanel();
        this.matriculePanel.setBackground(Color.BLACK);
        this.matriculePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        
        this.matricule = new JLabel("Matricule");
        this.matricule.setForeground(Color.WHITE);
        
        this.matriculeTextField = new JTextField();
        this.matriculeTextField.setPreferredSize( new Dimension(150, 24));

        this.matriculePanel.add(this.matricule);
        this.matriculePanel.add(this.matriculeTextField);

        /****** END MATRICULE PANEL ******/
        
        /****** INPUTS PANEL ****/
        
        String[] month = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        
        this.inputsPanel = new JPanel();
        
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        
        inputsPanel.setLayout(gridBag);
        
        this.nom = new JLabel("Nom");
        this.inputsPanel.add(this.nom);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0,10 ,10,0);
        gridBag.setConstraints(this.nom, gbc);
        
        this.nomTextField = new JTextField();
        this.nomTextField.setPreferredSize( new Dimension(150, 24));
        this.inputsPanel.add(this.nomTextField);
        gbc.gridx = 1;
        gbc.gridy =  0;
        gridBag.setConstraints(this.nomTextField, gbc);
        
        this.prenom = new JLabel("Prénom");
        this.inputsPanel.add(this.prenom);
        gbc.gridx = 2;
        gbc.gridy =  0;
        gridBag.setConstraints(this.prenom, gbc);
        
        this.prenomTextField = new JTextField();
        this.inputsPanel.add(this.prenomTextField);
        this.prenomTextField.setPreferredSize( new Dimension(150, 24));
        gbc.gridx = 3;
        gbc.gridy =  0;
        gridBag.setConstraints(this.prenomTextField, gbc);
        
        this.adresse = new JLabel("Adresse");
        this.inputsPanel.add(this.adresse);
        gbc.gridx = 0;
        gbc.gridy =  1;
        gridBag.setConstraints(this.adresse, gbc);
        
        this.adresseTextField = new JTextField();
        this.inputsPanel.add(this.adresseTextField);
        this.adresseTextField.setPreferredSize( new Dimension(150, 24));
        gbc.gridx = 1;
        gbc.gridy =  1;
        gridBag.setConstraints(this.adresseTextField, gbc);
               
        this.pseudo = new JLabel("Pseudo");
        this.inputsPanel.add(this.pseudo);
        gbc.gridx = 2;
        gbc.gridy =  1;
        gridBag.setConstraints(this.pseudo, gbc);
        
        this.pseudoTextField = new JTextField();
        this.inputsPanel.add(this.pseudoTextField);
        this.pseudoTextField.setPreferredSize( new Dimension(150, 24));
        gbc.gridx = 3;
        gbc.gridy =  1;
        gridBag.setConstraints(this.pseudoTextField, gbc);
  
        this.responsable = new JLabel("Responsable");
        this.inputsPanel.add(this.responsable);
        gbc.gridx = 0;
        gbc.gridy =  2;
        gridBag.setConstraints(this.responsable, gbc);
        
        this.responsableTextField = new JTextField();
        this.inputsPanel.add(this.responsableTextField);
        this.responsableTextField.setPreferredSize( new Dimension(150, 24));
        gbc.gridx = 1;
        gbc.gridy =  2;
        gridBag.setConstraints(this.responsableTextField, gbc);            
       
        this.dateNaissance = new JLabel("Date de Naissance");
        this.inputsPanel.add(this.dateNaissance);
        gbc.gridx = 2;
        gbc.gridy =  2;
        gridBag.setConstraints(this.dateNaissance, gbc);
        
        this.dateNaissanceJourTextField = new JTextField();
        this.inputsPanel.add(this.dateNaissanceJourTextField);
        this.dateNaissanceJourTextField.setPreferredSize( new Dimension(75, 24));
        gbc.gridx = 3;
        gbc.gridy =  2;
        gridBag.setConstraints(this.dateNaissanceJourTextField, gbc);
        
        this.dateNaissanceAnneeTextField = new JTextField();
        this.inputsPanel.add(this.dateNaissanceAnneeTextField);
        this.dateNaissanceAnneeTextField.setPreferredSize( new Dimension(75, 24));
        gbc.gridx = 5;
        gbc.gridy =  2;
        gridBag.setConstraints(this.dateNaissanceAnneeTextField, gbc);
        
        this.dateNaissanceMoisComboBox = new JComboBox(month);
        this.inputsPanel.add(this.dateNaissanceMoisComboBox);
        gbc.gridx = 4;
        gbc.gridy =  2;
        gridBag.setConstraints(this.dateNaissanceMoisComboBox, gbc);
        
        this.dateNaissanceMoisComboBox.setSelectedIndex(0);

        this.hobby = new JLabel("Hobby");
        this.inputsPanel.add(this.hobby);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridBag.setConstraints(this.hobby, gbc);
        
        this.hobbyTextField = new JTextField();
        this.inputsPanel.add(this.hobbyTextField);
        this.hobbyTextField.setPreferredSize( new Dimension( 150, 24));
        gbc.gridx = 1;
        gbc.gridy =  3;
        gridBag.setConstraints(this.hobbyTextField, gbc);
             
        this.dateEmbauche = new JLabel("Date d'embauche"); 
        this.inputsPanel.add(this.dateEmbauche);
        gbc.gridx = 2;
        gbc.gridy =  3;
        gridBag.setConstraints(this.dateEmbauche, gbc);
        
        this.dateEmbaucheJourTextField = new JTextField();
        this.inputsPanel.add(this.dateEmbaucheJourTextField);
        this.dateEmbaucheJourTextField.setPreferredSize( new Dimension(75, 24));
        gbc.gridx = 3;
        gbc.gridy =  3;
        gridBag.setConstraints(this.dateEmbaucheJourTextField, gbc);
        
        this.dateEmbaucheMoisComboBox = new JComboBox(month);
        this.inputsPanel.add(this.dateEmbaucheMoisComboBox);
        gbc.gridx = 4;
        gbc.gridy =  3;
        gridBag.setConstraints(this.dateEmbaucheMoisComboBox, gbc);
        
        this.dateEmbaucheMoisComboBox.setSelectedIndex(0);
       
        this.dateEmbaucheAnneeTextField = new JTextField();
        this.inputsPanel.add(this.dateEmbaucheAnneeTextField);
        this.dateEmbaucheAnneeTextField.setPreferredSize( new Dimension(75, 24));
        gbc.gridx = 5;
        gbc.gridy =  3;
        gridBag.setConstraints(this.dateEmbaucheAnneeTextField, gbc);

        /****** END INPUTS PANEL ******/
        
        /****** BUTTONS PANEL ******/
        this.buttonsPanel = new JPanel();
        
        this.rechercherButton = new JButton("Rechercher");
        this.reinitialiserButton = new JButton("Réinitialiser");
        this.validerButton = new JButton("Valider");
        this.annulerButton = new JButton("Annuler");
        
        this.buttonsPanel.add(this.rechercherButton);
        this.buttonsPanel.add(this.reinitialiserButton);
        this.buttonsPanel.add(this.validerButton);
        this.buttonsPanel.add(this.annulerButton);
        /****** END BUTTONS PANEL ******/
        
        this.add(this.buttonsPanel, BorderLayout.SOUTH);
        this.add(this.matriculePanel, BorderLayout.NORTH);
        this.add(this.inputsPanel, BorderLayout.CENTER);
     
    }
    
    public Window getWindow(){
        
        return this.window;
    }
    
    public JTextField getMatriculeTextField(){
        return this.matriculeTextField;
    }
    
    public Programmeur getProgrammeurInformations(){
        
        Programmeur p = new Programmeur();
        
        p.setNom(this.nomTextField.getText());
        p.setMatricule(this.matriculeTextField.getText());
        p.setPrenom(this.prenomTextField.getText());
        p.setAdresse(this.adresseTextField.getText());
        p.setPseudo(this.pseudoTextField.getText());
        p.setResponsable(this.responsableTextField.getText());
        p.setHobby(this.hobbyTextField.getText());
        p.setDateEmb( this.dateEmbaucheJourTextField.getText() 
                + "-" + this.dateEmbaucheMoisComboBox.getSelectedItem().toString()
                + "-" + this.dateEmbaucheAnneeTextField.getText());
        p.setDateNaiss( this.dateNaissanceJourTextField.getText()
                + "-" + this.dateNaissanceMoisComboBox.getSelectedItem().toString()
                + "-" + this.dateNaissanceAnneeTextField.getText());
        
        return p;
        
    }
    
    /**
     * Cette méthode vide les champs du panel
     *
     * @return connexion Une variable de type Connection
     */
    
    public void cleanTextField(){
        
        this.nomTextField.setText("");
        this.prenomTextField.setText("");
        this.pseudoTextField.setText("");
        this.adresseTextField.setText("");
        this.hobbyTextField.setText("");
        this.responsableTextField.setText("");
        this.matriculeTextField.setText("");
        this.dateEmbaucheAnneeTextField.setText("");
        this.dateEmbaucheJourTextField.setText("");
        this.dateNaissanceAnneeTextField.setText("");
        this.dateNaissanceJourTextField.setText("");
        this.dateNaissanceMoisComboBox.setSelectedIndex(0);
        this.dateEmbaucheMoisComboBox.setSelectedIndex(0);
    }
    
    
    /**
     * Cette méthode remplie les champs du panel
     *
     * @param p Les informations du programmeur
     */
    public void setTextField(Programmeur p){
        
        this.nomTextField.setText(p.getNom());
        this.prenomTextField.setText(p.getPrenom());
        this.pseudoTextField.setText(p.getPrenom());
        this.adresseTextField.setText(p.getAdresse());
        this.hobbyTextField.setText(p.getHobby());
        this.responsableTextField.setText(p.getResponsable());
        this.matriculeTextField.setText(p.getMatricule());
        
        // On coupe les dates en 3 parties
        String[] dateEmbaucheParts = p.getDateEmb().split("-");
        String[] dateNaissanceParts = p.getDateNaiss().split("-");
        String[] mounths = {"01", "02", "03", "04", "05", "06", "07", "08",
            "09", "10", "11", "12"};
        
        int i, dateEmbaucheMoisIndex = 0, dateNaissanceMoisIndex = 0;
        
        this.dateEmbaucheAnneeTextField.setText(dateEmbaucheParts[2]);
        this.dateEmbaucheJourTextField.setText(dateEmbaucheParts[0]);
        
        this.dateNaissanceAnneeTextField.setText(dateNaissanceParts[2]);
        this.dateNaissanceJourTextField.setText(dateNaissanceParts[0]);
        
        // On associe les mois à un index pour les comboBox
        for(i=0; i<mounths.length; i++){
            
            if(dateEmbaucheParts[1].equals(mounths[i])){
                dateEmbaucheMoisIndex = i;
            }
            
            if(dateNaissanceParts[1].equals(mounths[i])){
                dateNaissanceMoisIndex = i;
            }
        }
        
        
        this.dateNaissanceMoisComboBox.setSelectedIndex(dateNaissanceMoisIndex);
        this.dateEmbaucheMoisComboBox.setSelectedIndex(dateEmbaucheMoisIndex);
        
    }
    
    public JButton getReinitialiserButton(){
        
        return this.reinitialiserButton;
    }
    
    public JButton getValiderButton(){
        
        return this.validerButton;
    }
    
    public JButton getRechercherButton(){
        
        return this.rechercherButton;
    }
    
    public JButton getAnnulerButton(){
        
        return this.annulerButton;
    }
    
    /**
     * Cette méthode désactive tous les champs du panel
     *
     */
    public void disableTextField(){
        
        this.nomTextField.setEnabled(false);
        this.prenomTextField.setEnabled(false);
        this.adresseTextField.setEnabled(false);
        this.dateEmbaucheAnneeTextField.setEnabled(false);
        this.pseudoTextField.setEnabled(false);
        this.responsableTextField.setEnabled(false);
        this.dateEmbaucheJourTextField.setEnabled(false);
        this.dateNaissanceAnneeTextField.setEnabled(false);
        this.hobbyTextField.setEnabled(false);
        this.dateNaissanceJourTextField.setEnabled(false);
        this.dateEmbaucheMoisComboBox.setEnabled(false);
        this.dateNaissanceMoisComboBox.setEnabled(false);
    }
    
    /**
     * Cette méthode active tous les champs du panel
     *
     */
    public void enableTextField(){
        
        this.nomTextField.setEnabled(true);
        this.prenomTextField.setEnabled(true);
        this.adresseTextField.setEnabled(true);
        this.dateEmbaucheAnneeTextField.setEnabled(true);
        this.pseudoTextField.setEnabled(true);
        this.responsableTextField.setEnabled(true);
        this.dateEmbaucheJourTextField.setEnabled(true);
        this.dateNaissanceAnneeTextField.setEnabled(true);
        this.hobbyTextField.setEnabled(true);
        this.dateNaissanceJourTextField.setEnabled(true);
        this.dateEmbaucheMoisComboBox.setEnabled(true);
        this.dateNaissanceMoisComboBox.setEnabled(true);
    }
}
