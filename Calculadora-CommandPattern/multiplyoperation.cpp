#include "multiplyoperation.h"

MultiplyOperation::MultiplyOperation(double *numberOnDisplay, double rightOperand, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    this->numberOnDisplay = numberOnDisplay;
    this->rightOperand = rightOperand;
}

void MultiplyOperation::undo()
{
    *numberOnDisplay /= rightOperand;
}

void MultiplyOperation::redo()
{
    *numberOnDisplay *= rightOperand;
}
