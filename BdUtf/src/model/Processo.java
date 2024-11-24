package model;

public class Processo {

    private int numero;
    private String dataCriacao;
    private String descricao;

    public Processo(int numero, String dataCriacao, String descricao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public void imprimirDados() {
        System.out.println("Número: " + numero);
        System.out.println("Data de criacao: " + dataCriacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("===============================");
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dataCriacao
     */
    public String getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}