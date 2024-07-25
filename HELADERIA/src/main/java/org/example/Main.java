package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int precioHeladoSimple = 2000;
        int precioHeladoDoble = 3000;
        int precioHeladoEspecial = 5000;
        int cantdVendidoSimple;
        int cantdVendidoDoble;
        int cantdVendidoEspecial;
        int totalHeladoSimple;
        int totalHeladoDoble;
        int totalHeladoEspecial;
        int totalVentasDia;
        String nombre;

        Scanner leerTeclado= new  Scanner(System.in);

        System.out.println("CALCULAR PRODUCIDO");

        System.out.print("Digita tu Nombre: ");
        nombre = leerTeclado.nextLine();

        System.out.println("El Precio de los Helados Es:");

        System.out.println("Simple : " + precioHeladoSimple);
        System.out.println("Doble : " + precioHeladoDoble);
        System.out.println("Especial : " + precioHeladoEspecial);

        System.out.print("Cantida Helados Simple Vendidos : ");
        cantdVendidoSimple = leerTeclado.nextInt();

        System.out.print("Cantida Helados Doble Vendidos : ");
        cantdVendidoDoble = leerTeclado.nextInt();

        System.out.print("Cantida Helados Esepcial Vendidos : ");
        cantdVendidoEspecial= leerTeclado.nextInt();

        totalHeladoSimple = cantdVendidoSimple*precioHeladoSimple;
        totalHeladoDoble = cantdVendidoDoble*precioHeladoDoble;
        totalHeladoEspecial = cantdVendidoEspecial*precioHeladoEspecial;

        totalVentasDia = totalHeladoSimple + totalHeladoDoble + totalHeladoEspecial;

        System.out.println(nombre + " Tu producido del día fue : ");
        System.out.println("Precio Totla Helados Simple Vendidos: " + totalHeladoSimple);
        System.out.println("Precio Totla Helados Simple Vendidos: " + totalHeladoDoble);
        System.out.println("Precio Totla Helados Simple Vendidos: " + totalHeladoEspecial);

        System.out.println(" El Total de Ventas del Dia Fue: " + totalVentasDia);
    }
}