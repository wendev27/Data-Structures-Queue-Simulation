package Queue;

public class stringQueue {
	private String[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;
    public int classQueueNumber = 0;
    public String dequeuedStudent = "";
    
    public stringQueue(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(String item) {
//        if (size == capacity) {
//            System.out.println("Line is full!");
//            return;
//        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    // Method to remove an element from the queue
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Line is empty!");
            return null; // Return null if the queue is empty
        }
        String item = arr[front];
        System.out.println("Dequeued student:" + item);
        getDequeuedStudent(item);
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public String getDequeuedStudent(String item) {
    	return dequeuedStudent = item;
    }
    public String returnDequeuedStudent() {
    	return dequeuedStudent;
    }
    
    // Method to check the front element
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null; // Return null if the queue is empty
        }
        
        return arr[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current size of the queue
    public int getSize() {
        return size;
    }

    public String printQueue() {
//        if (front == rear) {
//            System.out.println("Queue is empty");
//            
//        }
        int queuenumber = 1;
        for (int i = front; i <= rear; i++) {
            System.out.println("Queue #" + queuenumber  + arr[i] + " ");
            queuenumber++;
        }
        classQueueNumber = queuenumber;
        System.out.println();
		return null;
    }

}
