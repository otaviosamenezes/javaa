import javax.swing.*;
import java.awt.*;
public class Exo9 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Génio da Lampada");
        janela.setSize(900, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        ImageIcon icone = new ImageIcon("src/balao.jpg");
        JLabel image = new JLabel(icone);
        image.setBounds(200, 50, 300, 300);

        ImageIcon icon = new ImageIcon("src/genio.png");
        JLabel image1 = new JLabel(icon);
        image1.setBounds(300, 300, 400, 400);

        JLabel texto1 = new JLabel("Valor:");
        texto1.setBounds(180, 450, 100, 30);
        texto1.setFont(new Font("Arial", Font.BOLD, 23));

        JLabel labelResultado = new JLabel("<html>Estou pensando em um <br>número entre 1 e 5 . Tente adivinhar</html>");
        labelResultado.setBounds(260, 130, 200, 100);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));

        JTextField numero = new JTextField();
        numero.setBounds(260, 450, 100, 30);

        JButton botao = new JButton("Palpite");
        botao.setBounds(200, 500, 150, 50);
        botao.setFont(new Font("Arial", Font.BOLD, 16));

        botao.addActionListener(e -> {
            int valor = Integer.parseInt(numero.getText());
            double ale = Math.random();
            int n = (int) (1 + ale * (5 - 1));
            if (n == valor) {
                labelResultado.setText("ACERTOU!");
            }else {
                labelResultado.setText("ERROU! Pensei em " + n);
            }
        });

        janela.add(labelResultado);
        janela.add(image);
        janela.add(image1);
        janela.add(texto1);
        janela.add(numero);
        janela.add(botao);
        janela.setVisible(true);
    }
}