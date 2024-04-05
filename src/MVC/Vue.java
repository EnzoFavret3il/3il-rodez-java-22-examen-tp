package MVC;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Vue extends JFrame {
    private JTextField Titre;
    private JTextField Description;
    //Pour des raisons de simplifcation, la date sera un string
    private JTextField dateEcheance;
    private JButton button;
    private JLabel label;

    public Vue() {
        setTitle("Gestionnaire des tâches");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Titre = new JTextField(20);
        Description = new JTextField(20);
        button = new JButton("Set");
        label = new JLabel("Data:");

        JPanel panel = new JPanel();
        panel.add(Titre);
        panel.add(button);
        panel.add(label);
        panel.add(Description);

        add(panel);

        setVisible(true);
    }

    public String getTitre() {
        return Titre.getText();
    }
    public String getDescription() {
        return Titre.getText();
    }
    
    public void setLabelText(String text) {
        label.setText("Data: " + text);
    }

    public void addButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}