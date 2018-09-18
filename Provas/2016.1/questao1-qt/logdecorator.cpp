#include "logdecorator.h"

#include <QDebug>

LogDecorator::LogDecorator(IComponent *decorated)
    : Decorator(decorated)
{
}
void LogDecorator::aumentarPreco(double percentual) {
    qDebug() << "Fazendo log";
    Decorator::aumentarPreco(percentual);
}
