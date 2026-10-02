public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Quadrado(4),
            new Triangulo(3, 4, 5),
            new Circulo(2.5)
        };
        String[] nomes = {"Quadrado (lado 4)", "Triângulo (3, 4, 5)", "Círculo (raio 2.5)"};

        for (int i = 0; i < formas.length; i++) {
            System.out.println(nomes[i]);
            System.out.printf("  Perímetro: %.2f%n", formas[i].calcularPerimetro());
            System.out.printf("  Área: %.2f%n", formas[i].calcularArea());
            System.out.println();
        }
    }
}
