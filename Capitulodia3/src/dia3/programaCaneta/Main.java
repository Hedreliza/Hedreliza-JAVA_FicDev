/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia3.programaCaneta;

import dia3.caneta.Esferografica;
import java.awt.*;

/**
 *
 * @author ficdev
 */

    
public class Main {
    public static void main(String[] args) {
      
     
         
     Esferografica retratil = new Esferografica("1 mm. ","Retrátil",
      "80%",false,Color.ORANGE,"Plástico",true);
	
        retratil.escrever();
	retratil.desenhar();
	retratil.trocarCarga();		
	retratil.acionarBotao();
        retratil.desacionarBotao();
        
        System.out.println("Ponta: " + retratil.getPonta());
        System.out.println("Modelo: " + retratil.getModelo());
        System.out.println("Carga: " + retratil.getCarga());
        System.out.println("Tampa: " + retratil.getTampa());
        System.out.println("Cor: " + retratil.getCor());
        System.out.println("Material: " + retratil.getMaterial());
        System.out.println("Botao: " + retratil.getBotao());
       
     
    }
}
