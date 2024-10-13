package desafios;

import javax.swing.*;

// Converter Celsius para Fahrenheit
public class PrimeiroDesafio {
    public static void main(String[] args) {
        double celsius = 20;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("A temperatura de %d°C é igual a %d°F", (int) celsius, (int) fahrenheit));
    }
}
