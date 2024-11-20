package ir.maktabsharif.Service.base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T,ID extends Serializable> {
        T insert(T t);

        T update(T t);

        Boolean delete(ID id);

        List<T> findAll();

        T findById(ID id);
}
