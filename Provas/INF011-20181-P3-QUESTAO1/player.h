#ifndef PLAYER_H
#define PLAYER_H

#include <QObject>

class Player : public QObject
{
    Q_OBJECT
public:
    Player(QString nome);

public slots:
    void inimigoObtevePoderes(int value, QString nomeInimigo);

private:
    QString nome;
};

#endif // PLAYER_H
