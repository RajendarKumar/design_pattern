package org.example.state;

public class TVStateON implements TVState{
    public static TVStateON ON = new TVStateON();

    private TVStateON(){

    }

    @Override
    public void updateState(TVContext context) {
        System.out.println("TV Switched ON.");
        context.setState(TVStateOFF.OFF);
    }
}
