#include "decorator.h"

#include "icomponent.h"

Decorator::Decorator(IComponent *decorated) {
    setDecorated(decorated);
}

void Decorator::setDecorated(IComponent *decorated) {
    m_decorated = decorated;
}

void Decorator::aumentarPreco(double percentual) {
    m_decorated->aumentarPreco(percentual);
}
