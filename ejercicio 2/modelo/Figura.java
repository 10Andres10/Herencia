package modelo;

public class Figura {

    // Atributos
    protected double area, perimetro;

    public Figura (){

        this.area = 0;
        this.perimetro = 0;

    }

    // Métodos
    public double getArea(){
        return area;
    }

    public double mostrarArea(){

        return this.area;

    }

    public double mostrarPerimetro(){

        return this.perimetro;

    }
    
}
