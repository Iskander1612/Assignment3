import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Part 1: Testing MyHashTable -----");

        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(1000000);
            String name = "Name" + random.nextInt(10000);

            MyTestingClass key = new MyTestingClass(id, name);

            int studentId = random.nextInt(10000);
            String studentName = "Name" + random.nextInt(1000);
            String studentSurname = "Surname" + random.nextInt(1000);
            double studentGpa = 2.0 + (4.0 - 2.0) * random.nextDouble();

            Student student = new Student(studentId, studentName, studentSurname, studentGpa);

            table.put(key, student);

            System.out.println(student);
        }

        System.out.println("done");

        System.out.println("\nBST:\n");

        BST<Integer, String> bst = new BST<>();

        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(2, "Two");
        bst.put(4, "Four");
        bst.put(6, "Six");
        bst.put(8, "Eight");

        System.out.println("BST size: " + bst.size());

        System.out.println("Key 3: " + bst.get(3));
        System.out.println("Key 10: " + bst.get(10));

        bst.delete(3);
        System.out.println("\nDelet key 3.");
        System.out.println("BST size: " + bst.size());
        System.out.println(" deleted key 3: " + bst.get(3));

        System.out.println("\nTraversing tree asc order:");
        for (var entry : bst.iterator()) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }
    }
}
