package Service;

import java.util.Collection;

public interface GeneralService<T> {

    boolean exist (Integer id);

    T get(Integer id);

    Collection<T> get();

    T add (T proyecto);

    T set(T t);

    boolean delete (Integer id);

}
