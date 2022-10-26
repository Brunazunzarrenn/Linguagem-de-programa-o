package br.com.sacolao;

public class Principal {
public static void main (String args[]) {
		
		Fruta f1 = new Fruta();
		f1.nome = "Uva";
		f1.valor = 10.50;
		
		Fruta f2 = new Fruta();
		f2.nome = "Melancia";
		f2.valor = 12.0;
		
		Fruta f3 = new Fruta ();
		f3.nome = "Banana";
		f2.valor = 7.0;
		
		Sacolao sa = new Sacolao ();
		sa.adicionarFruta(f1);
		sa.adicionarFruta(f2);
		sa.adicionarFruta(f3);
		
		int gtdeFrutas = sa.getQuantidadeFruta();
		double gtdeValor = sa.CalcularFruta();
		
		System.out.println("A lista frutas " + "possui " + gtdeFrutas);
		System.out.println("O valor das frutas é " + gtdeValor);

}
}
