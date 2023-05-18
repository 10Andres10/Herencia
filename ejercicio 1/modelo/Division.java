package modelo;

public class Division extends Operación {

    public Division (double x, double y){
        super(x, y);
    }

    public void dividir(){
        
        resultado = x / y;
        
    }

}
