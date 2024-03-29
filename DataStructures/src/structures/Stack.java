package structures;

public class Stack {

	int top = -1;
	int stack[];
	int maxSize;

	public Stack(int x) {
		stack = new int[x];
		maxSize = x;
	}

	public void push(int x) {
		if (isFull())
			System.out.print("Stack is full");
		else
			stack[++top] = x;
	}

	public int pop() {
		if (isEmpty())
			return -5000; //large number identifying empty
		return stack[top--];
	}

	public int peek() {
		if (isEmpty())
			return -5000; //large number identifying empty
		return stack[top];
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	/*
		Could include methods that expand stack size
		at the user's request
	*/
}