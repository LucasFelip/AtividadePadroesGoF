package org.example.quest10;

public abstract class Pizza {
    protected String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}