package VetoreMatriz;

public class Matriz {

	public static void main(String[] args) {
		int matrizInteiros[][] = {
				{10,15,35},
				{70,120,140},
				{50,100,150}
		};
		for(int indiceLinha = 0; indiceLinha<3; indiceLinha++) {
			for(int indiceColuna = 0;indiceColuna<3; indiceColuna++){
				
				System.out.println("["+indiceLinha+"]["+indiceColuna+"] é: "
						+matrizInteiros[indiceLinha][indiceColuna]);
			}
		}
		System.out.println("Tamanho da Linha: "+matrizInteiros.length);
		System.out.println("Tamanho da Coluna: "+matrizInteiros[0].length);
	}

}
