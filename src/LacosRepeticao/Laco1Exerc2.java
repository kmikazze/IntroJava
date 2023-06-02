package LacosRepeticao;
import java.util.Scanner;
public class Laco1Exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num=0,par=0,impar=0;

		for(int i=0;i<10;i++) {
			System.out.print("Digite o "+(i+1)+" número: ");
			num=leia.nextInt();
			if(num%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.print("\nTotal de número pares: "+par);
		System.out.print("\nTotal de números ímpares: "+impar);
	}
}
