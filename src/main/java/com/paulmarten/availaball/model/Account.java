package com.paulmarten.availaball.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
    private Set<FutsalField> futsalFields = new HashSet<FutsalField>(0);;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id",unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int idSurveyer) {
        this.id = idSurveyer;
    }

    @NotEmpty
    @Column (name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotEmpty
    @Column (name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "account")
    public Set<FutsalField> getFutsalFields() {
        return futsalFields;
    }

    public void setFutsalFields(Set<FutsalField> futsalFields) {
        this.futsalFields = futsalFields;
    }
}