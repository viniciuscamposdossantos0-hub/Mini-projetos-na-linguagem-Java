import java.util.Scanner;
public class Calculadora {
    static Scanner scanner = new Scanner(System.in);
    static char escolha;
    static double num1;
    static double num2;
    static double resultado;
    static void EntradaDados() {
        System.out.println("========Calculadora========");
        System.out.println("Escolha uma operação");
        System.out.println("(+)");
        System.out.println("(-)");
        System.out.println("(*)");
        System.out.println("(/)");
        escolha = scanner.next().charAt(0);
        System.out.println("\n");
    }

    static void ProcessamentoDados() {
        switch (escolha)
        {
            case '+':
                System.out.println("Digite o primeiro número");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = scanner.nextDouble();
                System.out.println("\n");
                System.out.println("\n");
                resultado = num1 + num2;
                break;
            case '-':
                System.out.println("Digite o primeiro número");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = scanner.nextDouble();
                System.out.println("\n");
                System.out.println("\n");
                resultado = num1 - num2;
                break;
            case '*':
                System.out.println("Digite o primeiro número");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = scanner.nextDouble();
                System.out.println("\n");
                System.out.println("\n");
                resultado = num1 * num2;
                break;
            case '/':
                System.out.println("Digite o primeiro número");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = scanner.nextDouble();
                System.out.println("\n");
                System.out.println("\n");
                resultado = num1 / num2;
                break;
            case '%':
                System.out.println("Digite o primeiro número");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = scanner.nextDouble();
                System.out.println("\n");
                System.out.println("\n");
                resultado = num1 % num2;
            default:
                System.out.println("Digite um operador aritmético válido!");
        }
    }

    static void SaidaDados()
    {
        System.out.printf("resultado: %.2f", resultado);
    }

    static void main()
    {
        EntradaDados();
        ProcessamentoDados();
        SaidaDados();
    }
}