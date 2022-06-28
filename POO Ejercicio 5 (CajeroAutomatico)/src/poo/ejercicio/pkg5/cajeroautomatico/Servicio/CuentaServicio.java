package poo.ejercicio.pkg5.cajeroautomatico.Servicio;

import java.util.Scanner;
import poo.ejercicio.pkg5.cajeroautomatico.Entidades.Cuenta;

public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta c1 = new Cuenta();

        System.out.println("Ingrese sus datos:");
        System.out.println("DNI");
        c1.setDNI(leer.nextLong());
        System.out.println("Numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Saldo");
        c1.setSaldoactual(leer.nextInt());
        return c1;
    }

    public void ingresar(Cuenta c1) {

        Double ingresar;
        int suma;

        System.out.println("Ingrese cantidad de dinero a ingresar a la cuenta");
        ingresar = leer.nextDouble();
        suma = (int) (c1.getSaldoactual() + ingresar);
        c1.setSaldoactual(suma);
        System.out.println("Se ha ingresado con exito!");
    }

    public void retirar(Cuenta c1) {

        Double retirar;
        int resta;

        System.out.println("Ingrese la cantidad de dinero a retirar");
        retirar = leer.nextDouble();
        resta = (int) (c1.getSaldoactual() - retirar);
        c1.setSaldoactual(resta);
        System.out.println("Se ha retirado con exito!");

        if (c1.getSaldoactual() < retirar) {
            c1.setSaldoactual(0);
        }
    }

    public void extraccionRapida(Cuenta c1) {

        Double extraccion_rapida;
        int maximo, resta;

        resta = c1.getSaldoactual() * 20 / 100;
        maximo = c1.getSaldoactual() * 20 / 100;

        System.out.println("Solo se le permitira retirar el 20% de su saldo");
        extraccion_rapida = leer.nextDouble();

        while (extraccion_rapida > maximo) {
            System.out.println("ERROR");
            System.out.println("Solo puede retirar como maximo el 20% de su saldo");
            System.out.println("Ingrese nuevamente una cantidad a retirar");
            extraccion_rapida = leer.nextDouble();
        }
        c1.setSaldoactual(resta);
        System.out.println("Se ha retirado con exito!");
    }

    public void consultarSaldo(Cuenta c1) {

        System.out.println("El saldo actual de la cuenta es: " + c1.getSaldoactual());
    }

    public void consultarDatos(Cuenta c1) {

        System.out.println("Numero de Cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI del cliente: " + c1.getDNI());
        System.out.println("Saldo actual: " + c1.getSaldoactual());
    }
}
