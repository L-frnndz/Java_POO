package poo.ejercicio.pkg2.circunferencia.Servicio;

import java.util.Scanner;
import poo.ejercicio.pkg2.circunferencia.Entidades.Circunferencia;

public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");

        Circunferencia r1 = new Circunferencia();
        r1.setRadio(leer.nextDouble());
        return r1;
    }
    public void area(Circunferencia r1){
        Double Area;
        Area = (Double) (3.14*r1.getRadio()*2*2);
        System.out.println("El area de la circunferencia es: " +Area);
    }
    public void perimetro(Circunferencia r1){
        Double perime;
        perime = (Double) (2*3.14*r1.getRadio());
        System.out.println("El perimetro es: " +perime);
    }
}
