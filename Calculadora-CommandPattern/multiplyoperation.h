#ifndef MULTIPLYOPERATION_H
#define MULTIPLYOPERATION_H

#include "calculator.h"
#include <QUndoCommand>

class MultiplyOperation : public QObject, public QUndoCommand
{
    Q_OBJECT

public:
    MultiplyOperation(double *numberOnDisplay, double rightOperand, QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;

private:
    double *numberOnDisplay;
    double rightOperand;
};

#endif // MULTIPLYOPERATION_H
