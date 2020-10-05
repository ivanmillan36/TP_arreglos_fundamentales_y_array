/*
1-Explique brevementeen quéconsistenlos siguientes Algoritmos Fundamentales.
Algoritmos de Ordenación:

Ordenamiento por Inserción
Algoritmo de la burbuja
Ordenamiento por selección
Algoritmo Quick-Sort

Algoritmosde Búsqueda:
BúsquedaSecuencial
BúsquedaBinaria

Algoritmos de Recorrido:
Recorrido de Profundidad
Recorridode Anchura
 */
package com.mycompany.tp_algoritmos_fundamentales_y_array;

/**
 *
 * @author ivanmillan36
 */
public class ej_1 {
    public static void main(String[] args) {
        /*
        Algoritmos de Ordenación:
            Ordenamiento por Inserción:
                Este  algoritmo  es  el  más  sencillo  de  comprender  ya que  es  una  representación natural 
                de cómo aplicaríamos el orden a un conjunto de elementos. Supongamos que tenemos un mazo de cartas desordenadas, 
                este algoritmo propone ir tomando las cartas de a una y luego ir colocandolas en la posición correcta con 
                respecto a las anteriores ya ordenadas.
            
            Algoritmo de la burbuja:
                La  ordenación  por burbuja  es  uno  de  los  métodos  más  fáciles  de  ordenación,  ya que el algoritmo 
                de ordenación utilizado es muy simple. Este algoritmo consiste en comparar cada elemento de la lista con el siguiente 
                (por parejas), si no están en el orden correcto, se intercambian entre sí sus valores. El valor más pequeño flota hasta 
                el principio de la lista como si fuera una burbuja en un vaso de gaseosa.
                
            Ordenamiento por selección:
                El algoritmo de ordenamiento por selección es similar al método de la burbuja y funciona de la siguiente manera: 
                inicialmente se recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida 
                el menor elemento se  coloca  al  inicio  de  la  lista  recorrida.  En  la  siguiente  iteración  se  recorre 
                nuevamente  la  lista  pero  comenzando  en  el  segundo  elemento  (ya  que  al  haber insertado  el  menor  
                encontrado  al  inicio  ya  lo  consideramos  ordenado).  El procedimiento continúa hasta que el último elemento recorrido 
                es el menor de su subconjunto.
        
            Algoritmo Quick-Sort:
                El algoritmo trabaja de la siguiente forma: 
                ● Elegir un elemento de la lista de elementos a ordenar, al que llamaremos pivote. 
                ● Resituar los demás elementos de la lista a cada lado del pivote, de manera que a un  lado  queden  todos  los  menores  que  él,  
                y  al  otro los  mayores.  Los  elementos iguales al  pivote  pueden  ser  colocados  tanto  a  su  derecha  como  
                a  su  izquierda, dependiendo  de  la  implementación  deseada.  En  este  momento,  el pivote ocupa exactamente el 
                lugar que le corresponderá en la lista ordenada. 
                ● La  lista  queda  separada  en  dos sublistas,  una  formada  por  los  elementos  a  la izquierda del pivote, y otra por los elementos a su derecha. 
                ● Repetir  este  proceso  de  forma  recursiva  para  cada sublista mientras  éstas contengan  más  de  un  elemento.  Una  vez  terminado  
                este  proceso  todos  los elementos estarán ordenados.
        
        Algoritmosde Búsqueda:
            BúsquedaSecuencial:
                Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde un  elemento  al  siguiente, 
                comenzando  en  la  primera posición  de  la  lista  y  se detiene cuando encuentra el elemento buscado o bien se 
                alcanza el final de la lista sin haberlo encontrado.
            
            BúsquedaBinaria:
                Este  algoritmo  se  utiliza  cuando  disponemos  de  una lista  ordenada,  lo  que  nos permite  facilitar  la 
                búsqueda,  ya  que  podemos  ir  disminuyendo  el  espacio  de búsqueda a segmentos menores a la lista original y completa.
                La idea es no buscar en aquellos segmentos de la lista donde sabemos que el valor seguro que no puede estar, considerando 
                que la lista esta ordenada.
        
        
        Algoritmos de Recorrido:
            Recorrido de Profundidad:
                En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a través de un hijo, al descendiente más lejano del primer hijo 
                antes de proseguir a un  segundo  hijo.  En  otras  palabras,  en  el  recorrido  en  profundidad,  todos  
                los descendientes  de  un  hijo  se  procesan  antes  del  siguiente  hijo.  Para  saber  cómo regresarnos,
                vamos guardando los nodos visitados en una estructura de pila.
             
            Recorridode Anchura:
                En el recorrido en anchura, el proceso se realiza horizontalmente desde el raıź a todos sus hijos, a continuación, 
                a los hijos de sus hijos y así ́ sucesivamente hasta que  todos  los  nodos  han  sido  procesados.  En  otras  palabras,  
                en  el  recorrido  en anchura,  cada  nivel  se  procesa  totalmente  antes  de que  comience  el  siguiente nivel. 
                Para poder saber qué vértices visitar, utilizamos una cola.
        
        */
    }
}
