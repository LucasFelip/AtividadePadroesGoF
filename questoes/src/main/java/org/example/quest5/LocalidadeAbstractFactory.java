package org.example.quest5;

public abstract class LocalidadeAbstractFactory {
    public abstract Moeda getMoeda(double valor);
    public abstract Data getData(int dia, int mes, int ano);
}
