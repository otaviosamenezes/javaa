import javax.swing.*;
import java.awt.*;
public class Aula25 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Contador");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel texto = new JLabel("Contagem :");
        texto.setBounds(20, 40, 100, 30);
        texto.setFont(new Font("arial", Font.BOLD, 17));

        JLabel labelRes = new JLabel(" ");
        labelRes.setBounds(130, 40, 400 , 30);
        labelRes.setFont(new Font("arial", Font.BOLD, 17));

        JButton botao = new JButton("Contar");
        botao.setBounds(100, 100, 100, 30);

        botao.addActionListener(e -> {
            int contar = 1;
            String resultado = " ";
            while(contar <= 10) {
             resultado += contar + " ";

             labelRes.setText(resultado);
                contar++;
            }
        });

        janela.add(texto);
        janela.add(labelRes);
        janela.add(botao);
        janela.setVisible(true);
    }
}