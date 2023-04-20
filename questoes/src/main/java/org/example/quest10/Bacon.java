package org.example.quest10;

public class Bacon extends CondimentDecorator {
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }

    public double cost() {
        return pizza.cost() + 0.8;
    }
}