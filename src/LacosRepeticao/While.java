package LacosRepeticao;

import java.util.Scanner;

public class While {

	//O intuito do while é determinar quando o programa vai parar
	
	public static void main(String[] args) {
		String continua = "Sim";
		//boolean continua = true
		int numero1,numero2,resultado = 0;
		Scanner leia = new Scanner(System.in);
		
		while(continua.equals("Sim")) {
			System.out.println("Digite o primeiro valor: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite segundo valor: ");
			numero2=leia.nextInt();
			
			resultado=numero1+numero2;
			
			System.out.println("Resultado final: "+resultado);
			System.out.println("Deseja continuar? (sim/não)");
			continua = leia.next();		
			System.out.println("Fim do programa");
		}
	}

}
