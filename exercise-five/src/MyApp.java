import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.\n");

        //Se definen las variabled
        double fisrtNumber, secondNumber, thirdNumber, biggestNumber;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el primer numero: ");
        fisrtNumber = keyboard.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        secondNumber = keyboard.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        thirdNumber = keyboard.nextDouble();

        //Se determina cual es el numero mas grande
        if (fisrtNumber > secondNumber) {
            if (fisrtNumber > thirdNumber) {
                biggestNumber = fisrtNumber;
            } else {
                biggestNumber = thirdNumber;
            }
        } else if (secondNumber > thirdNumber) {
            biggestNumber = secondNumber;
        } else {
            biggestNumber = thirdNumber;
        }
        //Se muestra el resultado
        System.out.println("\nEl numero mas grande es: " + biggestNumber);
    }
}
