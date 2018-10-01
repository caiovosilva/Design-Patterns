#include "operationmade.h"

OperationMade::OperationMade(double *numberOnDisplay, double rightOperand,
                             const QString &pendingOperator, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    //this->calc = calc;
    this->numberOnDisplay = numberOnDisplay;
    oldValue = *numberOnDisplay;
    this->rightOperand = rightOperand;
    this->pendingOperator = pendingOperator;
}

bool OperationMade::isValidOperation(){
    return validOperation;
}

void OperationMade::undo()
{
    *numberOnDisplay = oldValue;
    /*
    if (pendingOperator == tr("\303\267")) {
        *numberOnDisplay = oldValue * rightOperand;
    } else if (pendingOperator == tr("\303\227")) {
        *numberOnDisplay = oldValue / rightOperand;
    } else if (pendingOperator == tr("+")) {
        *numberOnDisplay = oldValue - rightOperand;
    } else if (pendingOperator == tr("-")) {
        *numberOnDisplay = oldValue - rightOperand;
    }*/
}

void OperationMade::redo()
{
    if (pendingOperator == tr("\303\267")) {
        if (rightOperand == 0.0){
            validOperation = false;
            //calc.abortOperation();
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
    validOperation = true;
}
