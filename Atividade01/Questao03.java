package Questao03;

public class Questao03 {

	public static void main(String args[]){
		int vet [];
		int aux = 0;
		int i = 0;

		System.out.println("Vetor desordenado: ");
		for(i = 0; i<50; i++){
			System.out.println(" "+vet[i]);
		}
		System.out.println(" ");

		for(i = 0; i<5; i++){
			for(int j = 0; j<50j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado:");
		for(i = 0; i< vet.length; i++){
			System.out.println(" "+vet[i]);
		}
		System.out.println("Digite o valor a ser procurado: ");
		int num = scan.nextInt();
		
		int inicio=0, meio=0, fim=vet.length - 1;
		while inicio <= fim) {
	}
	}

}
