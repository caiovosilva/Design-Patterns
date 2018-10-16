#ifndef INIMIGO_H
#define INIMIGO_H

#include <QDebug>
#include <QString>
#include <QObject>

class Inimigo : public QObject
{
    Q_OBJECT
public:
    Inimigo(QString nome);
    void obterSuperPoderes(int value);

private:
    QString nome;

protected:
    virtual void superPoder(int value) = 0;

signals:
    void obteveSuperPoderes(int value, QString nomeInimigo);

};

#endif // INIMIGO_H
