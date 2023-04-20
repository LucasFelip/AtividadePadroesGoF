package org.example.quest1;

class ContatoInternetBuilder implements Builder{
    private ContatoInternet contatoInternet;

    public void criarNovoContato() {
        contatoInternet = new ContatoInternet();
    }

    public void adicionarNome(String nome) {
        contatoInternet.setNome(nome);
    }

    public void adicionarEndereco(String endereco) {
        // Não faz nada
    }

    public void adicionarTelefone(String telefone) {
        // Não faz nada
    }

    public void adicionarEmail(String email) {
        contatoInternet.setEmail(email);
    }

    public Contato getContato() {
        return contatoInternet;
    }
}
