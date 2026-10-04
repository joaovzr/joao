public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Carlos Silva");
        f.setIdade(16);
        f.setEmail("carlos@empresa.com");
        f.setSalario(1200.00);
        f.setCargo("Auxiliar Administrativo");
        f.setDepartamento("Financeiro");

        if (f.getIdade() <= 16) {
            f.setAprendiz(true);
        } else {
            f.setAprendiz(false);
        }

        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Email: " + f.getEmail());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Departamento: " + f.getDepartamento());
        System.out.println("Salário: R$ " + f.getSalario());
        System.out.println("Aprendiz: " + f.isAprendiz());
    }
}
