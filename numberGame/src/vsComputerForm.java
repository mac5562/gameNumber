import com.game.GameItself;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class vsComputerForm extends JFrame{
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

    public vsComputerForm() {
        add(MainPanel);
        setSize(550,600);
        setTitle("Játékos vs Számítógép");
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
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A játékos vesztett");
                        a0NálNagyobbSzámButton.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton.setEnabled(false);
                    }
                    else {
                    kéremVálasszonEgyOpciótTextArea.append("gép következik");
                    machine();
                    }
                }
                else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a gép következik");
                    machine();
                }
            }
        });


        a0ValKezdődőSzámjegysorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText=textField2.getText();
                int choice=Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue,choice)==true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a játékos lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A játékos vesztett");
                        a0NálNagyobbSzámButton.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton.setEnabled(false);
                    }
                    else {
                        kéremVálasszonEgyOpciótTextArea.append("gép következik");
                        machine();
                    }
                }
                else {
                    kéremVálasszonEgyOpciótTextArea.append("\n érvénytelen pozíció a gép következik");
                    machine();
                }
            }
        });
    }

        public void machine(){
        int machineMoveChoice=GameItself.aiMoveChoice(currentValue);
        switch (machineMoveChoice){
            case 0:
                int positionChoice=GameItself.aiPositionChoice(currentValue,machineMoveChoice);
                kéremVálasszonEgyOpciótTextArea.append("\nAz Ai kiválasztja törölni kivánt karakterlánc kezdő 0-jának pozícióját");
                if(GameItself.chekerTwo(currentValue,positionChoice)==true){
                    currentValue = GameItself.removeing(currentValue,positionChoice);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a gép lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A gép vesztett");
                        a0NálNagyobbSzámButton.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton.setEnabled(false);
                    }
                    else {
                        kéremVálasszonEgyOpciótTextArea.append("A játékos következik");
                    }
                }
                break;

            case 1:
                int positionChoice2=GameItself.aiPositionChoice(currentValue,machineMoveChoice);
                kéremVálasszonEgyOpciótTextArea.append("Ai csökkenti az általa gondolt számot 1-el");
                if(GameItself.checkerOne(currentValue,positionChoice2)==true){
                    currentValue = GameItself.decrease(currentValue,positionChoice2);
                    currentNumber.setText(currentValue);
                    kéremVálasszonEgyOpciótTextArea.append("\n a gép lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        kéremVálasszonEgyOpciótTextArea.append("\n Játék vége !!! A gép vesztett");
                        a0NálNagyobbSzámButton.setEnabled(false);
                        a0ValKezdődőSzámjegysorButton.setEnabled(false);
                    }
                    else {
                        kéremVálasszonEgyOpciótTextArea.append("A játékos következik");
                    }
                }
                break;
        }

        }
    }

