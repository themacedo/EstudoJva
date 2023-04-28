package src.aplication;

import src.entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle ();
        y = new Triangle ();

        System.out.println("Digite as medidas dos lados do triangulo X :");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas dos lados do triangulo Y :");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

       double  areaX = x.Area();

       double areaY = y.Area();

        System.out.println("Triangle X Area: " + areaX);

        System.out.println("Triangle Y Area: " + areaY);

        if (areaX > areaY) {

            System.out.println("Large area: X");

        }

        else

            System.out.println("Large area: Y");

        sc.close();
    }
}
