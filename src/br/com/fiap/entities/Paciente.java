package br.com.fiap.entities;

public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;
    private Triagem triagem;
    private Contato contato;

    public Paciente() {
    }

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "\n\n======Paciente======\n" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCpf: " + cpf +
                endereco  + triagem
                 + contato ;
    }
}
