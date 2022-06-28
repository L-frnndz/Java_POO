package poo.ejercicio.pkg10.arreglo.servicio;

import java.util.Arrays;

public class ArregloServicio {

    Double arregloA[] = new Double[50];
    Double arregloB[] = new Double[20];

    public void inicializarArregloA() {
        for (int i = 0; i < 50; i++) {

            arregloA[i] = (Double) (Math.random() * 100);
        }
    }

    public void mostrarArreglo() {
        for (int i = 0; i < 50; i++) {
            System.out.println(+i + "[" + arregloA[i] + "]");

        }
        System.out.print(" ");
    }

    public void metodoBurbuja() {
        Arrays.sort(arregloA);
    }

    public void arregloB() {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
    }

    public void arregloB2() {
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
    }

    public void mostrarArregloAOrdenado() {
        System.out.println("ArregloA");
        for (int i = 0; i < 50; i++) {
            System.out.println(+i + "[" + arregloA[i] + "]");

        }
        System.out.print(" ");
    }

    public void mostrarArregloB() {
        System.out.println("ArregloB");
        for (int i = 0; i < 19; i++) {
            System.out.println(+i + "[" + arregloB[i] + "]");
        }
        System.out.println(" ");
    }
}
