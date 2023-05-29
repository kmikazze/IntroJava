package VetoreMatriz;
import java.util.Scanner;
public class Vetor1Exerc1 {

	public static void main(String[] args) {
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int num;
		Scanner leia = new Scanner(System.in);
		
		for(int posicao = 0;posicao<vetor.length;posicao++) {
			System.out.print(+vetor[posicao]+" ");
		}
		System.out.println("\nDe acordo com a sequência acima, escolha um número que deseja encontrar: ");
		num=leia.nextInt();
		for(int posicao=0;posicao<vetor.length;posicao++) {
			if(num==vetor[posicao]) {
				System.out.println("O número "+num+" está localizado na posição: "+posicao);
				return;
			}
		}
		System.out.println("O número "+num+" não foi encontrado!");
	}
}