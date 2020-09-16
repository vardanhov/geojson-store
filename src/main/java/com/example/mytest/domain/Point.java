package com.example.mytest.domain;

public class Point {

    private  Double left;

    private  Double right;

    public Point(Double left, Double right) {
        this.left = left;
        this.right = right;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }
}
