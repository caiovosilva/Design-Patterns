#ifndef OPERATIONMADE_H
#define OPERATIONMADE_H

#include "calculator.h"
#include <QUndoCommand>

class OperationMade : public QObject, public QUndoCommand
{
    Q_OBJECT

public:
    //enum { Id = 1234 };

    OperationMade(double *numberOnDisplay, double rightOperand, const QString &pendingOperator,
                QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;
    //int id() const override { return Id; }
private:
    double *numberOnDisplay;
    double rightOperand;
    //Calculator calc;
    QString pendingOperator;
};

#endif // OPERATIONMADE_H
