public class Aula26 {
    public static void main(String[] args) {
        int cc = 0;
        do {
            System.out.println("Cambalhota " + cc);       //  ( 0 ) ( 1 ) ( 2 ) ( 3 ) ( 4 )
            cc = cc + 1;                                                   // (cc=0+1=1)   (cc=1+1=2)   (c=2+1=3)   (c=3+1=4) (c=4+1=5)
        }while(cc <= 4);                                                //  (1 <= 4 sim)  (2 <= 4 sim) (3 <= 4 sim) (4 <= 4 sim) (5 <= 4 não) EMCERROU...
    }
}