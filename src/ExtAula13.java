import javax.swing.*;
import java.awt.*;
public class ExtAula13 extends JFrame {
    public ExtAula13() {
        setTitle("Número da sorte");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel texto1 = new JLabel("Número Sortiado");
        texto1.setBounds(100, 9, 250, 30);
        texto1.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel texto2 = new JLabel("Digite número:");
        texto2.setBounds(30, 50, 100, 30);

        JTextField numero = new JTextField();
        numero.setBounds(120, 50, 80, 30);

        JButton botao = new JButton("Girar");
        botao.setBounds(100, 100, 100, 30);

        JLabel labelResultado = new JLabel("Verificando...");
        labelResultado.setBounds(100, 150, 100,30);

        JLabel Sorte = new JLabel("");
        Sorte.setBounds(50, 200, 250, 30);
        Sorte.setFont(new Font("Arial", Font.BOLD, 15));

        botao.addActionListener(e -> {
            int n = Integer.parseInt(numero.getText());
           double ale = Math.random();
           int r = (int) (1 + ale * (50 - 1));

           labelResultado.setText("Número : " + r);
           if (r == n) {
               Sorte.setText("Parabens seu número foi Sorteado");
           }else{
               Sorte.setText("Tente novamente");
           }
        });
        add(texto1);
        add(texto2);
        add(numero);
        add(botao);
        add(labelResultado);
        add(Sorte);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExtAula13();
    }
}