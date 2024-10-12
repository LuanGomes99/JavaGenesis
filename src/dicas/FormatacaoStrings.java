package dicas;

public class FormatacaoStrings {

    public static void main(String[] args) {

        // 1. Formatação simples de Strings com concatenação
        String nome = "Maria";
        int idade = 30;
        String mensagem = "Nome: " + nome + ", Idade: " + idade;
        System.out.println(mensagem);  // Resultado: Nome: Maria, Idade: 30

        // 2. Usando o método format() para formatação de strings
        // O método format permite inserir valores em uma string usando placeholders.
        // Placeholders comuns:
        // %s - string, %d - inteiro, %f - número decimal (float/double)
        String formatada = String.format("Nome: %s, Idade: %d anos", nome, idade);
        System.out.println(formatada);  // Resultado: Nome: Maria, Idade: 30 anos

        // 3. Formatação com números decimais
        double salario = 2500.50;
        String salarioFormatado = String.format("Salário: %.2f", salario);  // %.2f formata com 2 casas decimais
        System.out.println(salarioFormatado);  // Resultado: Salário: 2500.50

        // 4. Usando text blocks (a partir do Java 13)
        // Text blocks permitem escrever strings em múltiplas linhas sem a necessidade de concatenação.
        String textoLongo = """
            Esta é uma string
            em múltiplas linhas
            usando text block.
            """;
        System.out.println(textoLongo);
        // Resultado:
        // Esta é uma string
        // em múltiplas linhas
        // usando text block.

        // 5. Formatação com placeholders dentro de text blocks
        // Podemos combinar o método format com text blocks para gerar texto formatado em múltiplas linhas
        String descricao = """
            Nome: %s
            Idade: %d anos
            Salário: %.2f
            """.formatted(nome, idade, salario);
        System.out.println(descricao);
        // Resultado:
        // Nome: Maria
        // Idade: 30 anos
        // Salário: 2500.50
    }
}
