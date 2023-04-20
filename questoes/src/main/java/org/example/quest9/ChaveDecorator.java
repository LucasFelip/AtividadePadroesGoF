package org.example.quest9;

public class ChaveDecorator extends NumeroDecorator {
    public ChaveDecorator(Numero numero) {
        super(numero);
    }

    protected String getSimboloAbertura() {
        return "{";
    }

    protected String getSimboloFechamento() {
        return "}";
    }
}