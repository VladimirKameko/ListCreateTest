package by.home;

import static java.util.Arrays.copyOfRange;

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

    public static Node createListRec(int...values){
        return values.length==0? null : new Node(values[0], createListRec(copyOfRange(values,1,values.length)));

    }

    public static String printListRec(Node tail){
        return (tail==null)? "*" : tail.value+"->"+printListRec(tail.next);

    }
}
