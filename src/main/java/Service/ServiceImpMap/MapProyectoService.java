package Service.ServiceImpMap;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;
import Service.ProyectoService;

import java.util.Collection;

public class MapProyectoService implements ProyectoService {

    @Override
    public boolean exist(Integer id) {

        return false;
    }

    @Override
    public Proyecto get(Integer id) {

        return null;
    }

    @Override
    public Collection<Proyecto> get() {

        return null;
    }

    @Override
    public Proyecto add(Proyecto proyecto) {

        return null;
    }

    @Override
    public Proyecto set(Proyecto proyecto) {

        return null;
    }

    @Override
    public boolean delete(Integer id) {

        return false;
    }

    @Override
    public Collection<Incidente> getProyectoUsuario(Integer id) {
        return null;
    }
}


