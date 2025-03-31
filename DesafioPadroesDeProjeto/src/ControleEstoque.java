import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Produto: ");
        String nome = entrada.nextLine();

        System.out.print("Preço: R$ ");
        double preco = entrada.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int estoque = entrada.nextInt();

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = entrada.nextInt();

        System.out.println("\nProduto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + estoque + " unidades");

        if (quantidadeVendida <= estoque) {
            estoque -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + estoque + " unidades");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }

        entrada.close();
    }
}
