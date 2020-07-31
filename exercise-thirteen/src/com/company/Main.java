package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 13: Fábricas “El cometa” produce artículos con claves (1, 2, 3, 4, 5 y 6). Se requiere un\n" +
                "algoritmo para calcular los precios de venta, para esto hay que considerar lo siguiente:\n" +
                "\nCosto de producción = materia prima + mano de obra + gastos de fabricación.\n" +
                "Precio de venta = costo de producción + 45 % de costo de producción.\n" +
                "\nEl costo de la mano de obra se obtiene de la siguiente forma: para los productos con\n" +
                "clave 3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga\n" +
                "80 %, y para los que tienen clave 2 o 6, 85 %.\n" +
                "\nPara calcular el gasto de fabricación se considera que si el artículo que se va a producir\n" +
                "tiene claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves\n" +
                "son 3 o 6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el\n" +
                "mismo costo para cualquier clave.\n");

        //Se definen las variables
        int claveArticulo;
        double materiaPrimaCosto, manoDeObraCosto, gastosFabricacion, costoProduccion, precioVenta;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los tados del usuario
        System.out.print("Ingrese el costo de la materia prima: ");
        materiaPrimaCosto = keyboard.nextDouble();

        System.out.print("Ingrese la clave del articulo: ");
        claveArticulo = keyboard.nextInt();

        //Se verifica la clave para calcular la mano de obra
        if (claveArticulo == 3 || claveArticulo == 4) {
            manoDeObraCosto = materiaPrimaCosto * 0.75;
        } else if (claveArticulo == 1 || claveArticulo == 5); {
            manoDeObraCosto = materiaPrimaCosto * 0.80;
        }  {
            manoDeObraCosto = materiaPrimaCosto * 0.85;
        }

        //Se verifica la clave para calcular el gasto de fabricacion
        if (claveArticulo == 2 || claveArticulo == 5) {
            gastosFabricacion = materiaPrimaCosto * 0.30;
        } else if (claveArticulo == 3 || claveArticulo == 6) {
            gastosFabricacion = materiaPrimaCosto * 0.35;
        } else {
            gastosFabricacion = manoDeObraCosto * 0.28;
        }

        //Se calcula el costo de produccion
        costoProduccion = materiaPrimaCosto + manoDeObraCosto + gastosFabricacion;

        //Se calcula el precio de venta
        precioVenta = costoProduccion + costoProduccion * 0.45;

        //Se muestra el resultado
        System.out.print("El costo de produccion sera de: " + costoProduccion + "\nY el precio de venta sera de: " + precioVenta);
    }
}
