package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 9: La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se\n" +
                "realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los\n" +
                "primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80¢ c/u, los siguientes\n" +
                "dos minutos, 70¢ c/u, y a partir del décimo minuto, 50¢ c/u.\n" +
                "Además, se carga un impuesto de 5% cuando es domingo, y si es día hábil, en\n" +
                "turno matutino, 15%, y en turno vespertino, 10%. Realice un algoritmo para determinar\n" +
                "cuánto debe pagar por cada concepto una persona que realiza una llamada.\n");

        //Se definen las variables
        int callDuration;
        String day, shift;
        double paymenyForTime, tax, total;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //se piden los datos del usuario
        System.out.print("Ingrese el tiempo que duro la llamada: ");
        callDuration = keyboard.nextInt();

        System.out.print("Determine el dia de la semana: ");
        day = keyboard.nextLine();

        System.out.print("Indique si la llamada fue realizado en el turno matutino o vespertino: ");
        shift = keyboard.nextLine();

        //Se verifica la duracion del tiempo de llamada

        if (callDuration < 5) {
            paymenyForTime = callDuration * 1;
        } else if (callDuration < 8) {
            paymenyForTime = (callDuration - 5) * 0.8 + 5;
        } else if (callDuration <= 10) {
            paymenyForTime = (callDuration - 8) * 0.7 + 7.4;
        } else {
            paymenyForTime = (callDuration - 10) * 0.5 + 8.8;
        }

        //Se determina si el dia es domingo

        if (day == "domingo") {
            tax = paymenyForTime * 0.5;
        } else if (shift == "matutino") {
            tax = paymenyForTime * 0.15;
        } else {
            tax = paymenyForTime * 0.10;
        }

        //Se calcula el total de la llamada
        total = paymenyForTime + tax;

        //Se muestra el resultado
        System.out.print("El total de su llamada es de: " + total +" con un total de "+ paymenyForTime +" por llamada, mas impuestos de: " + tax);
    }
}
