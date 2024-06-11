package JogoDaVelhaPackage;

import java.util.Scanner;

public class JogoDaVelha_Davi {

    public static void main(String[] args) {
        // Var's & Scan
        char velha[][] = new char[3][3];
        int posicao, cont = 0;
        char Jogador1, Jogador2 = ' ';
        Scanner teclado = new Scanner(System.in);

        // Inicializar o tabuleiro com espaços em branco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = ' ';
            }
        }

        // Escolha de simbolos
        System.out.printf("Escolha o simbolo do JOGADOR 1   ( X ) ou ( O )  %n");
        Jogador1 = teclado.next().charAt(0);
        if (Jogador1 == 'x' || Jogador1 == 'X') {
            Jogador2 = 'O';
        } else if (Jogador1 == 'o' || Jogador1 == 'O') {
            Jogador2 = 'X';
        } else {
            System.out.printf("Apenas ( X ) ou ( O ). %n%n");
            return;
        }

        // Loop principal do jogo
        while (true) {
            // Imprime tabuleiro
            System.out.printf("   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    | " + velha[0][0] + " |" + " "
                    + velha[0][1] + " | " + velha[0][2] + " |"
                    + "%n---------------    -------------%n| 4 |  5  | 6 |    | " + velha[1][0] + " |" + " "
                    + velha[1][1] + " | " + velha[1][2] + " |"
                    + "%n---------------    -------------%n| 7 |  8  | 9 |    | " + velha[2][0] + " |" + " "
                    + velha[2][1] + " | " + velha[2][2] + " |%n%n");

            // Jogada do jogador 1
            boolean jogadaValida = false;
            while (!jogadaValida) {
                System.out.println("Jogador 1 (" + Jogador1 + "), escolha uma posição:");
                posicao = teclado.nextInt();
                int linha = (posicao - 1) / 3;
                int coluna = (posicao - 1) % 3;
                if (posicao < 1 || posicao > 9 || velha[linha][coluna] != ' ') {
                    System.out.println("Posição inválida, tente novamente.");
                } else {
                    velha[linha][coluna] = Jogador1;
                    jogadaValida = true;
                }
            }
            cont++;

            // Verificar vitória do jogador 1
            if ((velha[0][0] == Jogador1 && velha[0][1] == Jogador1 && velha[0][2] == Jogador1) ||
                (velha[1][0] == Jogador1 && velha[1][1] == Jogador1 && velha[1][2] == Jogador1) ||
                (velha[2][0] == Jogador1 && velha[2][1] == Jogador1 && velha[2][2] == Jogador1) ||
                (velha[0][0] == Jogador1 && velha[1][0] == Jogador1 && velha[2][0] == Jogador1) ||
                (velha[0][1] == Jogador1 && velha[1][1] == Jogador1 && velha[2][1] == Jogador1) ||
                (velha[0][2] == Jogador1 && velha[1][2] == Jogador1 && velha[2][2] == Jogador1) ||
                (velha[0][0] == Jogador1 && velha[1][1] == Jogador1 && velha[2][2] == Jogador1) ||
                (velha[0][2] == Jogador1 && velha[1][1] == Jogador1 && velha[2][0] == Jogador1)) {
                System.out.println("Jogador 1 VENCEU!");
                break;
            }

            // Verifica empate
            if (cont == 9) {
                System.out.println("EMPATE / DEU VELHA");
                break;
            }

            // Imprime tabuleiro
            System.out.printf("   POSIÇÕES:       TELA DE JOGO:  %n| 1 |  2  | 3 |    | " + velha[0][0] + " |" + " "
                    + velha[0][1] + " | " + velha[0][2] + " |"
                    + "%n---------------    -------------%n| 4 |  5  | 6 |    | " + velha[1][0] + " |" + " "
                    + velha[1][1] + " | " + velha[1][2] + " |"
                    + "%n---------------    -------------%n| 7 |  8  | 9 |    | " + velha[2][0] + " |" + " "
                    + velha[2][1] + " | " + velha[2][2] + " |%n%n");

            // Jogada do jogador 2
            jogadaValida = false;
            while (!jogadaValida) {
                System.out.println("Jogador 2 (" + Jogador2 + "), escolha uma posição:");
                posicao = teclado.nextInt();
                int linha = (posicao - 1) / 3;
                int coluna = (posicao - 1) % 3;
                if (posicao < 1 || posicao > 9 || velha[linha][coluna] != ' ') {
                    System.out.println("Posição inválida, tente novamente.");
                } else {
                    velha[linha][coluna] = Jogador2;
                    jogadaValida = true;
                }
            }
            cont++;

            // Verificar vitória do jogador 2
            if ((velha[0][0] == Jogador2 && velha[0][1] == Jogador2 && velha[0][2] == Jogador2) ||
                (velha[1][0] == Jogador2 && velha[1][1] == Jogador2 && velha[1][2] == Jogador2) ||
                (velha[2][0] == Jogador2 && velha[2][1] == Jogador2 && velha[2][2] == Jogador2) ||
                (velha[0][0] == Jogador2 && velha[1][0] == Jogador2 && velha[2][0] == Jogador2) ||
                (velha[0][1] == Jogador2 && velha[1][1] == Jogador2 && velha[2][1] == Jogador2) ||
                (velha[0][2] == Jogador2 && velha[1][2] == Jogador2 && velha[2][2] == Jogador2) ||
                (velha[0][0] == Jogador2 && velha[1][1] == Jogador2 && velha[2][2] == Jogador2) ||
                (velha[0][2] == Jogador2 && velha[1][1] == Jogador2 && velha[2][0] == Jogador2)) {
                System.out.println("Jogador 2 VENCEU!");
                break;
            }

            // Verifica empate
            if (cont == 9) {
                System.out.println("EMPATE / DEU VELHA");
                break;
            }
        }
        teclado.close();
    }
}
