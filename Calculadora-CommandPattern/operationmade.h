#ifndef OPERATIONMADE_H
#define OPERATIONMADE_H

#include <QUndoCommand>

class OperationMade : public QUndoCommand
{
public:
    enum { Id = 1234 };

    OperationMade(const double oldPos,
                QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;
    bool mergeWith(const QUndoCommand *command) override;
    int id() const override { return Id; }

private:
    double myOldPos;
    double newPos;
};

#endif // OPERATIONMADE_H
