import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Int para Double");
        System.out.println("2. Double para Int");

        System.out.print("Digite o número da opção (1/2): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite um número inteiro: ");
            int numeroInt = scanner.nextInt();
            System.out.println("Número em double: " + (double) numeroInt);
        } else if (opcao == 2) {
            System.out.print("Digite um número double: ");
            double numeroDouble = scanner.nextDouble();
            int numeroInt = (int) numeroDouble;
            System.out.println("Número em int: " + numeroInt);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
