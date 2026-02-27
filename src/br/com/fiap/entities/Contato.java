package br.com.fiap.entities;

public class Contato {
    private String telefone;
    private String email;
    private String tipo;

    public Contato() {
    }

    public Contato(String telefone, String email, String tipo) {
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\nContato\n" +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nTipo: " + tipo
                ;
    }
}
