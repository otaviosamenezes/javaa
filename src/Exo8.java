import javax.swing.*;
import java.awt.*;
public class Exo8 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(600, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        ImageIcon icone = new ImageIcon("src/calculadora.jpg");
        JLabel image = new JLabel(icone);
        image.setBounds(270, 150, 300, 300);

        JLabel texto1 = new JLabel("Super Calculadora");
        texto1.setBounds(200, 10, 200, 30);
        texto1.setFont(new Font("arial", Font.BOLD, 20));

        JLabel texto2 = new JLabel("Informe um valor:");
        texto2.setBounds(30, 100, 119, 30);
        texto2.setFont(new Font("arial", Font.BOLD, 13));

        TextField Digite = new TextField();
        Digite.setBounds(150,100, 100, 30);

        JButton botao = new JButton("Calcular");
        botao.setBounds(270, 92, 100, 50);

        JLabel texto3 = new JLabel("");
        texto3.setBounds(10, 200, 250, 30);
        texto3.setFont(new Font("negrito", Font.BOLD, 14));

        JLabel texto4 = new JLabel("");
        texto4.setBounds(10, 250, 250, 30);
        texto4.setFont(new Font("negrito", Font.BOLD, 14));

        JLabel texto5 = new JLabel("");
        texto5.setBounds(10, 300, 250, 30);
        texto5.setFont(new Font("negrito", Font.BOLD, 14));

        JLabel texto6 = new JLabel("");
        texto6.setBounds(10, 350, 250, 30);
        texto6.setFont(new Font("negrito", Font.BOLD, 14));

        JLabel texto7 = new JLabel("");
        texto7.setBounds(10, 400, 250, 30);
        texto7.setFont(new Font("negrito", Font.BOLD, 14));


        botao.addActionListener(e -> {
          try {
              int numero1 = Integer.parseInt(Digite.getText());
              int resultado = (int) numero1 % 2;
              float resultado2 = (float) Math.pow(numero1, 3);
              float resultado3 = (float) Math.sqrt(numero1);
              float resultado4 = (float) Math.cbrt(numero1);
              int resultado5 = (int) Math.abs(numero1);

              texto3.setText("<html>Resto da Divisão por 2 : <span style = 'color:blue;'>" + resultado + " </span></html>");
              texto4.setText("<html>Elevado ao Cubo :  <span style = 'color:blue;'>" + resultado2 + " </span></html>");
              texto5.setText("<html>Raiz Quadrada :  <span style = 'color:blue;'>" +  String.format("%.2f", resultado3) + " </span></html>");
              texto6.setText("<html>Raiz Cúbica :  <span style = 'color:blue;'>" +  String.format("%.2f", resultado4) + " </span></html>");
              texto7.setText("<html>Valor Absoluto :  <span style = 'color:blue;'>" + resultado5 + " </span></html>");
          }catch (NumberFormatException erro) {
               texto3.setText("Digite valor válido");
          }
      });
        janela.add(image);
        janela.add(texto1);
        janela.add(texto2);
        janela.add(Digite);
        janela.add(botao);
        janela.add(texto3);
        janela.add(texto4);
        janela.add(texto5);
        janela.add(texto6);
        janela.add(texto7);

        janela.setVisible(true);
    }
}