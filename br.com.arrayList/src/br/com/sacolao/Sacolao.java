package br.com.sacolao;
import java.util.ArrayList;

public class Sacolao {
	String nome;
	
	ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
	
	public void adicionarFruta (Fruta fruta) {
		listaFrutas.add(fruta);
	}
	
	public int getQuantidadeFruta() {
		return listaFrutas.size();
	}
	
	public double CalcularFruta() {
		double somaValor = 0.0 ;
		for (int i=0; i<listaFrutas.size();i++) {
			Fruta f = (Fruta) listaFrutas.get(i);
			somaValor += f.valor;
		}
		return somaValor;
	}
		
	}

