package Model;

import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id &&
                Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nombre, apellido);
    }
}
