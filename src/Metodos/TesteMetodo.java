package Metodos;

public class TesteMetodo {

	public static void main(String[] args) {
		int resultado=0;
		String texto;
		
		resultado = somar(7,5);
		
		System.out.println("Resultado: "+resultado);
		System.out.println("Resultado: "+somar(7,4));
		exibir();
	}
	public static int somar(int num1,int num2) {
		return num1+num2;
	}
	public static void exibir() {
		System.out.println("Olá, mundo!");
	}
}
