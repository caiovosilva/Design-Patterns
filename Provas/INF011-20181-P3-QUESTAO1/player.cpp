#include "player.h"

#include <QDebug>

Player::Player(QString nome) :
    nome(nome)
{
}

void Player::inimigoObtevePoderes(int value, QString nomeInimigo)
{
    qDebug() << nome+" perseguindo "+nomeInimigo+" com "+QString::number(value);
}
