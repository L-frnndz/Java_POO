package poo.ejercicio.pkg8.frase.Entidades;

import java.util.Scanner;

public class Cadena {

    private String Frase;
    private int Longitud;

    public Cadena() {
    }

    public Cadena(String Frase, int Longitud) {
        this.Frase = Frase;
        this.Longitud = Longitud;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    //--------------------------METODOS------------------------------//
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena frase) {

        int contador = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i) == 'a' || frase.getFrase().charAt(i) == 'A'
                    || frase.getFrase().charAt(i) == 'e' || frase.getFrase().charAt(i) == 'E'
                    || frase.getFrase().charAt(i) == 'i' || frase.getFrase().charAt(i) == 'I'
                    || frase.getFrase().charAt(i) == 'o' || frase.getFrase().charAt(i) == 'O'
                    || frase.getFrase().charAt(i) == 'u' || frase.getFrase().charAt(i) == 'U') {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase(Cadena frase) {
        char[] invertir = frase.getFrase().toCharArray();
        int cont;
        for (cont = frase.getLongitud() - 1; cont >= 0; cont--) {
            System.out.print(" " + invertir[cont]);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena frase) {
        int pos = 0;
        int cont = 0;
        String caracter;
        System.out.println("Ingrese un caracter a buscar");
        caracter = leer.next();
        pos = frase.getFrase().indexOf(caracter);

        while (pos != -1) {

            cont++;
            pos = frase.getFrase().indexOf(caracter, pos + 1);
        }
        System.out.println("La letra ;" + caracter + "; se repite " + cont + " veces");
    }

    public void compararLongitud(Cadena frase) {

        System.out.println("Ingrese una frase nueva");
        String frase2 = leer.next();
        System.out.println("La longitud de la primer frase es de: " + frase.getLongitud());
        System.out.println("La longitud de la segunda frase es de: " + frase2.length());
    }

    public void unirFrases(Cadena frase) {
        System.out.println("Ingrese una nueva frase para concatenarla a la primera frase");
        String frase3 = leer.next();
        String fraseconcat = frase.getFrase().concat(frase3);
        System.out.println(fraseconcat);
    }

    public void reemplazar(Cadena frase) {
        char[] caract;
        String caract1;
        System.out.println("Ingrese el caracter con el que desea reemplazar la letra 'a'");
        caract1 = leer.next();
        caract = caract1.toCharArray();
        System.out.println(frase.getFrase().replace('a', caract[0]));
    }

    public void contiene(Cadena frase) {
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase");
        System.out.println("Si aparece 'true' la letra se encuentra en la frase. Si aparece 'false' la letra no se encuentra");
        String letra;
        boolean comprobar = true;
        letra = leer.next();

        char[] caract;
        caract = letra.toCharArray();

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i) == caract[0]) {
                comprobar = true;
                break;
            } else {
                comprobar = false;
            }
        }
        System.out.println(comprobar);
    }
}
