import java.util.Scanner;
public class CalculadoraDeIMC {
    static void main() {
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Calculadora de IMC=======");
        System.out.println("Informe o peso, em kg");
        float peso = scanner.nextFloat();
        System.out.println("Informe a altura, em m");
        float altura = scanner.nextFloat();
        scanner.close();
        //Processamento de dados
        double IMC = peso / Math.pow(altura, 2);
        //Saida de dados
        if (IMC < 18.5)
        {
            System.out.printf("IMC = " + IMC, "(baixo peso)%.2f%n");
        } else if (IMC >= 18.5 && IMC <= 24.9)
        {
            System.out.printf("IMC = %.2f" + " (peso normal!)%n", IMC);
        } else if (IMC > 24.9)
        {
            System.out.printf("IMC = %.2f" + " (obeso!)%n", IMC);
        }
    }
}
