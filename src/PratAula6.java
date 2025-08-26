import java.util.Scanner;
public class PratAula6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome do aluno :");
        String nome = leitor.nextLine();
        System.out.print("Nota do aluno :");
        float nota = leitor.nextFloat();
        System.out.print("Nota de " + nome + " é " + nota);         // * Simples *
        //System.out.printf("A nota de %s é %.1f", nome, nota);   // * Formatada *
    }
}