package com.anusha.calculatorapp;

public class Calculatorclass {
    int num1, num2;
    public Calculatorclass(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public int Add(){
        return num1 + num2;
    }
    public int Substract(){return num1 - num2;}
    public int Mul(){return num1 * num2;}
    public int Div(){return num1 / num2;}


}
