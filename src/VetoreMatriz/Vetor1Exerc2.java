package VetoreMatriz;

import java.util.Scanner;

public class Vetor1Exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0,num;

		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			vetor[posicao]=num;
		}
		System.out.println("Elementos nos índices ímpares : ");
		for (int posicao = 1; posicao < vetor.length; posicao+=2) {
				System.out.println(vetor[posicao]);
				}
		System.out.println("Elementos nos índices pares : ");
		for (int posicao = 0; posicao < vetor.length; posicao++) {
		soma+=vetor[posicao];
			if (vetor[posicao] % 2 == 0) {
				System.out.println(vetor[posicao]);
				}
			}
		System.out.println("Soma: "+soma);
		float media=(float)soma/10;
		System.out.printf("Média: %.1f",media);
		}
}
