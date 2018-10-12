#include "addoperation.h"

AddOperation::AddOperation(double *numberOnDisplay, double rightOperand, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    this->numberOnDisplay = numberOnDisplay;
    this->rightOperand = rightOperand;
}

void AddOperation::undo()
{
    *numberOnDisplay -= rightOperand;
}

void AddOperation::redo()
{
    *numberOnDisplay += rightOperand;
}
