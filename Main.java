import java.util.*;

public class Main {
    List<String> list1 = Arrays.asList("Monday", "Tuesday"); //it is an unmodifiable list we cannot add, remove element but we can replace them
    String[] array = {"Apple", "Banana", "Cherry"};
    List<String> list2 = Arrays.asList(array); //In this we can not even replace the element
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Standard way of declaring arraylist
        list.add(1); //adding an element
        list.add(2);
        list.add(3);
//        Converting arraylist into array
//        Object[] array1 = list.toArray();
//        Integer[] array2 = list.toArray(new Integer[0]);

    // We can also sort the arraylist
        Collections.sort(list);
        list.sort(null);

        list.add(2, 5); // 5 will come between 2 and 3
        list.set(3, 6); // the value at index 3 will replace
        System.out.println(list.get(2)); // to print element
        System.out.println(list.size()); // to print size of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int x: list){
            System.out.println(x);
        }
        System.out.println(list.contains(5)); //to check the existance
        list.remove(2); // to remove element at any particular index

    }
}

// list.trimToSize() to reduce the size of internal array

