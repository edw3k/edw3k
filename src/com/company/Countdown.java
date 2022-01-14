package com.company;

public class Countdown {
    public static void main(String[] args) {
        comptEnrereRecursiu(10);
    }
    static void comptEnrereRecursiu(int n){
        if(n==0){
            System.out.println("Boom");
        }
        else{
            System.out.println(n+",");
            comptEnrereRecursiu(n-1);
        }
    }
}
