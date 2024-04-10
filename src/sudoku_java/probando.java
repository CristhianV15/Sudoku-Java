/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku_java;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class probando {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresar 7 números siuuuuuuuu");
        int arrayNumeros[]= new int [5];                
        llenarArray(arrayNumeros);
        System.out.println("Tus números son: ");
        mostrarArray(arrayNumeros);
        System.out.println("Los números ordenados son : ");
        ordenamientoBurbuja(arrayNumeros);
        mostrarArray(arrayNumeros);
    }
    
    public static void ordenamientoBurbuja(int array[]){     
        
        for (int i = 0; i < array.length-1 ; i++) {
           
          
             for (int j = 0; j < array.length-i-1; j++) { //en este caso ahora el array tiene 2-0-1= solo 1 valor 
                System.out.println("Burbuajde dentro" +array[j+1]) ;
                if (array[j]> array[j+1]) { 
                    int temporal= array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                }
               
            }
            }
            
        }      
    
//    /*
//      for (int i = 0; i < array.length - 1; i++) {
//        for (int j = 0; j < array.length - i - 1; j++) {
//            if (array[j] > array[j + 1]) {
//                int temp = array[j];
//                array[j] = array[j + 1];
//                array[j + 1] = temp;
//            }
//        }
//    }      */
    
    public static void llenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el número "+ (i +1 )+" :");
            array[i] =sc.nextInt();
        }
    }
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " -- ");
        }
    }
    
    /*Comparación de elementos adyacentes:

Comenzamos comparando el primer elemento con el segundo.
Si el primer elemento es mayor que el segundo, los intercambiamos.
Luego, pasamos al siguiente par de elementos adyacentes (el segundo y el tercero) y repetimos el proceso.
Repetición de las comparaciones:

Este proceso se repite hasta llegar al final del array.
En cada iteración, el elemento más grande "burbujea" hacia arriba hasta llegar a su posición final.
Iteraciones:

Después de la primera iteración, el elemento más grande estará en la última posición del array.
En la segunda iteración, el segundo elemento más grande estará en la penúltima posición, y así sucesivamente.
El número total de iteraciones necesarias es igual al número de elementos en el array menos uno.
Optimización:

En cada iteración, el último elemento ya está en su posición final, por lo que no es necesario volver a compararlo en las iteraciones posteriores.
Podemos reducir el número de comparaciones en cada iteración en uno, ya que el último elemento ya está en su posición final.
Finalización:

Después de completar todas las iteraciones, el array estará ordenado de menor a mayor
*/
}
