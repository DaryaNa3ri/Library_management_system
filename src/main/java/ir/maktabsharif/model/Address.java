package ir.maktabsharif.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String country;

    private String city;

    private String street;

    private String zip;
}
