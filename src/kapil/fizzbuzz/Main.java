package kapil.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int fizz = i % 3;
            int buzz = i % 5;
            if (fizz == 0 && buzz == 0) {
                System.out.println("FizzBuzz");
            }
            else if (fizz == 0) {
                System.out.println("Fizz");
            }
            else if (buzz == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
