#ifndef PROFESSOR_H
#define PROFESSOR_H

#include "ielement.h"

class IVisitor;

class Professor : public IElement
{
public:
    Professor(int numeroPublicacoes);
    void Accept(IVisitor *v);
    int getNumeroPublicacoes();
private:
    int numeroPublicacoes;
};

#endif // PROFESSOR_H
