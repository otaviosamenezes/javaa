import java.awt.*;
import javax.swing.*;
public class Exo11 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Verificador de idade");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel texto1 = new JLabel("Ano Nascimento:");
        texto1.setBounds(20, 30, 150, 30);
        texto1.setFont(new Font("arial", Font.BOLD, 17));

        JTextField Anonascim = new JTextField();
        Anonascim.setBounds(170, 30, 100, 30);

        JButton botao = new JButton("Verificar");
        botao.setBounds(30, 67, 100, 30);

        JLabel Resultado = new JLabel("Verificando...");
        Resultado.setBounds(20, 110, 200, 30);
        Resultado.setFont(new Font("arial", Font.BOLD, 17));

        JLabel texto2 = new JLabel("...");
        texto2.setBounds(20, 150, 250, 30);
        texto2.setFont(new Font("arial", Font.BOLD, 17));
        texto2.setForeground(Color.BLUE);

        botao.addActionListener(e -> {
            int Ano = Integer.parseInt(Anonascim.getText());
            int Res = 2025 - Ano;
            Resultado.setText("Você tem " + Res + " anos");

            if (Res >= 18) {
                texto2.setText("VOCÊ É MAIOR DE IDADE");
            }else {
                texto2.setText("VOCÊ É MENOR DE IDADE");
            }
        });

        janela.add(botao);
        janela.add(Resultado);
        janela.add(Anonascim);
        janela.add(texto1);
        janela.add(texto2);
        janela.setVisible(true);
    }
}