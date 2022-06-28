/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set.///
En el main se creará el objeto y se 
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:///
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor///
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.///
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.///
 */
package poo.ejercicio.pkg9.matematica;

import java.util.Scanner;
import poo.ejercicio.pkg9.matematica.entidades.Matematica;

public class POOEjercicio9Matematica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica nums = new Matematica();
        
        nums.setNum1(Math.random() * 10);
        nums.setNum2(Math.random() * 10);
        
        nums.devolverMayor(nums);
        nums.calcularPotencia(nums);
        nums.cacluclarRaiz(nums);
    }

}
