/*
2-Codifique  mediante  código  JAVA  los pseudocódigos de  los  algoritmos  
fundamentales presentados en el apunte “Algoritmos Fundamentales” correspondiente.+

Ordenamiento por inserción
Algoritmo de la burbuja
Ordenamiento por selección
Búsqueda secuencial
 */
package com.mycompany.tp_algoritmos_fundamentales_y_array;

import java.util.Arrays;

/**
 *
 * @author ivanmillan36
 */
public class ej_2 {
    public static void main(String[] args) {
        int arreglo[] = new int[6];
        String alumnos[] = {"Juan", "Pedro", "Maria", "Martin", "Paola"};
        
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoInsercion(arreglo);
        imprimirArreglo(arreglo, "Arreglo ordenado por insercion");
        System.out.println("*************************************************");
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoBurbuja(arreglo);
        imprimirArreglo(arreglo, "Arreglo ordenado por algoritmo burbuja");
        System.out.println("*************************************************");
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoBurbuja(arreglo);
        imprimirArreglo(arreglo, "Arreglo ordenado por seleccion");
        System.out.println("*************************************************");
        
        busquedaSecuencial(alumnos, "Maria");
        busquedaSecuencial(alumnos, "Manuel");
    }
    
    public static void ordenamientoInsercion(int arreglo[]){
        for(int i=1; i<arreglo.length; i++){
            int valor = arreglo[i];
            int j = i-1;
                while(j>=0 && arreglo[j]>valor){
                    arreglo[j+1]=arreglo[j];
                    j--;
                }
            arreglo[j+1] = valor;
        }
    }
    
    public static void ordenamientoBurbuja(int arreglo[]){
        int n = arreglo.length;
        boolean intercambiado = false;
        do{
            intercambiado = false;
            for(int i=1; i<n; i++){
                if(arreglo[i-1] > arreglo[i]){
                    int aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i] = aux;
                    intercambiado = true;
                }
            }
        }while(intercambiado == true);
    }
    
    public static void ordenamientoPorSeleccion(int arreglo[]){
        int n = arreglo.length;
        for(int i=1 ; i<(n-1) ; i++){
            int minimo = i;
            for(int j=i+1; j<n ; j++){
                if(arreglo[j] < arreglo[minimo]){
                    minimo = j;
                }
                int aux = arreglo[minimo];
                arreglo[minimo] = arreglo[j];
                arreglo[j] = aux;
            }
        }
    }
    
    public static void busquedaSecuencial(String[] alumnos, String alumno_buscado){
        int n = alumnos.length;
        boolean seEncontro = false;
        
        for(int i=0 ; i<n ; i++){
            if(alumnos[i] == alumno_buscado){
                seEncontro = true;
                System.out.println("Alumno " + alumno_buscado + " encontrado en la posicion: " + (i+1) + " de la lista.");
            }
        }
        if(seEncontro == false){
            System.out.println("El alumno " + alumno_buscado + " no esta en la lista");
        }
    }
    
    public static void imprimirArreglo(int arreglo[], String mensaje){
        System.out.println("\n" + mensaje);
        System.out.println(Arrays.toString(arreglo));
    }
    
    public static int [] rellenarArregloAleatorio(int arreglo[]){     
        for(int i=0; i< arreglo.length; i++){
            arreglo[i] = (int) ((Math.random() * 100) + 1);
        }
        return arreglo;
    }

}
