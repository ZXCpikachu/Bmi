package com.example.demo;

public class Bmi {
    public double getM() {
        return m;
    }

    public double getH() {
        return h;
    }

    double m;

    public void setM(double m) {
        this.m = m;
    }

    public void setH(double h) {
        this.h = h;
    }

    double h;

    public Bmi() {
        this.m = m;
        this.h = h;
    }
    public  double calc()
    {
        return m/((h/100)*(h/100));
    }
    public String toString()
    {
        return String.valueOf(calc());
    }
}
