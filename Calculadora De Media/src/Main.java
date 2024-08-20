import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] num = new double[5];
        double soma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            num[i] = sc.nextDouble();
            soma += num[i];
        }

        double media = soma / num.length;
        System.out.println("A media total é: " + media);

        sc.close();
    }
}