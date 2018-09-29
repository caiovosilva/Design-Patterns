#include "mainwindow.h"
#include <QApplication>
#include "calculator.h"

int main(int argc, char *argv[])
{
    QApplication app(argc, argv);

//    MainWindow w;
//    w.show();

    Calculator calc;
    calc.show();

    return app.exec();
}
