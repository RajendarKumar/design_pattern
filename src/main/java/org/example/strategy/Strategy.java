package org.example.strategy;

public class Strategy {
    private Operation operation;
    public Strategy(){

    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void calculate(int val1, int val2){
        int result = operation.operation(val1, val2);
        System.out.println("Resultant Value : "+result);
    }
}
