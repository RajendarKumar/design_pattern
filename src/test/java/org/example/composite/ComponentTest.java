package org.example.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComponentTest {

    @Test
    public void getCharges() {
        Component component = new CompositeSubscription();

        component.add(new AmazonPrime( 100));
        component.add(new NetFlix( 150));

        float totalCharges = component.getCharges();
        System.out.println("Total Billed Amount : " + totalCharges);
    }
}