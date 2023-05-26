package LacosRepeticao;
import java.util.Scanner;
public class Laco3Exerc1 {

	public static void main(String[] args) {
		int num,soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			num=leia.nextInt();
			if(num>0) {
			soma=soma+num;
			}
		}while(num!=0);
		System.out.println("A soma dos números positivos é: "+soma);
		}
	}