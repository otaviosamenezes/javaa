// Para usar entrada tem importa "util.Scanner" para ter a entrada.
import java.util.Scanner;
public class Aula6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // usar (System.in)  para a entrada e o (System.out)  para saida.
        System.out.print("Digite nome do aluno :");
        String nome = teclado.nextLine();
        System.out.print("Digite nota do aluno :");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f ", nome, nota); // Pode usar o "format" no lugar de "printf".
    }
}