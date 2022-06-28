package poo.ejercicio.pkg9.matematica.entidades;

public class Matematica {

    private Double num1;
    private Double num2;

    public Matematica() {
    }

    public Matematica(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    //-----------------------METODOS-------------------------//
    public Double devolverMayor(Matematica nums) {
        if (nums.getNum1() > nums.getNum2()) {
            System.out.println("El mayor valor es: " + nums.getNum1());
            return nums.getNum1();
        } else {
            System.out.println("El mayor valor es: " + nums.getNum2());
            return nums.getNum2();
        }
    }

    public void calcularPotencia(Matematica nums) {

        long redondeo1 = Math.round(nums.getNum1());
        System.out.println("El primer valor redondeado es: " +redondeo1);
        long redondeo2 = Math.round(nums.getNum2());
        System.out.println("El segundo valor redondeado es: " +redondeo2);
        double potencia;

        if (redondeo1 > redondeo2) {
            potencia = Math.pow(redondeo1, redondeo2);
            System.out.println("La potencia del primer valor es: " + potencia);
        } else {
            potencia = Math.pow(redondeo2, redondeo1);
            System.out.println("La potencia del segundo valor es: " + potencia);
        }
    }

    public void cacluclarRaiz(Matematica nums) {
         long redondeo2 = Math.round(nums.getNum2());
        if (redondeo2 < 0) {
            Math.abs(nums.getNum2());
        }

        double raiz = Math.sqrt(redondeo2);
        System.out.println("La raiz cuadrada de " +redondeo2+ " es: " +raiz);
    }
}
