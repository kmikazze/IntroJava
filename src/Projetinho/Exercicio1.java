package Projetinho;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario,abono,novosalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		novosalario = salario + abono;
		
		System.out.println("Seu novo salário é: "+ novosalario);
	}

}
