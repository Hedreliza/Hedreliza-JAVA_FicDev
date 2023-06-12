/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia3.caneta;

import java.awt.Color;

/**
 *
 * @author ficdev
 */
public class Hidrografica {
    
    private String ponta;
    private String modelo;
    private String carga;
    private Color cor;
    private String material;
	
	
        public Hidrografica(String ponta, String modelo, String carga, 
         Color cor,String material){
            this.ponta = ponta;
            this.modelo = modelo;
            this.carga = carga;
            this.cor = cor;
            this.material = material;
	}
	
	public void escrever() {
	  System.out.println("Escrevendo");
	}
	
	public void desenhar() {
		System.out.println("Desenhando");
	}
        
        public void pintar() {
            System.out.println("Pintando.");
        }
        
        public void destacar() {
            System.out.println("Destacando.");
        }
	 
	    public String getPonta() {
                return ponta;	
	    }
	 
	    public String getModelo() {
                return modelo;	
	    }
	 
	    public Color getCor() {
                return cor;	
	    }
	 
	   public String getMaterial() {
	     return material;	
            }
           
}
