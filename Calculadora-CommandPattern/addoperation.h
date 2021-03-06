#ifndef ADDOPERATION_H
#define ADDOPERATION_H

#include "calculator.h"
#include <QUndoCommand>

class AddOperation : public QObject, public QUndoCommand
{
    Q_OBJECT

public:
    AddOperation(double *numberOnDisplay, double rightOperand, QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;

private:
    double *numberOnDisplay;
    double rightOperand;
};

#endif // ADDOPERATION_H
