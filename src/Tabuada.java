import java.util.Scanner;
public class For {
    static void main() {
        System.out.println("========Tabuada========");
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um número inteiro");
            int numero = scanner.nextInt();
            for (byte i = 1; i <= 10; i++)
            {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
