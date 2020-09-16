package com.example.mytest.domain;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Geometry implements Serializable {

    private String type;


    private List<List<Double>> coordinates;

    public Geometry() {
    }

    public Geometry(String type, List<List<Double>> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
       // this.coordinates =coordinates.stream().filter(Objects::nonNull).map(a-> new Point(a.get(0),a.get(1))).collect(Collectors.toList());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<Double>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
    }
}
