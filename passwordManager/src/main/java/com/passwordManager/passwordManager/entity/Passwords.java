package com.passwordManager.passwordManager.entity;
import javax.persistence.*;
@Entity
public class Passwords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passwordId;

    public Long getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Long passwordId) {
        this.passwordId = passwordId;
    }

    private String emailId;
    private String userName;
    private String password;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
