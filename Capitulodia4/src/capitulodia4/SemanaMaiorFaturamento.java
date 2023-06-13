/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulodia4;

/**
 *
 * @author ficdev
 */
public class SemanaMaiorFaturamento {
    public static void main(String[] args) {
		
    Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
    Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
    Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
    Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
		
    Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
	 	
	Double  SemanaMaior = 0.0;
	Integer SemanaMelhor = 0;
		
		
        for(int semana = 0; semana < mes.length;semana++){ 
		Double[] SemanaComMaiorFaturamento = mes[semana];
		Double colunaY = 0.0;
		
            for(int dia = 0;dia < SemanaComMaiorFaturamento.length -1;dia++){
                colunaY+= SemanaComMaiorFaturamento[dia];
		
			  
			
		  if(colunaY > SemanaMaior){
			  SemanaMaior = colunaY;
			  SemanaMelhor = semana + 1;
		    }
	    }
        }
        
        System.out.println("[" + SemanaMelhor + "ª semana]" + " valor total de R$: " + SemanaMaior);
    }
    
}
