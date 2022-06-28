package poo.ejercicio1.libro.Servicios;

import java.util.Scanner;
import poo.ejercicio1.libro.Entidades.Libro;

public class LibroServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro pedirLibro() {

        Libro l1 = new Libro();

        System.out.println("Ingrese el numero de ISBN:");
        l1.setISBN(leer.nextInt());

        System.out.println("Ingrese el titulo del libro:");
        l1.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del autor:");
        l1.setAutor(leer.next());

        System.out.println("Ingrese el numero de paginas:");
        l1.setNumerodepaginas(leer.nextInt());

        return l1;
    }

    public void MostrarLibro(Libro l1) {

        System.out.println("El numero de ISBN es: " + l1.getISBN());
        System.out.println("El titulo del libro es: " + l1.getTitulo());
        System.out.println("El nombre del autor es: " + l1.getAutor());
        System.out.println("El numero de paginas del libro es: " + l1.getNumerodepaginas());
    }
}
