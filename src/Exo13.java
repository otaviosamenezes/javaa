public class Exo13 {
    public static void main(String[] args) {
        int n = 1; // começa no 1
        while (n <= 12) {  // vai até 12
            long fatorial = 1;
            int i = 1;

            while (i <= n) {   // calcula o fatorial de n
                fatorial *= i;
                i++;
            }

            System.out.println(n + "! = " + fatorial);
            n++; // passa para o próximo número
        }
    }
}
