package MVC;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Vue extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public Vue() {
        setTitle("Exemple MVC avec Java Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        button = new JButton("Set");
        label = new JLabel("Data:");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        add(panel);

        setVisible(true);
    }

    public String getUserInput() {
        return textField.getText();
    }

    public void setLabelText(String text) {
        label.setText("Data: " + text);
    }

    public void addButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}