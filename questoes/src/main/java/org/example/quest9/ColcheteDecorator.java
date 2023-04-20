package org.example.quest9;

public class ColcheteDecorator extends NumeroDecorator {
    public ColcheteDecorator(Numero numero) {
        super(numero);
    }

    protected String getSimboloAbertura() {
        return "[";
    }

    protected String getSimboloFechamento() {
        return "]";
    }
}
