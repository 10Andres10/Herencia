package modelo;

public class Circulo extends Figura {

    // Atributos
    public double diametro, radio = diametro / 2;

    // Constructor
    public Circulo (double diametro)
    {

        this.diametro = diametro;

    }

    // Métodos
    public void calcularArea(double radio){

        // Área círculo = pi por radio al cuadrado.
        area = (radio*radio) * Math.PI;

    }

    public void calcularPerimetro(double diametro){

        // Perímetro círculo = “pi” por diámetro.
        perimetro = Math.PI * diametro ;

    }     
    
}
