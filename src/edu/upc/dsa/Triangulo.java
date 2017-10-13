package edu.upc.dsa;

/**
 * Created by $uperuser on 16/09/2016.
 */

public class Triangulo extends Figura
{
    private double b;
    private double h;

    public Triangulo(double b, double h)
    {
        this.b = b;
        this.h = h;
    }

    public double area()
    {
        return (b*h)/2;
    }
}

