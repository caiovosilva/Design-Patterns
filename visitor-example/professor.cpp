#include "professor.h"
#include "ivisitor.h"

void Professor::Accept(IVisitor *v){
    v->visitProfessor(this);
}

int Professor::getNumeroPublicacoes()
{
    return numeroPublicacoes;
}
