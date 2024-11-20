package ir.maktabsharif.model;

import ir.maktabsharif.model.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "books")
@NamedQuery(name = "Book.findAll",query = "FROM Book")
public class Book extends BaseEntity<Long> {

    private String title;

    private String author;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    private String isbn;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

}
