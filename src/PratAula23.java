public class PratAula23 {
    public static void main(String[] args) {
        // Usando o (While) estrutura repetição, usada para fazer teste lógico antes.
        int cc = 0;
        while(cc <= 4) {   //  (0<=4  sim )    (1<=4 sim)      (2<=4 sim)    (3<=4 sim)     (4<=4 sim)   (5<=4 não)    etc...
            System.out.println("Cambalhota " + cc);
            cc = cc + 1;  //     (cc=0+1=1)   (cc=1+1=2)      (cc=2+1=3)    (cc=3+1=4)  (cc=4+1=5)...
            // FIM...
        }
    }
}