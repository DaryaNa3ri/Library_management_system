package ir.maktabsharif.repository.entity.impl;

import ir.maktabsharif.model.User;
import ir.maktabsharif.repository.base.AbstractRepository;
import ir.maktabsharif.utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl extends AbstractRepository<User, Long> implements UserRepository {

    private final EntityManager em = EntityManagerProvider.getEntityManager();

    @Override
    public Class<User> classType() {
        return User.class;
    }

    @Override
    public Optional<List<User>> findAll() {
        TypedQuery<User> query = em.createNamedQuery("User.findAll", User.class);
        return Optional.of(query.getResultList());
    }




}
