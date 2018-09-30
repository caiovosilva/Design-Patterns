#ifndef OPERATIONMADE_H
#define OPERATIONMADE_H

#include <QUndoCommand>

class OperationMade : public QUndoCommand
{
public:
    enum { Id = 1234 };

    OperationMade(const double oldValue, const double rightOperand,  const QString &pendingOperator,
                QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;
    bool mergeWith(const QUndoCommand *command) override;
    int id() const override { return Id; }
    bool validOperation;
private:
    double oldValue;
    double rightOperand;
    double newValue;
    QString pendingOperator;
};

#endif // OPERATIONMADE_H
