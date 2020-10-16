package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "persistent_logins")
public class PersistentLogins {
    private String username;
    private String series;
    private String token;
    private Timestamp lastUesed;

    @Basic
    @Column(name = "username", nullable = false, length = 64)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "series", nullable = false, length = 64)
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Basic
    @Column(name = "token", nullable = false, length = 45)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "last_uesed", nullable = false)
    public Timestamp getLastUesed() {
        return lastUesed;
    }

    public void setLastUesed(Timestamp lastUesed) {
        this.lastUesed = lastUesed;
    }

}
