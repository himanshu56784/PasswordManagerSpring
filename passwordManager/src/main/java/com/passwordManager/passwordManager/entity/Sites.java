package com.passwordManager.passwordManager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sites {
    @Id
    private String siteUrl;
    private String siteName;
    private String imageUrl;
    @OneToMany
    @JoinColumn(
            name = "site_url",
            referencedColumnName = "siteUrl"
    )
    private List<Passwords> passwords;
}
