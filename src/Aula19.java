import java.util.Scanner;
import java.time.LocalDate;
public class Aula19 {
    public static void main(String[] args) {
        int anoAtual = LocalDate.now().getYear();
        Scanner res = new Scanner(System.in);
        System.out.print("Ano que você nasceu:");
        int n1 = res.nextInt();
        int resultado = anoAtual - n1;
        System.out.println("Você tem " + resultado + " anos");
        if (resultado >= 18) {
            System.out.println("MAIOR DE IDADE!");
        }else {
            System.out.println("MENOR DE IDADE!");
        }
    }
}