#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QList>

#include "isortalgorithm.h"
#include "bubblesort.h"


MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::run()
{
    ISortAlgorithm *sortObj = new BubbleSort();

    QList<int> list;
    list << 2 << 4 << 1;

    sortObj->sort(&list);
    //ui->label->setText(intQlistToString(&list));
}

QString intQlistToString(QList<int> *list)
{
    QString string;
    for(int i=0; i<list->size(); i++)
    {
        string += QString::number(list->indexOf(i));
        if(i<list->size()-1)
        string += "," ;
    }
}
