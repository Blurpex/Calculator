import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProblem implements ActionListener {

    double number, answer;
    int calculation;

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JMenu jMenuFile = new JMenu("File");
    JMenu jMenuHelp = new JMenu();
	JMenuItem jMenuitemExit = new JMenu("Exit");
    JMenuBar menuBar = new JMenuBar();
    JTextField textField = new JTextField();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonAdd = new JButton("+");
    JButton buttonMin = new JButton("-");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonEql = new JButton("=");
    JButton buttonPer = new JButton("%");
    JButton buttonSqr = new JButton("sqrt");
    JButton buttonRcp = new JButton("1/x");
    JButton buttonClr = new JButton("C");
    JButton buttonDel = new JButton("BACKSPACE");
    JButton buttonDot = new JButton(".");

    CalculatorProblem() {

        // frame
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(375, 350);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add components
        addComponents();
        
        // action listeners
        addActionEvent();
    }

    public void addComponents() {
        
        // bounds for buttons and text field
        textField.setBounds(10, 10, 350, 40);
        button0.setBounds(10, 260, 60, 40);
        button1.setBounds(10, 210, 60, 40);
        button2.setBounds(80, 210, 60, 40);
        button3.setBounds(150, 210, 60, 40);
        button4.setBounds(10, 160, 60, 40);
        button5.setBounds(80, 160, 60, 40);       
        button6.setBounds(150, 160, 60, 40);
        button7.setBounds(10, 110, 60, 40);  
        button8.setBounds(80, 110, 60, 40);
        button9.setBounds(150, 110, 60, 40);
        buttonAdd.setBounds(220, 260, 60, 40);
        buttonMin.setBounds(220, 210, 60, 40);
        buttonMul.setBounds(220, 160, 60, 40);
        buttonDiv.setBounds(220, 110, 60, 40);
        buttonEql.setBounds(290, 260, 60, 40);
        buttonPer.setBounds(290, 210, 60, 40);
        buttonSqr.setBounds(290, 110, 60, 40);
        buttonRcp.setBounds(290, 160, 60, 40);
        buttonDel.setBounds(10, 60, 120, 40);
        buttonClr.setBounds(290, 60, 60, 40);
        buttonDot.setBounds(150, 260, 60, 40);
        
        // add components
        frame.add(label);
        frame.add(textField); 
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonAdd);
        frame.add(buttonMin);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEql);
        frame.add(buttonPer);
        frame.add(buttonSqr);
        frame.add(buttonRcp);
        frame.add(buttonDel);
        frame.add(buttonClr);
        frame.add(buttonDot);
        // jMenuFile.add(jMenuitemExit);
        // menuBar.add(jmenuFile);
		// menuBar.add(jmenuHelp);
		//setJMenuBar(menuBar);
    }

    // calls action listeners
    public void addActionEvent() {
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonMin.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEql.addActionListener(this);
        buttonPer.addActionListener(this);
        buttonSqr.addActionListener(this);
        buttonRcp.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonClr.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    
    // action listeners
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == button0)       { textField.setText(textField.getText() + "0"); }
        else if(source == button1)  { textField.setText(textField.getText() + "1"); }
        else if(source == button2)  { textField.setText(textField.getText() + "2"); }
        else if(source == button3)  { textField.setText(textField.getText() + "3"); }
        else if(source == button4)  { textField.setText(textField.getText() + "4"); }
        else if(source == button5)  { textField.setText(textField.getText() + "5"); }
        else if(source == button6)  { textField.setText(textField.getText() + "6"); }
        else if(source == button7)  { textField.setText(textField.getText() + "7"); }
        else if(source == button8)  { textField.setText(textField.getText() + "8"); }
        else if(source == button9)  { textField.setText(textField.getText() + "9"); }
        else if(source == buttonAdd) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        }
        else if(source == buttonMin) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        }
        else if(source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        }
        else if(source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        }
        else if(source == buttonEql) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) { 
                        textField.setText(Double.toString(answer).replace(".0", "")); 
                    } else { textField.setText(Double.toString(answer)); }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        } 
        else if(source == buttonPer) {
        }
        else if(source == buttonSqr) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
        }
        else if(source == buttonRcp) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        }
        else if(source == buttonDel) {
            if (textField.getText().length() > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(textField.getText().length() - 1);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }
        else if(source == buttonClr) {
            label.setText("");
            textField.setText("");
        } 
        else if(source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        }
    }

    // main method
    public static void main(String[] args)
    {
        new CalculatorProblem();
    }
}