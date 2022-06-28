package poo.ejercicio.pkg12.persona.servicio;

import java.util.Date;
import java.util.Scanner;
import poo.ejercicio.pkg12.persona.entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingrese fecha de nacimiento (anio, mes, dia)");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        anio = anio - 1900;

        Date fechaNacimiento = new Date();
        fechaNacimiento.setYear(anio);
        fechaNacimiento.setMonth(mes);
        fechaNacimiento.setDate(dia);
        p1.setFechaDeNacimiento(fechaNacimiento);
        return p1;
    }

    public int calcularEdad(Persona p1) {
        Date FechaActual = new Date();
        int edad = 0;

        for (int i = p1.getFechaDeNacimiento().getYear(); i < FechaActual.getYear(); i++) {
            edad++;
        }
        return edad;
    }

    public void menorQue(Persona p1, int edad) {
        Date FechaActual = new Date();
        for (int i = p1.getFechaDeNacimiento().getYear(); i < FechaActual.getYear(); i++) {
            edad++;
        }

        int edadMayor = 18;
        boolean Mayor = true;

        if (edad < edadMayor) {
            Mayor = false;
        } else if (edad > edadMayor) {
            Mayor = true;
        }

        System.out.println(Mayor);
    }

    public void mostrarPersona(Persona p1) {
        Date FechaActual = new Date();
        int edad = 0;
        for (int i = p1.getFechaDeNacimiento().getYear(); i < FechaActual.getYear(); i++) {
            edad++;
        }
        System.out.println("Nombre " + p1.getNombre());
        System.out.println("Apellido " + p1.getApellido());
        System.out.println("Fecha de nacimiento " + p1.getFechaDeNacimiento());
        System.out.println("Edad " +edad);
    }
}
