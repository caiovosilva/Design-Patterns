#include "professor.h"
#include "ivisitor.h"

Professor::Professor(int numeroPublicacoes)
    : numeroPublicacoes(numeroPublicacoes)
{

}

void Professor::Accept(IVisitor *v){
    v->visitProfessor(this);
}

int Professor::getNumeroPublicacoes()
{
    return numeroPublicacoes;
}
