package week_20_28_01_2023;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {


        List<String> stack = new Stack<>();

        ((Stack)stack).push("first");
        ((Stack)stack).push("second");
        ((Stack)stack).push("Last");

        System.out.println("Stack LIFO "+((Stack) stack).peek());//last


       Queue<String> queue = new PriorityQueue<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Last");
        System.out.println("Queue FIFO "+queue.poll());//First





    }
}
