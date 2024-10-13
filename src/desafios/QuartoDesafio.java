package desafios;

public class QuartoDesafio {
    public static void main(String[] args) {
        double precoProduto = 5.99;
        int quantidade = 8;
        double resultado = precoProduto * quantidade;

        System.out.println(String.format("O valor total é de %.2f", resultado));
    }
}
