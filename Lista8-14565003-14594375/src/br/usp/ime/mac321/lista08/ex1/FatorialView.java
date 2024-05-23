package br.usp.ime.mac321.lista08.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class FatorialView extends JFrame {
    private static final long serialVersionUID = 6265594525071196118L;
    private JTextField numeroField;
    private JLabel resultadoLabel;

    public FatorialView() {
        setTitle("Calculadora de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        numeroField = new JTextField(10);
        numeroField.setName("numeroField");  // Definindo nome
        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setName("resultadoLabel");  // Definindo nome
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setName("calcularButton");  // Definindo nome

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFatorial();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite um número:"));
        panel.add(numeroField);
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        add(panel);
    }

    private void calcularFatorial() {
        try {
            int numero = Integer.parseInt(numeroField.getText());

            BigDecimal resultado = FatorialController.calculaFatorial(numero);
            resultadoLabel.setText("Resultado: " + resultado.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            resultadoLabel.setText("Entrada inválida!");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Valor", JOptionPane.ERROR_MESSAGE);
            resultadoLabel.setText("Entrada inválida!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FatorialView().setVisible(true);
            }
        });
    }
}
