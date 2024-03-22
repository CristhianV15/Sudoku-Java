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
    public static void resolverLinea(int array[]){
        int arrayCompleto[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Resolviendo ..........");
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                for (int j = 0; j < array.length; j++) {
                    boolean name = array[i]== arrayCompleto[j];                            
                }
            }
        }
        
        
        
    }
}
