import com.game.GameItself;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PvPForm extends JFrame{
    private JPanel MainPanel;
    private JTextArea kéremVálasszonEgyOpciótTextArea;
    private JButton ExitButton;
    private JButton visszaButton;
    private JButton a0ValKezdődőSzámjegysorButton1;
    private JButton a0NálNagyobbSzámButton1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel currentNumber;
    private JButton a0NálNagyobbSzámButton2;
    private JButton a0ValKezdődőSzámjegysorButton2;
    private JTextField textField3;
    private JTextField textField4;
    private String currentValue=GameItself.numberGenerator();

    public PvPForm() {
        add(MainPanel);
        setSize(800, 600);
        setTitle("Játékos vs Játékos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        currentNumber.setText(currentValue);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        a0NálNagyobbSzámButton2.setEnabled(false);
        a0ValKezdődőSzámjegysorButton2.setEnabled(false);

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
        a0NálNagyobbSzámButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField1.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue, choice) == true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos1 lépett, ");
                    textField1.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A játékos1 vesztett");
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                    } else {
                        kéremVálasszonEgyOpciótTextArea.append("Játékos 2 következik");
                        a0NálNagyobbSzámButton2.setEnabled(true);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(true);
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                    }
                } else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a játékos2 következik");
                    a0NálNagyobbSzámButton2.setEnabled(true);
                    a0ValKezdődőSzámjegysorButton2.setEnabled(true);
                    a0NálNagyobbSzámButton1.setEnabled(false);
                    a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                }
            }
        });

        a0ValKezdődőSzámjegysorButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField2.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue, choice) == true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos1 lépett, ");
                    textField2.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A Játékos1 vesztett");
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                    } else {
                        kéremVálasszonEgyOpciótTextArea.append("Játékos2 következik");
                        a0NálNagyobbSzámButton2.setEnabled(true);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(true);
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                    }
                } else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a Játékos2 következik");
                    a0NálNagyobbSzámButton2.setEnabled(true);
                    a0ValKezdődőSzámjegysorButton2.setEnabled(true);
                    a0NálNagyobbSzámButton1.setEnabled(false);
                    a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                }
            }
        });
        a0NálNagyobbSzámButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField3.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue, choice) == true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos2 lépett, ");
                    textField3.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A játékos2 vesztett");
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                    } else {
                        kéremVálasszonEgyOpciótTextArea.append("Játékos 1 következik");
                        a0NálNagyobbSzámButton1.setEnabled(true);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(true);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);

                    }
                }
                else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a játékos1 következik");
                }
            }

        });


        a0ValKezdődőSzámjegysorButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField4.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue, choice) == true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos2 lépett, ");
                    textField4.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A Játékos2 vesztett");
                        a0NálNagyobbSzámButton1.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(false);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                    } else {
                        kéremVálasszonEgyOpciótTextArea.append("Játékos1 következik");
                        a0NálNagyobbSzámButton1.setEnabled(true);
                        a0ValKezdődőSzámjegysorButton1.setEnabled(true);
                        a0NálNagyobbSzámButton2.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                    }
                } else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a Játékos1 következik");
                    a0NálNagyobbSzámButton1.setEnabled(true);
                    a0ValKezdődőSzámjegysorButton1.setEnabled(true);
                    a0NálNagyobbSzámButton2.setEnabled(false);
                    a0ValKezdődőSzámjegysorButton2.setEnabled(false);
                }
            }
        });
    }

    void drawLines(Graphics g) {
        Color c = new Color(60, 63, 65);
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(3f);
        g2d.setStroke(stroke);
        g2d.setColor(c);

        g2d.drawLine(400, 265, 400, 225);
        g2d.drawLine(400, 305, 400, 395);
        g2d.drawLine(400, 430, 400, 510);
        g2d.drawLine(20, 265, 780, 265);
        g2d.drawLine(20, 510, 780, 510);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
