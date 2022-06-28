/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.///
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla.///
Luego, el arreglo A se debe ordenar de menor a mayor///
Copiar los primeros 10 números ordenados al arreglo B de 20 elementos. ///
Rellenar los 10 últimos elementos con el valor 0.5. 
Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package poo.ejercicio.pkg10.arreglo;

import poo.ejercicio.pkg10.arreglo.servicio.ArregloServicio;

public class POOEjercicio10Arreglo {

    public static void main(String[] args) {

        ArregloServicio as = new ArregloServicio();
        as.inicializarArregloA();
        as.mostrarArreglo();
        as.metodoBurbuja();
        as.mostrarArregloAOrdenado();
        as.arregloB();
        as.arregloB2();
        as.mostrarArregloB();
    }

}
