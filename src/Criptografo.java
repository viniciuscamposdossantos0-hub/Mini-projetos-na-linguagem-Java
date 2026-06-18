import java.util.Scanner;
public class Criptografo {
    static int senha;
    static Scanner scanner = new Scanner(System.in);
    static void Input()
    {
        System.out.println("==========Criptógrafo de senhas==========");
        System.out.println();
        System.out.println("Informe a senha a ser criptografada");
        System.out.println("A senha deve conter apenas numeros, sem espaços ou caracteres especiais");
        senha = scanner.nextInt();
    }
    static int Processamento()
    {
        return senha * 2 / 3 * 4 / 5;
    }

    static void Output()
    {
        System.out.println("\n");
        System.out.println("A senha foi criptografada!");
        System.out.println(Processamento());
    }

    static void main() {
        Input();
        Output();
    }
}
