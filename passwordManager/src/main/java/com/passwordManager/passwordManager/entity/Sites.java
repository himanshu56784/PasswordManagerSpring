package com.passwordManager.passwordManager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @OneToMany
    @JoinColumn(
            name = "site_id",
            referencedColumnName = "siteId"
    )
    private List<Passwords> passwords;

    public Sites() {
    }

    public Sites(String siteUrl, String siteName, String imageUrl, List<Passwords> passwords) {
        this.siteUrl = siteUrl;
        this.siteName = siteName;
        this.imageUrl = imageUrl;
        this.passwords = passwords;
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

    public List<Passwords> getPasswords() {
        return passwords;
    }

    public void setPasswords(List<Passwords> passwords) {
        this.passwords = passwords;
    }

}
