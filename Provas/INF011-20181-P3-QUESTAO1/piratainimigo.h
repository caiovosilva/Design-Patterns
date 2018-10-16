#ifndef PIRATAINIMIGO_H
#define PIRATAINIMIGO_H

#include "inimigo.h"

class PirataInimigo: public Inimigo
{
public:
    PirataInimigo(QString nome);

protected:
    virtual void superPoder(int value);
};


#endif // PIRATAINIMIGO_H
