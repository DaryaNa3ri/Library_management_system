package ir.maktabsharif.repository.entity.impl;

import ir.maktabsharif.model.Topic;
import ir.maktabsharif.repository.base.BaseRepository;

import java.util.List;

public interface TopicRepository extends BaseRepository<Topic, Long>{
    List<Topic> allTopicsThatHaveAtLeastOneBook();
}
