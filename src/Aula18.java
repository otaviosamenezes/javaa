import java.util.Scanner;
public class Aula18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota:");
        float n2 = teclado.nextFloat();
        float r = (n1 + n2) /2;
        System.out.println("Sua média foi " + r);
        if (r > 9) {
            System.out.print("Parabéns pelo seu desenpenho!");
        }else {
            System.out.print("Estuda mas vagabundo!");
        }
    }
}