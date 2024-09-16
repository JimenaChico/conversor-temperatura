import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convertidor de temperatura");
        System.out.println("""
                Este es un convertidor de temperatura de Grados Celsius a Fahrenheit.
                Convierta Grados Celsius a Fahrenheit con esta pequeña calculadora.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();


        double temperaturaFahrenheit= (temperaturaCelsius * 1.8) + 32;

        String resultado = "Los grados Celsius:"+ temperaturaCelsius + " equivale a " +temperaturaFahrenheit +" grados Fahrenheit.";
        System.out.println(resultado);

        int temperaturaSinDecimal = (int) (temperaturaFahrenheit);
        System.out.println("La temperatura en grados enteros Fahrenheit es: "+temperaturaSinDecimal);

        scanner.close();

    }
}