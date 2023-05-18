package modelo;

import java.lang.Math;

public class Circulo extends Figura {

    // Atributos
    public double diametro;

    // Constructor
    public Circulo (double diametro){

        this.diametro = diametro;
    
    }

    // Métodos
    public void calcularArea(double diametro){

        double radio = diametro / 2;                
        // Área círculo = pi por radio al cuadrado.
        // A = π * r²
        area = Math.PI * Math.pow(radio, 2);      

    }

    public void calcularPerimetro(double diametro){

        // Perímetro círculo = “pi” por diámetro.
        perimetro = Math.PI * diametro ;

    }     
    
}
