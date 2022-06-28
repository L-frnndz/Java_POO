/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.///
• Agregar los métodos getters y setters correspondientes///
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.///
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.///
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.///
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.///
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.///
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.///
 */
package poo.ejercicio.pkg5.cajeroautomatico;

import java.util.Scanner;
import poo.ejercicio.pkg5.cajeroautomatico.Entidades.Cuenta;
import poo.ejercicio.pkg5.cajeroautomatico.Servicio.CuentaServicio;

public class POOEjercicio5CajeroAutomatico {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();

        int opcion;

        System.out.println("Ingrese una opcion");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extraccion rapida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Datos");
        System.out.println("6. Salir");

        opcion = leer.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    cs.ingresar(c1);
                    break;

                case 2:
                    cs.retirar(c1);
                    break;

                case 3:
                    cs.extraccionRapida(c1);
                    break;

                case 4:
                    cs.consultarSaldo(c1);
                    break;

                case 5:
                    cs.consultarDatos(c1);
                    break;

                default:
                    System.out.println("El numero ingresado no es valido");
                    break;
            }
            System.out.println("Ingrese una opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
        }
        if(opcion == 6){
            System.out.println("Gracias por utilizar nuetro servicio.");
        }
    }

}
