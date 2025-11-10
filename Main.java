public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("First Instance");
        System.out.print("\n" + singleton1.getData());
        System.out.println("\n" + singleton1);

        Singleton singleton2 = Singleton.getInstance("Second Instance");
        System.out.print("\n" + singleton2.getData());
        System.out.println("\n" + singleton2);

        // Both singleton1 and singleton2 should point to the same instance (shows only one instance of this class can exist)
        System.out.println("\nAre both instances the same? " + (singleton1 == singleton2));
    }
}