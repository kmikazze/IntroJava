package EstruturaDados;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++) {
			fila.add(i);
		}
		System.out.println("\nPriemeiro elemento da fila: "+fila.peek());
		
		System.out.println("\nRemover elemento: "+fila.remove());
		
		System.out.println("\nFila atualizada: "+fila);
		
		System.out.println("\nAdicionar elemento 11: "+fila.add(11));
		
		System.out.println("\nExibir fila atualizada: "+fila);
		
		System.out.println("\nExibir o primeiro elemento da fila: "+fila.peek());
		
		System.out.println("\nExibir o tamanho da fila: "+fila.size());
		
		System.out.println("\nChecar se o elemento 4 existe na fila? "+fila.contains(4));
		
		System.out.println("\nExibe e retira da fila o 1º elemento (HEAD): "+fila.poll());
		
		/*System.out.println("\nExibir todos os elementos da fila por Iteração: ");
		  Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}

		System.out.println("\nLimpar a fila");
		fila.clear();

		System.out.println("\nA fila está vazia? " + fila.isEmpty());		

		 */
	}
}
