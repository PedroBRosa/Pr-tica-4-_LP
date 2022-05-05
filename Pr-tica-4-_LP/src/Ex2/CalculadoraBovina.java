package Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBovina extends JFrame {
    private JPanel calculadora;
    private JFormattedTextField qtdArrobaTextField1;
    private JButton calcularButton;
    private JFormattedTextField valArrobaTextField;
    private float valArroba,valTotalArroba;
    private int qtdArroba;

    public CalculadoraBovina() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valArroba = Float.parseFloat(valArrobaTextField.getText());
                qtdArroba = Integer.parseInt(qtdArrobaTextField1.getText());
                valTotalArroba = valArroba*qtdArroba;
                System.out.println(valTotalArroba);
                valArrobaTextField.setText("");
                qtdArrobaTextField1.setText("");
                JOptionPane.showMessageDialog(null,String.format("O valor a pagar \nR$ %.2f",valTotalArroba));
            }
        });
    }

    public static void main(String[] args) {
        CalculadoraBovina calBovina = new CalculadoraBovina();
        calBovina.setContentPane(calBovina.calculadora);
        calBovina.setSize(450, 300);
        calBovina.setVisible(true);
        calBovina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
