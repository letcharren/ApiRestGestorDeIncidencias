package Service;

import Model.*;

import java.util.Collection;

public interface UsuarioService extends GeneralService<Usuario>{

    Collection<Proyecto> getProyectosUsuario(String id);

    Collection<IncidenteService> getIncidentesReportados(String id);

    Collection<IncidenteService> getIncidentesAsignados(String id);

}
