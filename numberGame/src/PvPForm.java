import com.game.GameItself;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PvPForm extends JFrame{
    private JPanel MainPanel;
    private JTextArea msg_area;
    private JButton ExitButton;
    private JButton visszaButton;
    private JButton j1Opcio2;
    private JButton j1Opcio1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel currentNumber;
    private JButton j2Opcio1;
    private JButton j2Opcio2;
    private JTextField textField3;
    private JTextField textField4;
    private JScrollPane scrollPane;
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
        textField3.setHorizontalAlignment(JTextField.CENTER);
        textField4.setHorizontalAlignment(JTextField.CENTER);
        j2Opcio1.setEnabled(false);
        j2Opcio2.setEnabled(false);

        scrollPane.setBorder(new LineBorder(Color.BLACK));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getViewport().add(msg_area);

        msg_area.setMargin( new Insets(10,10,10,10) );

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
        j1Opcio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField1.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue, choice) == true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nAz 1.Játékos lépett, ");
                    textField1.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! Az 2.Játékos nyert! \nSzeretnének újra játszani?\n\n",
                                "Játék vége", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new PvPForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }

                    } else {
                        msg_area.append("A 2.Játékos következik.\n");
                        j2Opcio1.setEnabled(true);
                        j2Opcio2.setEnabled(true);
                        j1Opcio1.setEnabled(false);
                        j1Opcio2.setEnabled(false);
                    }
                } else {
                    msg_area.append("\nÉrvénytelen pozíció, a 2.Játékos következik.\n");
                    j2Opcio1.setEnabled(true);
                    j2Opcio2.setEnabled(true);
                    j1Opcio1.setEnabled(false);
                    j1Opcio2.setEnabled(false);
                }
            }
        });

        j1Opcio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField2.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue, choice) == true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nAz 1.Játékos lépett, ");
                    textField2.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! Az 2.Játékos nyert! \nSzeretnének újra játszani?\n\n",
                                "Játék vége", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new PvPForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }

                    } else {
                        msg_area.append("A 2.Játékos következik.\n");
                        j2Opcio1.setEnabled(true);
                        j2Opcio2.setEnabled(true);
                        j1Opcio1.setEnabled(false);
                        j1Opcio2.setEnabled(false);
                    }
                } else {
                    msg_area.append("\nÉrvénytelen pozíció, a 2.Játékos következik.\n");
                    j2Opcio1.setEnabled(true);
                    j2Opcio2.setEnabled(true);
                    j1Opcio1.setEnabled(false);
                    j1Opcio2.setEnabled(false);
                }
            }
        });
        j2Opcio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField3.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue, choice) == true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA 2.Játékos lépett, ");
                    textField3.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! Az 1.Játékos nyert! \nSzeretnének újra játszani?\n\n",
                                "Játék vége", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new PvPForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }

                    } else {
                        msg_area.append("Az 1.Játékos következik.\n");
                        j1Opcio1.setEnabled(true);
                        j1Opcio2.setEnabled(true);
                        j2Opcio1.setEnabled(false);
                        j2Opcio2.setEnabled(false);

                    }
                }
                else {
                    msg_area.append("\nÉrvénytelen pozíció, az 1.Játékos következik.\n");
                    j1Opcio1.setEnabled(true);
                    j1Opcio2.setEnabled(true);
                    j2Opcio1.setEnabled(false);
                    j2Opcio2.setEnabled(false);
                }
            }

        });


        j2Opcio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField4.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue, choice) == true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA 2.Játékos lépett, ");
                    textField4.setText("");
                    if (!currentValue.contains("0") && !currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! Az 1.Játékos nyert! \nSzeretnének újra játszani?\n\n",
                                "Játék vége", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new PvPForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }

                    } else {
                        msg_area.append("Az 1.Játékos következik.\n");
                        j1Opcio1.setEnabled(true);
                        j1Opcio2.setEnabled(true);
                        j2Opcio1.setEnabled(false);
                        j2Opcio2.setEnabled(false);
                    }
                } else {
                    msg_area.append("\nÉrvénytelen pozíció, az 1.Játékos következik.\n");
                    j1Opcio1.setEnabled(true);
                    j1Opcio2.setEnabled(true);
                    j2Opcio1.setEnabled(false);
                    j2Opcio2.setEnabled(false);
                }
            }
        });
    }
}
