package Model;

public enum Estado {
    RESUELTO("Resuelto"),
    ASIGNADO("Asignado");

    private String status;

    Estado(String status) {

    }

    public String getStatus() {

        return status;
    }

    public void setStauts(String status) {

        this.status = status;
    }
}