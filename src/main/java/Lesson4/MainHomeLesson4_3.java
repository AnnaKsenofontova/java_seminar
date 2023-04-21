package Lesson4;
import java.util.*;
public class MainHomeLesson4_3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.offer(2809);
        System.out.println(queue);
        queue.remove(2809);
        queue.element();
        queue.peek();
    }
}
