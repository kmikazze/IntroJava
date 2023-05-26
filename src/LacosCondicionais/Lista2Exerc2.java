package LacosCondicionais;
import java.util.Scanner;
public class Lista2Exerc2 {

	public static void main(String[] args) {
		String colaborador;
		int cargo;
		float salario,novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		colaborador = leia.nextLine();
		System.out.println("Digite o cógigo do cargo: ");
		cargo = leia.nextInt();
		System.out.println("Digite seu salário: ");
		salario=leia.nextFloat();
		
		switch(cargo) {
		case 1:
			novoSalario=salario+(0.1f*salario);
			System.out.println("Olá, Gerente, "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		case 2:
			novoSalario=salario+(0.07f*salario);
			System.out.println ("Olá, Vendedor(a), "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		case 3:
			novoSalario=salario+(0.09f*salario);
			System.out.println ("Olá, Supervisor(a), "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		case 4:
			novoSalario=salario+(0.06f*salario);
			System.out.println ("Olá, Motorista, "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		case 5:
			novoSalario=salario+(0.05f*salario);
			System.out.println ("Olá, Estoquista, "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		case 6:
			novoSalario=salario+(0.08f*salario);
			System.out.println ("Olá, Estoquista, "+colaborador+"! seu novo salário é de: R$"+novoSalario);
			break;
		}
	}

}
