package com.paulmarten.availaball.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paulms on 6/15/2017.
 */
@Entity
@Table (name = "detail_price")
public class DetailPrice implements Serializable{

    private static final long serialVersionUID = 1L;

    private int idDetailPrice;
    private FutsalField futsalField;
    private String day;
    private String startTime;
    private String endTime;
    private String price;

    public DetailPrice(){}

    public DetailPrice(FutsalField futsalField, String day, String startTime, String endTime, String price) {
        this.futsalField = futsalField;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public int getIdDetailPrice() {
        return idDetailPrice;
    }

    public void setIdDetailPrice(int idDetailPrice) {
        this.idDetailPrice = idDetailPrice;
    }

    //Relation mapping from detail price to futsalfield

//    @Column (name = "id_futsal_field")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_futsal_field")
    public FutsalField getFutsalField() {
        return futsalField;
    }

    public void setFutsalField(FutsalField futsalField) {
        this.futsalField = futsalField;
    }

    @Column (name = "day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Column (name = "start_time")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Column (name = "end_time")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Column (name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
