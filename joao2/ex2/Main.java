import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Informe a idade: ");
        pessoa.setIdade(sc.nextInt());

        if (pessoa.getIdade() >= 18) {
            System.out.println("Pode tirar a carteira de motorista.");
        } else {
            System.out.println("Não pode tirar a carteira de motorista.");
        }

        sc.close();
    }
}
