package Service.ServiceImpMap;

import Model.Estado;
import Model.Incidente;
import Service.IncidenteService;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapIncidenteService implements IncidenteService {

    private HashMap<Integer, Incidente> IncidenteMap;
    private Integer insertions;

    public MapIncidenteService() {
        IncidenteMap = new HashMap<> ();
        this.insertions = 0;
    }

    @Override
    public boolean exist(Integer id) {
        return IncidenteMap.containsKey(id);
    }

    @Override
    public Incidente get(Integer id) {
        return IncidenteMap.get(id);
    }

    @Override
    public Collection<Incidente> get() {

        return IncidenteMap.values();
    }

    @Override
    public Incidente add(Incidente proyecto) {

        proyecto.setId(insertions);
        Incidente incidenteCreado = IncidenteMap.put(proyecto.getId(),proyecto);
        insertions++;
        return incidenteCreado;
    }

    @Override
    public Incidente set(Incidente incidente) {

        Incidente incidenteAux = IncidenteMap.get(incidente.getId());
        if (incidente.getDescripcion() !=null) {
            incidenteAux.setDescripcion(incidente.getDescripcion());
        }
        if (incidente.getEstado()== Estado.RESUELTO && incidenteAux.getEstado()==Estado.ASIGNADO) {
            incidenteAux.setEstado(Estado.RESUELTO);
        }

        return incidenteAux;
    }

    @Override
    public Collection<Incidente> getIncedentesAsignadoUsuario(Integer id) {

        Stream<Incidente> st = IncidenteMap.values().stream();
        return st.filter(incidente ->
                (incidente.getEstado() == Estado.ASIGNADO && incidente.getResponsable().getId()==(id)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Collection<Incidente> getIncedentesCreadoUsuario(Integer id) {

        Stream<Incidente> st = IncidenteMap.values().stream();
        return st.filter(incidente ->
                (incidente.getEstado() == Estado.RESUELTO && incidente.getResponsable().getId()==(id)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Collection<Incidente> getIncedentesProyecto(Integer id) {

        Stream<Incidente> st = IncidenteMap.values().stream();
        return st.filter(incidente ->
                (incidente.getProyecto().getId() == (id)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Collection<Incidente> getIncidentesAbiertos() {

        Stream<Incidente> st = IncidenteMap.values().stream();
        return st.filter(incidente ->
                (incidente.getEstado() == Estado.ASIGNADO))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Collection<Incidente> getIncidentesCerrados() {

        Stream<Incidente> st = IncidenteMap.values().stream();
        return st.filter(incidente ->
                (incidente.getEstado() == Estado.RESUELTO))
                .collect(Collectors.toCollection(LinkedList::new));    }
}
