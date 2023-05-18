package modelo;

public class Resta extends Operación {

    public Resta (double x, double y){
        super(x, y);
    }

    public void restar(){
        
        resultado = x - y;
        
    }

}
