//STACKS
//LIFO : Last In and First Out
//Stacks follow the concept of LIFO 
//Operating system , Compiler , Algorithm
//balanced parathesis
//Stack is a data structure which follow the concept of Last In First Out
//Operations associated with stacks
// 1. Push() : Inserting a new element into the stack is known as push
// 2. Pop() : Popping out/taking out an element from the top of the stack.
// 3. isEmpty() : Checks if the stack is empty.
// 4. Top()/Peek() : Returns the element at the top of the stack.

//overflow : inserting elements more than the capacity of the stack.
//underflow : when the stack is empty and you want to pop an element out.

//Implementation of stacks-
// 1. using arrays
// 2. using linked list

//Linked list 1->2->3->4->NULL
//first element of the linked list is head/root

public class stacks {
    node root;

    public static class node{
        int data;
        node next;
        node(int value){
            data = value;
        }
    }

    public void push(int value){
        node newnode = new node(value);
        if(root == null){
            root = newnode;
        }
        else{
        // 1->2->3->4->NULL
        //5--------->1->2->3->4->NULL
        //5->1->2->3->4->NULL
        //1. create a temporary node pointing to the head 
        //2. root should be replaced and newnode shuld be the new root/head
        //3.next of newnode should point to the head
        node temp = root;
        root = newnode;
        newnode.next = temp;
        }
        System.out.println(value+" inserted into the stack successfully");
    }

    public int pop(){
        int val = Integer.MIN_VALUE;
        if(root==null){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            //1. point to the root 
            //2. make the next element to the root as the new root
            //1->2->3->4->5->NULL
            val = root.data;
            root = root.next;
            return val;
        }        
    } 

    public boolean isEmpty() {
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int top(){
        if(root == null){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return root.data;
        }
    }

    public static void main(String[] args) {
        stacks obj = new stacks();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        //[50,40,30,20,10]
        System.out.println("Element at the top of the stack : "+obj.top());
        obj.pop();
        //[40,30,20,10]
        System.out.println("Element at the top of the stack : "+obj.top());
    }
    
}
