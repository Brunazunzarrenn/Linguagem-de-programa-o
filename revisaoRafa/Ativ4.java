package teste;
import java.util.Scanner;
public class Ativ4 {
	
	    public static void main (String[]args){

	    System.out.println("Entre com 5 números inteiros: ");

	        Scanner ler = new Scanner(System.in);

	        int vet [] = new int [5];


	        for (int i = 0; i < 5; i++) {
	            vet[i] = ler.nextInt();
	            if (vet[i] % 2 != 0 ) {
	                vet[i] *= 10;
	            }
	        }
	        for (int i = 0; i < 5; i++) {
	            System.out.println("vetot de indice  "+i+" : "+ vet[i]);
	            
	        }




	        ler.close();
	    }
	}
