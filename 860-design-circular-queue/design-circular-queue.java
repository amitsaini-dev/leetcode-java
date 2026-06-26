class MyCircularQueue {
    int arr[];
    int rear = -1;
    int front = -1;
    int size;

    public MyCircularQueue(int k) {

        size = k;
        arr = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % size;
        //if its 1st elemnent
        if (front == -1) {
            front = 0;
        }
        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        //if it last element in the queue
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */