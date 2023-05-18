package modelo;

public class Operación {
    
    // Atributos
    protected double x, y, resultado;

    // Constructor
    public Operación(double x, double y){

        this.x = x;
        this.y = y;
        this.resultado = 0;

    }

    // Métodos
    public double mostrarResultado(){

        return this.resultado;

    }

}
