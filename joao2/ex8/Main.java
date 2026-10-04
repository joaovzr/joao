import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== CADASTRO ACADÊMICO =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine().trim());

            switch (opcao) {
                case 1:
                    cadastrarAluno(sc);
                    break;
                case 2:
                    cadastrarProfessor(sc);
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        } while (opcao != 3);

        sc.close();
    }

    private static void cadastrarAluno(Scanner sc) {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine().trim());

        if (!(idade >= 16 && idade <= 99)) {
            System.out.println("Idade inválida para ingressar no ensino superior. Cadastro não realizado.");
            return;
        }

        System.out.print("Renda familiar (R$): ");
        double renda = Double.parseDouble(sc.nextLine().trim().replace(",", "."));

        System.out.print("Participa de projeto de extensão? (s/n): ");
        boolean projetoExtensao = sc.nextLine().trim().equalsIgnoreCase("s");

        boolean temAuxilio = renda < 1500.00 || projetoExtensao;

        System.out.println("Aluno " + nome + " cadastrado com sucesso!");
        if (temAuxilio) {
            System.out.println("Benefício: possui direito a auxílio estudantil.");
        } else {
            System.out.println("Benefício: não possui direito a auxílio estudantil.");
        }
    }

    private static void cadastrarProfessor(Scanner sc) {
        System.out.print("Nome do professor: ");
        String nome = sc.nextLine();

        System.out.print("Anos de experiência: ");
        int anosExperiencia = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Possui pós-graduação? (s/n): ");
        boolean temPosGraduacao = sc.nextLine().trim().equalsIgnoreCase("s");

        System.out.print("É bacharel? (s/n): ");
        boolean ehBacharel = sc.nextLine().trim().equalsIgnoreCase("s");

        if (anosExperiencia > 2 && (temPosGraduacao == true || ehBacharel == true)) {
            System.out.println("Professor " + nome + " cadastrado com status: Efetivo");
        } else {
            System.out.println("Professor " + nome + " cadastrado com status: Temporário");
        }
    }
}
