public class Condic {

    public static void main(String[] args) {
        
        int a, b;

        a = 11;
        b = 11;

        String status = " ";

        if (a==b) {
            status = "igual";
        }

        else
            status = "diferente";

        System.out.println(status);
        
        int c, d;

        c = 15;
        d = 1;

        String resultado = c==d ? "igual" : "diferente";

        System.out.println(resultado);
    }
    
}
