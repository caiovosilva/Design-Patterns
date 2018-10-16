#include <QApplication>

#include "inimigo.h"
#include "player.h"
#include "ursoinimigo.h"
#include "piratainimigo.h"

void run();

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    run();

    return a.exec();
}

void run(){
    Inimigo *inimigo1 = new UrsoInimigo("Urso");
    Inimigo *inimigo2 = new PirataInimigo("Pirata");
    Player *jogador1 = new Player("Jogador 1");
    Player *jogador2 = new Player("Jogador 2");

    QObject::connect(inimigo1, SIGNAL(obteveSuperPoderes(int,QString)), jogador1, SLOT(inimigoObtevePoderes(int,QString)));
    QObject::connect(inimigo1, SIGNAL(obteveSuperPoderes(int,QString)), jogador2, SLOT(inimigoObtevePoderes(int,QString)));
    QObject::connect(inimigo2, SIGNAL(obteveSuperPoderes(int,QString)), jogador1, SLOT(inimigoObtevePoderes(int,QString)));
    QObject::connect(inimigo2, SIGNAL(obteveSuperPoderes(int,QString)), jogador2, SLOT(inimigoObtevePoderes(int,QString)));

    inimigo1->obterSuperPoderes(10);
    inimigo2->obterSuperPoderes(20);
}
