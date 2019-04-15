package Service.ServiceImpMap;

import Model.Usuario;
import Service.UsuarioService;

import java.util.Collection;
import java.util.HashMap;

public class MapUsuarioService implements UsuarioService {

    private HashMap<Integer, Usuario> UsuarioMap;
    private Integer insertions;

    public MapUsuarioService() {
        insertions = 0;
        UsuarioMap = new HashMap<>();
    }

    @Override
    public boolean exist(Integer id) {

        return UsuarioMap.containsKey(id);
    }

    @Override
    public Usuario get(Integer id) {

        return UsuarioMap.get(id);
    }

    @Override
    public Collection<Usuario> get() {

        return UsuarioMap.values();
    }

    @Override
    public Usuario add(Usuario usuario) {
        usuario.setId(insertions);
        Usuario usuarioCreado = UsuarioMap.put(usuario.getId(),usuario);
        insertions++;
        return usuarioCreado;
    }

    @Override
    public Usuario set(Usuario usuario) {

        Usuario usuarioAux = UsuarioMap.get(usuario.getId());
        if (usuario.getNombre()!=null) {
            usuarioAux.setNombre(usuario.getNombre());
        }
        if (usuario.getApellido()!=null) {
            usuarioAux.setNombre(usuario.getNombre());
        }

        return usuarioAux;
    }

    @Override
    public boolean delete(Integer id) {

        Usuario usuarioElim = UsuarioMap.remove(id);
        return usuarioElim!=null;
    }
}
