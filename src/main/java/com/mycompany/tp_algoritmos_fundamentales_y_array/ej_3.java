/*
3-Modifique  losalgoritmosde  ordenamiento  anteriores(inserción,burbuja,  selección)para queademásde la 
lista a ordenar revisan como parámetroun “String orden”, cuyo valor será“ASC”o “DESC”,que  permita  definir  si  
la  lista  debe  ordenarse  de  forma ASCENDENTE o DESCENDENTE.
 */
package com.mycompany.tp_algoritmos_fundamentales_y_array;


import java.util.Arrays;

/**
 *
 * @author ivanmillan36
 */
public class ej_3 {
    public static void main(String[] args) {
        
        int arreglo[] = new int[6];
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoBurbuja(arreglo, "DESC");
        imprimirArreglo(arreglo, "Arreglo ordenado por algoritmo burbuja");
        System.out.println("*************************************************");
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoPorSeleccion(arreglo, "DESC");
        imprimirArreglo(arreglo, "Arreglo ordenado por seleccion");
        System.out.println("*************************************************");
        
        rellenarArregloAleatorio(arreglo);
        imprimirArreglo(arreglo, "Arreglo inicial: ");
        ordenamientoInsercion(arreglo, "DESC");
        imprimirArreglo(arreglo, "Arreglo ordenado por insercion");
        System.out.println("*************************************************");
        
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
