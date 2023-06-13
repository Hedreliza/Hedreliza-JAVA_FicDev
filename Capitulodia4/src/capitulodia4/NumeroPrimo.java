/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulodia4;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
    
        System.out.println("Digite um numero inteiro positivo");
        int numero = input.nextInt();
        boolean ehPrimo;
        int i;
        
        if(numero % 2 == 0) {
            ehPrimo = true;
                if (numero == 2) {
                    ehPrimo = true;
                } else {
                    ehPrimo = false;
                } 
                
        } else {
            ehPrimo = true;
             i = 3;
             
            while (ehPrimo && (i <= Math.sqrt(numero))) {
                  
                if (numero % i == 0) {
                     ehPrimo = false;
                }
                    
                  i += 2;
                }
            }
        if (ehPrimo) {
            System.out.printf("%d é primo!",numero);            
        } else {
            System.out.printf("%d não é primo!",numero);
        }
    }  
}
