package Model;

public enum Clasificacion {
    CRITICO("Critico"),
    NORMAL("Normal"),
    MENOR("Menor");


    private String status;

    Clasificacion(String status) {

    }

    public String getSClasificacion() {

        return status;
    }

    public void setClasificacion(String status) {

        this.status = status;
    }
}
