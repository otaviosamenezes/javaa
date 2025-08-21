import javax.swing.*;
import java.awt.*;
import java.util.Locale;
public class Exo6 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Idioma");
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        ImageIcon icone = new ImageIcon("src/imagem.jpg");
        JLabel labelImagem = new JLabel(icone);
        labelImagem.setBounds(0, 0, 400, 300);

        JButton botao = new JButton("Clicar aqui");
        int btnLargura = 120;
        int btnAltura = 30;

        int btnX = (labelImagem.getWidth() - btnLargura) /2;
        int btnY = (labelImagem.getHeight() - btnAltura) /2;
        botao.setBounds(btnX, btnY, btnLargura, btnAltura);

        JLabel labelTexto = new JLabel("", JLabel.CENTER);
        labelTexto.setBounds(0, 165, 400, 30);

        botao.addActionListener(e -> {
            Locale local = Locale.getDefault();
            String idioma = local.getLanguage();
            String pais = local.getDisplayCountry();

            labelTexto.setText("Idioma: " + idioma + " /  Pais : " + pais);
        });
        janela.add(labelTexto);
        janela.add(botao);
        janela.add(labelImagem);

        janela.setVisible(true);
    }
}