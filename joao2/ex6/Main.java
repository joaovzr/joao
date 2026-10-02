public class Main {
    public static void main(String[] args) {
        CalculadoraFinanceira calc = new CalculadoraFinanceira();

        System.out.println("--- Desconto à vista ---");
        calc.calcularDesconto(1000.00, 10);

        System.out.println();
        System.out.println("--- Desconto parcelado ---");
        calc.calcularDesconto(1000.00, 10, 3);
    }
}
