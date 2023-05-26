package EntradaSaida;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua nota do 1º Semestre: ");
		n1 = leia.nextFloat();
		System.out.println("Digite sua nota do 2º Semestre: ");
		n2 = leia.nextFloat();
		System.out.println("Digite sua nota do 3º Semestre: ");
		n3 = leia.nextFloat();
		System.out.println("Digite sua nota do 4º Semestre: ");
		n4 = leia.nextFloat();
		media = (n1+n2+n3+n4)/4;
		System.out.printf("Sua média final é: %.1f",media);
		
	}

}
