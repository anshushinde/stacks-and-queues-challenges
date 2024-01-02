import org.w3c.dom.Node;

import javax.xml.crypto.NodeSetData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Runner extends Stacks {


    public static void main(String[] args) {

        System.out.println(checkPalindrome("dad"));

        StackOfPlates stacker = new StackOfPlates(3);
        System.out.println(stacker.pushAStack(7));
        System.out.println(stacker.pushAStack(18));
        System.out.println(stacker.pushAStack(47));
        System.out.println(stacker.pushAStack(93));
        System.out.println(stacker.pushAStack(11));

        System.out.println(stacker.isEmptyStackOfPlates());

        System.out.println("Arraylist list size" + stacker.getSizeofArrayList());

        System.out.println("The maximum of the first stack is " + stacker.getMaxOfStack(0));
        System.out.println("The maximum of the second stack is " + stacker.getMaxOfStack(1));
        System.out.println("The minimum of the first stack is " + stacker.getMinOfStack(0));
        System.out.println("The minimum of the first stack is " + stacker.getMinOfStack(1));


       // System.out.println(stacker.getStackofPlates().get(0));

        System.out.println(stacker.popOffStack());
        System.out.println(stacker.popOffStack());
        System.out.println(stacker.popOffStack());
        System.out.println(stacker.popOffStack());


    }

    public static boolean checkPalindrome(String word) {

        word = word.replaceAll(" ", ""); //remove punctuation
        word = word.replaceAll(",", ""); //remove punctuation
        word = word.replaceAll(".", ""); //remove punctuation
        word = word.replaceAll(":", ""); //remove punctuation
        word = word.replaceAll(";", ""); //remove punctuation
        word = word.replaceAll("-", ""); //remove punctuation
       // word = word.replaceAll("?", "");//remove punctuation
        word = word.replaceAll("!", "");//remove punctuation

        Queue<String> queue = new LinkedList<>();

        for (int i = word.length(); i > 0; i--) {
            queue.add(word.substring(i - 1, i));
        }

        if (queue.isEmpty()) {
            System.out.println("String is empty");
            return false;
        }

        for (int i = 0; i < word.length() / 2; i++) {
            if (queue.peek().equals(word.substring(i, i + 1))) {
                queue.remove();
            } else {
                return false;
            }
        }

        return true;
    }


}
