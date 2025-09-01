import javax.swing.*;
import java.awt.*;
public class PratAula13 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Número Aléatorio");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel texto = new JLabel("Número Sortiado");
        texto.setBounds(100, 9, 100, 30);

        JLabel texto2 = new JLabel("Digite número:");
        texto2.setBounds(30, 50, 100, 30);

        JTextField numero = new JTextField();
         numero.setBounds(120, 50, 80, 30);

        JButton botao = new JButton("Girar");
        botao.setBounds(100, 100, 100, 30);

        JLabel labelResultado = new JLabel("verificando...");
        labelResultado.setBounds(100, 150, 100, 30);

        JLabel Sorte = new JLabel("");
        Sorte.setBounds(50, 200,  250, 30);

        botao.addActionListener(e -> {
            int n = Integer.parseInt(numero.getText());
            double ale = Math.random();
            int r = (int) (1 + ale * (50 - 1));
            labelResultado.setText("Número: " + r);
            if (r == n) {
             Sorte.setText("Parabéns seu numero da sorte foi " + n);
            }
        });
        janela.add(texto);
        janela.add(texto2);
        janela.add(numero);
        janela.add(botao);
        janela.add(labelResultado);
        janela.add(Sorte);

        janela.setVisible(true);
    }
}