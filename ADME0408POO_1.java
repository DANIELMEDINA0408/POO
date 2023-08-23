//Andrés Daniel Medina Erazo
package admepoo;

public class ADME0408POO_1 {

    public static void main(String[] args) {

        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "Daniel Medina";

        int[] numeros = {1, 2, 3, 4, 5}; //Array de enteros

        System.out.println("Hola " + nombre);
        
        ADME0408POO_1 instance = new ADME0408POO_1();
        int result= instance.sum(1, 2);
        System.out.println(result);
    }

    public int sum(int num1, int num2) {
        // System.out.println("Result: " + (num1 + num2));
        return(num1+num2);
    }
}
