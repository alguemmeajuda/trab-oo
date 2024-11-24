package model;

public class Funcionario {
    protected int registro;
    protected String nome;
    protected String dataAdmissao;
    protected double salarioBase;
    
    public Funcionario(int registro, String nome, String dataAdmissao, double salarioBase){
        this.registro=registro;
        this.nome=nome;
        this.dataAdmissao=dataAdmissao;
        this.salarioBase=salarioBase;
    }

    public void imprimirDados(){
        System.out.println("===============================");
        System.out.println("Registro:" + registro);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Admissao: " + dataAdmissao);
        System.out.println("Salario Base: R$ " + salarioBase);
    }
    
    
    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataAdmissao
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}