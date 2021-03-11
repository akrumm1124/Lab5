import java.util.Scanner;
import java.util.ArrayList;
public class ArrayHigherNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers to be added to an array.");
        System.out.println("Type 'x' when finished.");
        System.out.println("Finally, enter a number to find out how many numbers in the array are greater than it");
        while (true) {
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("x")) {
        break;
      }
      int inputAsNumber = Integer.parseInt(input);
      numbers.add(inputAsNumber);
        }
        int n = keyboard.nextInt();
        int numbersHigher = findHigherNumbers(numbers, n);
        System.out.println(numbersHigher);
    }
    public static int findHigherNumbers (ArrayList<Integer> array, int n) {
        int numbersHigher = 0;
        for (int i = 0; i < array.size(); i = i + 1) {
            if (array.get(i) > n) {
                numbersHigher = numbersHigher + 1;
            }
        }
        return numbersHigher;
    }
}
