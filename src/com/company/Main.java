package com.company;

public class Main {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x){
        return x*Math.exp(-x)+Math.sqrt(1-Math.exp(-x));
    }

    public static void main(String[] args) {
        System.out.println(multadd(1,2,3));
        System.out.println(Math.sin(Math.PI/4)+(Math.cos(Math.PI/4))/2);
        System.out.println(Math.log(10)+Math.log(20));
        System.out.println(expSum(2));
    }
}
