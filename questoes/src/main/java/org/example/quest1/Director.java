package org.example.quest1;

class Director {
    private Builder builder;
    private Contato contato;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construirContato(Pessoa pessoa) {
        builder.criarNovoContato();
        builder.adicionarNome(pessoa.getNome());

        if (builder instanceof ContatoCompletoBuilder) {
            builder.adicionarEndereco(pessoa.getEndereco());
        }

        builder.adicionarTelefone(pessoa.getTelefone());

        if (builder instanceof ContatoInternetBuilder || builder instanceof ContatoCompletoBuilder) {
            builder.adicionarEmail(pessoa.getEmail());
        }

        contato = builder.getContato();
    }

    public Contato getContato() {
        return contato;
    }
}
