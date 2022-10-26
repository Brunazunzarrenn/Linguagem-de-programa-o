package br.com.arrayList;

public class Principal {
	public static void main (String args[]) {
		
		Carro c1 = new Carro();
		c1.nome = "Palio";
		c1.cor = "Cinza";
		c1.valor = 40.000;
		
		Carro c2 = new Carro();
		c2.nome = "Gol";
		c2.cor = "Preto";
		c2.valor = 80.000;
		
		Carro c3 = new Carro();
		c3.nome = "Novo C3";
		c3.cor = "Azul/Preto";
		c3.valor  = 70.00;
		
		Agencia ag = new Agencia();
		ag.nome = "Feras";
		ag.adicionarCarro(c1);
		ag.adicionarCarro(c2);
		ag.adicionarCarro(c3);
		
		int gtdeCarros = ag.getQuantidadeCarros();
		double gtdeValor = ag.calcualarPrecoTotal();
		
		System.out.println("A lista de carros da agencia " + ag.nome + " possui " + gtdeCarros);
		System.out.println("Valor total de carros da agencia " + ag.nome + " é  " + gtdeValor);
		
	}

}
