package dicas;

public class TiposVariaveis {

    public static void main(String[] args) {

        // Variáveis inteiras (números inteiros, sem casas decimais)
        int idade = 25;  // 'int' armazena números inteiros até 2 bilhões

        // Variáveis de ponto flutuante (números com casas decimais)
        float altura = 1.75f;  // 'float' armazena números decimais, precisão de 6 a 7 dígitos
        double peso = 72.5;    // 'double' armazena números decimais com precisão maior (15 dígitos)

        // Variável de caractere (um único caractere)
        char inicial = 'A';    // 'char' armazena um único caractere, usando aspas simples

        // Variável booleana (verdadeiro ou falso)
        boolean isEstudante = true;  // 'boolean' armazena apenas 'true' ou 'false'

        // Variável de texto (sequência de caracteres)
        String nome = "João";  // 'String' armazena texto, usando aspas duplas

        // Impressão das variáveis para ver os valores
        System.out.println("Nome: " + nome);  // Exibe o nome
        System.out.println("Idade: " + idade + " anos");  // Exibe a idade
        System.out.println("Altura: " + altura + " metros");  // Exibe a altura
        System.out.println("Peso: " + peso + " kg");  // Exibe o peso
        System.out.println("Inicial do nome: " + inicial);  // Exibe a inicial
        System.out.println("É estudante? " + isEstudante);  // Exibe se é estudante ou não
    }
}
