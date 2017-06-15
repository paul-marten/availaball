package com.paulmarten.availaball.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paulms on 6/14/2017.
 */

@Entity
@Table(name="account")
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String username;
    private String password;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int idSurveyer) {
        this.id = idSurveyer;
    }

    @Column (name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column (name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}