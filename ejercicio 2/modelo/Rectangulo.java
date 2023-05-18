package modelo;

public class Rectangulo extends Figura {
    
    // Atributos
    public double base, altura;

    // Constructor
    public Rectangulo( double base, double altura ){

        this.base = base;
        this.altura = altura;

    }

    // Métodos

    public void calcularArea(double base, double altura){

        area = base * altura;

    }

    public void calcularPerimetro (double base, double altura){

        perimetro = 2 * ( base + altura );

    }  

}
