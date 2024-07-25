package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distanciaRecorrida;
        double cosumoCombustibleXcienKm;
        double precioLitroCombustible;
        double combustibleNecesarioViaje;
        double constoCombutibleViaje;

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Digite la Distancia Recorrida :");
        distanciaRecorrida = lectorTeclado.nextDouble();

        System.out.print("Digite Cuanto Combustible Consume su Vehicula Cada 100 Km : ");
        cosumoCombustibleXcienKm = lectorTeclado.nextDouble();

        System.out.print("Digite el Precio del Litro de Combutible: ");
        precioLitroCombustible = lectorTeclado.nextDouble();

        combustibleNecesarioViaje = (distanciaRecorrida/100) * cosumoCombustibleXcienKm;

        System.out.println("El Combustible Necesario para el Viaje es : " + combustibleNecesarioViaje);

        constoCombutibleViaje = combustibleNecesarioViaje * precioLitroCombustible;
        System.out.print("El Costo Total de Combutible Necesari :  " + constoCombutibleViaje);





    }
}