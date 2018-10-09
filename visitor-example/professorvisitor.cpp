#include "professorvisitor.h"
#include "professor.h"
ProfessorVisitor::ProfessorVisitor()
{
    somaPublicacoes = 0;
    numProfessores = 0;
}

void ProfessorVisitor::visitProfessor(Professor *professor)
{
    somaPublicacoes += professor->getNumeroPublicacoes();
    numProfessores++;
}

double ProfessorVisitor::getMedia()
{
    return somaPublicacoes/numProfessores;
}
