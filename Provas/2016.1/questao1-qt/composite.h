#ifndef COMPOSITE_H
#define COMPOSITE_H

#include <QList>

#include "icomponent.h"

class Composite : public IComponent
{
public:
    Composite();
    bool addChild(IComponent *child);
    bool removeChild(IComponent *child);
    void aumentarPreco(double percentual);
private:
    QList<IComponent *> m_children;
};

#endif // COMPOSITE_H
