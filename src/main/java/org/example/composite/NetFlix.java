package org.example.composite;

public class NetFlix extends Component {
    private float charges;
    public NetFlix(final float charges){
        this.charges = charges;
    }
    @Override
    public float getCharges() {
        return charges;
    }
}
