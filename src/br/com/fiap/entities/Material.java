package br.com.fiap.entities;

public class Material {
    private String materialUsado;
    private double materialValor;

    public Material() {
    }

    public Material(String materialUsado, double materialValor) {
        this.materialUsado = materialUsado;
        this.materialValor = materialValor;
    }

    public String getMaterialUsado() {
        return materialUsado;
    }

    public void setMaterialUsado(String materialUsado) {
        this.materialUsado = materialUsado;
    }

    public double getMaterialValor() {
        return materialValor;
    }

    public void setMaterialValor(double materialValor) {
        this.materialValor = materialValor;
    }

    @Override
    public String toString() {
        return "\n\nMaterial\n" +
                "\nMaterialUsado: " + materialUsado +
                "\nMaterialValor: " + materialValor ;
    }
}
