package Service.ServiceImpMap;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;

import java.util.Collection;

public class MapIncidenteService implements IncidenteService {


    @Override
    public Collection<IncidenteService> getIncedentes() {
        return null;
    }

    @Override
    public Collection<IncidenteService> getIncidentesAbiertos() {
        return null;
    }

    @Override
    public Collection<IncidenteService> getIncidentesCerrados() {
        return null;
    }

    @Override
    public boolean exist(int id) {
        return false;
    }

    @Override
    public IncidenteService get(int id) {
        return null;
    }

    @Override
    public Collection<Incidente> get() {
        return null;
    }

    @Override
    public void add(Incidente proyecto) {

    }

    @Override
    public Incidente set(Incidente incidente) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
