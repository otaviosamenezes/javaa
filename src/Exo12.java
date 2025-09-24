import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Exo12 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Tipos de Triângulo");
        janela.setSize(750, 600);;
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        ImageIcon icone = new ImageIcon("src/trianguloo.png");
        JLabel imagem = new JLabel(icone);
        imagem.setBounds(370, 50, 350, 240);

        JLabel textoA = new JLabel("Segmento a");
        textoA.setBounds(20, 50, 100, 30);
        textoA.setFont(new Font("arial", Font.BOLD, 14));

        JSlider sliderA = new JSlider(0, 20, 5);
        sliderA.setBounds(109, 50, 200, 30);

        JLabel labelA = new JLabel("" + sliderA.getValue());
        labelA.setBounds(320, 50, 100, 30);
        labelA.setFont(new Font("arial", Font.BOLD, 14));

        JLabel textoB = new JLabel("Segmento b");
        textoB.setBounds(20, 85, 100, 30);
        textoB.setFont(new Font("arial", Font.BOLD, 14));

        JSlider sliderB = new JSlider(0, 20, 5);
        sliderB.setBounds(109, 85, 200, 30);

        JLabel labelB = new JLabel("" + sliderB.getValue());
        labelB.setBounds(320, 85, 100, 30);
        labelB.setFont(new Font("arial", Font.BOLD, 14));

        JLabel textoC = new JLabel("Segmento c");
        textoC.setBounds(20, 125, 100, 30);
        textoC.setFont(new Font("arial", Font.BOLD, 14));

        JSlider sliderC = new JSlider(0, 20, 5);
        sliderC.setBounds(109, 125, 200, 30);

        JLabel labelC = new JLabel("" + sliderC.getValue());
        labelC.setBounds(320, 125, 100, 30);
        labelC.setFont(new Font("arial", Font.BOLD, 14));

        sliderA.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                labelA.setText("" + sliderA.getValue());
            }
        });

        sliderB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                labelB.setText("" + sliderB.getValue());
            }
        });

        sliderC.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                labelC.setText("" + sliderC.getValue());
            }
        });

        JButton botao = new JButton("Verificar");
        botao.setBounds(50, 210, 100, 50);
        botao.setFont(new Font("arial", Font.BOLD, 14));

        JLabel labelRes = new JLabel("");
        labelRes.setBounds(100, 340, 360, 30);
        labelRes.setFont(new Font("arial", Font.BOLD, 26));
        labelRes.setForeground(Color.BLUE);

        JLabel labelRes2 = new JLabel("");
        labelRes2.setBounds(150, 380, 300, 30);
        labelRes2.setFont(new Font("arial", Font.BOLD, 26));
        labelRes2.setForeground(Color.RED);

        botao.addActionListener(e -> {
            int numeroA = Integer.parseInt(labelA.getText());
            int numeroB =  Integer.parseInt(labelB.getText());
            int numeroC =  Integer.parseInt(labelC.getText());

               if (numeroA == 0 || numeroB == 0 || numeroC == 0 || numeroA >= numeroB + numeroC || numeroB >= numeroA + numeroC ||  numeroC >= numeroA + numeroB) {
                labelRes.setText("Não forma um Triângulo");
                labelRes2.setText("-----");
            }
            else if(numeroA == numeroB && numeroC == numeroB && numeroC == numeroA) {
                labelRes.setText("Forma um Triângulo");
                labelRes2.setText("Equilátero");
            }
            else if ((numeroA == numeroB && numeroC != numeroA ) || (numeroB == numeroC &&  numeroA != numeroB) || (numeroA == numeroC && numeroB != numeroA)){
                labelRes.setText("Forma um Triângulo");
                labelRes2.setText("Isósceles");
            }
            else if (numeroA != numeroB && numeroC != numeroB && numeroC != numeroA) {
                labelRes.setText("Forma um Triângulo");
                labelRes2.setText("Escaleno");
            }
        });



        janela.add(labelA);
        janela.add(labelB);
        janela.add(labelC);
        janela.add(imagem);
        janela.add(botao);
        janela.add(textoA);
        janela.add(textoB);
        janela.add(textoC);
        janela.add(sliderA);
        janela.add(sliderB);
        janela.add(sliderC);
        janela.add(labelRes);
        janela.add(labelRes2);
        janela.setVisible(true);

    }
}