package teste;
import java.util.Scanner;
public class Ativ2 {
	

	    public static void main(String[]args) {
	     
	        Scanner ler = new Scanner(System.in);
	        int numero, qtdImpar =0, qtdPar = 0 ;

	System.out.println("Entre com 10 números: ");

	for (int i = 0; i < 9; i++) {
	    numero = ler.nextInt();

	    if(numero == 0){
	        System.out.println("Zero é invalido. Será desconsiderado!");
	        i--;
	    } else if (numero % 2 == 0){
	        qtdPar++;
	    } else if( numero % 2 != 0 ){
	        qtdImpar ++;
	    }
	}
	System.out.println("A quantidade de numeros impares é "+ qtdImpar); 
	System.out.println("A quantidade de numeros Pares é "+ qtdPar);
	    }
	}

