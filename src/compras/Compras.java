package compras;

import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {
        // DECLARACION  VARIABLES
        double precio, cantidad, subtotal,descuento, documento, total,total1;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto vas a comprar");
        cantidad = entrada.nextDouble();
        System.out.println("Cual es el precio");
        //Calcular descuento
        precio = entrada.nextDouble();
        System.out.println("escribir el descuento en decimales:");
        descuento=entrada.nextDouble();
        subtotal=cantidad*precio;
        total1=subtotal*descuento;
        total=subtotal-total1;
        
        
        System.out.println("El Total de la compra es : " +total );

    }

}
