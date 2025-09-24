import java.util.Scanner;
public class Aula23 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Treipé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo= "aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.print(tipo);

    }
}