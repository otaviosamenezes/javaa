import javax.swing.*;
import java.awt.*;
public class Exo7 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculando idade");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JTextField caixa = new JTextField();
        caixa.setBounds(10, 50, 80, 30);

        JLabel texto = new JLabel("ano nas.", JLabel.CENTER);
        texto.setBounds(100, 50, 80, 30);

        JButton botao = new JButton("Calcular");
        botao.setBounds(190, 50, 80, 30);

        JLabel labelResultado = new JLabel("Sua idade :", JLabel.CENTER);
        labelResultado.setBounds(10, 100, 250, 30);

        botao.addActionListener(e -> {
            try {
                int ano = Integer.parseInt(caixa.getText());
                    labelResultado.setText("Ano Inválido");
                int resultado = 2025 - ano;
                labelResultado.setText("Sua idade :" + resultado);

            }catch (NumberFormatException erro){
                labelResultado.setText("Digite número válido");
            }
        });
        janela.add(caixa);
        janela.add(texto);
        janela.add(botao);
        janela.add(labelResultado);

        janela.setVisible(true);
    }
}