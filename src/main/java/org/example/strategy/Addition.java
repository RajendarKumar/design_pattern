package org.example.strategy;

public class Addition implements Operation{
    @Override
    public int operation(int val1, int val2) {
        return val1+val2;
    }
}
