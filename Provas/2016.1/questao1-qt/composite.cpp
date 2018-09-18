#include "composite.h"

#include "icomponent.h"

Composite::Composite()
{

}

bool Composite::addChild(IComponent *child)
{
    m_children << child;
    return true;
}
bool Composite::removeChild(IComponent *child)
{
    m_children.removeAll(child);
    return true;
}
void Composite::aumentarPreco(double percentual)
{
    foreach(IComponent *child, m_children)
        child->aumentarPreco(percentual);
}
