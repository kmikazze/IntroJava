package LacosCondicionais;
import java.util.Scanner;
public class LacoSimples {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o número 1 ou 2: ");
		num = ler.nextInt();
		
		if(num == 1) {
			System.out.println("Conta paga no débito!");
		}else if(num == 2) {
			System.out.println("Conta paga no crédito!");
		}else {
			System.out.println("Número inválido!");
		}
	}

}
