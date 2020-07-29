import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Se desea implementar un algoritmo para determinar cuál de dos valores\n" +
                "proporcionados es el mayor. Representarlo con pseudocódigo y diagrama de flujo.\n");

        //Se definen las variables
        double firstNumber, secondNumber, biggerNumber;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el primer numero: ");
        firstNumber = keyboard.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        secondNumber = keyboard.nextDouble();

        //Se verifica cual numero es el mayo
        if (firstNumber > secondNumber) {
            biggerNumber = firstNumber;
        } else {
            biggerNumber = secondNumber;
        }

        //Se muestra el resultado
        System.out.println("El mayor numero es: "+biggerNumber);
    }
}
