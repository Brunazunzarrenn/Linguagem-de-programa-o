package teste;
import java.util.Scanner;

public class Ativ3 {

	    public static void main(String [] args) {

	  Scanner ler = new Scanner(System.in);
	  int numero, qtdPos=0, qtdNeg=0, somPos=0, somNeg=0;

	System.out.println("Entre com 15 números inteiros: ");


	  for (int i = 0; i < 15 ; i++) {
	    numero = ler.nextInt();
	    if (numero == 0){
	        System.out.println("Zero é invalido.  Desconsiderado pelo programa");
	        i--;
	    }else{ 
	        if(numero > 0 ){ qtdPos++;}
	            else if(numero < 0 ){qtdNeg++;}
	         if(numero % 2 == 0){ somPos+=numero; } 
	            else if(numero % 2 != 0){ somNeg += numero;}
	    }
	}

	System.out.println("quantidade de números positivos : "+ qtdPos);
	System.out.println("quantidade de números negativos : "+ qtdNeg);
	System.out.println("soma de todos os valores negativos : " + somNeg);
	System.out.println("soma de todos os valores positivos : " + somPos);
	    ler.close();
	    }
	}