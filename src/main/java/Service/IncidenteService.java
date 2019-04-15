package Service;

import Model.Incidente;
import java.util.Collection;

public interface IncidenteService extends GeneralService<Incidente>{

    @Override
    default boolean delete (Integer id){
        return false;
    }

    Collection<Incidente> getIncedentesAsignadoUsuario(Integer id);

    Collection<Incidente> getIncedentesCreadoUsuario(Integer id);

    Collection<Incidente> getIncedentesProyecto(Integer id);

    Collection<Incidente> getIncidentesAbiertos();

    Collection<Incidente> getIncidentesCerrados();
}
