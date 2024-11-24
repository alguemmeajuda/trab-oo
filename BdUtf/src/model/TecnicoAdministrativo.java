package model;

import java.util.List;

public class TecnicoAdministrativo extends Funcionario {
    private double adicionalNoturno;
    private List<Processo> processos;
    
    public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase, double adicionalNoturno, List<Processo> processos){
        super(registro, nome, dataAdmissao, salarioBase);
        this.adicionalNoturno = adicionalNoturno;
        this.processos = processos;
    }
    
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Adicional Noturno: R$ " + adicionalNoturno);
        System.out.println("Salário Total: R$ " + calcularSalario());
        System.out.println("");
        System.out.println("Processor:");
        System.out.println("");
        for(Processo processo : processos){
            processo.imprimirDados();
        }
    }
    
    public double calcularSalario(){
        return salarioBase + adicionalNoturno;   
    }
    
    /**
     * @return the adicionalNoturno
     */
    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    /**
     * @param adicionalNoturno the adicionalNoturno to set
     */
    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    /**
     * @return the processos
     */
    public List<Processo> getProcessos() {
        return processos;
    }

    /**
     * @param processos the processos to set
     */
    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    
    
}