import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("First");
        list.add("Second");
        list.offer("Third");
//        list.add(0, "Third");
        list.push("Four");
        System.out.println(list);
        System.out.println("-".repeat(20));
        list.pop();
        System.out.println(list);
    }
}
