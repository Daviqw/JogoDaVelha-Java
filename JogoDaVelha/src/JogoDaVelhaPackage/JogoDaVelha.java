package JogoDaVelhaPackage;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		// Var's & Scan

		char velha[][] = new char[3][3];
		int posicao, cont = 0, posicao2 = 0;
		char Jogador1, Jogador2 = ' ';
		Scanner teclado = new Scanner(System.in);

		// Escolha de simbolos

		for (int a = 0; a < 1; a++) {
			System.out.printf("Escolha o simbolo do JOGADOR 1   ( X ) ou ( O )  %n");
			Jogador1 = teclado.next().charAt(0);
			if (Jogador1 == 'x' || Jogador1 == 'X') {
				Jogador2 = 'O';
			} else if (Jogador1 == 'o' || Jogador1 == 'O') {
				Jogador2 = 'X';
			} else {
				System.out.printf("Apenas ( X ) ou ( O ). %n%n");
				a--;
				continue;
			}

			// Impressao das posições e tela de jogo

			System.out.printf("-----------JOGO DA VELHA----------%n%n" + "| JOGADOR 1 : " + Jogador1
					+ "    JOGADOR 2 : " + Jogador2 + " |%n%n"
					+   "   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    |   |    |   |"
					+ "%n---------------    ---------------%n| 4 |  5  | 6 |    |   |    |   |"
					+ "%n---------------    ---------------%n| 7 |  8  | 9 |    |   |    |   |%n%n"
					+ "----Escolha uma posição para jogar----%n%n");

			// Atribuição das posições na tela de jogo

			posicao = teclado.nextInt();

			for (int z = 0; z < 9; z++) {
				for (int c = 0; c < 9; c++) {
					if (posicao == 1 && posicao != posicao2) {
						velha[0][0] = Jogador1;
						break;
					} else if (posicao == 2 && posicao != posicao2) {
						velha[0][1] = Jogador1;
						break;
					} else if (posicao == 3 && posicao != posicao2) {
						velha[0][2] = Jogador1;
						break;
					} else if (posicao == 4 && posicao != posicao2) {
						velha[1][0] = Jogador1;
						break;
					} else if (posicao == 5 && posicao != posicao2) {
						velha[1][1] = Jogador1;
						break;
					} else if (posicao == 6 && posicao != posicao2) {
						velha[1][2] = Jogador1;
						break;
					} else if (posicao == 7 && posicao != posicao2) {
						velha[2][0] = Jogador1;
						break;
					} else if (posicao == 8 && posicao != posicao2) {
						velha[2][1] = Jogador1;
						break;
					} else if (posicao == 9 && posicao != posicao2) {
						velha[2][2] = Jogador1;
						break;
					} else if (posicao == posicao2) {
						System.out.println("Posição ja marcada, informe outra posição");
						break;
					}
				}
				System.out.printf("   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    | " + velha[0][0] + " |" + " "
						+ velha[0][1] + " | " + velha[0][2] + " |"
						+ "%n---------------    -------------%n| 4 |  5  | 6 |    | " + velha[1][0] + " |" + " "
						+ velha[1][1] + " | " + velha[1][2] + " |"
						+ "%n---------------    -------------%n| 7 |  8  | 9 |    | " + velha[2][0] + " |" + " "
						+ velha[2][1] + " | " + velha[2][2] + " |%n%n" + "----------VEZ DO JOGADOR 2-----------%n");

				if (cont < 8) {
					posicao2 = teclado.nextInt();
					cont++;
					for (int b = 0; b < 9; b++) {
						if (posicao2 == 1 && posicao2 != posicao) {
							velha[0][0] = Jogador2;
						} else if (posicao2 == 2 && posicao2 != posicao) {
							velha[0][1] = Jogador2;
							break;
						} else if (posicao2 == 3 && posicao2 != posicao) {
							velha[0][2] = Jogador2;
							break;
						} else if (posicao2 == 4 && posicao2 != posicao) {
							velha[1][0] = Jogador2;
							break;
						} else if (posicao2 == 5 && posicao2 != posicao) {
							velha[1][1] = Jogador2;
							break;
						} else if (posicao2 == 6 && posicao2 != posicao) {
							velha[1][2] = Jogador2;
							break;
						} else if (posicao2 == 7 && posicao2 != posicao) {
							velha[2][0] = Jogador2;
							break;
						} else if (posicao2 == 8 && posicao2 != posicao) {
							velha[2][1] = Jogador2;
							break;
						} else if (posicao2 == 9 && posicao2 != posicao) {
							velha[2][2] = Jogador2;
							break;
						} else if (posicao2 == posicao) {
							System.out.printf("%n%nPosição ja marcada, informe outra posição %n%n");
							break;
						}
					}

				}
				System.out.printf("   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    | " + velha[0][0] + " |" + " "
						+ velha[0][1] + " | " + velha[0][2] + " |"
						+ "%n---------------    -------------%n| 4 |  5  | 6 |    | " + velha[1][0] + " |" + " "
						+ velha[1][1] + " | " + velha[1][2] + " |"
						+ "%n---------------    -------------%n| 7 |  8  | 9 |    | " + velha[2][0] + " |" + " "
						+ velha[2][1] + " | " + velha[2][2] + " |%n%n" + "----------VEZ DO JOGADOR 1-----------%n");

				if (cont < 8) {
					posicao = teclado.nextInt();
					cont++;
				} else if (cont == 9) {
					System.out.println("EMPATE / DEU VELHA");
				}
			}

			// ganhador 1
			if ((velha[0][0] == Jogador1) && (velha[0][1] == Jogador1) && (velha[0][2] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[1][0] == Jogador1) && (velha[1][1] == Jogador1) && (velha[1][2] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[2][0] == Jogador1) && (velha[2][1] == Jogador1) && (velha[2][2] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[0][0] == Jogador1) && (velha[1][0] == Jogador1) && (velha[2][0] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[1][0] == Jogador1) && (velha[1][0] == Jogador1) && (velha[2][0] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[2][0] == Jogador1) && (velha[1][0] == Jogador1) && (velha[2][0] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[0][0] == Jogador1) && (velha[1][1] == Jogador1) && (velha[2][2] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
			} else if ((velha[0][2] == Jogador1) && (velha[1][1] == Jogador1) && (velha[2][0] == Jogador1)) {
				System.out.println("Jogador 1 VENCEU");
				// ganhador 2
			} else if ((velha[0][0] == Jogador2) && (velha[0][1] == Jogador2) && (velha[0][2] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[1][0] == Jogador2) && (velha[1][1] == Jogador2) && (velha[1][2] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[2][0] == Jogador2) && (velha[2][1] == Jogador2) && (velha[2][2] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[0][0] == Jogador2) && (velha[1][0] == Jogador2) && (velha[2][0] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[1][0] == Jogador2) && (velha[1][0] == Jogador2) && (velha[2][0] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[2][0] == Jogador2) && (velha[1][0] == Jogador2) && (velha[2][0] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[0][0] == Jogador2) && (velha[1][1] == Jogador2) && (velha[2][2] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			} else if ((velha[0][2] == Jogador2) && (velha[1][1] == Jogador2) && (velha[2][0] == Jogador2)) {
				System.out.println("Jogador 2 VENCEU");
			}
		}
	}
}
