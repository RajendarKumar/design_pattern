package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    protected List<Component> list = new ArrayList<>();

    public abstract float getCharges();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public Component getChild(int i) {
        return (Component) list.get(i);
    }
}
