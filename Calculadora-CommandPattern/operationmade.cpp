#include "operationmade.h"

OperationMade::OperationMade(double *oldValue, double rightOperand,  const QString &pendingOperator, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    this->oldValue = oldValue;
    this->rightOperand = rightOperand;
    this->pendingOperator = pendingOperator;
}

void OperationMade::undo()
{
//    myDiagramItem->setPos(myOldPos);
//    myDiagramItem->scene()->update();
//    setText(QObject::tr("Move %1")
//        .arg(createCommandString(myDiagramItem, newPos)));
}

void OperationMade::redo()
{
//    if (pendingOperator == tr("+")) {
//        newValue += rightOperand;
//    } else if (pendingOperator == tr("-")) {
//        newValue -= rightOperand;
//    } else if (pendingOperator == tr("\303\227")) {
//        newValue *= rightOperand;
//    } else if (pendingOperator == tr("\303\267")) {
//        if (rightOperand == 0.0){
//            validOperation = false;
//            return;
//        }
//        newValue /= rightOperand;
//    }
}

bool OperationMade::mergeWith(const QUndoCommand *command)
{
//    const MoveCommand *moveCommand = static_cast<const MoveCommand *>(command);
//    DiagramItem *item = moveCommand->myDiagramItem;

//    if (myDiagramItem != item)
//    return false;

//    newPos = item->pos();
//    setText(QObject::tr("Move %1")
//        .arg(createCommandString(myDiagramItem, newPos)));

    return true;
}
