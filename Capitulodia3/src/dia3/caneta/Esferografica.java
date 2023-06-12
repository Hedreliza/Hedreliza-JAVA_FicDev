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
public class Esferografica {
    
    private String ponta;
    private String modelo;
    private String carga;
    private boolean tampa;
    private Color cor;
    private String material;
    private boolean botao;	
	
        public Esferografica(String ponta, String modelo, String carga,
         boolean tampa,Color cor,String material, boolean botao){
            this.ponta    = ponta;
            this.modelo   = modelo;
            this.carga    = carga;
            this.tampa    = tampa;
            this.cor      = cor;
            this.material = material;
            this.botao    = botao;  
	}
        
        Color laranja = Color.ORANGE;
        
	public void escrever() {
	  System.out.println("Escrevendo");
	}
	
	public void desenhar() {
		System.out.println("Desenhando");
	}
	
	public void tamparCaneta() {
		System.out.println("Caneta tampada");
	}
	
	public void destamparCaneta() {
		System.out.println("Caneta destampada");
	}
	
	public void trocarCarga() {
		System.out.println("Carga trocada");
	}
        
        public void acionarBotao() {
                System.out.println("Ponta acionada.");
        }
    
	public void desacionarBotao() {
                System.out.println("Ponta desacionada.");
        }
     
	    public String getPonta() {
	     return ponta;	
	    }
	 
	    public String getModelo() {
                return modelo;	
	    }
	 
	    public String getCarga() {
                return carga;	
	    }
	 
	    public Boolean getTampa() {
                return tampa;	
	    }
	
	    public Color getCor() {
                return cor;	
	    }
            
            public String getMaterial() {
                return material;	
            }
            
            public boolean getBotao() {
                return botao;	
            }
             
}
