package com.company;

class Queue {

    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean insert(String i) {
        if(isFull() )
            return false;
        if(rear == maxSize - 1)
            rear = -1;
        rear++;
        queueArray[rear] = i;
        nItems++;
        return true;
    }

    public String remove() {
        if(isEmpty())
            return "empty";
        String temp = queueArray[front];
        front++;
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public String peekFront() {
        return queueArray[front];
    }


    public int size() {
        return nItems;
    }

}
