package Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Array2Exerc1 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		Integer num = Integer.valueOf(10);
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite um número: ");
			num=leia.nextInt();
			setNumeros.add(num);
		}
		System.out.println("\nLista de dados do Set: ");
		Iterator<Integer>isetNumeros = setNumeros.iterator();
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		leia.close();
	}

}
