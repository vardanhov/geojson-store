package com.example.mytest.domain;



import java.util.List;



public class Line {


 //   private ObjectId id;

    private String type;

    private List<Feature> features;

    public Line() {
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
