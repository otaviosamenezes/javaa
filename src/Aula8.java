import javax.swing.*;
import java.awt.*;
public class Aula8 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Somador");
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JTextField caixa1 = new JTextField();
        caixa1.setBounds(10, 50, 50, 30);

        JLabel sinalMais = new JLabel("+", JLabel.CENTER);
        sinalMais.setBounds(70, 50, 20, 30);

        JTextField caixa2 = new JTextField();
        caixa2.setBounds(100, 50, 50, 30);

        JButton botao = new JButton ("=");
        botao.setBounds(170, 50, 50, 30);

        JLabel labelResultado = new JLabel(" calculando... ", JLabel.CENTER);
        labelResultado.setBounds(180, 50, 200, 30);

        botao.addActionListener(e -> {
            try {
                int numero1 = Integer.parseInt(caixa1.getText());
                int numero2 = Integer.parseInt(caixa2.getText());
                int resultado = numero1 + numero2;
                labelResultado.setText("Resultado : " + resultado);
            }catch(NumberFormatException ex) {
                labelResultado.setText("Digite número válido");
            }
        });
        janela.add(caixa1);
        janela.add(caixa2);
        janela.add(sinalMais);
        janela.add(botao);
        janela.add(labelResultado);

        janela.setVisible(true);
    }
}