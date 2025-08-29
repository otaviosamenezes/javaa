import javax.swing.*;
import java.awt.*;
public class PratAula10 {
    public static void main(String[] args) {
JFrame janela = new JFrame("Divião");
janela.setSize(300, 400);
janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.setLayout(null);

TextField caixa1 = new TextField();
caixa1.setBounds(100, 50, 100, 30);

JLabel texto1 = new JLabel("Numerador :");
texto1.setBounds(20, 50, 100, 30);

TextField caixa2 = new TextField();
caixa2.setBounds(100, 100, 100, 30);

JLabel texto2 = new JLabel("Denominador");
texto2.setBounds(20, 100, 100, 30);

JButton botao = new JButton("Dividir");
botao.setBounds(20, 150, 100, 30);

JLabel Dividir = new JLabel("Divisão:");
Dividir.setBounds(20, 200, 100, 30);

JLabel Resto = new JLabel("Resto");
Resto.setBounds(20, 250, 100, 30);

botao.addActionListener(e -> {
    try {
        int numero1 = Integer.parseInt(caixa1.getText());
        int numero2 = Integer.parseInt(caixa2.getText());
        float resultado1 = (float) numero1 / numero2;
        float resultado2 = (float) numero1 % numero2;

        Dividir.setText("Divisão: " + resultado1);
        Resto.setText("Resto: " + resultado2);
    }catch (NumberFormatException erro) {
        Dividir.setText("Numero invalido");
        Resto.setText("Numero invalido");
    }
});
janela.add(caixa1);
janela.add(texto1);
janela.add(caixa2);
janela.add(texto2);
janela.add(botao);
janela.add(Dividir);
janela.add(Resto);

janela.setVisible(true);
    }
}