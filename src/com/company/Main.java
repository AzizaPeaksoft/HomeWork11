package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle treugolnik = new Triangle();
    treugolnik.a = 10;
    treugolnik.b = 20;
    treugolnik.c = 5;

    Triangle.area(treugolnik.a, treugolnik.b, treugolnik.c);
    }
}
