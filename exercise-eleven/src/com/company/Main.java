package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 11: “El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las\n" +
                "cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa acepta\n" +
                "tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que los clientes\n" +
                "adquieren sólo un tipo de hamburguesa, realice un algoritmo para determinar cuánto\n" +
                "debe pagar una persona por N hamburguesas\n");

        //Se definen las variables
        String burgerType, paymentMethod;
        int amountBurgers;
        double burgerPrice, totalWithoutCharge, total;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Determine el tipo de hamburguesa (sencilla, doble, triple): ");
        burgerType = keyboard.nextLine();

        System.out.print("Ingrese la cantidad de hamburguesas: ");
        amountBurgers = keyboard.nextInt();

        System.out.print("Determine la forma de pago (tarjeta, efectivo): ");
        paymentMethod = keyboard.nextLine();

        //Se determina el tipo de hamburguesa
        if (burgerType == "sencilla") {
            burgerPrice = 20;
        } else if (burgerType == "doble") {
            burgerPrice = 25;
        } else {
            burgerPrice = 28;
        }

        //Se calcula el precio final sin el recargo por tarjeta

        totalWithoutCharge = amountBurgers * burgerPrice;

        //Se determina si se aplica cargo por el uso de tarjeta
        if (paymentMethod == "tarjeta") {
            total = totalWithoutCharge * 1.05;
        } else {
            total = totalWithoutCharge;
            System.out.print("El precio de la hamburguesa es de: " + burgerPrice + " con un total de: " + total);
        }

    }
}
