package org.example.quest10;

public class Tomato extends CondimentDecorator {
    private Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    public double cost() {
        return pizza.cost() + 0.1;
    }
}