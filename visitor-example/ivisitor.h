#ifndef IVISITOR_H
#define IVISITOR_H

#include <QString>

class Professor;
class Aluno;
class Funcionario;

class IVisitor
{
public:
    virtual void visitProfessor(Professor *professor);
    virtual void visitAluno(Aluno *aluno);
    virtual void visitFuncionario(Funcionario *funcionario);
    virtual QString toString()=0;
};

#endif // IVISITOR_H
