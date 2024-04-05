package MVC;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UtilisateurInterface extends JFrame {
    private JTextField Titre;
    private JTextField Description;
  //Valeur de la comboBox
    String[] prio= {"HAUTE","MOYENNE","BASSE","AUCUNE"};
    //Pour des raisons de simplifcation, la date sera un string
    private JTextField dateEcheance;
    private JComboBox Priorite=new JComboBox(prio);
    private JButton button;
    private JLabel label;
    
    
    public UtilisateurInterface() {
        setTitle("Gestionnaire des tâches");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Titre = new JTextField(20);
        Description = new JTextField(20);
        dateEcheance= new JTextField(20);
        Priorite=new JComboBox();
        button = new JButton("Enregistrer");
        label = new JLabel("Information Tache: Titre,Description,DateEcheance,priorite");
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(Titre);
        
        
        panel.add(Description);
        panel.add(dateEcheance);
        panel.add(Priorite);
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    public String getTitre() {
        return Titre.getText();
    }
    public String getDescription() {
        return Titre.getText();
    }
    public String getDate() {
    	return dateEcheance.getText();
    }
    public String getPriorite() {
    	return Priorite.getSelectedItem().toString();
    }
    
    
    public void setLabelText(String text) {
        label.setText("Data: " + text);
    }

    public void addButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}