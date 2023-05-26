package LacosCondicionais;
import java.util.Scanner;
public class Lista1Exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if(a+b>c) {
			System.out.println(a+"+"+b+" é maior do que "+c);
		}else if(a+b<c) {
			System.out.println(+a+"+"+b+" é menor do que "+c);
		}else if(a+b==c) {
			System.out.println(+a+"+"+b+" é igual a "+c);
		}
	}

}
