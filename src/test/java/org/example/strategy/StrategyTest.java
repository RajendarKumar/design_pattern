package org.example.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void calculate() {
        Strategy strategy = new Strategy();

        Operation add = new Addition();
        strategy.setOperation(add);
        strategy.calculate(8,4);

        Operation sub = new Subtraction();
        strategy.setOperation(sub);
        strategy.calculate(8,4);

        Operation mult = new Multiplication();
        strategy.setOperation(mult);
        strategy.calculate(8,4);

        Operation div = new Divide();
        strategy.setOperation(div);
        strategy.calculate(8,4);
    }
}