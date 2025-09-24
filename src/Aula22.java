import java.awt.*;
import javax.swing.*;
public class Aula22 extends JFrame {
    public Aula22() {
        setTitle("Analizador de idade");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel texto1 = new JLabel("Ano Nasc:");
        texto1.setBounds(20, 20, 100, 30);
        texto1.setFont(new Font("arial", Font.BOLD, 17));

        JTextField Anonasc = new JTextField();
        Anonasc.setBounds(110, 20, 100, 30);

        JButton botao = new JButton("Posso Votar?");
        botao.setBounds(40, 60, 150, 30);
        botao.setFont(new Font("arial", Font.BOLD, 15));

        JLabel labelResultado = new JLabel("Verificando...");
        labelResultado.setBounds(20, 100, 150, 30);
        labelResultado.setFont(new Font("arial", Font.BOLD, 15));
        labelResultado.setForeground(Color.BLUE);

        JLabel texto2 = new JLabel(" ");
        texto2.setBounds(20, 150, 200, 30);
        texto2.setFont(new Font("arial", Font.BOLD, 15));
        texto2.setForeground(Color.BLUE);

        botao.addActionListener(e -> {
            int Ano = Integer.parseInt(Anonasc.getText());
            int Res = 2025 - Ano;
            labelResultado.setText("Você tem " + Res + " anos");

            if (Res < 16) {
                texto2.setText("NÃO VOTA.");
            }else if (Res >= 16 && Res <18 || Res > 70) {
                texto2.setText("VOTO OPICIONAL");
            }else {
                texto2.setText("VOTO OBRIGATÓRIO.");
            }
        });

        add(Anonasc);
        add(labelResultado);
        add(botao);
        add(texto1);
        add(texto2);
        setVisible(true);


        }
        public static void main(String[] args) {
        new Aula22();
    }
}