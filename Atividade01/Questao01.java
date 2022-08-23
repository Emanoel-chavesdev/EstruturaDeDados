package questao01;

import java.util.Random;
import java.util.Vector;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {  
	    Random numaleatorio = new Random();
	    
	    Scanner scan = new Scanner(System.in);
	    int[] vetor = new int[10];

	    System.out.println(Vetor []);
}
	     for(int i=0;i<10;i++){
	     System.out.printf("\nResultado do Vetor",i+1);
	     vetor[i]= entrada.nextInt();
				}
	      int num;
		System.out.println("Digite um valor a ser localizado: ");
                num = in.nextInt();
               System.out.println();
	        
	    for(int i=0;i<vetor.length;i++){
	            
	         if(vetor[i] == num){
	            System.out.println("A posição do numero pedido eh " + i);
	            
	            } else if(i != vetor.length){
	                System.out.println("Número não existe no vetor");
	            }
		}

	}
}
