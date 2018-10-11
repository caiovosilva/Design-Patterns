#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "ielement.h"
#include "ivisitor.h"
#include "aluno.h"
#include "alunovisitor.h"
#include "professor.h"
#include "professorvisitor.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    Run();
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::Run()
{
    for(int i=1;i<11;i++)
    {
        elementList.append(new Aluno(i));
    }

    for(int i=0;i<11;i=i+2)
    {
        elementList.append(new Professor(i));
    }

    visitorList.append(new AlunoVisitor);
    visitorList.append(new ProfessorVisitor);

    foreach (IVisitor *visitor, visitorList)
    {
        foreach (IElement *element, elementList)
        {
            element->Accept(visitor);
        }
    }
    QString result;
    foreach (IVisitor *visitor, visitorList) {
        result = result + visitor->toString()+"\n";
    }
    ui->label->setText(result);
}

