public class Main {

    public static void main(String[] args) {
	    int num = 5;
        int increment = increment(num);
        System.out.println(increment);
    }

    public static int increment(int number) {
        return ++number;
    }
}
