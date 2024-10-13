package desafios;

public class SextoDesafio {
    public static void main(String[] args) {
        double precoOriginal = 50;
        double percentualDesconto = 10;

        double valorDesconto = (precoOriginal / 100) * percentualDesconto;
        double precoNovo = precoOriginal - valorDesconto;

        System.out.println(String.format("O valor de desconto foi de R$ %.2f", valorDesconto));
        System.out.println(String.format("O preço do produto com desconto é R$ %.2f", precoNovo));
    }
}
