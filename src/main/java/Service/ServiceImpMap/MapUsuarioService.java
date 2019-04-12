package Service.ServiceImpMap;

import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;
import Service.UsuarioService;

import java.util.Collection;

public class MapUsuarioService implements UsuarioService {


    @Override
    public Collection<Proyecto> getProyectosUsuario(String id) {
        return null;
    }

    @Override
    public Collection<IncidenteService> getIncidentesReportados(String id) {
        return null;
    }

    @Override
    public Collection<IncidenteService> getIncidentesAsignados(String id) {
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
    public Collection<Usuario> get() {
        return null;
    }

    @Override
    public void add(Usuario proyecto) {

    }

    @Override
    public Usuario set(Usuario usuario) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
