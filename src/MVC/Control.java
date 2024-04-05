package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Control {
    private Model model;
    private Vue view;

    public Control(Model model, Vue view) {
        this.model = model;
        this.view = view;

        // Liaison entre la vue et le contrôleur
        this.view.addButtonListener(new ButtonListener());
    }

    // ActionListener pour le bouton
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Récupérer la saisie utilisateur depuis la vue
            String userInput = view.getUserInput();
            // Mettre à jour le modèle avec la saisie utilisateur
            model.setData(userInput);
            // Mettre à jour l'affichage dans la vue
            view.setLabelText(model.getData());
        }
    }
}


