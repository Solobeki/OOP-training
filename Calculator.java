import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons =new JButton[10];
    JButton[] FUNCTIONButtons =new JButton[8];
    JButton addButton,sButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;
    
    Calculator(){
       
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         
        Calculator calc = new Calculator();
        
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}