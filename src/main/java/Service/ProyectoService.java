package Service;

import Model.Proyecto;
import java.util.Collection;

public interface ProyectoService extends GeneralService<Proyecto> {

    Collection<Proyecto> getProyectoUsuario(Integer id);

}
