package org.example.composite;

public class AmazonPrime extends Component {
    private float charges;
    public AmazonPrime(final float charges){
        this.charges = charges;
    }
    @Override
    public float getCharges() {
        return charges;
    }
}
