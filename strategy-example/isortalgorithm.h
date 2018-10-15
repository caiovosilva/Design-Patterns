#ifndef ISORTALGORITHM_H
#define ISORTALGORITHM_H
#include <QList>

class ISortAlgorithm
{
public:
    virtual void sort(QList<int> *list) = 0;
};

#endif // ISORTALGORITHM_H
