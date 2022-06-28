/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio.///
Se le pedirán al usuario para poner el constructor del objeto Date.///
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años
hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto 
Date con constructor vacío.///

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo.ejercicio.pkg11.date;

import java.util.Date;
import java.util.Scanner;

public class POOEjercicio11Date {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int anio, mes, dia;

        System.out.println("Ingrese anio");
        anio = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese dia");
        dia = leer.nextInt();

        anio = anio - 1900;
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        int resta = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("La fecha ingeresada es " + fecha);
        System.out.println("La fecha actual es " + fechaActual);
        System.out.println("Los años que hay entre estas fechas son " +resta);
    }

}
