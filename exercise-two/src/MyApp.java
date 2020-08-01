import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Realice un algoritmo para determinar si un número es positivo o negativo.\n" +
                "Represéntelo en pseudocódigo y diagrama de flujo.\n");
        //Se definen las variables
        double number;
        String result;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese un numero: ");
        number = keyboard.nextDouble();

        //Se verifica si el numero es positivo o negativo
        if (number>=0){
            result = "positivo";
        } else {
            result = "negativo";
        }
     

        //Se muestra el resultado
        System.out.println("Su numero es "+result);
    }
}
