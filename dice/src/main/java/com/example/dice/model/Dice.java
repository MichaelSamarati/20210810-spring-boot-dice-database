package com.example.dice.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

@Table(name = "dice")
@Entity(name = "dice")
public class Dice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "color")
    private String color;
    @Column(name = "number")
    @Min(1)
    @Max(6)
    private int number;
    @Column(name = "insertTimestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertTimestamp;
    @Column(name = "lastRollTimestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRollTimestamp;

    public Dice(String color, int number) {
        this.color = color;
        this.number = number;
        this.insertTimestamp = currentTimestamp();
    }

    public Dice() {

    }

    public Date getInsertTimestamp() {
        return insertTimestamp;
    }

    public Date getLastRollTimestamp() {
        return lastRollTimestamp;
    }

    public void setInsertTimestamp(Date insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    public void setLastRollTimestamp(Date lastRollTimestamp) {
        this.lastRollTimestamp = lastRollTimestamp;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void rollDice(){
        Random random = new Random();
        this.number = random.nextInt(6) + 1;
    }

    public Date currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
