public class MyClass{


    public static void main (String [] args) {

        String meuNome = "Gabriel Vieira";
        String classe = "Full-Stack";
        
        String meuDev = nomeDev(meuNome, classe);
        
        System.out.println(meuDev);
        
    }

    public static String nomeDev (String meuNome, String classe){
        return "Nome: " + meuNome.concat(" Classe: ").concat(classe);
    }

}
