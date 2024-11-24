package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private String titulacao;
    private List<Disciplina> disciplinas;

    public Professor(int registro, String nome, String dataAdmissao, double salarioBase, int titulacao) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.titulacao = titulacao == 1 ? "Doutor" : "Mestre";
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salário Titulação: R$ " + getSalarioTitulacao());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário Total: R$ " + calcularSalario());
        System.out.println("");
        System.out.println("Disciplinas:");
        System.out.println("");
        for (Disciplina disciplina : disciplinas) {
            disciplina.imprimirDados();
        }
    }

    public void disciplina() {

    }

    public double calcularSalario() {
        if (titulacao.equals("Doutor")) {
            return 2000 + salarioBase;
        } else {
            return 1000 + salarioBase;
        }
    }

    public double getSalarioTitulacao() {
        if (titulacao.equals("Doutor")) {
            return 2000;
        } else {
            return 1000;
        }
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}