package teste;
import java.util.Random;
public class Ativ7 {
	
	
	    public static void main(String [] args) {
	        Random aleatorio = new Random();
	 
	        int matriz [][] = new int [2][5], x = 0;
	 
	        int vetor [] = new int [(matriz.length * matriz[0].length)];
	        System.out.println(" o tamanho do vetor é "+ vetor.length);
	 
	        for (int i = 0; i < matriz.length; i++) {
	            System.out.println();
	 
	            for (int j = 0; j < matriz[i].length; j++) {
	 
	                matriz[i][j] = aleatorio.nextInt(100);
	                System.out.print(" " + matriz[i][j] + " ");
	 
	            }
	        }
	        System.out.println();
	 
	            for (int j = 0; j < matriz.length; j++) {

	                for (int j2 = 0; j2 < matriz[j].length; j2++) {
	                    
	                    vetor[x] = matriz[j][j2];
	                    System.out.print(" " + vetor[x] +" ");
	                     x++;
	                }
	            }
	        }
	    
}
