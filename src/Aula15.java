public class Aula15 {
    public static void main(String[] args) {
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo");
        String res;
        res = (n1.equals(n3) )? "igual":"diferente";
        System.out.println(res);
    }
}