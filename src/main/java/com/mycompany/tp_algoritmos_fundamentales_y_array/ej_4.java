/*
4-Codifique un algoritmo que permitacargar unarraydeuna dimensiónde 20 elementos enteros.Finalizada  la  
carga  de  los  20  elementos  el  programa  debe  solicitarcomo  se desea ordenar el array ASCENDENTE O DESCENDENTE 
y que métodode ordenamiento aplicar(inserción, burbuja,   selección), segúnlas   opciones   elegidas   aplique el algoritmos 
fundamentalde  ordenamiento que  corresponda.Muestre  por  pantalla  el arrayoriginal desordenado y su resultanteordenado segúnlas opciones elegidas.
 */
package com.mycompany.tp_algoritmos_fundamentales_y_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_4 {
    public static void main(String[] args) {
        int arreglo[] = new int[20];
        String orden;
        String metodo;
        
        rellenarArreglo(arreglo);
        orden = seleccionOrden();
        metodo = seleccionMetodo();
        imprimirArreglo(arreglo, "Arreglo original: ");
        ordenar(orden, metodo, arreglo);
        imprimirArreglo(arreglo, "Arreglo ordenado: ");
        
    }
    
    public static void rellenarArreglo(int arreglo[]){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i=0 ; i< arreglo.length ; i++ ){
            System.out.println("\nIngrese un entero para la posicion " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
            System.out.println("Numero almacenado: " + arreglo[i]);
        }
    }
    
    private static String seleccionOrden(){
        Scanner sc = new Scanner(System.in);
        int eleccion;
        System.out.println("\n1 - Ordenar de forma ascendente");
        System.out.println("2 - Ordenar de forma descendente");
        System.out.println("\nElija la opcion que prefiera: ");
        do{
            eleccion = sc.nextInt();
            if(eleccion <= 0 || eleccion > 2){
                System.out.println("Ingreso una opcion no valida, intente de nuevo...");
            }
        }while(eleccion <= 0 || eleccion > 2);
        if (eleccion == 1){
            return "ASC";
        }else {
            return "DESC";
        }            
    }
    
    private static String seleccionMetodo(){
        Scanner sc = new Scanner(System.in);
        int eleccion;
        System.out.println("\n1 - Metodo burbuja");
        System.out.println("2 - Metodo seleccion");
        System.out.println("3 - Metodo insercion");
        System.out.println("\nElija la opcion que prefiera: ");
        do{
            eleccion = sc.nextInt();
            if(eleccion <= 0 || eleccion > 3){
                System.out.println("Ingreso una opcion no valida, intente de nuevo...");
            }
        }while(eleccion <= 0 || eleccion > 3);
        
        if(eleccion == 1){
            return "burbuja";
        }else if(eleccion == 2){
            return "seleccion";
        }else{
            return "insercion";
        }
    }
    
    public static void ordenar(String orden, String metodo, int arreglo[]){
        
        if(metodo == "burbuja"){
            ordenamientoBurbuja(arreglo, orden);
        }else if (metodo == "insercion"){
            ordenamientoInsercion(arreglo, orden);
        }else if (metodo == "seleccion"){
            ordenamientoPorSeleccion(arreglo, orden);
        }
        
    
    }
    
    public static void imprimirArreglo(int arreglo[], String mensaje){
        System.out.println("\n" + mensaje);
        System.out.println(Arrays.toString(arreglo));
    }
    
    public static void ordenamientoBurbuja(int arreglo[], String orden){
        int n = arreglo.length;
        boolean intercambiado = false;
        do{
            intercambiado = false;
            for(int i=1; i<n; i++){
                if(orden == "ASC"){
                    if(arreglo[i-1] > arreglo[i]){
                        int aux = arreglo[i-1];
                        arreglo[i-1] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiado = true;
                    }
                }
                if(orden == "DESC"){
                    if(arreglo[i-1] < arreglo[i]){
                        int aux = arreglo[i-1];
                        arreglo[i-1] = arreglo[i];
                        arreglo[i] = aux;
                        intercambiado = true;
                    }
                }
            }
        }while(intercambiado == true);
    }
    
    public static void ordenamientoInsercion(int arreglo[], String orden){
        if(orden == "ASC"){
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
        if(orden == "DESC"){
            for(int i=1; i<arreglo.length; i++){
                int valor = arreglo[i];
                int j = i-1;
                    while(j>=0 && arreglo[j]<valor){
                        arreglo[j+1]=arreglo[j];
                        j--;
                    }
                arreglo[j+1] = valor;
            }
        }
    }
    
    public static void ordenamientoPorSeleccion(int arreglo[], String orden){
        int n = arreglo.length;
        if(orden == "ASC"){
            for(int i=0 ; i<n ; i++){
                int minimo = i;
                for(int j=i+1; j<n ; j++){
                    if(arreglo[j] < arreglo[minimo]){
                        minimo = j;
                    }                  
                }
                int aux = arreglo[minimo];
                arreglo[minimo] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        if(orden == "DESC"){
            for(int i=0 ; i<(n-1) ; i++){
                int maximo = i;
                for(int j=i+1; j<n ; j++){
                    if(arreglo[j] > arreglo[maximo]){
                        maximo = j;
                    }               
                }
                int aux = arreglo[maximo];
                arreglo[maximo] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }
}


