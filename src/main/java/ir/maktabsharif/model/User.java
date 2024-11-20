package ir.maktabsharif.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import ir.maktabsharif.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "users")
@NamedQuery(name = "User.findAll",query = "FROM User")
public class User extends BaseEntity<Long> {

    private String username;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Accessibility accessibility;




}
