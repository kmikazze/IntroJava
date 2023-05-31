package EstruturaDados;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class FilaExercicio {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		Integer num;
		String nome;
		
		System.out.println("\t============= MENU =============\n"
				+ "\t|1 - Adicionar cliente na fila|\n"
				+ "\t|2 - Listar todos os clientes |\n"
				+ "\t|3 - Retirar cliente da fila  |\n"
				+ "\t|0 - Sair		      |");
		System.out.print("\nEscolha uma opção: ");
		num=leia.nextInt();
		while(num!=0) {
			if(num==1) {
				System.out.print("Digite seu nome: ");
				nome=leia.next();
				fila.add(nome);
				System.out.println("Cliente adicionado com sucesso!");
			}else if(num==2) {
				System.out.print("Lista de clientes na fila: "+fila);
			}else if(num==3) {
				System.out.println(fila.remove());
				System.out.println("Cliente removido com sucesso!");
			}
			System.out.print("\nDigite uma opção: ");
			num=leia.nextInt();
		}
		System.out.println("O programa foi finalizado!");
	}

}

