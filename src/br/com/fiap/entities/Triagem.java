package br.com.fiap.entities;

public class Triagem {
    private int peso;
    private double altura;
    private String problemaSaude;

    public Triagem() {
    }

    public Triagem(int peso, double altura, String problemaSaude) {
        this.peso = peso;
        this.altura = altura;
        this.problemaSaude = problemaSaude;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }


    @Override
    public String toString() {
        return "\n\nTriagem\n" +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nProblemaSaude: " + problemaSaude ;
    }
}
