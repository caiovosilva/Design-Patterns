#ifndef ALUNOVISITOR_H
#define ALUNOVISITOR_H

#include "ivisitor.h"
class Aluno;

class AlunoVisitor
{
public:
    AlunoVisitor();
    void visitAluno(Aluno *aluno);
    double getMedia();
private:
    double somaNotas;
    int numAlunos;
};

#endif // ALUNOVISITOR_H
