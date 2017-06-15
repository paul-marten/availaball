package com.paulmarten.availaball.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paulms on 6/15/2017.
 */
@Entity
@Table(name="futsal_field")
public class FutsalField implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idFutsalField;
    private String fieldName;
    private String location;
    private String phoneNumber;
    private int numberOfField;
    private String openingHours;
    private String closingHours;
    private String price;
    private int idSurveyer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getIdFutsalField() {
        return idFutsalField;
    }

    public void setIdFutsalField(int idFutsalField) {
        this.idFutsalField = idFutsalField;
    }

    @Column (name = "field_name")
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Column (name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column (name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column (name = "number_of_field")
    public int getNumberOfField() {
        return numberOfField;
    }

    public void setNumberOfField(int numberOfField) {
        this.numberOfField = numberOfField;
    }

    @Column (name = "opening_hours")
    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Column (name = "closing_horus")
    public String getClosingHours() {
        return closingHours;
    }

    public void setClosingHours(String closingHours) {
        this.closingHours = closingHours;
    }

    @Column (name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Column (name = "id_surveyer")
    public int getIdSurveyer() {
        return idSurveyer;
    }

    public void setIdSurveyer(int idSurveyer) {
        this.idSurveyer = idSurveyer;
    }
}
