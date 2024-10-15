package com.example.racingcarrent.model.entity;

import com.example.racingcarrent.model.enums.CarStatus;
import com.example.racingcarrent.model.enums.Level;
import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car extends BaseEntity{

    private Category category;
    private String carName;
    private Level level;
    private CarStatus carStatus;
    private int year;
    private String engine;
    private String power;
    private String torque;
    private String weight;
    private String topSpeed;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "car_name", nullable = false)
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Column(name = "level", nullable = false)
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Column(name = "status", nullable = false)
    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name = "engine")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Column(name = "power")
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Column(name = "torque", nullable = true)
    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    @Column(name = "car_weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Column(name = "top_speed", nullable = false)
    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }
}
