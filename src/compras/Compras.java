package compras;

import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {
        // DECLARACION  VARIABLES
        double precio, cantidad, subtotal,descuento, total,total1; 
        //Pedimos por teclado cuantos articulos va a comprar
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto vas a comprar");
        //pedimos por teclado para saber cual va ha ser el precio
        cantidad = entrada.nextDouble();
        System.out.println("Cual es el precio");
        //pedimos por teclado el descuento que se va a aplicar
        precio = entrada.nextDouble();
        System.out.println("escribir el descuento en decimales:");
        descuento=entrada.nextDouble();
        //calculamos el subtotal
        subtotal=cantidad*precio;
        
        total1=subtotal*descuento;
        total=subtotal-total1;
        
        
        System.out.println("El Total de la compra es : " +total );

    }

}
