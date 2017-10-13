package edu.upc.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Figura> ListaFiguras = new ArrayList<Figura>();
        double sum = 0;


        String largeString = "Hola, soy tu primer programa en Java!" + "\r\n" + "Sirvo unicamente para calcularte el area de un cuadrado," + "\r\n" + "de un triangulo y de un circulo y devolverte la suma total." + "\n\n";
        System.out.println(largeString);
        System.out.println("Escribe el lado de el cuadrado:");

        double s = reader.nextDouble();

        ListaFiguras.add(new Cuadrado(s));
        System.out.println("tu numero es: " + s);
        System.out.println("Escribe la base del triangulo:");

        double b = reader.nextDouble();

        System.out.println("Escribe la altura del triangulo:");

        double h = reader.nextDouble();
        ListaFiguras.add(new Triangulo(b, h));
        System.out.println("tus numero son: " + b + " " + h);
        System.out.println("Escribe el radio del circulo:");

        double c = reader.nextDouble();
        //vector[1] = new Circulo(2,c);
        ListaFiguras.add(new Circulo(c));
        System.out.println("tu numero es: " + c);


        for (int i = 0; i < ListaFiguras.size(); i++) {
            sum = sum + ListaFiguras.get(i).area();
        }

        System.out.println("La suma da como resultado!: " + sum);
        Collections.sort(ListaFiguras, new Comparator<Figura>()
        {
            @Override
            public int compare(Figura o1, Figura o2)
            {
                return Double.compare(o1.area(), o2.area());
            }
        });
        System.out.println("Y sus areas ordenadas son!: ");
        for(int i=0; i<ListaFiguras.size(); i++)
        {
            System.out.println(ListaFiguras.get(i).area());
        }
    }
}

