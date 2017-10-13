package edu.upc.dsa;


import static java.lang.Math.PI;

public class Circulo extends Figura
{
    private double radio;

    public Circulo(double radio)
    {
        this.radio = radio;
    }
    public double area()
    {
        return PI*radio*radio;
    }
}

