package Default;

import Database.DatabaseConnection;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame implements WindowListener{
    
    private JMenuBar menuBar;
    private JMenu progMenu;
    private JMenu actionMenu;
    private JMenuItem openMenuItem;
    private JMenu showMenuItem;
    private JMenuItem allMenuItem;
    private JMenuItem modifMenuItem;
    private JMenuItem deleteMenuItem;
    private JMenuItem addMenuItem;
  
    public Window(){
        
        super("GesProg");
        this.setWindow();
        
    }
    
    /**
     * Cette méthode configure la fenetre
     *
     */
    private void setWindow(){
        
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(800, 400));
        this.setResizable(false);
        
        this.add(new WelcomeView());
        this.setMenu();
        this.setVisible(true);
        
    }
    
    /**
     * Cette méthode configure le menu
     *
     */
    private void setMenu(){
        
        
        menuBar = new JMenuBar();


        // build the Action menu
        actionMenu = new JMenu("Action");
        openMenuItem = new JMenuItem("Quitter");
        openMenuItem.addActionListener(new MenuListener(this, "Quitter"));
        actionMenu.add(openMenuItem);

        // build the Prog menu
        progMenu = new JMenu("Programmeur");
        showMenuItem = new JMenu("Afficher");

        allMenuItem = new JMenuItem("Tous");
        allMenuItem.addActionListener(new MenuListener(this, "Tous"));

        modifMenuItem = new JMenuItem("Modifier");
        modifMenuItem.addActionListener(new MenuListener(this, "Modifier"));

        deleteMenuItem = new JMenuItem("Supprimmer");
        deleteMenuItem.addActionListener(new MenuListener(this, "Supprimer"));

        addMenuItem = new JMenuItem("Ajouter");
        addMenuItem.addActionListener(new MenuListener(this, "Ajouter"));

        showMenuItem.add(allMenuItem);
        progMenu.add(showMenuItem);
        progMenu.add(modifMenuItem);
        progMenu.add(deleteMenuItem);
        progMenu.add(addMenuItem);

        // add menus to menubar
        menuBar.add(progMenu);
        menuBar.add(actionMenu);

        // put the menubar on the frame
        this.setJMenuBar(menuBar);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        DatabaseConnection.closeConnection();
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
