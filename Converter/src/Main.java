import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        System.out.print("Digite o número da opção (1/2): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em graus Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

