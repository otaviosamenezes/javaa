import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
public class Aula17 extends JFrame {
    public Aula17() {
        setTitle("Calculador de idade");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel texto1 = new JLabel("Ano Nascimento:");
        texto1.setBounds(40, 50, 250, 30);
        texto1.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField ano = new JTextField();
        ano.setBounds(170, 50, 100, 30);

        JButton botao = new JButton("Calcular idade");
        botao.setBounds(100, 100, 160, 30);
        botao.setFont(new Font("Arial", Font.BOLD, 13));

        JLabel texto2 = new JLabel("Idade :");
        texto2.setBounds(20, 150, 100, 30);
        texto2.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel res1 = new JLabel("0");
        res1.setBounds(90, 150, 100, 30);
        res1.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel texto3 = new JLabel("Situação :");
        texto3.setBounds(20, 200, 100, 30);
        texto3.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel res2 = new JLabel("vazio");
        res2.setBounds(99, 200, 255, 30);
        res2.setFont(new Font("Arial", Font.BOLD, 14));

        botao.addActionListener(e -> {
            int anoAtual = LocalDate.now().getYear();
            int anoNascimento = Integer.parseInt(ano.getText());
            int idade = anoAtual - anoNascimento;

            if (idade < 16) {
                res2.setText("Não Votar");
            }else if (idade >= 16 && idade < 18 || idade > 70) {
                res2.setText("Voto Opcional");
            }else {
                res2.setText("Voto Obrigatório");
            }

           // String sit =  (idade < 16) ? "Não Vota" : ((idade >= 16 && idade < 18) || (idade > 70)) ? "Voto Opcional" : "Voto Obrigatório";

          //  res2.setText(sit);
            res1.setText(Integer.toString(idade));
        });

        add(texto1);
        add(ano);
        add(botao);
        add(texto2);
        add(texto3);
        add(res1);
        add(res2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Aula17();
    }
}