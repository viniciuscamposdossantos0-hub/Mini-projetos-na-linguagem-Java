import java.util.Scanner;
static Scanner scanner = new Scanner(System.in);
static double[] vetor = new double[10];
static byte idx = 0;

void main()
{
    inicioVetor();
    maiorValor();
    menorValor();
    media();
}

void inicioVetor()
{
    idx = 0;
    System.out.println("O vetor tem 10 índices. Informe os 10 termos");
    while (idx < 10)
    {
        vetor[idx] = scanner.nextDouble();
        idx++;
    }
}

void maiorValor()
{
    double maiorValor;

    maiorValor = vetor[0];

    for (idx = (byte) (vetor.length - 1); idx >= 0 ; idx--)
    {
        if (vetor[idx] > maiorValor)
        {
            maiorValor = vetor[idx];
        }
    }
    System.out.println("maior valor: " + maiorValor);
}

void menorValor()
{
    double menorValor;

    menorValor = vetor[0];

    for (idx = (byte) (vetor.length - 1); idx >= 0 ; idx--)
    {
        if (vetor[idx] < menorValor)
        {
            menorValor = vetor[idx];
        }
    }
    System.out.println("menor valor: " + menorValor);
}

void media()
{
    double soma;
    double media;

    soma = 0;

    for (idx = 0; idx < vetor.length ; idx++)
    {
        soma = soma + vetor[idx];
    }
        media = soma / vetor.length;
    System.out.println("média dos termos: " + media);
}