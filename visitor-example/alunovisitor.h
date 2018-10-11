#ifndef ALUNOVISITOR_H
#define ALUNOVISITOR_H

#include "ivisitor.h"
class Aluno;

class AlunoVisitor : public IVisitor
{
public:
    AlunoVisitor();
    void visitAluno(Aluno *aluno);
    double getMedia();
    QString toString();
private:
    double somaNotas;
    int numAlunos;
};

#endif // ALUNOVISITOR_H
