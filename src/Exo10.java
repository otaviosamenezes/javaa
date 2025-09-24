import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class Exo10 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Equação Segundo Grau");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JTextField caixaA = new JTextField();
        caixaA.setBounds(10, 20, 50, 30);

        JLabel texto1 = new JLabel("x² +");
        texto1.setBounds(70, 20, 50, 30);
        texto1.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField caixaB = new JTextField();
        caixaB.setBounds(110, 20, 50, 30);

        JLabel texto2 = new JLabel("x +");
        texto2.setBounds(170, 20, 50, 30);
        texto2.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField caixaC = new JTextField();
        caixaC.setBounds(200, 20, 50, 30);

        JLabel texto3 = new JLabel("= 0");
        texto3.setBounds(258, 20, 50, 30);
        texto3.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel triangulo = new JLabel("▲  =");
        triangulo.setBounds(30, 60, 50, 50);

        JLabel resB = new JLabel("B");
        resB.setBounds(60, 60, 50,50);
        resB.setFont(new Font("Arial", Font.BOLD, 15));
        resB.setForeground(Color.RED);

        JLabel texto4 = new JLabel("² - 4 .");
        texto4.setBounds(75, 60, 50, 50);
        texto4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resA = new JLabel("A");
        resA.setBounds(117, 60, 50, 50);
        resA.setFont(new Font("Arial", Font.BOLD, 15));
        resA.setForeground(Color.RED);

        JLabel ponto = new JLabel(".");
        ponto.setBounds(135, 60, 50, 50);
        ponto.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resC = new JLabel("C");
        resC.setBounds(149, 60, 50, 50);
        resC.setFont(new Font("Arial", Font.BOLD, 15));
        resC.setForeground(Color.RED);

       caixaA.getDocument().addDocumentListener(new DocumentListener() {
           private void atualizar() {
           String textoA = caixaA.getText();
           resA.setText(textoA);
           }
           public void insertUpdate(DocumentEvent e) { atualizar();}
           public void removeUpdate(DocumentEvent e) { atualizar();}
           public void changedUpdate(DocumentEvent e) { atualizar();}
       });

       caixaB.getDocument().addDocumentListener(new DocumentListener(){
           private void atualizar(){
               String textoB = caixaB.getText();
               resB.setText(textoB);
           }
           public void insertUpdate(DocumentEvent e) { atualizar();}
           public void removeUpdate(DocumentEvent e) { atualizar();}
           public void changedUpdate(DocumentEvent e) { atualizar();}
       });

        caixaC.getDocument().addDocumentListener(new DocumentListener(){
            private void atualizar(){
                String textoC = caixaC.getText();
                resC.setText(textoC);
            }
            public void insertUpdate(DocumentEvent e) { atualizar();}
            public void removeUpdate(DocumentEvent e) { atualizar();}
            public void changedUpdate(DocumentEvent e) { atualizar();}
        });

        JButton botao = new JButton("Calcular ▲");
        botao.setBounds(60, 120, 100, 30);

        JLabel labelResultado1 = new JLabel("");
        labelResultado1.setBounds(10, 170, 150, 30);
        labelResultado1.setFont(new Font("Arial", Font.BOLD, 17));

        JLabel labelResultado2 = new JLabel("");
        labelResultado2.setBounds(10, 200, 350,30);
        labelResultado2.setFont(new Font("Arial", Font.BOLD, 17));

        botao.addActionListener(e -> {
            int numeroA = Integer.parseInt(caixaA.getText());
            int numeroB = Integer.parseInt(caixaB.getText());
            int numeroC = Integer.parseInt(caixaC.getText());
            float resultado = (float) (Math.pow(numeroB, 2) - 4 + numeroA * numeroC);

            labelResultado1.setText("<html> ▲ = <span style = 'color:blue;'>" + resultado + "</span></html>");
            if (resultado >= 0) {
                labelResultado2.setText("<html> Tipo = <span style = 'color:blue'>" + " Existem raízes Reais </span></html>");
            }else if (resultado < 0){
                labelResultado2.setText("<html> Tipo = <span style = 'color:blue'>" + "Não existem raízes Reais </span></html>");
            }
        });

        janela.add(caixaA);
        janela.add(texto1);
        janela.add(caixaB);
        janela.add(texto2);
        janela.add(caixaC);
        janela.add(texto3);
        janela.add(triangulo);
        janela.add(resB);
        janela.add(texto4);
        janela.add(resA);
        janela.add(ponto);
        janela.add(resC);
        janela.add(botao);
        janela.add(labelResultado1);
        janela.add(labelResultado2);
        janela.setVisible(true);
    }
}