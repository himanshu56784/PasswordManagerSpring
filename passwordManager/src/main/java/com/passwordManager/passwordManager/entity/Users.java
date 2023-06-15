package com.passwordManager.passwordManager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long registrationId;

    @Column(nullable = false)
    private String userEmail;
    private String userName;
    private String password;
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "registration_id",
            referencedColumnName = "registrationId"
    )
    @JsonIgnore
    private List<Sites> sitesList;
    public void addSite(Sites sites){
        sitesList.add(sites);
    }

    public void removeSite(Sites sites){
        sitesList.remove(sites);
    }

    public Users(){}

    public Users(String userEmail, String userName, String password) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
    }

    public Users(Long registrationId, String userEmail, String userName, String password) {
        this.registrationId = registrationId;
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    public List<Sites> getSitesList() {
        return sitesList;
    }

    public void setSitesList(List<Sites> sitesList) {
        this.sitesList = sitesList;
    }

    public Users(String userEmail, String userName, String password, List<Sites> sitesList) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
        this.sitesList = sitesList;
    }
}
