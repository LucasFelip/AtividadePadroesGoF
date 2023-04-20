package org.example.quest5;

public class LocalidadeBrasilFactory extends LocalidadeAbstractFactory {
    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaBrasil(valor);
    }
    @Override
    public Data getData(int dia, int mes, int ano){
        return new DataBrasil(dia, mes, ano);
    }
}
