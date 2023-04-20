package org.example.quest10;

public class CreamCheeseEdge extends CondimentDecorator {
    private Pizza pizza;

    public CreamCheeseEdge(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", CreamCheeseEdge";
    }

    public double cost() {
        return pizza.cost() + 1.2;
    }
}
