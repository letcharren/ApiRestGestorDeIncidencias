package Service;

import Model.Incidente;
import Model.Proyecto;
import Model.Usuario;

import java.util.Collection;

public interface ProyectoService extends GeneralService<Proyecto> {

    Collection<Proyecto> getProyectoUsuario(Integer id);

}
