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

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cual es tu nombre");
        String nombre= sc.nextLine();
        System.out.println("Hola "+ nombre + ".");
        //Array basico para ir probando diseño y logica
        System.out.println("Los 0 ingresados representan espacio en blanco");
        int array[] = new int[9];
        registrardatos(array);
        imprimirdatos(array);
        
        
        int[][]sudoku = new int[9][9]; //Matriz bidimensional para el sudoku
    }
    public static void registrardatos(int array[]){
        System.out.println("Ingresa en orden los 9 numeros ");
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
    }
    public static void imprimirdatos(int array[]){
        System.out.println("Tus 9 números fueron: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - " );
        }
    }
    public static void resolverLinea(int sudoku[]){
        boolean[] numUsados= new boolean[10]; // Números del 0 al 9
        System.out.println("Resolviendo ..........");
        
        for (int i = 0; i < sudoku.length; i++) { //for usado para llenar los numeros usados con true y false
            if (sudoku[i]!=0) {
                numUsados[sudoku[i]] = true;
            }
            
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                for (int j = 0; j < array.length; j++) {
                    boolean name = array[i]== arrayCompleto[j];                            
                }
            }
        }
        
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
    
    public static void resolverLinea3(int[] numeros) {
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
