package Service;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;

import java.util.Collection;

public interface IncidenteService extends GeneralService<Incidente>{

    Collection<IncidenteService> getIncedentes();

    Collection<IncidenteService> getIncidentesAbiertos();

    Collection<IncidenteService> getIncidentesCerrados();
}
