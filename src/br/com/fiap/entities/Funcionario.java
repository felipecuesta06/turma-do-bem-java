package br.com.fiap.entities;

public class Funcionario {
    private String nome;
    private String cargo;
    private String cpf;
    private int idade;
    private Contato contato;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, String cpf, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "\n\nFuncionario\n" +
                "\nNome: " + nome +
                "\nCargo: " + cargo +
                "\nCpf: " + cpf +
                "\nIdade: " + idade  + contato;
    }
}
