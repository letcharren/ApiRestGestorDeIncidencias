package Model;

import java.util.Objects;

public class Proyecto {

    int id;
    String titulo;
    Usuario propietario;

    public Proyecto() {
    }

    public Proyecto(String titulo, Usuario propietario) {
        this.titulo = titulo;
        this.propietario = propietario;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public Usuario getPropietario() {

        return propietario;
    }

    public void setPropietario(Usuario propietario) {

        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecto proyecto = (Proyecto) o;
        return id == proyecto.id &&
                Objects.equals(titulo, proyecto.titulo) &&
                Objects.equals(propietario, proyecto.propietario);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, titulo, propietario);
    }
}
