package LacosCondicionais;
import java.util.Scanner;
public class Lista1Exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if(num%2==0 && (num>=0)) {
		System.out.println("O número é positivo e par!");
		}else if(num%2==0 && (num<0)){
			System.out.println("O número é negativo e par!");
		}else if(num%2!=0 && (num>0)){
			System.out.println("O número é positivo e ímpar!");
		}else {
			System.out.println("O número é negativo e ímpar!");
		}
	}

}