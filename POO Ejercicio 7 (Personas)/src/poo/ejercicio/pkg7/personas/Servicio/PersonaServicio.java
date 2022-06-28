package poo.ejercicio.pkg7.personas.Servicio;

import java.util.Scanner;
import poo.ejercicio.pkg7.personas.Entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Persona p3 = new Persona();
    Persona p4 = new Persona();
    
    
    //Crear Personas
    public Persona crearPersona1() {

        System.out.println("Ingrese los datos:");
        System.out.println("Nombre");
        p1.setNombre(leer.next());

        System.out.println("Edad");
        p1.setEdad(leer.nextInt());

        System.out.println("Sexo");
        p1.setSexo(leer.next());

        while (!"H".equals(p1.getSexo()) && !"M".equals(p1.getSexo()) && !"O".equals(p1.getSexo())) {
            System.out.println("El caracter introducido no es valido. "
                    + "Por favor ingrese nuevamente.");
            p1.setSexo(leer.next());
        }

        System.out.println("Peso");
        p1.setPeso(leer.nextDouble());

        System.out.println("Altura");
        p1.setAltura(leer.nextDouble());

        return p1;
    }

    public Persona crearPersona2() {

        System.out.println("Ingrese los datos:");
        System.out.println("Nombre");
        p2.setNombre(leer.next());

        System.out.println("Edad");
        p2.setEdad(leer.nextInt());

        System.out.println("Sexo");
        p2.setSexo(leer.next());

        while (!"H".equals(p2.getSexo()) && !"M".equals(p2.getSexo()) && !"O".equals(p2.getSexo())) {
            System.out.println("El caracter introducido no es valido. "
                    + "Por favor ingrese nuevamente.");
            p2.setSexo(leer.next());
        }

        System.out.println("Peso");
        p2.setPeso(leer.nextDouble());

        System.out.println("Altura");
        p2.setAltura(leer.nextDouble());

        return p2;
    }

    public Persona crearPersona3() {

        System.out.println("Ingrese los datos:");
        System.out.println("Nombre");
        p3.setNombre(leer.next());

        System.out.println("Edad");
        p3.setEdad(leer.nextInt());

        System.out.println("Sexo");
        p3.setSexo(leer.next());

        while (!"H".equals(p3.getSexo()) && !"M".equals(p3.getSexo()) && !"O".equals(p3.getSexo())) {
            System.out.println("El caracter introducido no es valido. "
                    + "Por favor ingrese nuevamente.");
            p3.setSexo(leer.next());
        }

        System.out.println("Peso");
        p3.setPeso(leer.nextDouble());

        System.out.println("Altura");
        p3.setAltura(leer.nextDouble());

        return p3;
    }

    public Persona crearPersona4() {

        System.out.println("Ingrese los datos:");
        System.out.println("Nombre");
        p4.setNombre(leer.next());

        System.out.println("Edad");
        p4.setEdad(leer.nextInt());

        System.out.println("Sexo");
        p4.setSexo(leer.next());

        while (!"H".equals(p4.getSexo()) && !"M".equals(p4.getSexo()) && !"O".equals(p4.getSexo())) {
            System.out.println("El caracter introducido no es valido. "
                    + "Por favor ingrese nuevamente.");
            p4.setSexo(leer.next());
        }

        System.out.println("Peso");
        p4.setPeso(leer.nextDouble());

        System.out.println("Altura");
        p4.setAltura(leer.nextDouble());

        return p4;
    }

    
    //Calcular IMC
    public Double calcularIMC1(Persona p1) {

        Double IMC1, mts2;
        System.out.println("Con los datos ingresados se calculara si la persona "
                + "esta en su peso ideal.");
        System.out.println("En caso de que tenga un peso inferior al ideal se mostrara un -1, si "
                + "esta en su peso ideal se mostrara un 0 y si tiene sobrepeso se mostrara un 1.");
        mts2 = (Double) (p1.getAltura() * p1.getAltura());
        IMC1 = (Double) (p1.getPeso() / mts2);

        if (IMC1 < 20) {
            System.out.println("-1");
        } else if (IMC1 > 20 && IMC1 < 25) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        return IMC1;
    }

    public Double calcularIMC2(Persona p2) {

        Double IMC2, mts2;
        System.out.println("Con los datos ingresados se calculara si la persona "
                + "esta en su peso ideal.");
        System.out.println("En caso de que tenga un peso inferior al ideal se mostrara un -1, si "
                + "esta en su peso ideal se mostrara un 0 y si tiene sobrepeso se mostrara un 1.");
        mts2 = (Double) (p2.getAltura() * p2.getAltura());
        IMC2 = (Double) (p2.getPeso() / mts2);

        if (IMC2 < 20) {
            System.out.println("-1");
        } else if (IMC2 > 20 && IMC2 < 25) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        return IMC2;
    }

    public Double calcularIMC3(Persona p3) {

        Double IMC3, mts2;
        System.out.println("Con los datos ingresados se calculara si la persona "
                + "esta en su peso ideal.");
        System.out.println("En caso de que tenga un peso inferior al ideal se mostrara un -1, si "
                + "esta en su peso ideal se mostrara un 0 y si tiene sobrepeso se mostrara un 1.");
        mts2 = (Double) (p3.getAltura() * p3.getAltura());
        IMC3 = (Double) (p3.getPeso() / mts2);

        if (IMC3 < 20) {
            System.out.println("-1");
        } else if (IMC3 > 20 && IMC3 < 25) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        return IMC3;
    }

    public Double calcularIMC4(Persona p4) {

        Double IMC4, mts2;
        System.out.println("Con los datos ingresados se calculara si la persona "
                + "esta en su peso ideal.");
        System.out.println("En caso de que tenga un peso inferior al ideal se mostrara un -1, si "
                + "esta en su peso ideal se mostrara un 0 y si tiene sobrepeso se mostrara un 1.");
        mts2 = (Double) (p4.getAltura() * p4.getAltura());
        IMC4 = (Double) (p4.getPeso() / mts2);

        if (IMC4 < 20) {
            System.out.println("-1");
        } else if (IMC4 > 20 && IMC4 < 25) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        return IMC4;
    }

    
    //Mayor de Edad
    public void esMayorDeEdad1(Persona p1) {

        System.out.println("Si la persona es mayor de edad aparecera un mensaje diciendo true, "
                + "si no aparecera un mensaje que diga false.");
        boolean MayordeEdad = false;
        if (p1.getEdad() >= 18) {
            MayordeEdad = true;
        } else if (p1.getEdad() < 18) {
            MayordeEdad = false;
        }
        System.out.println(MayordeEdad);
    }

    public void esMayorDeEdad2(Persona p2) {

        System.out.println("Si la persona es mayor de edad aparecera un mensaje diciendo true, "
                + "si no aparecera un mensaje que diga false.");
        boolean MayordeEdad = false;
        if (p2.getEdad() >= 18) {
            MayordeEdad = true;
        } else if (p2.getEdad() < 18) {
            MayordeEdad = false;
        }
        System.out.println(MayordeEdad);
    }

    public void esMayorDeEdad3(Persona p3) {

        System.out.println("Si la persona es mayor de edad aparecera un mensaje diciendo true, "
                + "si no aparecera un mensaje que diga false.");
        boolean MayordeEdad = false;
        if (p3.getEdad() >= 18) {
            MayordeEdad = true;
        } else if (p3.getEdad() < 18) {
            MayordeEdad = false;
        }
        System.out.println(MayordeEdad);
    }

    public void esMayorDeEdad4(Persona p4) {

        System.out.println("Si la persona es mayor de edad aparecera un mensaje diciendo true, "
                + "si no aparecera un mensaje que diga false.");
        boolean MayordeEdad = false;
        if (p4.getEdad() >= 18) {
            MayordeEdad = true;
        } else if (p4.getEdad() < 18) {
            MayordeEdad = false;
        }
        System.out.println(MayordeEdad);
    }
}
