package com.paulmarten.availaball.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paulms on 6/15/2017.
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private Account account;
    private String role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Column (name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
