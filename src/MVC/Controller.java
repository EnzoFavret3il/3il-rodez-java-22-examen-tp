package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tache.Task;


public class Controller {
    private Task tache;
    private UtilisateurInterface view;

    public Controller(Task tache, UtilisateurInterface view) {
        this.tache = tache;
        this.view = view;

        // Liaison entre la vue et le contrôleur
        this.view.addButtonListener(new ButtonListener());
    }

    // ActionListener pour le bouton
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}


