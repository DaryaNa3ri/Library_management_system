package ir.maktabsharif.repository.entity.impl;

import ir.maktabsharif.model.Topic;
import ir.maktabsharif.repository.base.AbstractRepository;
import ir.maktabsharif.utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class TopicRepositoryImpl extends AbstractRepository<Topic, Long> implements TopicRepository {

    private final EntityManager em = EntityManagerProvider.getEntityManager();

    @Override
    public Class<Topic> classType() {
        return Topic.class;
    }

    @Override
    public Optional<List<Topic>> findAll() {
        TypedQuery<Topic> query = em.createNamedQuery("Topic.findAll", Topic.class);
        return Optional.of(query.getResultList());
    }

    @Override
    public List<Topic> allTopicsThatHaveAtLeastOneBook() {
        TypedQuery<Topic> query = em.createNamedQuery("Topic.findAllByBook", Topic.class);
        return query.getResultList();
    }




}
