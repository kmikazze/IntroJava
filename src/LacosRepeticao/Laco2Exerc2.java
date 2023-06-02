package LacosRepeticao;
import java.util.Scanner;
public class Laco2Exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade,sexo,categoria,backend=0,frontendMulheres=0,mobileMaior40=0,fullstackMenor=0;
		String continua="S";
		
		while(!continua.equals("N")) {
			System.out.println("Digite a idade: ");
			idade=leia.nextInt();
			
			System.out.println("\nDigite o sexo: \n"
					+ "1 - Masculino\n"
					+ "2 - Feminino\n"
					+ "3 - Outros");
			sexo=leia.nextInt();
			
			System.out.println("\nDigite a categoria: \n"
					+ "1 - Backend\n"
					+ "2 - Frontend\n"
					+ "3 - Mobile\n"
					+ "4 - FullStack");
			categoria=leia.nextInt();
			
			if(categoria==1) {
				backend++;
			}if(sexo==2 && categoria==2) {
				frontendMulheres++;
			}if(sexo==1 && categoria==3 && idade>=40) {
				mobileMaior40++;
			}if(sexo==2 && categoria==4 && idade<=30) {
				fullstackMenor++;
			}
			System.out.println("Deseja continuar? (S/N");
			continua=leia.next();
		}
		System.out.println("\nPessoas backend: "+backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+frontendMulheres);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+mobileMaior40);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+fullstackMenor);
	}

}
