package VetoreMatriz;
import java.util.Scanner;
public class Matriz2Exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int diagonalPrincipal, diagonalSecundaria,soma=0,soma2=0;
        //leitura do código

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite um valor para a posição");
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        	//Diagonal principal
        System.out.println("\nO valor da diagonal principal: ");
        for (int posicao=0;posicao<matriz.length;posicao++) {
            System.out.print(matriz[posicao][posicao]+" ");
        }
        System.out.println("\nO valor da diagonal secundária: ");
        for (int posicao=0;posicao<matriz.length;posicao++) {
            System.out.print(matriz[posicao][matriz.length-posicao-1]+" ");
        }
        for(int posicao=0; posicao<matriz.length; posicao++) {
        	soma+=matriz[posicao][posicao];
        	soma2+=matriz[posicao][matriz.length-posicao-1];
        	}
        System.out.println("\nSoma dos elementos Diagonal Principal: "+soma);
        System.out.println("\nSoma dos elementos Diagonal Secundária: "+soma2);
        }
        
	}
