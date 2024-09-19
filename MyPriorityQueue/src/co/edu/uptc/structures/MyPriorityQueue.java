package co.edu.uptc.structures;

public class MyPriorityQueue<T> {
    private MyList<Node> myList;

    public MyPriorityQueue() {
        myList = new MyList<>();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public void push(T element, int priority) {
        Node<T> nodePriority = new Node<>(element, priority);
        int index =0;
        while(index<myList.size() && myList.get(index).getPriority()<=priority) {
            index++;
        }
        myList.add(index, nodePriority);
    }

    public T pop() {
        Node<T> data = myList.get(0);
        myList.remove(0);
        return data.getData();
    }

    public T peek() {
        return (T) myList.get(0).getData();
    }
}
