#ifndef PROFESSORVISITOR_H
#define PROFESSORVISITOR_H

class Professor;
#include "ivisitor.h"


class ProfessorVisitor : public IVisitor
{
public:
    ProfessorVisitor();
    void visitProfessor(Professor *professor);
    double getMedia();
private:
    double somaPublicacoes;
    int numProfessores;
};

#endif // PROFESSORVISITOR_H
