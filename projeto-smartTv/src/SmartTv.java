import javax.xml.validation.ValidatorHandler;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void volumeUp(){
        volume ++;
    }

    public void volumeDown(){
        volume --;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
