package Projetinho;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,calculo;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 4 números em 2 blocos e veja a diferença entre eles!\n");
		System.out.println("Digite o numero 1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o numero 2: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o numero 3: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o numero 4: ");
		n4 = leia.nextFloat();
		calculo = (n1*n2)-(n3*n4);
		System.out.println("Essa é a diferença entre os números do primeiro boco: "+calculo);
	}

}
