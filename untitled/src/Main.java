import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de sequências: ");
        int n = scanner.nextInt();

        System.out.println("Sequência " + n + ":");
        calcularFibonacci(n);

        scanner.close();
    }

    public static void calcularFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
            return;
        }

        long anterior = 0;
        long atual = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(anterior + " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
    }
}