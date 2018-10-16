#include "slot.h"

#include <QDebug>

Slot::Slot()
{

}

void Slot::recebeExemplo(int value)
{
 qInfo() << "recebeu valor no slot:"+value;
}
