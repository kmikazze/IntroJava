package EntradaSaida;
import java.util.Scanner;
public class aula1 {

	//ENTRADA E SAÍDA DE DADOS
	public static void main(String[] args) {
		
		String nome;
		float distancia;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite a distância: ");
		
		distancia = leia.nextFloat();
		System.out.println("\nParabéns, " + nome + "!! A distância percorrida foi de " + distancia + "KM");
	}

}
