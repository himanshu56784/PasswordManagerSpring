package com.passwordManager.passwordManager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Registration {
    @Id
    @SequenceGenerator(
            name = "registration_sequence",
            sequenceName = "registration_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "registration_sequence"
    )
    private Long registrationId;

    @Column(name = "user_email",
            nullable = false)
    private String userEmail;
    private String userName;
    private String password;
    @OneToMany
    @JoinColumn(
            name = "registration_id",
            referencedColumnName = "registrationId"
    )
    private List<Sites> sitesList;

}
