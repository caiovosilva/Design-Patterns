#include "alunovisitor.h"
#include "aluno.h"

AlunoVisitor::AlunoVisitor()
{
    numAlunos = 0;
    somaNotas = 0;
}

void AlunoVisitor::visitAluno(Aluno *aluno)
{
    somaNotas += aluno->getNota();
    numAlunos++;
}

double AlunoVisitor::getMedia()
{
    return somaNotas / numAlunos;
}
