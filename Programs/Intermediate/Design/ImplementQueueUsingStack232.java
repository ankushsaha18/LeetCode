package Intermediate.Design;
import java.util.Stack;


public class ImplementQueueUsingStack232 {
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.push(50);
        m.push(8);
        System.out.println(m.peek());
        m.pop();
        System.out.println(m.peek());
    }
}

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int a){
        input.push(a);
    }

    public int pop(){
        if(output.isEmpty()){
            while (! input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek(){
        if(output.isEmpty()){
            while (! input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty(){
        return input.size() == 0 && output.size() == 0;
    }
}
