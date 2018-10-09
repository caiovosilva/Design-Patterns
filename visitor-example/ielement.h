#ifndef IELEMENT_H
#define IELEMENT_H

class IVisitor;

class IElement
{
public:
    virtual void Accept(IVisitor *v) = 0;
};

#endif // IELEMENT_H
