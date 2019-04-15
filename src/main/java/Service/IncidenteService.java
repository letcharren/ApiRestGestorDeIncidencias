package Service;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;

import java.util.Collection;

public interface IncidenteService extends GeneralService<Incidente>{

    Collection<Incidente> getIncedentesAsignadoUsuario(Integer id);

    Collection<Incidente> getIncedentesCreadoUsuario(Integer id);

    Collection<Incidente> getIncedentesProyecto(Integer id);

    Collection<Incidente> getIncidentesAbiertos();

    Collection<Incidente> getIncidentesCerrados();
}
