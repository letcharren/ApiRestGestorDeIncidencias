package Service.ServiceImpMap;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;
import Service.ProyectoService;

import java.util.Collection;

public class MapProyectoService implements ProyectoService {

    @Override
    public boolean exist(int id) {
        return false;
    }

    @Override
    public IncidenteService get(int id) {
        return null;
    }

    @Override
    public Collection<Proyecto> get() {
        return null;
    }

    @Override
    public void add(Proyecto proyecto) {

    }

    @Override
    public Proyecto set(Proyecto proyecto) {
        return null;
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public Collection<Incidente> getIncedentes(String id) {
        return null;
    }

    @Override
    public Collection<Incidente> getIncidentesAbiertos(String id) {
        return null;
    }

    @Override
    public Collection<Incidente> getIncidentesCerrados(String id) {
        return null;
    }

}
