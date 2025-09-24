import java.util.Scanner;
public class Aula20 {
    public static void main(String[] args) {
        Scanner ale = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = ale.nextInt();
        System.out.print("Você digitou " + numero);
        if (numero % 2 == 0) {
            System.out.print("Par");
        }else {
            System.out.println("Impar");
        }
    }
}