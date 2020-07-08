import com.game.GameItself;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vsComputerForm extends JFrame{
    private JPanel MainPanel;
    private JTextArea msg_area;
    private JButton ExitButton;
    private JButton visszaButton;
    private JButton opcio2;
    private JButton opcio1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel currentNumber;
    private JScrollPane scrollPane;
    private JPanel opcio1Panel;
    private String currentValue= GameItself.numberGenerator();

    public vsComputerForm() {
        add(MainPanel);
        setSize(650,600);
        setTitle("Játékos vs Számítógép");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        currentNumber.setText(currentValue);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField2.setHorizontalAlignment(JTextField.CENTER);

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
        opcio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText = textField1.getText();
                int choice = Integer.parseInt(getText);
                if (GameItself.checkerOne(currentValue,choice)==true) {
                    currentValue = GameItself.decrease(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA játékos lépett, ");
                    textField1.setText("");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! A számítógép nyert! \nSzeretne újra játszani?\n\n",
                                "Vereség", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new vsComputerForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }
                    }
                    else {
                    msg_area.append("A számítógép következik.\n");
                    machine();
                    }
                }
                else {
                    msg_area.append("\nÉrvénytelen pozíció, a számítógép következik.\n");
                    machine();
                }
            }
        });


        opcio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String getText=textField2.getText();
                int choice=Integer.parseInt(getText);
                if (GameItself.chekerTwo(currentValue,choice)==true) {
                    currentValue = GameItself.removeing(currentValue, choice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA játékos lépett, ");
                    textField2.setText("");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! A számítógép nyert! \nSzeretne újra játszani?\n\n",
                                "Vereség", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new vsComputerForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }
                    }
                    else {
                        msg_area.append("A számítógép következik.\n");
                        machine();
                    }
                }
                else {
                    msg_area.append("\nÉrvénytelen pozíció, a számítógép következik.\n");
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
                msg_area.append("\nA számítógép kiválasztja törölni kivánt karakterlánc kezdő 0-jának pozícióját.");
                if(GameItself.chekerTwo(currentValue,positionChoice)==true){
                    currentValue = GameItself.removeing(currentValue,positionChoice);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA gép lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! A számítógép nyert! \nSzeretne újra játszani?\n\n",
                                "Győzelem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new vsComputerForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }
                    }
                    else {
                        msg_area.append("A játékos következik.\n");
                    }
                }
                break;

            case 1:
                int positionChoice2=GameItself.aiPositionChoice(currentValue,machineMoveChoice);
                msg_area.append("\nA számítógép csökkenti az általa gondolt számot 1-el.");
                if(GameItself.checkerOne(currentValue,positionChoice2)==true){
                    currentValue = GameItself.decrease(currentValue,positionChoice2);
                    currentNumber.setText(currentValue);
                    msg_area.append("\nA gép lépett, ");
                    if (!currentValue.contains("0")&&!currentValue.contains("1")) {
                        Object[] options = {"Új játék", "Vissza a menübe"};
                        int dialogresult = JOptionPane.showOptionDialog(null, "Játék vége! A számítógép nyert! \nSzeretne újra játszani?\n\n",
                                "Győzelem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (dialogresult == JOptionPane.YES_OPTION){
                            setVisible(false);
                            new vsComputerForm().setVisible(true);
                        }

                        if (dialogresult == JOptionPane.NO_OPTION){
                            setVisible(false);
                            new StartMenuForm().setVisible(true);
                        }

                    }
                    else {
                        msg_area.append("A játékos következik.\n");
                    }
                }
                break;
        }

        }

    void drawLines(Graphics g) {
        Color c = new Color(60, 63, 65);
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(3f);
        g2d.setStroke(stroke);
        g2d.setColor(c);

        g2d.drawLine(605, 400, 45, 400);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
    }

