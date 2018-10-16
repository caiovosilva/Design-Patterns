#ifndef URSOINIMIGO_H
#define URSOINIMIGO_H

#include "inimigo.h"

class UrsoInimigo: public Inimigo
{
public:
    UrsoInimigo(QString nome);

protected:
    virtual void superPoder(int value);
};

#endif // URSOINIMIGO_H
