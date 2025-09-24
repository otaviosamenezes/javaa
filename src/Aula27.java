import java.util.Scanner;
public class Aula27 {
    public static void main(String[] args) {
        Scanner lele = new Scanner(System.in);
        int  n, s = 0;
        String resp;
        do {
            System.out.print("Digite um numero:");
            n = lele.nextInt();
            s = s + n;
            System.out.print("Quer continuar? [S/N]");
            resp = lele.next();
        }while(resp.equals("S"));
        System.out.println("A soma todos os valores é " + s);

    }
}