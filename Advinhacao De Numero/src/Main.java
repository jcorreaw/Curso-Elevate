import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");

        while (palpite != numeroAleatorio) {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}