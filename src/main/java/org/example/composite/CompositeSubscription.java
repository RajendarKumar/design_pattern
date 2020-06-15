package org.example.composite;

public class CompositeSubscription extends Component{

    private float totalBill;

    public float getCharges() {
        totalBill = 0;
        for (Component f : list) {
            totalBill = totalBill + f.getCharges();
        }
        return totalBill;
    }
}
