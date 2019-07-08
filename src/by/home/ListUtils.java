package by.home;

public class ListUtils {
    public static Node createList(int... values) {
        Node tail = null;
        for (int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;

    }

    public static String printList(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";

    }
}
