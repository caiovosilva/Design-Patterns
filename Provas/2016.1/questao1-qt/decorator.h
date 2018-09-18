#ifndef DECORATOR_H
#define DECORATOR_H

#include "icomponent.h"

class Decorator : public IComponent
{
public:
    Decorator(IComponent *decorated = 0);
    void setDecorated(IComponent *decorated);
    void aumentarPreco(double percentual);
private:
    IComponent *m_decorated;
};

#endif // DECORATOR_H
