package dicas;

public class Operadores {

    public static void main(String[] args) {

        // 1. Operadores Aritméticos (matemáticos)
        int a = 10;
        int b = 5;

        int soma = a + b;         // Soma: 10 + 5 = 15
        int subtracao = a - b;    // Subtração: 10 - 5 = 5
        int multiplicacao = a * b; // Multiplicação: 10 * 5 = 50
        int divisao = a / b;      // Divisão: 10 / 5 = 2
        int resto = a % b;        // Módulo (resto da divisão): 10 % 5 = 0

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        // 2. Operadores Relacionais (comparação)
        // Comparação entre dois valores, resultado sempre booleano (true ou false)
        boolean igual = (a == b);           // Igualdade: 10 == 5 -> false
        boolean diferente = (a != b);       // Diferença: 10 != 5 -> true
        boolean maior = (a > b);            // Maior que: 10 > 5 -> true
        boolean menor = (a < b);            // Menor que: 10 < 5 -> false
        boolean maiorIgual = (a >= b);      // Maior ou igual: 10 >= 5 -> true
        boolean menorIgual = (a <= b);      // Menor ou igual: 10 <= 5 -> false

        System.out.println("É igual? " + igual);
        System.out.println("É diferente? " + diferente);
        System.out.println("É maior? " + maior);
        System.out.println("É menor? " + menor);
        System.out.println("É maior ou igual? " + maiorIgual);
        System.out.println("É menor ou igual? " + menorIgual);

        // 3. Operadores Lógicos (combinação de condições)
        boolean x = true;
        boolean y = false;

        boolean e = x && y;    // Operador lógico AND: true && false -> false (ambos precisam ser verdadeiros)
        boolean ou = x || y;   // Operador lógico OR: true || false -> true (um dos dois precisa ser verdadeiro)
        boolean nao = !x;      // Operador lógico NOT: !true -> false (inverte o valor booleano)

        System.out.println("AND (x && y): " + e);
        System.out.println("OR (x || y): " + ou);
        System.out.println("NOT (!x): " + nao);

        // 4. Operadores de Atribuição (atribuir valores a variáveis)
        int c = 20;
        c += 5;  // Atribuição com adição: c = c + 5 -> 20 + 5 = 25
        c -= 2;  // Atribuição com subtração: c = c - 2 -> 25 - 2 = 23
        c *= 3;  // Atribuição com multiplicação: c = c * 3 -> 23 * 3 = 69
        c /= 3;  // Atribuição com divisão: c = c / 3 -> 69 / 3 = 23
        c %= 4;  // Atribuição com módulo: c = c % 4 -> 23 % 4 = 3 (resto da divisão)

        System.out.println("Resultado da atribuição final de c: " + c);

        // 5. Operadores de Incremento e Decremento
        int d = 10;
        d++;  // Incrementa o valor de d em 1: d = d + 1 -> 10 + 1 = 11
        d--;  // Decrementa o valor de d em 1: d = d - 1 -> 11 - 1 = 10

        System.out.println("Valor final de d (após incremento e decremento): " + d);
    }
}
