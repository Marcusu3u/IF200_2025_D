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
    
    // 1) Determinar si es par o impar
    public static void parImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " es PAR");
        } else {
            System.out.println(n + " es IMPAR");
        }
    }

    // 2) Valor absoluto
    public static void valorAbsoluto(int n) {
        int abs = (n < 0) ? -n : n;
        System.out.println("El valor absoluto de " + n + " es " + abs);
    }

    // 3) Serie 3,6,9,...,99 y suma
    public static void serieSumatoria() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nSuma total: " + suma);
    }

    // 4) Tres números en orden ascendente
    public static void tresNumerosAsc(int a, int b, int c) {
        int[] nums = {a, b, c};
        // Orden manual
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("Orden ascendente: " + nums[0] + " " + nums[1] + " " + nums[2]);
    }

    // 5) Operaciones según relación de dos números
    public static void operarDosNumeros(int a, int b) {
        int resultado;
        if (a == b) {
            resultado = a * b;
        } else if (a > b) {
            resultado = a - b;
        } else {
            resultado = a + b;
        }
        System.out.println("Resultado: " + resultado);
    }

    // 6) Notas hasta -1, ver si hubo un 10
    public static void notas() {
        Scanner sc = new Scanner(System.in);
        boolean hubo10 = false;
        int nota;
        System.out.println("Ingrese notas (0 a 10), -1 para terminar:");
        do {
            nota = sc.nextInt();
            if (nota == 10) {
                hubo10 = true;
            }
        } while (nota != -1);
        System.out.println(hubo10 ? "Sí hubo un 10." : "No hubo ningún 10.");
    }

    // 7) Pulsaciones según sexo
    public static void pulsaciones(int edad, char sexo) {
        int pulsaciones;
        if (sexo == 'F' || sexo == 'f') {
            pulsaciones = (220 - edad) / 10;
        } else {
            pulsaciones = (210 - edad) / 10;
        }
        System.out.println("Pulsaciones por cada 10 seg: " + pulsaciones);
    }

    // 8) Utilidad según antigüedad
    public static void utilidad(double salario, int anios) {
        double porcentaje;
        if (anios < 1) porcentaje = 0.05;
        else if (anios < 2) porcentaje = 0.07;
        else if (anios < 5) porcentaje = 0.10;
        else if (anios < 10) porcentaje = 0.15;
        else porcentaje = 0.20;
        
        double utilidad = salario * porcentaje;
        System.out.println("La utilidad anual es: " + utilidad);
    }

    // 9) Número primo o no
    public static void esPrimo(int n) {
        if (n <= 1) {
            System.out.println(n + " NO es primo");
            return;
        }
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println(primo ? n + " es primo" : n + " NO es primo");
    }

    // 10) Descuento en computadoras
    public static void descuentoComputadoras(int cantidad) {
        double precioUnit = 11000;
        double total = cantidad * precioUnit;
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

    // 11) Lista de primos hasta N
    public static void listaPrimos(int N) {
        System.out.println("Primos hasta " + N + ":");
        for (int i = 2; i <= N; i++) {
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

    // 12) Área de triángulo
    public static void areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);
    }
    
}
