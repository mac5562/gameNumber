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
                JOptionPane.showMessageDialog(null, "Adott egy tetszőleges hosszú, 0, 1, . . . , 9 számjegyekből álló szám (vezetőnullák lehetnek az elején). A játékosok felváltva következnek lépni.Egylépésben az alábbi két lépés közül választhatnak: \n 1: egy 0-nál nagyobb számjegy értékét eggyel csökkentik, \n 0: letörölnek a szám végéről egy 0-val kezdődő, legalább 1 hosszú számjegysorozatot \n Az a játékos veszít aki utoljára tud lépni");
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
