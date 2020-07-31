package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 10: Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno\n" +
                "tiene un precio por kilómetro recorrido por persona, los costos respectivos son $2.0,\n" +
                "$2.5 y $3.0. Se requiere determinar el costo total y por persona del viaje considerando\n" +
                "que cuando éste se presupuesta debe haber un mínimo de 20 personas, de lo contrario\n" +
                "el cobro se realiza con base en este número límite.\n");

        //Se definen las variables
        char busType;
        double kilometers, pricePerKilometers, pricePerPerson, finalPrice;
        int amountPeople;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //se piden los datos del usuario
        System.out.print("Ingese el tipo de autobus (A, B o C): ");
        busType = keyboard.next().charAt(0);

        System.out.print("Ingrese los Km por recorrer: ");
        kilometers = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de personas: ");
        amountPeople = keyboard.nextInt();

        //Se verifica si el tipo de camion es A
        if (busType == 'A') {
            pricePerKilometers = 2;
        } else if (busType == 'B') {
            pricePerKilometers = 2.5;
        } else {
            pricePerKilometers = 3;
        }

        //Se verifica si la cantidad de personas es menor a 20
        if (amountPeople < 20) {
            amountPeople = 20;
        } else {
            amountPeople = amountPeople;
        }
        //Se calcula el total del viaje
        finalPrice = amountPeople * pricePerKilometers * kilometers;

        //Se calcula el costo para cada persona que realiza el viaje
        pricePerPerson = finalPrice / amountPeople;

        //Se muestra el resultado
        System.out.println("El costo por persona sera de: " + pricePerPerson + " y el monto final de: " + finalPrice);
    }
}
