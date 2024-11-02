/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.mavenproject6;
import java.util.Scanner;
/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        // Calcular el area del triangulo y area del circulo
        //TRIANGULO
        double base;
        double altura;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la base del triangulo:");
        base=leer.nextDouble();
        System.out.println("Ingresar la altura del triangulo");
        altura=leer.nextDouble();     
        double respuesta=(base*altura)/2;
        System.out.println("El area del triangulo es: " +respuesta);
         System.out.println("=======================================");
         //Calcular el area del circulo
         //CIRCULO
        double radio;
        System.out.println("Ingresar el radio del circulo");
        radio=leer.nextDouble();
        double respuesta1=3.1416*(radio*radio);
        System.out.println("El area del circulo es " +respuesta1);
    }
}
