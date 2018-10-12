ifndef ADDOPERATION_H
#define ADDOPERATION_H

#include "calculator.h"
#include <QUndoCommand>

class AddOperation : public QObject, public QUndoCommand
{
    Q_OBJECT

public:
    //enum { Id = 1234 };

    AddOperation(double *numberOnDisplay, double rightOperand, QUndoCommand *parent = 0);

    void undo() override;
    void redo() override;
    //int id() const override { return Id; }
private:
    double *numberOnDisplay;
    double rightOperand;
    //Calculator calc;
};

#endif // ADDOPERATION_H
