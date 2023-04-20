package org.example.quest1;

interface Builder {
    void criarNovoContato();
    void adicionarNome(String nome);
    void adicionarEndereco(String endereco);
    void adicionarTelefone(String telefone);
    void adicionarEmail(String email);
    Contato getContato();
}
