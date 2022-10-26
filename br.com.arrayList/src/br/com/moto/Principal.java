package br.com.moto;
import br.com.arrayList.Carro;

public class Principal {
	public static void main (String args[]) {

		Moto c1 = new Moto();
		c1.nome = "CG";
		c1.cor = "Vermelha";
		
		Moto c2 = new Moto();
		c2.nome = "Tyges";
		c2.cor = "Cinza";

		
		Agencia ag = new Agencia();
		ag.nome = "Feras";
		ag.adicionarMoto(c1);
		ag.adicionarMoto(c2);
		
		int gtdeMoto = ag.getQuantidadeMotos();
		
		System.out.println("A lista de Moto da agencia " + ag.nome + " possui " + gtdeMoto);
		
	}
	}


