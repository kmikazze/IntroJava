package Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Array2Exerc2 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<>();
		Scanner leia = new Scanner(System.in);
		int num;
		
		setNumeros.add(0);
		setNumeros.add(1);
		setNumeros.add(2);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(5);
		setNumeros.add(6);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(9);
		
		System.out.println("Digite o número que deseja encontrar: ");
		num=leia.nextInt();
		
		if(setNumeros.contains(num)) {
			System.out.println("O número "+num+" foi encontrado!");
		}else {
			System.out.println("O número "+num+" não foi encontrado!");
		}
	}

}
