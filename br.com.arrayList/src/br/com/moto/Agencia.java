package br.com.moto;
import java.util.ArrayList;

public class Agencia {
	String nome;
	
	ArrayList<Moto> listaMotos = new ArrayList<Moto>();
	
	public void adicionarMoto (Moto moto) {
		listaMotos.add(moto);
	}
	
	public int getQuantidadeMotos() {
		return listaMotos.size();
	}

}
