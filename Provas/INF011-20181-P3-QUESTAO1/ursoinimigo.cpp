#include "ursoinimigo.h"

UrsoInimigo::UrsoInimigo(QString nome) :
    Inimigo(nome)
{
}

void UrsoInimigo::superPoder(int value)
{
    qDebug() << "Obtendo super-poderes de "+(QString::number(value)) + " mels";
}
