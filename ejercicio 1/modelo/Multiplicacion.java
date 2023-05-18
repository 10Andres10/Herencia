package modelo;

public class Multiplicacion extends Operación {

    public Multiplicacion (double x, double y){
        super(x, y);
    }

    public void multiplicar(){
        
        resultado = x * y;
        
    }

}
