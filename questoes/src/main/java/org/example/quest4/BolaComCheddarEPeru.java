package org.example.quest4;
class BolaComCheddarEPeru implements SanduicheFactory{
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.Bola,Queijo.Cheddar,Presento.Peru,Salada.SemVerdura);
        return sanduiche;
    }
}
