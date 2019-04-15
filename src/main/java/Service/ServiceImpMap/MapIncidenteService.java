package Service.ServiceImpMap;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;

import java.util.Collection;

public class MapIncidenteService implements IncidenteService {


    @Override
    public boolean exist(Integer id) {
        return false;
    }

    @Override
    public Incidente get(Integer id) {
        return null;
    }

    @Override
    public Collection<Incidente> get() {
        return null;
    }

    @Override
    public Incidente add(Incidente proyecto) {
        return null;
    }

    @Override
    public Incidente set(Incidente incidente) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Collection<Incidente> getIncedentesAsignadoUsuario(Integer id) {
        return null;
    }

    @Override
    public Collection<Incidente> getIncedentesCreadoUsuario(Integer id) {
        return null;
    }

    @Override
    public Collection<Incidente> getIncedentesProyecto(Integer id) {
        return null;
    }

    @Override
    public Collection<Incidente> getIncidentesAbiertos() {
        return null;
    }

    @Override
    public Collection<Incidente> getIncidentesCerrados() {
        return null;
    }
}
