import java.util.Scanner;
import java.util.Arrays;

static byte[] ijA = new byte[2];
static int[][] A;
static byte[] ijB = new byte[2];
static int[][] B;
static Scanner scanner = new Scanner(System.in);
static double[][] resultado;

static void Soma() {
    System.out.println("Digite o número de linhas da primeira matriz");
    ijA[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da primeira matriz");
    ijA[1] = scanner.nextByte();
    System.out.println("Digite o número de linhas da segunda matriz");
    ijB[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da segunda matriz");
    ijB[1] = scanner.nextByte();
    if (ijA[0] != ijB[0]) {
        System.out.println("AS MATRIZES DEVEM TER A MESMA ORDEM!");
    } else if (ijA[1] != ijB[1]) {

        System.out.println("AS MATRIZES DEVEM TER A MESMA ORDEM!");
    } else {
        System.out.println();
        A = new int[ijA[0]][ijA[1]];
        System.out.println("Primeira matriz");
        System.out.println("Digite os termos da primeira matriz, da esquerda para a direita, de cima para baixo");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("A = " + Arrays.deepToString(A));
        System.out.println();
        System.out.println();
        B = new int[ijB[0]][ijB[1]];
        System.out.println("Segunda matriz");
        System.out.println("Digite os termos da primeira matriz, da esquerda para a direita, de cima para baixo");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("B = " + Arrays.deepToString(B));
        System.out.println();

        resultado = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Resultado: " + Arrays.deepToString(resultado));
    }
}

static void Subtracao() {
    System.out.println("Digite o número de linhas da primeira matriz");
    ijA[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da primeira matriz");
    ijA[1] = scanner.nextByte();
    System.out.println("Digite o número de linhas da segunda matriz");
    ijB[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da segunda matriz");
    ijB[1] = scanner.nextByte();
    if (ijA[0] != ijB[0]) {
        System.out.println("AS MATRIZES DEVEM TER A MESMA ORDEM!");
    } else if (ijA[1] != ijB[1]) {
        System.out.println("AS MATRIZES DEVEM TER A MESMA ORDEM!");
    } else {
        System.out.println();
        A = new int[ijA[0]][ijA[1]];
        System.out.println("Primeira matriz");
        System.out.println("Digite os termos da primeira matriz, da esquerda para a direita, de cima para baixo");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("A = " + Arrays.deepToString(A));
        System.out.println();
        System.out.println();
        B = new int[ijB[0]][ijB[1]];
        System.out.println("Segunda matriz");
        System.out.println("Digite os termos da primeira matriz, da esquerda para a direita, de cima para baixo");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("B = " + Arrays.deepToString(B));
        System.out.println();

        resultado = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                resultado[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Resultado: " + Arrays.deepToString(resultado));
    }
}

static void Multiplicacao() {
    System.out.println("Digite o número de linhas da primeira matriz");
    ijA[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da primeira matriz");
    ijA[1] = scanner.nextByte();
    System.out.println("Digite o número de linhas da segunda matriz");
    ijB[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da segunda matriz");
    ijB[1] = scanner.nextByte();
    if (ijA[1] != ijB[0]) {
        System.out.println("O NÚMERO DE COLUNAS DA PRIMEIRA MATRIZ DEVE SER IGUAL AO DA SEGUNDA!");
    } else {
        A = new int[ijA[0]][ijA[1]];
        System.out.println("Primeira matriz");
        System.out.println("Digite os termos da esquerda para a direira, de cima para baixo");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("A = " + Arrays.deepToString(A));
        System.out.println();
        B = new int[ijB[0]][ijB[1]];
        System.out.println("Segunda matriz");
        System.out.println("Digite os termos da esquerda para a direira, de cima para baixo");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("B = " + Arrays.deepToString(B));
        System.out.println();

        resultado = new double[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                resultado[i][j] += A[i][j] * B[j][i];
            }
        }
        System.out.println("Resultado: " + Arrays.deepToString(resultado));
    }
}

static void Determinante2x2() {
    System.out.println("Digite o número de linhas da matriz");
    ijA[0] = scanner.nextByte();
    System.out.println("Digite o número de colunas da matriz");
    ijA[1] = scanner.nextByte();
    A = new int[ijA[0]][ijA[1]];
    if (A.length == 2 && A[0].length == 2) {
        System.out.println("Digite os termos da matriz da direita para a esquerda, de cima pra baixo");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("A = " + Arrays.deepToString(A));
        int determinante = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        System.out.println("Resultado: " + determinante);
    } else System.out.println("Por enquanto só é possível determinar matrizes 2x2 º-º");
}

void main() {
    System.out.println("====================================");
    System.out.println("     Calculadora de matrizes");
    System.out.println("====================================");

    System.out.println("Selecione uma operação");
    System.out.println("(1) Soma");
    System.out.println("(2) Subtração");
    System.out.println("(3) Multiplicação");
    System.out.println("(4) Determinante 2 por 2");
    String escolha = scanner.next();
    switch (escolha) {
        case "1":
            System.out.println();
            System.out.println("SOMA");
            Soma();
            break;
        case "2":
            System.out.println();
            System.out.println("SUBTRAÇÃO");
            Subtracao();
            break;
        case "3":
            System.out.println();
            System.out.println("MULTIPLICAÇÃO");
            Multiplicacao();
            break;
        case "4":
            System.out.println();
            System.out.println("DETERMINANTE 2x2");
            Determinante2x2();
            break;
        default:
            System.out.println();
            System.out.println("digite 1, 2, 3 ou 4!");
    }
}

