/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author MSI
 */

import java.util.Random;
import java.util.Scanner;
public class Ejercicios_Semana2_PracticaEnClase {
    
    
    //A. Realice un algoritmo que permita formar la siguiente figura:
    public void cuadrado (){
    
        String [][] matriz = {

            {"*"," ","*"," ","*"," ","*"," ","*"},
            {" "," "," "," "," "," "," "," "},
            {"*"," "," "," "," "," "," "," ","*"},
            {" "," "," "," "," "},
            {"*"," "," "," "," "," "," "," ","*"},
            {" "," "," "," "," "},
            {"*"," "," "," "," "," "," "," ","*"},
            {"*"," ","*"," ","*"," ","*"," ","*"}
        };
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]);
        }
    System.out.println();
    }
    }
    //B. Realice un algoritmo que permite formar la siguiente figura:
    public void triangulo (){
    
        String [][] matriz = {

            {"*","*","*","*","*","*","*","*","*","*","*",},
            {"*","*","*","*","*","*","*","*","*","*","",},
            {"*","*","*","*","*","*","*","*","*","","",},
            {"*","*","*","*","*","*","*","*","","","",},
            {"*","*","*","*","*","*","*","","","","",},
            {"*","*","*","*","*","*","","","","","",},
            {"*","*","*","*","*","","","","","","",},
            {"*","*","*","*","","","","","","","",},
            {"*","*","*","","","","","","","","",},
            {"*","*","","","","","","","","","",},
            {"*","","","","","","","","","","",},
        };
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]);
        }
    System.out.println();
    }
    }
    //C. Realice un algoritmo que permita formar la siguiente figura:
    public void trianguloOtro (){
    
        String [][] matriz = {

            {"*","*","*","*","*","*","*","*","*","*","*",},
            {" ","*","*","*","*","*","*","*","*","*","*",},
            {" "," ","*","*","*","*","*","*","*","*","*",},
            {" "," "," ","*","*","*","*","*","*","*","*",},
            {" "," "," "," ","*","*","*","*","*","*","*",},
            {" "," "," "," "," ","*","*","*","*","*","*",},
            {" "," "," "," "," "," ","*","*","*","*","*",},
            {" "," "," "," "," "," "," ","*","*","*","*",},
            {" "," "," "," "," "," "," "," ","*","*","*",},
            {" "," "," "," "," "," "," "," "," ","*","*",},
            {" "," "," "," "," "," "," "," "," "," ","*",},
            
        };
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]);
        }
    System.out.println();
    }
    }
    /**
     * D. Realice un algoritmo que permita ingresar 10 números enteros en forma desordenada en un 
    Arreglo de tamaño 10 y luego ordenar ascendentemente el mismo, al final deberá realizar la 
    impresión del arreglo para mostrar el resultado. 
     * @return 
     */
    public int[] matrizDeRandomsDeMenorAMayor() {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite los siguientes 10 numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        return numeros;
    }
    
    /**
     * Realice un algoritmo que genere 100 números enteros en forma aleatoria y se almacenen en un 
    Arreglo de tamaño 100 y luego ordenar descendentemente el mismo, al final deberá realizar la 
    impresión del arreglo para mostrar el resultado.
     * @return 
     * @param
     */
    
    public int [] generadorDeCienNumeros (){
        
         Random randomcito = new Random();
        int[] numeros = new int[100];
        
        int minimo = 1;
        int maximo = 100;
        
        for (int i = 0; i < numeros.length; i++) {
             int rango = randomcito.nextInt(maximo - minimo + 1) + minimo;
            numeros[i] = rango;
        }
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        return numeros;
    }
    
    /**
     * F. Realice un algoritmo que permita mostrar una partida inicial de “Tablero” con ayuda de una 
matriz, las fichas negras se podrán representar con la letra “N” y las rojas con la letra “R”, al final 
deberá mostrar algo como lo siguiente. 
1    2    3    4    5    6    7    8   
A N        
B      
C  N       
D 
E 
F       
G  R         
H      R         
 N         
 N         
R          
 N         
R        
 N          
 N         
R         
 R          
 N          
 R         
N 
 N          
 R         
R          
N 
 R 
N  
 R 
R
     * @param args 
     */
    
    public void Tablero (){
    
        String [][] matriz = {

            {" ","1","2","3","4","5","6","7","8",},
            {" "," "," "," "," "," "," "," "," ",},
            {"A","N "," ","N"," ","N"," ","N"," ",},
            {"B"," ","N"," ","N"," ","N"," ","N",},
            {"C","N "," ","N"," ","N"," ","N"," ",},
            {"D"," "," "," "," "," "," "," "," ",},
            {"E"," "," "," "," "," "," "," "," ",},
            {"F"," ","R"," ","R"," ","R"," ","R",},
            {"G","R"," ","R"," ","R"," ","R"," ",},
            {"H"," ","R"," ","R"," ","R"," ","R",},
        };
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]);
        }
    System.out.println();
    }
    }
}
    
 

