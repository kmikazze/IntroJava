package EstruturaDados;
import java.util.Stack;
public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("O Assassinato do Expresso do Oriente");
		pilha.push("Alquimista");
		pilha.push("Como Influenciar pessoas");
		pilha.push("Persépolis");
		pilha.push("Um Estudo em Vermelho");
		
		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nElemento no topo da Pilha: " + pilha.peek());
		
		System.out.println("\nAdicionar Elemento Prato Roxo: " + pilha.push("Prato Roxo"));
		
		System.out.println("\nExibir a Pilha Atualizada: " + pilha);
		
		System.out.println("\nTamanho da Pilha: " + pilha.size());

		System.out.println("\nO Elemento Prato Verde existe na Pilha? " + pilha.contains("Prato Verde"));
		
		/*System.out.println("\nExibir todos os Elementos da Pilha por Iteração");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}

		pilha.clear();

		System.out.println("\nA Pilha está vazia? " + pilha.isEmpty()); */
	}

}
