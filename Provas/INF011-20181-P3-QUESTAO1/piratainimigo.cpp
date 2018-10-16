#include "piratainimigo.h"

PirataInimigo::PirataInimigo(QString nome) :
    Inimigo(nome)
{
}

void PirataInimigo::superPoder(int value)
{
    qDebug() << "Obtendo super-poderes de "+(QString::number(value)) + " facas";
}

