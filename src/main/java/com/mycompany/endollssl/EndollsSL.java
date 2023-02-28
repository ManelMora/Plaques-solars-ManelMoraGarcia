/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.endollssl;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class EndollsSL {

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //llamamos al constructor con el new

        //declaramos una variable tipo string donde almacenaremos lo que ponga por consola.
        String consola = "";

        // printamos
        System.out.println("Et donem la benvinguda al sistema Endolls Solars, S.L.");

        /*Hacemos un bucle con el while utilizando equalsIgnoreCase:
        (este metodo ignora mayusculas, minusculas y compara dos cadenas de texto si son iguales)
        *cuando el usuario ponga quit el programa finalizara. 
        Al finalizar saldra en pantalla:
        Has finalitzat el programa: Endolls Solars.
         */
        //quit
        while (!consola.equalsIgnoreCase("quit")) {
            System.out.println(">");
            consola = scanner.nextLine();

            String[] nomSplit = consola.split(" ");

            /*
            *Si el valor introducido no llega a 4 palabras saldra el texto, 
            ya que es el mínimo para registrar una casa es 4.
             */
            //addCasa
            if (nomSplit.length != 4) {
                System.out.println("Falta informació: Has de introduir el nif, el nom i la superficie.");
            } /*
            *Extraemos los parámetros con el split: el NIF, nombre y la superficie de la casa.
             */ else {
                String nif = nomSplit[1];
                String nom = nomSplit[2];
                //convertimos el int por un string con parseInt
                int superficie = Integer.parseInt(nomSplit[3]);
                
                //Comprobamos que la superficie de la casa sea mayor que 10.
                if (superficie < 10) {
                    System.out.println("La superficie de la casa ha de ser mes gran que 10.");
                }
                

            }   

        }
        scanner.close();
        System.out.println("Has finalitzat el programa: Endolls Solars.");
    }

}
