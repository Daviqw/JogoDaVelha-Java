package JogoDaVelhaPackage;

import java.util.Scanner;

public class JogoDaVelha_Diogo {

	public static void main(String[] args) {

		// Declaração e inicialização dos atributos

		char velha[][] = new char[3][3];
		int posicao = 0, jogadas = 9, fim = 0, linha = 0, coluna = 0;
		boolean triunfoJ1 = false, triunfoJ2 = false;
		char jogador1 = ' ', jogador2 = ' ';
		Scanner teclado = new Scanner(System.in);

		// Tabuleiro com espaços em branco para representar posições vazias
		for (int i = 0; i < velha.length; i++) {
			for (int j = 0; j < velha[i].length; j++) {
				velha[i][j] = ' ';
			}
		}

		// Escolha de simbolos
		for (int a = 0; a < 1; a++) {
			System.out.printf("Escolha o simbolo do JOGADOR 1   ( X ) ou ( O )  %n");
			jogador1 = teclado.next().charAt(0);
			if (jogador1 == 'x' || jogador1 == 'X') {
				jogador2 = 'O';
			} else if (jogador1 == 'o' || jogador1 == 'O') {
				jogador2 = 'X';
			} else {
				System.out.printf("Apenas ( X ) ou ( O ). %n%n");
				a--;
			}
		}
		// Impressao das posições e tela de jogo
		System.out.printf("-----------JOGO DA VELHA----------%n%n" + "| JOGADOR 1 : " + jogador1 + "    JOGADOR 2 : "
				+ jogador2 + " |%n%n" + "   POSIÇÕES:         TELA DE JOGO:  %n| 1 |  2  | 3 |    |   |     |   |"
				+ "%n---------------    ---------------%n| 4 |  5  | 6 |    |   |     |   |"
				+ "%n---------------    ---------------%n| 7 |  8  | 9 |    |   |     |   |%n%n"
				+ "----Escolha uma posição para jogar----%n%n");

		// Laço do jogo
		do {

			// Jogador 1
			while (true) {

				System.out.println("Jogador 1");
				System.out.println("");
				posicao = teclado.nextInt();

				linha = (posicao - 1) / 3;
				coluna = (posicao - 1) % 3;

				// Verifica se a posição é válida ou não
				if (posicao < 1 || posicao > 9 || velha[linha][coluna] != ' ') {
					System.out.println("Posição inválida ou já ocupada, escolha outra posição.");
					continue;
				} else {
					velha[linha][coluna] = jogador1;
					jogadas--;
					printTabuleiro(velha);
					triunfoJ1 = verificarTriunfo(velha, jogador1);

					// Verifica se o J1 ganhou
					if (triunfoJ1) {
						fim = 1;
					}
					break;
				}
			}

			// Verifica se o jogo acabou dps da jogada do J1
			if ((fim == 1) || (jogadas == 0)) {
				break;
			}

			// Jogador 2
			while (true) {
				System.out.println("Jogador 2");
				System.out.println("");
				posicao = teclado.nextInt();
				linha = (posicao - 1) / 3;
				coluna = (posicao - 1) % 3;

				// Verifica se a posição é válida ou não
				if (posicao < 1 || posicao > 9 || velha[linha][coluna] != ' ') {
					System.out.println("Posição inválida ou já ocupada, escolha outra posição.");
					continue;
				} else {
					velha[linha][coluna] = jogador2;
					jogadas--;
					printTabuleiro(velha);
					triunfoJ2 = verificarTriunfo(velha, jogador2);

					// Verifica se o J2 triunfou
					if (triunfoJ2) {
						fim = 1;
					}
					break;
				}
			}

			// Verifica se o jogo acabou dps da jogada do J2
			if ((fim == 1) || (jogadas == 0)) {
				break;
			}

		} while (fim != 1);

		// Exibição do resultado
		if (triunfoJ1 == true) {
			System.out.println("O Jogador 1 é o vencedor!");
		} else if (triunfoJ2 == true) {
			System.out.println("O Jogador 2 é o vencedor!");
		} else {
			System.out.println("Deu velha");
		}
		teclado.close();
	}

	// Módulo da impressão do tabuleiro
	public static void printTabuleiro(char[][] tabuleiro) {
		System.out.printf("   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    | " + tabuleiro[0][0] + " |" + " "
				+ tabuleiro[0][1] + " | " + tabuleiro[0][2] + " |"
				+ "%n---------------    -------------%n| 4 |  5  | 6 |    | " + tabuleiro[1][0] + " |" + " "
				+ tabuleiro[1][1] + " | " + tabuleiro[1][2] + " |"
				+ "%n---------------    -------------%n| 7 |  8  | 9 |    | " + tabuleiro[2][0] + " |" + " "
				+ tabuleiro[2][1] + " | " + tabuleiro[2][2] + " |%n%n" + "--------------------------------------%n");

	}

	// Método para verificar se um jogador triunfou
	public static boolean verificarTriunfo(char[][] velha, char jogador) {

		// Horizontal e vertical
		for (int i = 0; i < 3; i++) {
			if ((velha[i][0] == jogador) && (velha[i][1] == jogador) && (velha[i][2] == jogador)) {
				return true;
			}
			if ((velha[0][i] == jogador) && (velha[1][i] == jogador) && (velha[2][i] == jogador)) {
				return true;
			}
		}

		// Diagonal
		if ((velha[0][0] == jogador) && (velha[1][1] == jogador) && (velha[2][2] == jogador)) {
			return true;
		}
		if ((velha[0][2] == jogador) && (velha[1][1] == jogador) && (velha[2][0] == jogador)) {
			return true;
		}
		return false;
	}
}