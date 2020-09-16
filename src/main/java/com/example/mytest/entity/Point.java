package com.example.mytest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

public class Point {


    private Long id;
    private Double vertical;
    private Double horizontal;
    private Line line;

    public Point() {
    }

    public Point(Long id, Double vertical, Double horizontal) {
        this.id = id;
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public Point(Long id, Double vertical, Double horizontal, Line line) {
        this.id = id;
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.line = line;
    }

    public Long getId() {
        return id;
    }


    public Double getVertical() {
        return vertical;
    }

    public void setVertical(Double vertical) {
        this.vertical = vertical;
    }

    public Double getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Double horizontal) {
        this.horizontal = horizontal;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
