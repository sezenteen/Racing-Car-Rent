package com.example.racingcarrent.model.entity;

import com.example.racingcarrent.model.enums.Level;
import com.example.racingcarrent.model.enums.Status;

import java.math.BigDecimal;

public class Course extends BaseEntity {
    private Level level;
    private Status status;
    private BigDecimal price;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
