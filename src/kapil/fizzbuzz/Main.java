package kapil.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        int max = 100;
        for (int i = 1; i <= max; i++) {
            int fizz = i % 3;
            int buzz = i % 5;
            int bang = i % 7;
            if (fizz == 0 && buzz == 0 && bang == 0) {
                System.out.println("FizzBuzzBang");
            }
            else if (fizz == 0 && buzz == 0) {
                System.out.println("FizzBuzz");
            }
            else if (buzz == 0 && bang == 0) {
                System.out.println("BuzzBang");
            }
            else if (fizz == 0 && bang == 0) {
                System.out.println("FizzBang");
            }
            else if (fizz == 0) {
                System.out.println("Fizz");
            }
            else if (buzz == 0) {
                System.out.println("Buzz");
            }
            else if (bang == 0) {
                System.out.println("Bang");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
