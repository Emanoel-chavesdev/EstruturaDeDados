package questao01;

import java.util.Random;
import java.util.Vector;

public class Questao01 {

	public static void main(String[] args) {  
	    Random numaleatorio = new Random();
	    int[] vetor = new int[10];

	    System.out.println(Vector []);
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
	            // se existir no vetor o número digitado
	         if(vetor[i] == num){
	            System.out.println("A posição do numero pedido eh " + i);
	            // se não existir...
	            } else if(i != vetor.length){
	                System.out.println("Número não encontrado no vetor");
	            }
		}

	}
}
