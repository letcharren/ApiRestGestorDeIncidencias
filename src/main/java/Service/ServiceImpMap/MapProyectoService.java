package Service.ServiceImpMap;

import Model.Proyecto;
import Service.ProyectoService;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapProyectoService implements ProyectoService {

    private HashMap<Integer, Proyecto> ProyectoMap;
    private Integer insertions;

    public MapProyectoService() {
        insertions = 0;
        ProyectoMap = new HashMap<>();
    }

    @Override
    public boolean exist(Integer id) {

        return ProyectoMap.containsKey(id);
    }

    @Override
    public Proyecto get(Integer id) {

        return ProyectoMap.get(id);
    }

    @Override
    public Collection<Proyecto> get() {

        return ProyectoMap.values();
    }

    @Override
    public Proyecto add(Proyecto proyecto) {

        proyecto.setId(insertions);
        Proyecto proyectoCreado = ProyectoMap.put(proyecto.getId(),proyecto);
        insertions++;
        return proyectoCreado;
    }

    @Override
    public Proyecto set(Proyecto proyecto) {

        Proyecto proyectoAux = ProyectoMap.get(proyecto.getId());
        if (proyecto.getTitulo() !=null) {
            proyectoAux.setTitulo(proyecto.getTitulo());
        }
        if (proyecto.getPropietario()!=null) {
            proyectoAux.setPropietario(proyecto.getPropietario());
        }

        return proyectoAux;
    }

    @Override
    public boolean delete(Integer id) {

        Proyecto proyectoElim = ProyectoMap.remove(id);
        return proyectoElim != null;
    }

    @Override
    public Collection<Proyecto> getProyectoUsuario(Integer id) {
        Stream<Proyecto> st = ProyectoMap.values().stream();
        return st.filter(proyecto -> proyecto.getPropietario().getId() == (id))
                .collect(Collectors.toCollection(LinkedList::new));
    }
}


