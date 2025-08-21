import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Exo4 {
    public static void main(String[] args){
        JFrame janela = new JFrame("Janela com Data/Hora");
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

       ImageIcon icone = new ImageIcon("src/imagem.jpg");
       JLabel labelImagem = new JLabel(icone);
       labelImagem.setBounds(0, 0, 400, 300);

       JButton botao = new JButton("Clicar aqui");
       int btnLargura = 120;
       int btnAltura = 30;
       int btnX = (labelImagem.getWidth() - btnLargura ) / 2;
       int btnY = (labelImagem.getHeight() - btnAltura) / 2;
       botao.setBounds(btnX, btnY, btnLargura, btnAltura);

       JLabel labelTexto = new JLabel(" ", JLabel.CENTER);
       labelTexto.setBounds(0, 160, 400, 30);

       botao.addActionListener(e -> {
           LocalDateTime agora = LocalDateTime.now();
           DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
           labelTexto.setText("Data/Hora:" + agora.format(ftm));
       });
        janela.add(labelTexto);
       janela.add(botao);
        janela.add(labelImagem);

       janela.setVisible(true);
    }
}