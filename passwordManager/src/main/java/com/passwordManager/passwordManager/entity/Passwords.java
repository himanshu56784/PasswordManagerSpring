package com.passwordManager.passwordManager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passwords {

    @Id
    private String emailId;
    private String userName;
    private String password;

}
