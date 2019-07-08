package by.home;

public class Main {

    public static void main(String[] args) {
        test();
        System.out.println("Recursion method---------------------------------");
        testRec();

    }


    public static void test() {
        Node tail = ListUtils.createList(1, 2, 3, 4, 5);
        System.out.println(ListUtils.printList(tail));
    }

    public static void testRec(){
        Node tail = ListUtils.createListRec(1, 2, 3, 4, 5);
        System.out.println(ListUtils.printListRec(tail));
    }


}
