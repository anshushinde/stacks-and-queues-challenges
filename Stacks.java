import java.util.*;

public class Stacks {

    private Node head;
    private Node topOfStack;
    private Node beforeTop;
    private int size;
    private int max;
    private int min;

    public Node getHead() {
        return head;
    }

    public void setTop(Node head) {
        this.head = head;
    }

    public Stacks()
    {
        head = null;
        topOfStack = null;
        beforeTop = null;
        size = 0;
        max =0;
        min =0;
    }

public boolean isEmpty()
{
    return head == null;
}


    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }
    public void printMax(){
        System.out.println(getMax());
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Node getTopOfStack() {
        return topOfStack;
    }

    public Object push(Object data){
//       Node n = new Node(data,top);

       if(isEmpty()){
           head = new Node(data, null);
           topOfStack = head;
           setMax((int) data);
           setMin((int) data);
       } else {
           //Node currentTop = (Node) data;
           Node newNode = new Node(data, null);
           topOfStack.setNext(newNode);
           beforeTop = topOfStack;
           topOfStack = newNode;
       }

        if((int)data > getMax()){
            setMax((int) data);
        } else if ((int) data < getMin()){
            setMin((int) data);
        }

       size++;
       return data;
}
public Object pop()
{
    //Object data = null;
    if (isEmpty()){
        throw new EmptyStackException();
    }
    else {

//        Node currentNode = head;
//        Node previousNode = null;
        Node temp = topOfStack;
        Node current = beforeTop;
        beforeTop.setNext(null);
        topOfStack = beforeTop;
        size--;

        //need to loop if two or more nodes exist
//        while (currentNode.getNext() != null) {
//            previousNode = currentNode;
//            currentNode = currentNode.getNext();
//        }
//
//        Object removed = currentNode.getData();
//        if (previousNode == null) {
//            head = null;
//        } else {
//            previousNode.setNext(null);
//        }
//        size--;
        return temp.getData();

//        data = top.getData();
//        Node temp = top;
//        top = top.getNext();
//        temp.setNext(null);

//    }
//    return data;
    }
}


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}