package org.example.quest10;

public class Oregano extends CondimentDecorator {
    private Pizza pizza;

    public Oregano(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Oregano";
    }

    public double cost() {
        return pizza.cost() + 0.5;
    }
}
