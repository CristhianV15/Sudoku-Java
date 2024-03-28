/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudoku_java;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Sudoku_Java {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Cual es tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + ".");
                               
        System.out.println("Los 0 ingresados representan espacio en blanco");
        int array[] = new int[9];        //Array basico para ir probando diseño y logica
        
        registrardatos(array); //Registra los 9 números en un array         
        
        System.out.println("Tus números son : ");
        imprimirDatos(array);
        System.out.println("La resolución es:");
        resolverLinea(array);

        //int[][] sudoku = new int[9][9]; //Matriz bidimensional para el sudoku

    }

    public static void registrardatos(int array[]) {
        System.out.println("Ingresa en orden los 9 numeros ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void imprimirDatos(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

    // Método genérico para imprimir un array de cualquier tipo de envoltura
    public static <T> void imprimirDatosGenericos(T[] array) {       
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void resolverLinea(int linea[]) {
        //Metodo 1 
        /*Este enfoque utiliza dos arrays: uno para almacenar los números proporcionados por el usuario y otro para los números posibles en cada celda. 
        Se reemplazan los números no válidos con 0 en el array de números posibles. 
        Luego, se comienza con una matriz de posibles números y se van restringiendo según las reglas del sudoku, hasta obtener una solución válida.*/
              
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Array con los 9 números posibles por cada linea 

        int cNumerosVacios = 0;
                  
        for (int num : linea) {
            if (num == 0) {
                cNumerosVacios++;
            }
        }
        
        
        System.out.println("La cantidad de números vacios en la linea son : " + cNumerosVacios);
        int[] arrayRestante = new int[cNumerosVacios]; //Array para almacenar los números faltantes en la linea ingresada 
        int index=0 ; //Contador para rastrear la posición en ArrayRestantes
        for (int num : arrayNumeros){
            boolean encontrado = false;
            for (int i = 0; i < linea.length; i++) {
                if (linea[i]== num) {
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
            arrayRestante[index++]= num;
            }
        }
        
        imprimirDatos(arrayRestante);
        
        //Metodo2
        /*En este enfoque se utiliza un solo array para almacenar la fila de números y un array booleano para marcar qué números han sido utilizados.
        Se recorre la fila y se marcan los números ya proporcionados. Luego, para las celdas vacías, se asigna el primer número disponible que no ha sido utilizado. */

//        Boolean[] numUsados= new Boolean[10]; // Números del 0 al 9
//        System.out.println("Resolviendo ..........");
//        
//        for (int i = 0; i < sudoku.length; i++) { //for usado para llenar los numeros usados con true y false
//            if (sudoku[i]!=0) {
//                numUsados[sudoku[i]] = true;
//            }
//            
//        }
//        imprimirDatosGenericos(numUsados);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]==0) {
//                for (int j = 0; j < array.length; j++) {
//                    boolean name = array[i]== arrayCompleto[j];                            
//                }
//            }
//        }
    }

    public static boolean esNumeroValido(int numero) {
        // Verificar si el número está en el rango válido (del 1 al 9)
        if (numero < 1 || numero > 9) {
            return false;
        }
        return true;
    }

    // Función para resolver la línea
    public static void resolverLinea2(int[] numeros) {
        boolean[] usados = new boolean[10]; // Marcador para números usados

        for (int i = 0; i < 9; i++) {
            if (numeros[i] != 0) {
                usados[numeros[i]] = true;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (numeros[i] == 0) {
                for (int num = 1; num <= 9; num++) {
                    if (!usados[num]) {
                        numeros[i] = num;
                        usados[num] = true;
                        break;
                    }
                }
            }
        }
    }

}
