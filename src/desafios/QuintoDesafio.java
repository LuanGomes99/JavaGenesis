package desafios;

public class QuintoDesafio {
    public static void main(String[] args) {
        double realEmDolar = 5.61;
        double dolarEmReal = 10;
        double resultado = realEmDolar * dolarEmReal;

        System.out.println(String.format("A conversão de $ %.2f em reais é igual a R$ %.2f", dolarEmReal, resultado));
    }
}
