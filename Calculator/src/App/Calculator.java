package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator implements ActionListener{
    
    double input, result;
    String cal;

    /* Interface Components ----------------------------------------------------------------------- */
        JFrame frame;
        JLabel label = new JLabel("");

        JTextField textView = new JTextField();

        // First Row
        JButton sym_CLR = new JButton("CLR");
        JButton sym_DEL = new JButton("DEL");
        JButton sym_MUL = new JButton("X");
        JButton sym_DIV = new JButton("/");

        // Second Row
        JButton Num_Seven = new JButton("7");
        JButton Num_Eight = new JButton("8");
        JButton Num_Nine = new JButton("9");
        JButton sym_SUB = new JButton("-");

        // Third Row
        JButton Num_Four = new JButton("4");
        JButton Num_Five = new JButton("5");
        JButton Num_Six = new JButton("6");
        JButton sym_SUM = new JButton("+");

        // Fourth Row
        JButton Num_One = new JButton("1");
        JButton Num_Two = new JButton("2");
        JButton Num_Three = new JButton("3");
        JButton sym_EQUAL = new JButton("=");

        // Fifth Row
        JButton Num_Zero = new JButton("0");
        JButton sym_DEC = new JButton(".");

    /* -------------------------------------------------------------------------------------------- */
    
    Calculator(){
        CreateInterface();
        InterfaceComponenets();
        AddInterfaceEventListener();
    }

    public void CreateInterface() {
        // Basic Swing Layout
        frame = new JFrame("Calculator");

        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(305, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void InterfaceComponenets() {
        /* Output Row -------------------------------------------------------------------------- */
            label.setBounds(180, 0, 100, 30);
            frame.add(label);

            textView.setBounds(10, 40, 270, 60);
            textView.setEditable(false);
            textView.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textView);
        /* ------------------------------------------------------------------------------------- */
        /* First Row --------------------------------------------------------------------------- */
            sym_CLR.setBounds(10, 110, 60, 40);
            frame.add(sym_CLR);

            sym_DEL.setBounds(80, 110, 60, 40);
            frame.add(sym_DEL);

            sym_MUL.setBounds(150, 110, 60, 40);
            frame.add(sym_MUL);

            sym_DIV.setBounds(220, 110, 60, 40);
            frame.add(sym_DIV);
        /* ------------------------------------------------------------------------------------- */
        /* Second Row -------------------------------------------------------------------------- */
            Num_Seven.setBounds(10, 160, 60, 40);
            frame.add(Num_Seven);

            Num_Eight.setBounds(80, 160, 60, 40);
            frame.add(Num_Eight);

            Num_Nine.setBounds(150, 160, 60, 40);
            frame.add(Num_Nine);

            sym_SUB.setBounds(220, 160, 60, 40);
            frame.add(sym_SUB);
        /* ------------------------------------------------------------------------------------- */
        /* Third Row --------------------------------------------------------------------------- */
            Num_Four.setBounds(10, 210, 60, 40);
            frame.add(Num_Four);

            Num_Five.setBounds(80, 210, 60, 40);
            frame.add(Num_Five);

            Num_Six.setBounds(150, 210, 60, 40);
            frame.add(Num_Six);

            sym_SUM.setBounds(220, 210, 60, 40);
            frame.add(sym_SUM);
        /* ------------------------------------------------------------------------------------- */
        /* Fourth Row -------------------------------------------------------------------------- */
            Num_One.setBounds(10, 260, 60, 40);
            frame.add(Num_One);

            Num_Two.setBounds(80, 260, 60, 40);
            frame.add(Num_Two);

            Num_Three.setBounds(150, 260, 60, 40);
            frame.add(Num_Three);

            sym_EQUAL.setBounds(220, 260, 60, 90);
            frame.add(sym_EQUAL);
        /* ------------------------------------------------------------------------------------- */
        /* Fifth Row --------------------------------------------------------------------------- */
            Num_Zero.setBounds(10, 310, 130, 40);
            frame.add(Num_Zero);

            sym_DEC.setBounds(150, 310, 60, 40);
            frame.add(sym_DEC);
        /* ------------------------------------------------------------------------------------- */
    }

    public void AddInterfaceEventListener() {
        // 1st Row
        sym_CLR.addActionListener(this);
        sym_DEL.addActionListener(this);
        sym_MUL.addActionListener(this);
        sym_DIV.addActionListener(this);
        // 2nd Row
        Num_Seven.addActionListener(this);
        Num_Eight.addActionListener(this);
        Num_Nine.addActionListener(this);
        sym_SUB.addActionListener(this);
        // 3rd Row
        Num_Four.addActionListener(this);
        Num_Five.addActionListener(this);
        Num_Six.addActionListener(this);
        sym_SUM.addActionListener(this);
        // 4th Row
        Num_One.addActionListener(this);
        Num_Two.addActionListener(this);
        Num_Three.addActionListener(this);
        sym_EQUAL.addActionListener(this);
        // 5th Row
        Num_Zero.addActionListener(this);
        sym_DEC.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();

        if(event == Num_One) {
            textView.setText(textView.getText() + "1");
        }
        else if(event == Num_Two) {
            textView.setText(textView.getText() + "2");
        }
        else if(event == Num_Three) {
            textView.setText(textView.getText() + "3");
        }
        else if(event == Num_Four) {
            textView.setText(textView.getText() + "4");
        }
        else if(event == Num_Five) {
            textView.setText(textView.getText() + "5");
        }
        else if(event == Num_Six) {
            textView.setText(textView.getText() + "6");
        }
        else if(event == Num_Seven) {
            textView.setText(textView.getText() + "7");
        }
        else if(event == Num_Eight) {
            textView.setText(textView.getText() + "8");
        }
        else if(event == Num_Nine) {
            textView.setText(textView.getText() + "9");
        }
        else if(event == Num_Zero) {
            if(textView.getText().equals("0")) {
                return;
            } else {
                textView.setText(textView.getText() + "0");
            }
        }
        else if(event == sym_CLR) {
            label.setText("");
            textView.setText("");
        }
        else if(event == sym_DEL) {
            int length = textView.getText().length();
            int num = length-1;
            if(length>0) {
                StringBuilder numString = new StringBuilder(textView.getText());
                numString.deleteCharAt(num);
                textView.setText(numString.toString());
            }
            if(textView.getText().endsWith("")){
                label.setText("");
            }
        }
        else if(event == sym_SUM) {
            String presentNumber = textView.getText();
            input = Double.parseDouble(textView.getText());
            textView.setText("");
            label.setText(presentNumber + " + ");
            cal = "+";
        }
        else if(event == sym_SUB) {
            String presentNumber = textView.getText();
            input = Double.parseDouble(textView.getText());
            textView.setText("");
            label.setText(presentNumber + " - ");
            cal = "-";
        }
        else if(event == sym_MUL) {
            String presentNumber = textView.getText();
            input = Double.parseDouble(textView.getText());
            textView.setText("");
            label.setText(presentNumber + " * ");
            cal = "*";
        }
        else if(event == sym_DIV) {
            String presentNumber = textView.getText();
            input = Double.parseDouble(textView.getText());
            textView.setText("");
            label.setText(presentNumber + " / ");
            cal = "/";
        }
        else if(event == sym_DEC) {
            if(textView.getText().contains(".")) {
                return;
            }
            else{
                textView.setText(textView.getText() + ".");
            }
        }
        else if(event == sym_EQUAL) {
            switch (cal) {
                case "+" :
                    result = input + (Double.parseDouble(textView.getText()));
                        
                    if(Double.toString(result).endsWith(".0")) {
                        textView.setText(Double.toString(result).replace(".0", ""));
                    }
                    else {
                        textView.setText(Double.toString(result));
                    }
                    
                    label.setText("");
                    break;
                case "-" :
                    result = input - (Double.parseDouble(textView.getText()));
                        
                    if(Double.toString(result).endsWith(".0")) {
                        textView.setText(Double.toString(result).replace(".0", ""));
                    }
                    else {
                        textView.setText(Double.toString(result));
                    }
                    
                    label.setText("");
                    break;
                case "*" :
                    result = input * (Double.parseDouble(textView.getText()));
                    
                    if(Double.toString(result).endsWith(".0")) {
                        textView.setText(Double.toString(result).replace(".0", ""));
                    }
                    else {
                        textView.setText(Double.toString(result));
                    }
                    
                    label.setText("");
                    break;
                case "/" :
                    result = input / (Double.parseDouble(textView.getText()));
                        
                    if(Double.toString(result).endsWith(".0")) {
                        textView.setText(Double.toString(result).replace(".0", ""));
                    }
                    else {
                        textView.setText(Double.toString(result));
                    }
                    
                    label.setText("");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
