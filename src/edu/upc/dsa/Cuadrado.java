package edu.upc.dsa;



/**
 * Created by $uperuser on 16/09/2016.
 */

public class Cuadrado extends Figura
{
    private double lado;
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    public double area()
    {
        return lado*lado;
    }

}

