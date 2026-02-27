package br.com.fiap.entities;

public class Tratamento {
    private String descricao;
    private String horaInicio;
    private String horaFim;
    private String status;
    private Material material;

    public Tratamento() {
    }

    public Tratamento(String descricao, String horaInicio, String horaFim, String status) {
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\n\nTratamento\n" +
                "\nDescricao: " + descricao +
                "\nHoraInicio: " + horaInicio +
                "\nHoraFim: " + horaFim +
                "\nStatus: " + status + material ;
    }
}
