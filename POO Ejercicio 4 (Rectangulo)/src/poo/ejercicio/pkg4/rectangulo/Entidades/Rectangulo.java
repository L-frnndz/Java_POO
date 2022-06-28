package poo.ejercicio.pkg4.rectangulo.Entidades;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    //Constructores, getters y setters
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Metodos
    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rect = new Rectangulo();

        System.out.println("Ingrese la altura y la base del rectangulo");
        rect.setAltura(leer.nextInt());
        rect.setBase(leer.nextInt());

        return rect;
    }

    public void calcularSuperficie(Rectangulo rect) {
        int superficie;
        superficie = rect.getBase() * rect.getAltura();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void calcularPerimetro(Rectangulo rect) {
        int perimetro;
        perimetro = (rect.getBase() + rect.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rect) {
        int i, j;
        for (i = 1; i <= rect.getAltura(); i++) {
            for (j = 1; j <= rect.getBase(); j++) {

                if (i > 1 && i < rect.getAltura() && j > 1 && j < rect.getBase()) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println(" ");
        }
    }
}
