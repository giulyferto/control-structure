import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad\n" +
                "de lápices considerando que si son 1000 o más el costo es de 85$; de lo contrario, el\n" +
                "precio es de 90$. Represéntelo con el pseudocódigo y el diagrama de flujo.\n");

        //Se establecen las variables
        int pencils;
        double price;

        //se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de lapices que quiere comprar: ");
        pencils = keyboard.nextInt();

        //Se calcula el precio de los lapices
        if (pencils >= 85) {
            price = pencils * 85;
        } else {
            price = pencils * 90;
        }

        //Se muestra el resultado
        System.out.println("Tiene que pagar un monto de: $"+price + "por los lapices");
    }
}
