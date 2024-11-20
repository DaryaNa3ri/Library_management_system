package ir.maktabsharif.model;

import ir.maktabsharif.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "libraries")
public class Library extends BaseEntity<Long> {

    private String name;

    @Embedded
    private Address address;
}
