package com.joantolos.tenda;

public class BasicComponent extends Component {

    public BasicComponent(String name, String description, Integer price, Integer stock) {
        super(name, description, price, stock, new InternalCategory("Basic", ""));
    }
}
