package org.example.state;

public class TVStateOFF implements TVState{
    public static TVStateOFF OFF = new TVStateOFF();

    private TVStateOFF(){}

    @Override
    public void updateState(TVContext context) {
        System.out.println("TV Switched OFF.");
        context.setState(TVStateON.ON);
    }
}
