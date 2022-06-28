package poo.ejercicio.pkg3.operacion.Servicio;

import java.util.Scanner;
import poo.ejercicio.pkg3.operacion.Entidades.Operacion;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese los numeros");

        Operacion n1 = new Operacion();
        n1.setNumero1(leer.nextInt());
        n1.setNumero2(leer.nextInt());
        return n1;
    }

    public void Sumar(Operacion n1) {

        int suma;
        suma = (int) (n1.getNumero1() + n1.getNumero2());
        System.out.println("La suma es: " + suma);
    }

    public void Restar(Operacion n1) {
        int resta;
        resta = (int) (n1.getNumero1() - n1.getNumero2());
        System.out.println("La resta es: " + resta);
    }

    public void Multiplicar(Operacion n1) {
        int multiplicacion;

        if (n1.getNumero1() == 0 || n1.getNumero2() == 0) {
            System.out.println("0");
            System.out.println("ERROR AL MULTIPLICAR POR 0(CERO)");
        } else {
            multiplicacion = n1.getNumero1() * n1.getNumero2();
            System.out.println("La multiplicacion es: " + multiplicacion);
        }
    }

    public void Dividir(Operacion n1) {
        int division;

        if (n1.getNumero1() == 0 || n1.getNumero2() == 0) {
            System.out.println("0");
            System.out.println("ERROR AL DIVIDIR POR 0(CERO)");
        } else {
            division = n1.getNumero1() / n1.getNumero2();
            System.out.println("La division es: " + division);
        }
    }
}
