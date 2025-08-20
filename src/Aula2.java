import javax.swing.JLabel;
import javax.swing.JButton;
public class Aula2 extends javax.swing.JFrame {
     public Aula2() {
        super("Minha janela");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel texto = new JLabel("", JLabel.CENTER);
        texto.setBounds(50, 50, 400, 30);
        add(texto);

        JButton botao = new JButton("Clicar aqui");
        botao.setBounds(150, 150, 200, 40);
        add(botao);

        botao.addActionListener(e -> texto.setText("VAMOS ESTUDAAAAAAAAR"));

        setVisible(true);
   }

    public static void main(String[] args) {
        new Aula2();
    }
}