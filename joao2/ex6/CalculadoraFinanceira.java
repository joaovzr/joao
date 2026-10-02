public class CalculadoraFinanceira {

    // Sobrecarga 1: valor total e percentual de desconto
    public void calcularDesconto(double valorTotal, double percentualDesconto) {
        double valorFinal = valorTotal - (valorTotal * percentualDesconto / 100);
        System.out.printf("Valor final com %.1f%% de desconto: R$ %.2f%n",
                percentualDesconto, valorFinal);
    }

    // Sobrecarga 2: valor total, percentual de desconto e quantidade de parcelas
    public void calcularDesconto(double valorTotal, double percentualDesconto, int parcelas) {
        double valorFinal = valorTotal - (valorTotal * percentualDesconto / 100);
        double valorParcela = valorFinal / parcelas;
        System.out.printf("Valor final com %.1f%% de desconto: R$ %.2f%n",
                percentualDesconto, valorFinal);
        System.out.printf("%dx de R$ %.2f%n", parcelas, valorParcela);
    }
}
