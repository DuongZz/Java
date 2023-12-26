package Buoi3.B3;

import java.util.Scanner;

public class Stack {
    int top;
    int maxSize;
    int[] stackArray;
    public Stack(int size){
        this.maxSize = size;
        this.top = -1;
        this.stackArray = new int [maxSize];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full, Can not push");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, can not pop");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println(value + " poped from stack");
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack(5);
        System.out.println("Is stack empty " + stack.isEmpty());
        System.out.println("Is stack full " + stack.isFull());
        while (!stack.isFull()) {
            System.out.print("Enter a value to push into the stack: ");
            int value = input.nextInt();
            stack.push(value);
        }
        System.out.println("Is stack full? " + stack.isFull());
        System.out.print("Popping elements from the stack: ");
        while (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            System.out.println("Popped value: " + poppedValue);
        }
        System.out.println("Is stack empty " + stack.isEmpty());
    }
}
