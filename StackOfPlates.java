import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates extends Stacks {

    private ArrayList<Stacks> list;
    private int size;
    private int thres;

    private Stacks current;

    public StackOfPlates(int threshold) {
        list = new ArrayList<>();
        size = 1;
        thres = threshold;
        current = new Stacks();
        list.add(current);
    }
public void increment(){
        size++;
}
    public int getSizeofArrayList() {
        return list.size();
    }

    public void setStackofPlates(ArrayList<Stacks> newStack) {
        list = newStack;
    }

    public boolean isEmptyStackOfPlates() {
        return size == 0;
    }


    public int getMaxOfStack(int stackIndex){
        return list.get(stackIndex).getMax();
    }

    public int getMinOfStack(int stackIndex){
        return list.get(stackIndex).getMin();
    }

    public Stacks getCurrent() {
        return current;
    }

    public void setCurrent(Stacks current) {
        this.current = current;
    }

    public boolean pushAStack(Object num) {
if(isEmptyStackOfPlates()){
    current.push((num));
    size++;
    return true;
} else if(current.getSize() < thres){
    current.push(num);
    return true;
} else if(current.getSize() == thres){
    Stacks newCurrent = new Stacks();
    list.add(newCurrent);
    newCurrent.push(num);
    size++;
    return true;
}
        return false;
    }

    public String popOffStack(){
        if(isEmptyStackOfPlates()){
            return "Stack was empty nothing to pop";
        } else if(current.getSize() > 0) {
            current.pop();
            return "Popped off one from last stack in arraylsit";
        } else if (list.get(size -1).getSize() == 0){
            list.remove(list.get(size -1));
            size--;
            list.get(size -1).pop();
            return "Last stack was empty so removed that stack from arraylist and popped off top from next stak";
        }
        return "something went wrong";
    }
}
