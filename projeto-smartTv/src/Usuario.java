public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();


        System.out.println("Tv Ligada? " + smartTv.ligada);

        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
    
        smartTv.volumeUp();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.volumeDown();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Calan: " + smartTv.canal);
        

    
    }
    
}
