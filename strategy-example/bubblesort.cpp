#include "bubblesort.h"

void BubbleSort::sort(QList<int> *list)
{
    int i;
    int size = list->size();

    for(i = 0; i < size-1; i++)
        if(list->indexOf(i)>list->indexOf(i+1))
        {
            int temp = list->indexOf(i);
            list->insert(i,list->indexOf(i+1));
            list->insert(i+1,temp);
        }
}
