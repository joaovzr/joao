public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String departamento;
    private boolean aprendiz;

    public Funcionario() {
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public boolean isAprendiz() { return aprendiz; }
    public void setAprendiz(boolean aprendiz) { this.aprendiz = aprendiz; }
}
