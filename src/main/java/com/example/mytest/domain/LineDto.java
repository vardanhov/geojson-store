package com.example.mytest.domain;




import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.List;

public class LineDto implements Serializable {



    private String type;

    private List<Feature> features;

    public LineDto() {
    }

    public LineDto(String type, List<Feature> features) {
        this.type = type;
        this.features = features;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Line{" +

                ", type='" + type + '\'' +
                ", features=" + features +
                '}';
    }
}

