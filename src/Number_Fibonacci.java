public class Number_Fibonacci {

    public static void fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;
        System.out.print(z +" ");
        for (int i = 1; i < num; i++) {
            result = j + z;
            System.out.print(result + " ");
            j = z;
            z = result;

        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}