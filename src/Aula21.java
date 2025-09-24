import javax.swing.*;
import java.awt.*;
public class Aula21 extends JFrame {
    public Aula21() {
        setTitle("Par ou Impar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null)  ;

        JLabel texto1 = new JLabel("Valor:");
        texto1.setBounds(10, 50, 100, 30);
        texto1.setFont(new Font("Arial", Font.BOLD, 17));

        JTextField numero = new JTextField();
        numero.setBounds(57, 50, 100, 30);

        JButton botao = new JButton("Verificar");
        botao.setBounds(35, 100, 100, 30);
        botao.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel labelResultado = new JLabel("Resultado");
        labelResultado.setBounds(35, 150, 200, 30);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 20));

        botao.addActionListener(e -> {
            int resultado = Integer.parseInt(numero.getText());
            if (resultado % 2 == 0) {
                labelResultado.setText("Par");
            }else {
                labelResultado.setText("Impar");
            }
        });

        add(texto1);
        add(botao);
        add(numero);
        add(labelResultado);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula21();
    }
}