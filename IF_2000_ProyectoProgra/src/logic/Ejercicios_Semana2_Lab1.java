/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Ejercicios_Semana2_Lab1 {
    
    // par o impar
    public static void parImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + "par");
        } else {
            System.out.println(numero + "impar");
        }
    }

    // valor absoluto
    public static void valorAbsoluto(int numero) {
        int absoluto = (numero < 0) ? -numero : numero;
        System.out.println("valor absoluto de " + numero + " es: " + absoluto);
    }

    // serie de numeros
    public static void serieSumatoria() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nsuma total: " + suma);
    }

    // numeros en orden ascendente
    public static void tresNumerosAsc(int a, int b, int c) {
        int[] numeros = {a, b, c};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("orden ascendente: " + numeros[0] + " " + numeros[1] + " " + numeros[2]);
    }

    // operacion
    public static void operarDosNumeros(int a, int b) {
        int resultado;
        if (a == b) {
            resultado = a * b;
        } else if (a > b) {
            resultado = a - b;
        } else {
            resultado = a + b;
        }
        System.out.println("eesultado: " + resultado);
    }

    // verificar si hay 10
    public static void notas() {
        Scanner scan = new Scanner(System.in);
        boolean hubo10 = false;
        int nota;
        System.out.println("ingrese notas del 0 al 10, introduzca -1 para terminar...");
        do {
            nota = scan.nextInt();
            if (nota == 10) {
                hubo10 = true;
            }
        } while (nota != -1);
        System.out.println(hubo10 ? "Si hubo un 10." : "No hubo ningún 10");
    }

    // genero
    public static void pulsaciones(int edad, char sexo) {
        int pulsaciones;
        if (sexo == 'F' || sexo == 'f') {
            pulsaciones = (220 - edad) / 10;
        } else {
            pulsaciones = (210 - edad) / 10;
        }
        System.out.println("pulsaciones por cada 10 segundos: " + pulsaciones);
    }

    // utilidad
    public static void utilidad(double salario, int anios) {
        double porcentaje;
        if (anios < 1) porcentaje = 0.05;
        else if (anios < 2) porcentaje = 0.07;
        else if (anios < 5) porcentaje = 0.10;
        else if (anios < 10) porcentaje = 0.15;
        else porcentaje = 0.20;
        
        double utilidad = salario * porcentaje;
        System.out.println("utilidad anual es: " + utilidad);
    }

    // numeros primos o no
    public static void esPrimo(int numero) {
        if (numero <= 1) {
            System.out.println(numero + " no es un numero primo ");
            return;
        }
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println(primo ? numero + " es primo" : numero + " no s primo");
    }

    // computadoras
    public static void descuentoComputadoras(int cantidad) {
        double precioCadaUno = 11000;
        double total = cantidad * precioCadaUno;
        double descuento;

        if (cantidad < 5) descuento = 0.10;
        else if (cantidad < 10) descuento = 0.20;
        else descuento = 0.40;

        double montoDesc = total * descuento;
        double totalPagar = total - montoDesc;

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio sin descuento: " + total);
        System.out.println("Descuento: " + montoDesc);
        System.out.println("Total a pagar: " + totalPagar);
    }

    // primos hasta N
    public static void listaPrimos(int numero) {
        System.out.println("Primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // triangulo
    public static void areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        System.out.println("area: " + area);
    }
    
}
