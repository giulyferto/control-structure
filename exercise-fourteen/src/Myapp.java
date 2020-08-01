import java.util.Scanner;

public class Myapp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 14: Una compañía de paquetería internacional tiene servicio en algunos países de\n" +
                "América del Norte, América Central, América del Sur, Europa y Asia. El costo por el\n" +
                "servicio de paquetería se basa en el peso del paquete y la zona a la que va dirigido. Lo\n" +
                "anterior se muestra en la siguiente tabla:\n" +
                "\nZona Ubicación Costo/gramo\n" +
                "1 América del Norte $11.00\n" +
                "2 América Central $10.00\n" +
                "3 América del Sur $12.00\n" +
                "4 Europa $24.00\n" +
                "5 Asia $27.00\n" +
                "\nParte de su política implica que los paquetes con un peso superior a 5 kg no son\n" +
                "transportados, esto por cuestiones de logística y de seguridad. Realice un algoritmo\n" +
                "para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la\n" +
                "entrega");

        //Se definen las variables
        int zone;
        int weight;
        double cost = 10;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el peso en gramos: ");
        weight = keyboard.nextInt();

        System.out.print("Ingrese la zona donde desee enviar el paquete: ");
        System.out.println("[1] Amierca del norte [2]America central [3]America del sur [4]Europa [5] Asia");
        zone = keyboard.nextInt();

        //Se determina el cobro de la entrega

        if (weight > 5000) {
            System.out.println("No se puede realizar el envio.");
        } else {
            switch (zone) {
                case 1:
                    cost = weight * 11;
                    break;
                case 2:
                    cost = weight * 10;
                    break;
                case 3:
                    cost = weight * 12;
                    break;
                case 4:
                    cost = weight * 24;
                    break;
                case 5:
                    cost = weight * 27;
                    break;
                default:
                    System.out.println("Numero de destino invalido");
            }
        }

        //Se muestra el resultado
        System.out.println("El costo sera de: "+ cost);
    }
}
