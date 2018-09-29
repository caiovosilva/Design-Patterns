#include "operationmade.h"

OperationMade::OperationMade(const double oldPos, QUndoCommand *parent)
    : QUndoCommand(parent)
{
    newPos = 1;//iagramItem->pos();
    myOldPos = oldPos;
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
//    myDiagramItem->setPos(newPos);
//    setText(QObject::tr("Move %1")
//        .arg(createCommandString(myDiagramItem, newPos)));
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
