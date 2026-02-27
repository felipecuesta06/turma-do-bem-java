package br.com.fiap.entities;

public class Ong {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private Funcionario funcionario;

    public Ong() {
    }

    public Ong(String cnpj, String razaoSocial, String nomeFantasia) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "\n======Ong======\n" +
                "\nCnpj: " + cnpj +
                "\nRazaoSocial: " + razaoSocial +
                "\nNomeFantasia: " + nomeFantasia + funcionario
                ;
    }
}
