#ifndef IVISITOR_H
#define IVISITOR_H

class Professor;
class Aluno;
class Funcionario;

class IVisitor
{
public:
    virtual void visitProfessor(Professor *professor);
    virtual void visitAluno(Aluno *aluno);
    virtual void visitFuncionario(Funcionario *funcionario);
};

#endif // IVISITOR_H
