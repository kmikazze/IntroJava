package LacosCondicionais;
import java.util.Scanner;
public class Lista2Exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade,produto;
		float preco;
		
		System.out.println("-------------------- CARDÁPIO --------------------");
		System.out.println("\n1. Cachorro quente: R$10,00      2. X-Salada: R$15,00\n3. X-Bacon: R$18,00              4. Bauru: R$12,00\n5. Refrigerante: R$8,00          6. Suco de laranja: R$13,00\n");
		System.out.println("Digite o número do produto: ");
		produto = leia.nextInt() ;
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt(); 
		
		switch(produto) {
		case 1:
			preco=10.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" Cachorro quente(s): R$ %.2f",preco);
			break;
		case 2:
			preco=15.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" X-Salada(s): R$ %.2f",preco);
			break;
		case 3:
			preco=18.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" X-Bacon(s): R$ %.2f",preco);
			break;
		case 4:
			preco=12.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" Bauru(s): R$ %.2f",preco);
			break;
		case 5:
			preco=8.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" Refrigerante(s): R$ %.2f",preco);
			break;
		case 6:
			preco=13.0f;
			preco=quantidade*preco;
			System.out.printf("\n"+quantidade+" Suco(s) de laranja: R$ %.2f",preco);
			break;
			default:
		}
	}
}
