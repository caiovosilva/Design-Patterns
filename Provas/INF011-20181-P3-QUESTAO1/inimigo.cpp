#include "inimigo.h"

Inimigo::Inimigo(QString nome):
    nome(nome)
{
}

void Inimigo::obterSuperPoderes(int value)
{
    superPoder(value);
    emit obteveSuperPoderes(value, nome);
}
