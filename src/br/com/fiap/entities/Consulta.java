package br.com.fiap.entities;

public class Consulta {
    private String data;
    private Dentista dentista;
    private Paciente paciente;
    private Tratamento tratamento;

    public Consulta() {
    }

    public Consulta(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    @Override
    public String toString() {
        return "\n\nConsulta\n" +
                "\nData: " + data +
                  dentista +
                  paciente +
                  tratamento ;
    }
}
