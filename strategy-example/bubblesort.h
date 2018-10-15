#ifndef BUBBLESORT_H
#define BUBBLESORT_H

#include "isortalgorithm.h"

class BubbleSort : public ISortAlgorithm
{
public:
    void sort(QList<int> *list);
};

#endif // BUBBLESORT_H
