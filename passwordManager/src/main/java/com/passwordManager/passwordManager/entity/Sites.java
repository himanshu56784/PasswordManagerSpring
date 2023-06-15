package com.passwordManager.passwordManager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sites {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long siteId;

    private String siteUrl;
    private String siteName;
    private String imageUrl;
    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "site_id",
            referencedColumnName = "siteId"
    )
    @JsonIgnore
    private List<Passwords> passwordsList;



    public Sites() {

    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Sites(String siteUrl, String siteName, String imageUrl, List<Passwords> passwords) {
        this.siteUrl = siteUrl;
        this.siteName = siteName;
        this.imageUrl = imageUrl;
        this.passwordsList = passwords;
    }

    public void addPassword(Passwords passwords){
        this.passwordsList.add(passwords);
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Passwords> getPasswordsList() {
        return passwordsList;
    }

    public void setPasswordsList(List<Passwords> passwordsList) {
        this.passwordsList = passwordsList;
    }

}
