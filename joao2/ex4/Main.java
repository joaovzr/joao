import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuada tabuada = new Tabuada();

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        tabuada.exibirTabuada(numero);

        sc.close();
    }
}
