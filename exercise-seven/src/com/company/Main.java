package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 7: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de\n" +
                "uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la\n" +
                "venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto\n" +
                "recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:\n" +
                "si es de tipo A, se le cargan 20$ al precio inicial cuando es de tamaño 1; y 30$ si es de\n" +
                "tamaño 2. Si es de tipo B, se rebajan 30$ cuando es de tamaño 1, y 50$ cuando es de\n" +
                "tamaño 2. Realice un algoritmo para determinar la ganancia obtenida \n");

        //Se definen las variables
        char typeGrape = 'A';
        int sizeGrape = 1;
        double priceGrape;
        double kilogramsOfProduction;
        double profitMade;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario

        System.out.print("Determine si el tamaño de la uva es de tipo 'A' o 'B': ");
        typeGrape = keyboard.next().charAt(0);

        System.out.print("Determine si el tamaño de la uva es '1' o '2': ");
        sizeGrape = keyboard.nextInt();

        System.out.print("Ingrese el precio de la uva: ");
        priceGrape = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de kilogramos producidos: ");
        kilogramsOfProduction = keyboard.nextDouble();


        //se verifica si el tipo de uva es "A"

        if (typeGrape == 'A') {
            if (sizeGrape == 1){
                priceGrape =  priceGrape + 20;
            } else {
                priceGrape = priceGrape + 30;
            }
        } else {
            if (sizeGrape == 1){
                priceGrape = priceGrape - 30;
            } else {
                priceGrape = priceGrape - 20;
            }
        }

        //Se calcula la ganancia final
        profitMade = priceGrape * kilogramsOfProduction;

        //Se muestra el resultado
        System.out.print("La ganancia final sera de: $" + profitMade);


    }
}
