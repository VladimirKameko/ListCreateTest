package by.home;

public class Main {

    public static void main(String[] args) {
        test();
    }


    public static void test() {
        Node tail = ListUtils.createList(1, 2, 3, 4, 5);
        System.out.println(ListUtils.printList(tail));
    }


}
