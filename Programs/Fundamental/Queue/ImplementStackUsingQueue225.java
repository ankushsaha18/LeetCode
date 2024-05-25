package Fundamental.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class ImplementStackUsingQueue225 {
    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(5);
        m.push(7);
        System.out.println(m.pop());
    }
}

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int a) {
        q.add(a);
        for(int i = 0 ; i < q.size() - 1 ;i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty() {
        return q.size() == 0;
    }
}
