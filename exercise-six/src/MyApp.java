import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("“La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus\n" +
                "tarifas son las siguientes: el costo de platillo por persona es de $950.00, pero si el\n" +
                "número de personas es mayor a 200 pero menor o igual a 300, el costo es de $850.00.\n" +
                "Para más de 300 personas el costo por platillo es de $750.00. Se requiere un algoritmo\n" +
                "que ayude a determinar el presupuesto que se debe presentar a los clientes que deseen\n" +
                "realizar un evento\n");

        //Se definen las variables
        int amountPeople;
        double price;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de personas que asistiran: ");
        amountPeople = keyboard.nextInt();

        //Se determina el precio que van a pagar por la comida
        if (amountPeople > 300) {
            price = amountPeople * 750;
        } else {
            if (amountPeople > 200) {
                price = amountPeople * 850;
            } else {
                price = amountPeople * 950;
            }
        }

        //Se muestra el resultado
        System.out.println("El precio a pagar por "+ amountPeople + " personas es de: $" + price);
    }
}
