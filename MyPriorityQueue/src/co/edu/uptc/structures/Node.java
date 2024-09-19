package co.edu.uptc.structures;

public class Node<T> {
	private Node<T> previous;
	private Node<T> next;
	private T data;
	private int priority;

	public Node(T data) {
		this.data = data;
	}
	public Node(T data, int priority) {
		this.data = data;
		this.priority = priority;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Node [previous=" + previous + ", next=" + next + ", data=" + data + "]";
	}

}
