package ir.maktabsharif.model;

import ir.maktabsharif.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@NamedQuery(name = "Topic.findAll",query = "FROM Topic")
@NamedQuery(name = "Topic.findAllByBook", query = "SELECT t FROM Topic as t WHERE EXISTS( SELECT b FROM Book as b WHERE Topic.id = Book.topic.id)")
@Table(name = "topics")
public class Topic extends BaseEntity<Long> {

    private String title;

    private String description;

    @OneToMany(mappedBy = "topic")
    private List<Book> books = new ArrayList<>();
}
