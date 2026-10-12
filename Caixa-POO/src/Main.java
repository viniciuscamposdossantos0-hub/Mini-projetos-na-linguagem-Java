import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double quantidade;
    public static double valorPagto;


    static Produto alface = new Produto("Alface", 2.50);
    static Produto tomate = new Produto("Tomate", 2.00);
    static Produto maca = new Produto("Maçã", 2.50);
    static Produto leite = new Produto("Leite", 10.00);
    static Produto ovo = new Produto("Ovo", 6.00);
    static Produto acucar = new Produto("Açúcar", 8.00);
    static Produto frango = new Produto("Frango", 25.00);
    static Produto peixe = new Produto("Peixe", 30.00);
    static Produto arroz = new Produto("Arroz", 15.00);
    static Produto feijaoCarioca = new Produto("Feijão carioca", 7.50);
    static Produto feijaoPreto = new Produto("Feijão preto", 8.00);
    static Produto farinha = new Produto("Farinha", 10.00);
    static Produto oleo = new Produto("Óleo", 8.00);
    static Produto azeite = new Produto("Azeite", 20.50);
    static Produto vinagre = new Produto("Vinagre", 10.99);
    static Produto agua = new Produto("Água", 10.00);
    static Produto sucoDeLaranja = new Produto("Suco de laranja", 5.95);
    static Produto sucoDeLimao = new Produto("Suco de limão", 5.95);
    static Produto cafe = new Produto("Café", 10.50);
    static Produto cebola = new Produto("Cebola", 2.25);

    static ArrayList<Produto> ListaDeProdutos = new ArrayList<>();

    public static void listaDeProdutos() {
        ListaDeProdutos.add(null);
        ListaDeProdutos.add(alface);
        ListaDeProdutos.add(tomate);
        ListaDeProdutos.add(maca);
        ListaDeProdutos.add(leite);
        ListaDeProdutos.add(ovo);
        ListaDeProdutos.add(acucar);
        ListaDeProdutos.add(frango);
        ListaDeProdutos.add(peixe);
        ListaDeProdutos.add(arroz);
        ListaDeProdutos.add(feijaoCarioca);
        ListaDeProdutos.add(feijaoPreto);
        ListaDeProdutos.add(farinha);
        ListaDeProdutos.add(oleo);
        ListaDeProdutos.add(azeite);
        ListaDeProdutos.add(vinagre);
        ListaDeProdutos.add(agua);
        ListaDeProdutos.add(sucoDeLaranja);
        ListaDeProdutos.add(sucoDeLimao);
        ListaDeProdutos.add(cafe);
        ListaDeProdutos.add(cebola);
    }

    public static void menu() {
        System.out.println("===========================MERCADO===========================");
        System.out.println("Digite um número:");
        System.out.println("(1) Compra");
        System.out.println("(2) Lista de produtos");

        byte escolha = scanner.nextByte();

        switch (escolha) {
            case 1:
                carrinho();
                break;
            case 2:
                produtos();
                break;
            default:
                System.out.println("Digite 1 ou 2!");
        }
    }

    public static void carrinho() {
        boolean compra = true;
        System.out.println("===========================COMPRA===========================");
        while(compra) {
            System.out.println("Código: ");
            int i = scanner.nextInt();
            if (i == 0) {
                compra = false;
            } else {
                System.out.println(ListaDeProdutos.get(i).getNome());
                System.out.println("Quantidade: ");
                quantidade = scanner.nextDouble();
                valorPagto += ListaDeProdutos.get(i).getPreco() * quantidade;
                System.out.printf("Carrinho: R$" + "%.2f\n", valorPagto);
            }
        }
        System.out.printf("TOTAL A PAGAR: R$ " + "%.2f\n", valorPagto);
        formaPagto();
    }

    public static void produtos() {
        for (int i = 1; i < ListaDeProdutos.toArray().length; i++) {
            System.out.println(ListaDeProdutos.get(i).getCodigo() + " " + ListaDeProdutos.get(i).getNome() + " " + ListaDeProdutos.get(i).imprimirPreco());
        }
    }

    public static void formaPagto() {
        System.out.println("Selecione a forma de pagamento: ");
        System.out.println("(1) Dinheiro");
        System.out.println("(2) Pix");
        byte escolha = scanner.nextByte();
        switch (escolha) {
            case 1 -> System.out.println("DINHEIRO");
            case 2 -> System.out.println("PIX");
        }
    }

    static void main() {
        listaDeProdutos();
        menu();
    }
}
