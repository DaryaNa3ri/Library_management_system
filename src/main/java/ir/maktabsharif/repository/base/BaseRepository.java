package ir.maktabsharif.repository.base;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<T,ID extends Serializable> {

    Optional<T> insert(T t);

    Optional<T> update(T t);

    Boolean delete(ID id);

    Optional<List<T>> findAll();

    Optional<T> findById(ID id);
}
