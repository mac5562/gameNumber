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
        setSize(500,500);
        setTitle("Start menü");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        startButton1.setFocusPainted(false);


        startButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Adott egy tetszőleges hosszú, 0, 1, . . . , 9 számjegyekből álló szám (vezetőnullák lehetnek az elején). \nVagy Számítógép ellen, vagy játékos más játékos ellen felváltva képesek lépni. \nEgylépésben az alábbi két lépés közül választhatnak: \n\n Első opció: egy 0-nál nagyobb számjegy értékét eggyel csökkentik. \n Második opció: letörölnek a szám végéről egy 0-val kezdődő, legalább 1 hosszú számjegysorozatot. \n\n Az a játékos veszít aki utoljára tud lépni.", "Szabályok", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new vsComputerForm().setVisible(true);
            }
        });
        startButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new PvPForm().setVisible(true);
            }
        });
    }
}
