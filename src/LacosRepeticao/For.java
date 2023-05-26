package LacosRepeticao;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		String nome;
		int num;
		Scanner leia = new Scanner(System.in);
		
		for(num = 1; num<4; num++) {
			System.out.println("Digite o "+num+"º nome: ");
			nome=leia.next();
			System.out.println("O "+num+"º nome é: "+nome);
			System.out.println("--------------------------");
		}
	}

}
