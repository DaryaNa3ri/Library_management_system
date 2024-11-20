package ir.maktabsharif.repository.entity.impl;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.repository.base.AbstractRepository;
import ir.maktabsharif.utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl extends AbstractRepository<Book, Long> implements BookRepository {

    private final EntityManager em = EntityManagerProvider.getEntityManager();

    @Override
    public Class<Book> classType() {
        return Book.class;
    }

    @Override
    public Optional<List<Book>> findAll() {
        TypedQuery<Book> query = em.createNamedQuery("Book.findAll", Book.class);
        return Optional.of(query.getResultList());
    }




}
