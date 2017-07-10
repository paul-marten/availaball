package com.paulmarten.availaball.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
    private String role;
    private Set<FutsalField> futsalFields = new HashSet<FutsalField>(0);
    private String plainPassword;
    private String repeatPassword;

//    @JsonView(ViewJSON.AccountView.class)
    @JsonView(DataTablesOutput.View.class)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id",unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int idSurveyer) {
        this.id = idSurveyer;
    }

//    @JsonView(ViewJSON.AccountInFutsalFieldView.class)
    @JsonView(DataTablesOutput.View.class)
    @NotEmpty
    @Column (name = "username" , unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    @JsonView(ViewJSON.AccountView.class)
    @JsonView(DataTablesOutput.View.class)
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

    @Column(name="role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Transient
    public String getPlainPassword() {
        return plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.password = new BCryptPasswordEncoder().encode(plainPassword);
        this.plainPassword=plainPassword;
    }

    @Transient
    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}