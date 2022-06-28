/*
Declarar una clase llamada Circunferencia que tenga como atributo privado
el radio de tipo real.

Metodos: 
a)Metodo constructor que inicialice el radio pasado como parametro.///
b)Metodos get y set para el atributo radio de la calse Circunferencia.///
c)Metodo para crearCircunferencia(): que pide el radio y lo guarda en el
atributo del objeto.///
d)Metodo area():para calcular el area de la circunferencia(Area=pi*radio2).///
e)Metodo perimetro():para calcular el perimetro(Perimetro=2*pi*radio).///
 */
package poo.ejercicio.pkg2.circunferencia;

import poo.ejercicio.pkg2.circunferencia.Entidades.Circunferencia;
import poo.ejercicio.pkg2.circunferencia.Servicio.CircunferenciaServicio;

public class POOEjercicio2Circunferencia {

    public static void main(String[] args) {
        
      CircunferenciaServicio cs = new CircunferenciaServicio();
      Circunferencia r1 = cs.crearCircunferencia();
      cs.area(r1);
      cs.perimetro(r1);
    }
    
}
