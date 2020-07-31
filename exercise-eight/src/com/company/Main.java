package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 8: El director de una escuela está organizando un viaje de estudios, y requiere\n" +
                "determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de\n" +
                "viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el\n" +
                "costo por cada alumno es de $65.00; de 50 a 99 alumnos, el costo es de $70.00, de 30 a\n" +
                "49, de $95.00, y si son menos de 30, el costo de la renta del autobús es de $4000.00, sin\n" +
                "importar el número de alumnos. Realice un algoritmo que permita determinar el pago a\n" +
                "la compañía de autobuses y lo que debe pagar cada alumno por el viaje\n");

        //Se definen las variables
        int amountStudent;
        double pricePerStudent;
        double total;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de alumnos que van a realizar el viaje: ");
        amountStudent =keyboard.nextInt();

        //Se calcula el precio por estudiante y el costo del viaje

        if (amountStudent > 100) {
            total = amountStudent * 65;
        } else if (amountStudent > 50) {
            total = amountStudent * 70;
        } else if (amountStudent > 30) {
            total = amountStudent * 95;
        } else {
            total = 40000;
        }

        //Se muestra el resultado
        System.out.println("El precio final por el viaje sera de: " + total);
    }
}
