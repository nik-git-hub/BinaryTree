package ua.skillsup.binarytree;

public class Launcher {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        set.show();
        System.out.println("Set is empty: " + set.isEmpty());

        set.add(null);

        set.add("D");
        set.add("G");
        set.add("A");
        set.add("H");
        set.add("B");
        set.add("C");
        set.add("F");
        set.add("E");
        set.show();

        contains(set, null);
        contains(set, "NO");
        contains(set, "E");

        set.add("A");

        set.show();

        System.out.println("\nSize is " + set.size());
        System.out.println("Set is empty: " + set.isEmpty());
    }

    private static void contains(TreeSet set, Object value) {
        if ( value == null) {
            System.out.println("\nThe value must not be equals null.");
            return;
        }
        if (set.contains(value)) {
            System.out.println("\nSet contains this value. " + value.toString());
        } else {
            System.out.println("\nThe value isn't found. " + value.toString());
        }
    }

}
