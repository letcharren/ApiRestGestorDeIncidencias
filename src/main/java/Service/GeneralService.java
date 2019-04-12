package Service;

import java.util.Collection;

public interface GeneralService<T> {

    boolean exist (int id);

    IncidenteService get(int id);

    Collection<T> get();

    void add (T proyecto);

    T set(T t);

    void delete (int id);

}
