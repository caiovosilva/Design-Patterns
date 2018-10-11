#ifndef ALUNO_H
#define ALUNO_H

class IVisitor;
#include "ielement.h"


class Aluno : public IElement
{
public:
    Aluno(double nota);
    void Accept(IVisitor *v);
    double getNota();
private:
    double nota;
};

#endif // ALUNO_H
