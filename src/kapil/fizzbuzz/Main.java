package kapil.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        int max = 105;
        for (int i = 1; i <= max; i++) {
            int fizz = i % 3;
            int buzz = i % 5;
            int bang = i % 7;
            String word = "";

            if (fizz == 0) {
                word += "Fizz";
            }
            if (buzz == 0) {
                word += "Buzz";
            }
            if (bang == 0) {
                word += "Bang";
            }
            else if (fizz != 0 && buzz != 0 && bang != 0) {
                word = Integer.toString(i);
            }
            System.out.println(word);
        }
    }
}
