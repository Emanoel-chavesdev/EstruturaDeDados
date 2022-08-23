package questao02;

public class Questao02 {
	int[][] matriz = new int[3][4]; // inicializa a matriz com zeros
	//loop para preencher e mostrar a diagonal
	int impar=1;
	for(int linhas=0;linhas<3;linhas++){
	for(int cols=0;cols<4;cols++){
	matriz[linhas][cols]=impar;
	if (linhas==cols)
	System.out.printf("%d\t",matriz[linhas][cols]);
	else
	System.out.printf("0\t");
	impar+=2;
	}
	System.out.printf("\n");
		
		}
			
			System.out.println("Maior valor: " + maiorValor);
			System.out.println("Menor valor: " + menorValor);
			
		}
		
		return m;
	}
	
	public static void mostrar(int [][]matriz) {
		for (int linha = 0; linha < matriz.length; linha++ ) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + "	" );
			}
			System.out.println();
		}
		
	}
	}
	}

}
