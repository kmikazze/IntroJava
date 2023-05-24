package Projetinho;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		float salario,addn,he,desconto,salarioLiquido;  //addn = adicional noturno.
		         										//he = é hora extra.
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		addn = leia.nextFloat();
		System.out.println("Digite o valor das suas horas extras: ");
		he = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		desconto = leia.nextFloat();
		salarioLiquido = salario+addn+(he*5)-desconto;
		System.out.println("Seu salário líquido é: "+salarioLiquido);
	}

}
