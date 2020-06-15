package org.example.state;

public class TVContext {
    private TVState state;
    public  TVContext(final TVState state){
        this.state = state;
    }

    public void setState(TVState state) {
        this.state = state;
    }

    public void change(){
        state.updateState(this);
    }
}
