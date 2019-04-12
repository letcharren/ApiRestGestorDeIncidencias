package Service;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;

import java.util.Collection;

public interface ProyectoService extends GeneralService<Proyecto> {

    Collection<Incidente> getIncedentes(String id);

    Collection<Incidente> getIncidentesAbiertos(String id);

    Collection<Incidente> getIncidentesCerrados(String id);
}
