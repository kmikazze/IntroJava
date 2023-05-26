package LacosRepeticao;
import java.util.Scanner;
public class Laco1Exerc1 {

	public static void main(String[] args) {
		int num1,num2,contador;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1=leia.nextInt();
		System.out.println("Digite o ultimo número do intervalo: ");
		num2=leia.nextInt();
		
		if(num1<num2) {
			System.out.println("No intervalo entre"+num1+" e "+num2+"\n");
			for (contador = num1; contador < num2; contador++) {
				if (contador%3==0 && contador%5==0){
					System.out.println(contador+" é multiplo de 3 e 5.");
						}
					}
				}else {
					System.out.println("Intervalo inválido!");
			}
		}
	}
