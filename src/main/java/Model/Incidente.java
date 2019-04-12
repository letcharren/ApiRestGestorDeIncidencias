package Model;

import java.util.Date;

public class Incidente {
    int id;
    Clasificacion clasificacion;
    String descripcion;
    Usuario reportador;
    Usuario responsable;
    Estado estado;
    Date fechaCreacion;
    Date fechaSoulcion;
}
