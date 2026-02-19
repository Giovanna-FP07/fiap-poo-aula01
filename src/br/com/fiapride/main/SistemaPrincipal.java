package br.com.fiapride.main;

import br.com.fiapride.model.BilheteUnico;
import java.time.LocalDate;

public class SistemaPrincipal {
	
   public static void main(String[] args) {
	   
       // Instância 1
       BilheteUnico bilhete1 = new BilheteUnico();
       bilhete1.tipo = "estudante";
       bilhete1.saldo = 20.00;
       bilhete1.dataValidade = LocalDate.of(2026, 12, 31);
       
       // Instância 2
       BilheteUnico bilhete2 = new BilheteUnico();
       bilhete2.tipo = "comum";
       bilhete2.saldo = 5.00;
       bilhete2.dataValidade = LocalDate.of(2025, 5, 10);
       
       System.out.println("Bilhete 1 tipo: " + bilhete1.tipo
    		   + ", saldo: " + bilhete1.saldo
						 + "e data de validade: " + bilhete1.dataValidade);
       System.out.println("Bilhete 2 tipo: " + bilhete2.tipo
       		+ ", saldo: " + bilhete2.saldo
						 + "e data de validade: " + bilhete2.dataValidade);
       
   }
}
