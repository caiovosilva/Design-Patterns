#include "aluno.h"
#include "ivisitor.h"

void Aluno::Accept(IVisitor *v){
    v->visitAluno(this);
}

double Aluno::getNota()
{
    return nota;
}

