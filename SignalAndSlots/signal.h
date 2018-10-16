#ifndef SIGNAL_H
#define SIGNAL_H

#include <QObject>

class Signal: public QObject
{
    Q_OBJECT

public:
    Signal();
    void run();

signals:
    void exemplo(int newValue);
};

#endif // SIGNAL_H
