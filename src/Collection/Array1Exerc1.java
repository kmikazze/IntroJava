package Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Array1Exerc1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		String cor;
		
		for(int i = 0;i<5;i++) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		System.out.println("\nTodas as cores digitadas: "+cores);
		Collections.sort(cores);
		System.out.println("\nCores em ordem: "+cores);
	}

}
