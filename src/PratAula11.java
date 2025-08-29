import javax.swing.*;
import java.awt.*;
public class PratAula11 {
    public static void main(String[] args) {
        JFrame janela = new JFrame ("Raiz Quadrada");
        janela.setSize(300, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        TextField caixa1 = new TextField();
        caixa1.setBounds(100, 100, 100, 30);

        JLabel texto1 = new JLabel("Numerador:");
        texto1.setBounds(20, 100, 100, 30 );

        TextField caixa2 = new TextField();
        caixa2.setBounds(100, 150, 100, 30);

        JLabel texto2 = new JLabel("Denominador:");
        texto2.setBounds(20, 150, 100, 30);

        JButton botao = new JButton("Calcular");
        botao.setBounds(20, 200, 100, 30);

        JLabel Dividir = new JLabel("Divisão:");
        Dividir.setBounds(20, 250, 100, 30);

        JLabel Raiz = new JLabel("Raiz:");
        Raiz.setBounds(20, 300, 100, 30);

        botao.addActionListener(e -> {
            try {
                int numero1 = Integer.parseInt(caixa1.getText());
                int numero2 = Integer.parseInt(caixa2.getText());

                float divisao = (float) numero1 / numero2;
                float raiz = (float) Math.sqrt(numero1);

                Dividir.setText("Divisão: " + divisao);
                Raiz.setText("Raiz : " + raiz);
            }catch (NumberFormatException erro) {
                Dividir.setText("Digita número válido");
                Raiz.setText("Digita número válido");
            }
        });
        janela.add(caixa1);
        janela.add(texto1);
        janela.add(caixa2);
        janela.add(texto2);
        janela.add(botao);
        janela.add(Dividir);
        janela.add(Raiz);

        janela.setVisible(true);
    }
}