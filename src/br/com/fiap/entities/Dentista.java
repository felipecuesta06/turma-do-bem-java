package br.com.fiap.entities;

public class Dentista {
    private String nome;
    private String cro;
    private String cpf;
    private Endereco endereco;
    private Contato contato;
    private Consulta consulta;

    public Dentista() {
    }

    public Dentista(String nome, String cro, String cpf) {
        this.nome = nome;
        this.cro = cro;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
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

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "\n\n======Dentista======\n" +
                "\nNome: " + nome +
                "\nCro: " + cro +
                "\nCpf: " + cpf  + endereco  + contato + consulta ;
    }
}
