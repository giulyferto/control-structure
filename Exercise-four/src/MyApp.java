import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes\n" +
                "que tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %, a todos\n" +
                "los demás se les aplicará sólo 8%. Realice un algoritmo para determinar el precio final\n" +
                "que debe pagar una persona por comprar un traje y de cuánto es el descuento que\n" +
                "obtendrá. Represéntelo mediante el pseudocódigo y el diagrama de flujo.\n");

        //Se establecen las variables
        double suitPrice, discountedPrice, discount;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el precio del traje: ");
        suitPrice = keyboard.nextDouble();

        //Se le calcula el descuento

        if (suitPrice > 2500) {
            discount = suitPrice * 0.15;
        } else {
            discount = suitPrice * 0.08;
        }

        //Se le aplica el descuento al precio
        discountedPrice = suitPrice - discount;

        //Se muestra el resultado
        System.out.println("Al traje se le aplica un descuento de: $"+ discount + " y queda a un precio de: $" + discountedPrice);
    }
}
