#include "aluno.h"
#include "ivisitor.h"

Aluno::Aluno(double nota)
    : nota(nota)
{

}

void Aluno::Accept(IVisitor *v)
{
    v->visitAluno(this);
}

double Aluno::getNota()
{
    return nota;
}

