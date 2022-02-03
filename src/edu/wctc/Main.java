package edu.wctc;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Triplet name1 = new Triplet("Andrew", "Michael", "Gunn");
        Triplet name2 = new Triplet(new ArrayList<String>({"Andrew","Goombah"}))

        System.out.println(name1);

    }

    static void cheeseyVenn() {
        // write your code here
        Set<String> carby = new HashSet<>();
        Set<String> tomatoey = new HashSet<>();
        Set<String> cheesey = new HashSet<>();

        carby.add("Croissant");
        carby.add("Roll");
        carby.add("Toast");
        carby.add("Grilled Cheese");
        carby.add("Mac and Cheese");
        carby.add("Cheese and Crackers");
        carby.add("Bagel and Cream Cheese");
        carby.add("Spaghetti Marinara");
        carby.add("Tomato Sandwich");
        carby.add("Lasagna");
        carby.add("Tomato Soup and Goldfish Crackers");
        carby.add("Pizza Margherita");
        carby.add("Tomato and Mozzarella Sandwich");

        tomatoey.add("Tomato Slices");
        tomatoey.add("Tomato Wedges");
        tomatoey.add("Grape Tomatoes");
        tomatoey.add("Spaghetti Marinara");
        tomatoey.add("Tomato Sandwich");
        tomatoey.add("Lasagna");
        tomatoey.add("Tomato Soup and Goldfish Crackers");
        tomatoey.add("Pizza Margherita");
        tomatoey.add("Tomato and Mozzarella Sandwich");
        tomatoey.add("Caprese Salad");
        tomatoey.add("Greek Salad");

        cheesey.add("Mozzarella Sticks");
        cheesey.add("String Cheese");
        cheesey.add("Cheese Cubes");
        cheesey.add("Fresh Mozzarella");
        cheesey.add("Caprese Salad");
        cheesey.add("Greek Salad");
        cheesey.add("Grilled Cheese");
        cheesey.add("Mac and Cheese");
        cheesey.add("Cheese and Crackers");
        cheesey.add("Bagel and Cream Cheese");
        cheesey.add("Lasagna");
        cheesey.add("Tomato Soup and Goldfish Crackers");
        cheesey.add("Pizza Margherita");
        cheesey.add("Tomato and Mozzarella Sandwich");

        // Foods that are both cheesey and tomatoey
        // The intersection of both sets
        Set<String> cheeseyAndTomatoey = new HashSet<>(cheesey);
        cheeseyAndTomatoey.retainAll(tomatoey);
        System.out.println(cheeseyAndTomatoey.toString());

        // Foods that are either carby or tomatoey (or both)
        // The union of both sets
        Set<String> carbyOrTomatoey = new HashSet<>(carby);
        carbyOrTomatoey.addAll(tomatoey);
        System.out.println(carbyOrTomatoey.toString());

        // Foods that are cheesey but not carby
        // The difference (or relative complement) of both sets
        Set<String> cheeseyButNotCarby = new HashSet<>(cheesey);
        cheeseyButNotCarby.removeAll(carby);
        System.out.println(cheeseyButNotCarby.toString());

        // Foods that are cheesey, carby, and tomatoey
        // The center of the Venn diagram
        Set<String> allThree = new HashSet<>(cheesey);
        allThree.retainAll(carby);
        allThree.retainAll(tomatoey);
        System.out.println(allThree.toString());
    }
    static void bookDemo() {
        Set<Book> books = new HashSet<>();
        books.add(new Book("Beyond order", new Author("Jordan", "Peterson")));
        books.add(new Book("Beyond asdfasdf", new Author("Sdfsdf", "Petesaadrson")));
        books.add(new Book("Beyond order", new Author("Jordan", "Peterson")));

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(books.size());
    }

    static void printInventory(Map<String, String> stuff) {
        for (Map.Entry<String, String> item : stuff.entrySet())
            System.out.printf("%s\n\t%s\n", item.getKey(), item.getValue());

    }

    static void zeldademo() {
        Map<String, String> inventory = new HashMap<>();
        Scanner keyboard = new Scanner(System.in);
        inventory.put("Bow", "Bow with arrows");
        inventory.put("Boomerang", "Wooden boomerang");
        inventory.put("Bombs", "Standard bombs");

        printInventory(inventory);

        System.out.println("Item name to modify:");
        String key = keyboard.nextLine();

        if (inventory.containsKey(key)) {
            System.out.print("Enter new desc\n");
            inventory.replace(key, keyboard.nextLine());
        } else {
            System.out.println("For your reference, today you with have\nBig Trouble");
        }
    }
}
