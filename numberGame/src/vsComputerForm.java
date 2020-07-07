import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vsComputerForm extends JFrame{
    private JPanel MainPanel;
    private JTextArea kéremVálasszonEgyOpciótTextArea;
    private JButton ExitButton;
    private JButton visszaButton;
    private JButton a0ValKezdődőSzámjegysorButton;
    private JButton a0NálNagyobbSzámButton;
    private JTextField textField1;
    private JTextField textField2;

    public vsComputerForm() {
        add(MainPanel);
        setSize(550,550);
        setTitle("Játékos vs Számítógép");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
    }
}
