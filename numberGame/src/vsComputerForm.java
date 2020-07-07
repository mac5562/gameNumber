import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vsComputerForm extends JFrame{
    private JPanel MainPanel;
    private JButton a0NálNagyobbSzámButton;
    private JButton a0ValKezdődőSzámjegysorButton;
    private JTextArea kéremVálasszonEgyOpciótTextArea;
    private JButton ExitButton;
    private JButton visszaButton;

    public vsComputerForm() {
        add(MainPanel);
        setSize(450,550);
        setTitle("Játékos vs Számítógép");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
