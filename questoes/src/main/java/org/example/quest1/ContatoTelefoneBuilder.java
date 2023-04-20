package org.example.quest1;

class ContatoTelefoneBuilder implements Builder{
    private ContatoTelefone contatoTelefone;

    public void criarNovoContato() {
        contatoTelefone = new ContatoTelefone();
    }

    public void adicionarNome(String nome) {
        contatoTelefone.setNome(nome);
    }

    public void adicionarEndereco(String endereco) {
        // Não faz nada
    }

    public void adicionarTelefone(String telefone) {
        contatoTelefone.setTelefone(telefone);
    }

    public void adicionarEmail(String email) {
        // Não faz nada
    }

    public Contato getContato() {
        return contatoTelefone;
    }
}
