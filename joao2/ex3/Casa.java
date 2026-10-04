public class Casa {
    public String endereco;
    public double preco;
    public String tipo;
    public double area;

    public Casa() {
    }

    public Casa(String endereco, double preco, String tipo, double area) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
        this.area = area;
    }

    public void exibir() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tipo: " + tipo);
        System.out.println("Área: " + area + " m²");
    }
}
