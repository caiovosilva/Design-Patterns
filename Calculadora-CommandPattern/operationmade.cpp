#include "operationmade.h"

OperationMade::OperationMade(double *numberOnDisplay, double rightOperand,
                             const QString &pendingOperator, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    //this->calc = calc;
    this->numberOnDisplay = numberOnDisplay;
    this->rightOperand = rightOperand;
    this->pendingOperator = pendingOperator;
}

void OperationMade::undo()
{
    if (pendingOperator == tr("\303\267")) {
        *numberOnDisplay = *numberOnDisplay * rightOperand;
    } else if (pendingOperator == tr("\303\227")) {
        if(rightOperand==0.0)
            return;
        *numberOnDisplay = *numberOnDisplay / rightOperand;
    } else if (pendingOperator == tr("+")) {
        *numberOnDisplay = *numberOnDisplay - rightOperand;
    } else if (pendingOperator == tr("-")) {
        *numberOnDisplay = *numberOnDisplay - rightOperand;
    }
}

void OperationMade::redo()
{
    if (pendingOperator == tr("\303\267")) {
        if (rightOperand == 0.0){
            return;
        }
        *numberOnDisplay /= rightOperand;
    } else if (pendingOperator == tr("\303\227")) {
        *numberOnDisplay *= rightOperand;
    } else if (pendingOperator == tr("+")) {
        *numberOnDisplay += rightOperand;
    } else if (pendingOperator == tr("-")) {
        *numberOnDisplay -= rightOperand;
    }
}
