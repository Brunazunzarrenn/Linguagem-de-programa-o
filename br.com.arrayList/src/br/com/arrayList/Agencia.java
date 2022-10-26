package br.com.arrayList;
import java.util.ArrayList;

public class Agencia {
	String nome;
	
	//criando lista de carros do tipo Carro
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	
	//criei metodo publico, se retorno para incluir tipos de Carro
	//dentro da lista de carros
	public void adicionarCarro (Carro carro) {
		listaCarros.add(carro);
	}
	
	//ultilizando a propriedade size da classe arraylist para contar a quantidade de carros da lista
	public int getQuantidadeCarros() {
		return listaCarros.size();
	}
	public double calcualarPrecoTotal(){
		//percorrer lista e colocar um acumulador
		double somaValor = 0.0 ;
		for (int i=0; i<listaCarros.size();i++) {
			Carro c = (Carro) listaCarros.get(i);
			somaValor += c.valor;
		}
		return somaValor;
	}
}
