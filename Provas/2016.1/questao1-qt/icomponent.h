#ifndef ICOMPONENT_H
#define ICOMPONENT_H


class IComponent
{
public:
    virtual void aumentarPreco(double percentual) = 0;
    bool addChild(IComponent *child);
    bool removeChild(IComponent *child);
};

#endif // ICOMPONENT_H
