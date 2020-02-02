package ua.skillsup.binarytree;

import java.util.Objects;

public class Launcher {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        show(set);
        System.out.println("Set is empty: " + set.isEmpty());

        add(set, null);
        add(set, "D");
        add(set, "G");
        add(set, "A");
        add(set, "H");
        add(set, "B");
        add(set, "C");
        add(set, "F");
        add(set, "E");
        show(set);

        contains(set, null);
        contains(set, "NO");
        contains(set, "E");

        add(set, "A");

        show(set);

        System.out.println("\nSize is " + set.size());
        System.out.println("Set is empty: " + set.isEmpty());
    }

    private static void add(TreeSet set, Object value) {
        if (Objects.isNull(value)) {
            System.out.println("\nThe value must not be equals null.");
            return;
        }
        set.add(value);
    }

    private static void contains(TreeSet set, Object value) {
        if (Objects.isNull(value)) {
            System.out.println("\nThe value must not be equals null.");
            return;
        }
        if (set.contains(value)) {
            System.out.println("\nSet contains this value. " + value.toString());
        } else {
            System.out.println("\nThe value isn't found. " + value.toString());
        }
    }

    private static void show(TreeSet set) {
        if (set.isEmpty()) {
            System.out.println("Set is empty.");
            return;
        }
        System.out.println("\n" + set.show());
    }
}
