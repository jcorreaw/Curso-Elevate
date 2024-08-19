import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        String concatenado = string1 + string2;

        String caixaAlta = concatenado.toUpperCase();
        String caixaBaixa = concatenado.toLowerCase();

        int quantidadeLetras = concatenado.length();

        System.out.println("String concatenada: " + concatenado);
        System.out.println("Em caixa alta: " + caixaAlta);
        System.out.println("Em caixa baixa: " + caixaBaixa);
        System.out.println("Quantidade de letras: " + quantidadeLetras);

        scanner.close();
    }
}