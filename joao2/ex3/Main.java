public class Main {
    public static void main(String[] args) {
        // Usando o construtor vazio
        Casa casa1 = new Casa();
        casa1.endereco = "Rua das Flores, 100";
        casa1.preco = 300000.00;
        casa1.tipo = "Térrea";
        casa1.area = 90.0;

        // Usando o construtor preenchido
        Casa casa2 = new Casa("Av. Brasil, 2500", 650000.00, "Sobrado", 180.5);

        System.out.println("=== Casa 1 (construtor vazio) ===");
        casa1.exibir();

        System.out.println();
        System.out.println("=== Casa 2 (construtor completo) ===");
        casa2.exibir();
    }
}
