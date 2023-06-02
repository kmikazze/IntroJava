package EstruturaDados;
import java.util.Stack;
import java.util.Scanner;
public class PilhaExercicio {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		Integer num;
		String livro;
		
		System.out.println("\t============ MENU ============\n"
				+ "\t|1 - Adicionar livro na pilha |\n"
				+ "\t|2 - Listar todos os livros   |\n"
				+ "\t|3 - Retirar livro da pilha   |\n"
				+ "\t|0 - Sair		      |");
		System.out.print("\nEscolha uma opção: ");
		num=leia.nextInt();
		while(num!=0) {
			if(num==1) {
				System.out.print("Digite o nome do livro: ");
				leia.nextLine();
				livro=leia.nextLine();
				pilha.add(livro);
				System.out.println("Livro adicionado com sucesso!");
			}else if(num==2) {
				System.out.print("Lista de livros na fila: "+pilha);
			}else if(num==3) {
				System.out.println(pilha.pop());
				System.out.println("\nLivro removido com sucesso!");
			}else {
				System.out.println("\nOpção inválida!");
			}
			System.out.print("\nEscolha uma opção: ");
			num=leia.nextInt();
		}
		System.out.println("O programa foi finalizado!");
	}

}
