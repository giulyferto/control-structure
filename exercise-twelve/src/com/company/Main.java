package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ejercicio 12: El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la\n" +
                "consulta con base en el número de cita, de la siguiente forma:\n" +
                "● Las tres primeras citas a $200.00 c/u.\n" +
                "● Las siguientes dos citas a $150.00 c/u.\n" +
                "● Las tres siguientes citas a $100.00 c/u.\n" +
                "● Las restantes a $50.00 c/u, mientras dure el tratamiento.\n" +
                "Se requiere un algoritmo para determinar:\n" +
                "a) Cuánto pagará el paciente por la cita.\n" +
                "b) El monto de lo que ha pagado el paciente por el tratamiento\n");

        //Se definen las variables
        int appointmentNumber;
        double appointmentCost, cost;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el numero de cita: ");
        appointmentNumber = keyboard.nextInt();

        //Se verifica si el numero de cita es menor o igual a 3

        if (appointmentNumber <= 3) {
            appointmentCost = 200;
            cost = appointmentCost * appointmentNumber;
        } else if (appointmentNumber <= 5) {
            appointmentCost = 150;
            cost = (appointmentNumber - 3) * 150 + 600;
        } else  if (appointmentNumber <= 8) {
            appointmentCost = 100;
            cost = (appointmentNumber - 5) * 100 + 900;
        } else {
            appointmentCost = 50;
            cost = (appointmentNumber - 8) * 50 + 1200;
        }

        //Se imprime el resultado
        System.out.println("El costo por la cita es de: " + appointmentCost + "\n" + "El costo por el tratamiento es de: " + cost);
    }
}
