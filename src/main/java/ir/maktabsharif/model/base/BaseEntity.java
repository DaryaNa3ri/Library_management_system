package ir.maktabsharif.model.base;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
//@ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields,@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    @Column(name = "create_date")
    private final LocalDateTime created = LocalDateTime.now();
}
