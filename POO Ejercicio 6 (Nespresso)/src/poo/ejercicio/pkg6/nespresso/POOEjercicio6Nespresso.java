/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío///
• Constructor con la capacidad máxima y la cantidad actual///
• Métodos getters y setters.///
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.///
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.///
• Método vaciarCafetera(): pone la cantidad de café actual en cero.///
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.///
 */
package poo.ejercicio.pkg6.nespresso;

import java.util.Scanner;
import poo.ejercicio.pkg6.nespresso.Entidades.Cafetera;
import poo.ejercicio.pkg6.nespresso.Servicio.NespressoServicio;

public class POOEjercicio6Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        NespressoServicio ns = new NespressoServicio();
        Cafetera caf = ns.crearCafetera();

        int opcion;
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar cafe (cafetera)");
        System.out.println("5. Salir");
        opcion = leer.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    ns.llenarCafetera(caf);
                    break;
                case 2:
                    ns.servirTaza(caf);
                    break;
                case 3:
                    ns.vaciarCafeetera(caf);
                    break;
                case 4:
                    ns.agregarCafe(caf);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    System.out.println("Ingrese nuevamente");
            }
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe (cafetera)");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
        }
        System.out.println("¡Gracias por utilizar el programa!");
    }

}
