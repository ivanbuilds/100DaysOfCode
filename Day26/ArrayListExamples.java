package arraylistexamples;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Diego");
        names.add("Carlos");

        System.out.println("Names in the list: " + names);

        System.out.println("The second name is: " + names.get(1));

        names.set(0, "Alicia");
        System.out.println("Updated names: " + names);

        names.remove(2);
        System.out.println("After removing the third name: " + names);

        System.out.println("Iterating through the names:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Number of names in the list: " + names.size());
    }
    
}
