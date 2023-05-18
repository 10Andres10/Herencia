package ejecutable;

import javax.swing.JOptionPane;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;

public class Test{

    public static void main(String[] args) {

        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa x: ", "x",JOptionPane.QUESTION_MESSAGE));

        double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa y: ", "x",JOptionPane.QUESTION_MESSAGE));

        System.out.println("------------------------------------------");

        Suma suma = new Suma (x, y);
        suma.sumar();
        System.out.println(" La suma de " + x + " y " + y + " es: " + suma.mostrarResultado());

        Resta resta = new Resta(x, y);
        resta.restar();
        System.out.println(" La resta de " + x + " y " + y + " es: " + resta.mostrarResultado());

        Multiplicacion multiplicacion = new Multiplicacion(x, y);
        multiplicacion.multiplicar();
        System.out.println(" La multiplicación de " + x + " y " + y + " es: " + multiplicacion.mostrarResultado());

        Division division = new Division(x, y);
        division.dividir();
        System.out.println(" La división de " + x + " y " + y + " es: " + division.mostrarResultado());


        System.out.println("------------------------------------------");

    }

}