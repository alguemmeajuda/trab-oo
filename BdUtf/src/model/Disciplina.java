package model;

public class Disciplina {
    private int codigo;
    private String nomeDisciplina;
    private String ementa;
    private double cargaHoraria;

    public Disciplina(int codigo, String nomeDisciplina, String ementa, double cargaHoraria ){
        this.codigo = codigo;
        this.nomeDisciplina= nomeDisciplina;
        this.ementa = ementa;
        this.cargaHoraria= cargaHoraria;
    }
    
    public void imprimirDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nomeDisciplina);
        System.out.println("Ementa: " + ementa);
        System.out.println("CH: " + cargaHoraria + "h");
        System.out.println("===============================");
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the cargaHoraria
     */
    public double getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}