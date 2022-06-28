/*
Crear una clase llamada libro que contenga los siguientes atributos: ISBN, Titulo,
Autor,Numero de paginas. Y un constructor con todos los atributos pasados por parametro
a un constructor vacio.
Hacer un metodo para cargar un libro pidiendo los datos al usuario y luego informar
mediante otro metodo el numero de ISBN, titulo, autor y numero de paginas.
 */
package poo.ejercicio1.libro;

import poo.ejercicio1.libro.Entidades.Libro;
import poo.ejercicio1.libro.Servicios.LibroServicios;

public class POOEjercicio1Libro {

    public static void main(String[] args) {
        
        LibroServicios ls = new LibroServicios();
        Libro l1 = ls.pedirLibro();
        ls.MostrarLibro(l1);
    }

}
