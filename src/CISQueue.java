import java.util.Arrays;

public class CISQueue {

    // Array property.
    private Integer[] queue;
    // Size property.
    private int size;
    // Index pointer. Indicates the index of the most recently added element.
    private int pointer;
    // Constructor.

    public CISQueue(int size) {
        this.queue = new Integer[size];
        this.size = 0;
        this.pointer = -1;
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(int x){
        pointer++;
        queue[pointer] = x;
        size++;
    }
    // Dequeue. This method removes a node from the beginning of the linked list.
    public Integer dequeue(){
        if (!isEmpty()) {
            Integer x = queue[0];
            reshuffle();
            size--;
            pointer--;
            return x;
        } else {
            return null;
        }
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        return (size == 0);
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }
    // reshuffle. Moves each element down one index. Called whenever we dequeue.
    public void reshuffle(){
        for (int i = 0; i<size; i++){
            queue[i]=queue[i+1];
        }
    }

    // toString. Returns a description of the queue in, for example, the following format:

    // CISQueue{queue=[7, 11], size=2, pointer=1}

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }
}
