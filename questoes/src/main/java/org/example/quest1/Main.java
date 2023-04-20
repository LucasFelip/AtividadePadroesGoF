package org.example.quest1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder internetBuilder = new ContatoInternetBuilder();
        Builder telefoneBuilder = new ContatoTelefoneBuilder();
        Builder completoBuilder = new ContatoCompletoBuilder();

        Pessoa pessoa = new Pessoa("João", "Rua X, 123", "123456789", "joao@email.com");

        director.setBuilder(internetBuilder);
        director.construirContato(pessoa);
        ContatoInternet contatoInternet = (ContatoInternet) director.getContato();
        System.out.println(contatoInternet.toString());

        director.setBuilder(telefoneBuilder);
        director.construirContato(pessoa);
        ContatoTelefone contatoTelefone = (ContatoTelefone) director.getContato();
        System.out.println(contatoTelefone.toString());

        director.setBuilder(completoBuilder);
        director.construirContato(pessoa);
        ContatoCompleto contatoCompleto = (ContatoCompleto) director.getContato();
        System.out.println(contatoCompleto.toString());
    }
}
