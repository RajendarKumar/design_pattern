package org.example.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVContextTest {

    @Test
    public void change() {
        TVContext context = new TVContext(TVStateON.ON);
        context.change();
        context.change();
    }
}