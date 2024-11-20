package ir.maktabsharif.repository.base;

import ir.maktabsharif.utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class AbstractRepository<T, ID extends Serializable> implements BaseRepository<T, ID> {

    private EntityManager entityManager = EntityManagerProvider.getEntityManager();

    @Override
    public Optional<T> insert(T t) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
            return Optional.of(t);
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            return Optional.empty();
        }
    }

    @Override
    public Optional<T> update(T t) {
        try{
            entityManager.getTransaction().begin();
            T foundObject = entityManager.find(classType(), t);
            entityManager.merge(foundObject);
            entityManager.getTransaction().commit();
            return Optional.of(t);
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            return Optional.empty();
        }
    }

    @Override
    public Boolean delete(ID id) {
        try {
            entityManager.getTransaction().begin();
            T foundObject = entityManager.find(classType(), id);
            entityManager.remove(foundObject);
            entityManager.getTransaction().commit();
            return Boolean.TRUE;
        }catch (Exception e) {
            entityManager.getTransaction().rollback();
            return Boolean.FALSE;
        }
    }

    public Optional<T> findById(ID id) {
        entityManager.getTransaction().begin();
        T foundObject = entityManager.find(classType(), id);
        entityManager.getTransaction().commit();
        return Optional.of(foundObject);
    }

    public Optional<List<T>> findAll() {
        List foundObjects = entityManager.createQuery("FROM "+classType().getName()).getResultList();
        return Optional.of(foundObjects);
    }

    public abstract Class<T> classType() ;
}
