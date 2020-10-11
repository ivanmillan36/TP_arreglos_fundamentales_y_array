/*
5- Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se
corresponden a cantidad de filas y columnas. Cree un arreglo de tamaño[X,Y]de tipo
entero, el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de
la matriz. Finalizada la carga calcule el promedio entero de los elementos asignados y
cargados en la matriz. Para terminar determine si el promedio calculado se encuentra
asignado en alguna de las celdas, si es así indique la posición o posiciones
correspondientes, caso contrario muestre el mensaje “No se encontró ninguna
coincidencia”.
 */
package com.mycompany.tp_algoritmos_fundamentales_y_array;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_5 {
    public static void main(String[] args) {
        int cant_filas, cant_columnas;
        int promedio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de filas: ");
        cant_filas = sc.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        cant_columnas = sc.nextInt();
        
        int matriz[][] = new int[cant_filas][cant_columnas];
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        promedio = calcularPromedioMatriz(matriz);
        System.out.println("El promedio entero es: " + promedio);
        buscarCoincidencia(promedio, matriz);
        
    }
    
    public static void cargarMatriz(int matriz[][]){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.println("Ingrese un entero para la fila " + i + " coluna " + j + " de la matriz: ");
                matriz[i][j] = sc.nextInt();
            }
            
        }
    }
    
    
    public static int calcularPromedioMatriz(int matriz[][]){
        int sumatoria = 0;
        int promedio;
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){          
                sumatoria += matriz[i][j];
            }        
        }
        promedio = sumatoria / (matriz.length * matriz[0].length);
        return promedio;
    }
    
    public static void buscarCoincidencia(int num, int matriz[][]){
        String coincidencias = "";
        boolean encontrado = false;
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){          
                if (matriz[i][j] == num){
                    coincidencias += "(" + i + "," + j + ") ";
                    encontrado = true;
                }
            }        
        }
        
        if (encontrado){
            System.out.println("El valor " + num + " se encuentra en la posicion con indice " + coincidencias);
        }else {
            System.out.println("No se encontro ninguna coincidencia.");
        }
        
    }
    
    public static void imprimirMatriz(int matriz[][]) {
        System.out.println("Matriz resultado: \n");
        
        for (int[] fila : matriz) {
            System.out.print("| ");
            for (int dato : fila) {
                System.out.print(dato + " ");
            }
            System.out.println("|");
        }
    }
}
