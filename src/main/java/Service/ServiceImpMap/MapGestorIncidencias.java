package Service.ServiceImpMap;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;
import Service.IncidenteService;
import Service.ProyectoService;
import Service.UsuarioService;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapGestorIncidencias {
    private IncidenteService incidenteService;
    private UsuarioService usuarioService;
    private ProyectoService proyectoService;

    public MapGestorIncidencias() {

        incidenteService= new MapIncidenteService();
        usuarioService= new MapUsuarioService();
        proyectoService= new MapProyectoService();
    }

    public boolean exist(Integer id) {

        return usuarioService.exist(id);
    }

    public Usuario getUsuario(Integer id) {

        return usuarioService.get(id);
    }

    public Collection<Usuario> getUsuario() {

        return usuarioService.get();
    }

    public Usuario addUsuario(Usuario usuario) {

        return usuarioService.add(usuario);
    }


    public Usuario setUsuario(Usuario usuario) {

        return usuarioService.set(usuario);
    }

    public boolean deleteUsuario(Integer id) {

        Collection<Incidente> incidentesCreados= incidenteService.getIncedentesCreadoUsuario(id);
        Collection<Incidente> incidentesAsignados= incidenteService.getIncedentesCreadoUsuario(id);
        Collection<Proyecto> proyectos= proyectoService.getProyectoUsuario(id);

        if (incidentesAsignados.isEmpty() && incidentesCreados.isEmpty() && proyectos.isEmpty()){
            return usuarioService.delete(id);
        }
        return false;
    }

    public boolean existProyecto(Integer id) {

        return false;
    }

    public Proyecto getProyecto(Integer id) {

        return proyectoService.get(id);
    }

    public Collection<Proyecto> getProyecto() {

        return proyectoService.get();
    }

    public Proyecto addProyecto(Proyecto proyecto) {

        return proyectoService.add(proyecto);
    }

    public Proyecto setProyecto(Proyecto proyecto) {
//chequear que el usuario a modificar no sea null
        if (proyecto.getPropietario() != null){
            if (usuarioService.get(proyecto.getPropietario().getId()) == null) {
                proyecto.setPropietario(usuarioService.get(proyecto.getPropietario().getId()));
            } else {
                proyecto.setPropietario(null);
            }
        }
        return proyectoService.set(proyecto);
    }

    public boolean deleteProyecto(Integer id) {

        Collection<Incidente> incidentesProyecto= incidenteService.getIncedentesProyecto(id);
        if (incidentesProyecto.isEmpty()){
            return proyectoService.delete(id);
        }
        return false;
    }

    public Collection<Proyecto> getProyectoUsuario(Integer id) {

        return proyectoService.getProyectoUsuario(id);
    }

    public boolean existIncidente(Integer id) {

        return incidenteService.exist(id);
    }

    public Incidente getIncidente(Integer id) {

        return incidenteService.get(id);
    }

    public Collection<Incidente> getIncidente() {

        return incidenteService.get();
    }

    public Incidente addIncidente(Incidente incidente) {

        return incidenteService.add(incidente);
    }

    public Incidente setIncidente(Incidente incidente) {

        return incidenteService.set(incidente);
    }

    public boolean deleteIncidente(Integer id) {

        return incidenteService.delete(id);
    }

    public Collection<Incidente> getIncedentesAsignadoUsuario(Integer id) {

        return incidenteService.getIncedentesAsignadoUsuario(id);
    }

    public Collection<Incidente> getIncedentesCreadoUsuario(Integer id) {

        return incidenteService.getIncedentesCreadoUsuario(id);
    }

    public Collection<Incidente> getIncedentesProyecto(Integer id) {

        return incidenteService.getIncedentesProyecto(id);
    }

    public Collection<Incidente> getIncidentesAbiertos() {

        return incidenteService.getIncidentesAbiertos();
    }

    public Collection<Incidente> getIncidentesCerrados() {

        return incidenteService.getIncidentesCerrados();
    }




}
