package LacosRepeticao;
import java.util.Scanner;
public class Laco2Exerc1 {

	public static void main(String[] args) {
		int idade=0,maiorAge=0,menorAge=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade>=0) {
			
			if(idade<21) {
				menorAge++;
				System.out.println("Digite uma idade: ");
				idade=leia.nextInt();
			}else if(idade>50) {
				maiorAge++;	
				System.out.println("Digite uma idade: ");
				idade=leia.nextInt();
			}
			
		}
		System.out.println("Total de pessoas maiores de 50 anos: "+maiorAge);
		System.out.println("Total de pessoas menores de 21 anos: "+menorAge);
	}
}