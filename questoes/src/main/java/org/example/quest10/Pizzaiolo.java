package org.example.quest10;

public class Pizzaiolo {
    public static void main(String[] args) {
        Pizza pizza = new MozzarellaPizza();
        System.out.println(pizza.getDescription() + " --- " + pizza.cost());

        pizza = new Tomato(pizza);
        System.out.println(pizza.getDescription() + " --- " + pizza.cost());

        pizza = new CreamCheeseEdge(pizza);
        System.out.println(pizza.getDescription() + " --- " + pizza.cost());

        Pizza pizza2 = new PepperoniPizza();
        System.out.println(pizza2.getDescription() + " --- " + pizza2.cost());

        pizza2 = new Oregano(pizza2);
        pizza2 = new Bacon(pizza2);
        System.out.println(pizza2.getDescription() + " --- " + pizza2.cost());

        pizza2 = new Tomato(pizza2);
        System.out.println(pizza2.getDescription() + " --- " + pizza2.cost());
    }
}
