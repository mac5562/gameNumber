import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenuForm extends JFrame{
    private JPanel panelMain;
    private JLabel startMenuLabel;
    private JButton ExitButton;
    private JButton startButton2;
    private JButton startButton3;
    private JButton startButton1;

    public StartMenuForm() {
        add(panelMain);
        setSize(400,400);
        setTitle("Szám Játék");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        startButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Próba szöveg.");
            }
        });
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
