import com.game.GameItself;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PvPForm extends JFrame{
    private JPanel MainPanel;
    private JTextArea kéremVálasszonEgyOpciótTextArea;
    private JButton ExitButton;
    private JButton visszaButton;
    private JButton a0ValKezdődőSzámjegysorButton;
    private JButton a0NálNagyobbSzámButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel currentNumber;
    private String currentValue= GameItself.numberGenerator();

    public PvPForm() {
        add(MainPanel);
        setSize(800,600);
        setTitle("Játékos vs Játékos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        currentNumber.setText(currentValue);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField2.setHorizontalAlignment(JTextField.CENTER);

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        visszaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new StartMenuForm().setVisible(true);
            }
        });
        a0NálNagyobbSzámButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField1.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue,choice)==true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                }
                else {
                    
                }
            }
        });
    }
}
