public class Main {

    public static void main(String[] args) {
	    int num = 5;
        System.out.println("before increment: " +num);

        int increment = increment(num);
        System.out.println("after increment: " +increment);

    }

    public static int increment(int number) {
        return ++number;
    }
}
