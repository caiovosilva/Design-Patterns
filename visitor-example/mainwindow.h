#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QList>

#include "ielement.h"
#include "ivisitor.h"

//class IElement;
//class IVisitor;

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private:
    void run();
    Ui::MainWindow *ui;
    QList<IElement*> elementList;
    QList<IVisitor*> visitorList;
};

#endif // MAINWINDOW_H
