package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test{
    public static void main(String[] args) {

            

        double diametroCirculo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el díametro: ", "Círculo",JOptionPane.QUESTION_MESSAGE));
        Circulo circulo = new Circulo(diametroCirculo);
        circulo.calcularPerimetro(diametroCirculo);

        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la base: ", "Rectángulo",JOptionPane.QUESTION_MESSAGE));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la altura: ", "Rectángulo",JOptionPane.QUESTION_MESSAGE));
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.calcularArea(base, altura);
        rectangulo.calcularPerimetro(base, altura);

        System.out.println("------------------------------------------");

        System.out.println("Área y Perímetro del Círculo");
        
        System.out.println("El área es: " + circulo.getArea());
        System.out.println("El perímetro es: " + circulo.mostrarPerimetro());

        System.out.println("------------------------------------------");
        
        System.out.println("Área y Perímetro del Rectángulo");
        System.out.println("El área es: " + rectangulo.mostrarArea());
        System.out.println("El perímetro es: " + rectangulo.mostrarPerimetro());
        System.out.println("------------------------------------------");

    }
}