package org.kodluyoruz;

import java.util.Stack;

public class StackExample {
    private static Stack stack;
    public StackExample(Stack stack){
        this.stack=stack;
    }
    synchronized void addItem(Integer item){
        stack.push(item);
        System.out.println(item+" added");

    }
    synchronized void pullItem(){
        stack.pop();
        System.out.println("Get Value: "+stack.peek().toString());
    }
}
