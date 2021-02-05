public class Main {

    public static void main(String[] args) {
	    int num = 5;
        System.out.println("before increment: " +num);

        int increment = increment(num);
        System.out.println("after increment: " +increment);

        int number = 10;
        System.out.println("\nbefore decrement: " +number);

        int decrement = decrement(number);
        System.out.println("after decrement: " +decrement);

    }

    public static int increment(int number) {
        return ++number;
    }

    public static int decrement(int number) {
        return --number;
    }
}
