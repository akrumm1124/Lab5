
public class ArrayMathProblem {
    public static void main(String[] args) {
       int[] numArray = {3, 6, 2, 10, 7, 5, 14, 12};
       int arrayTotal = getTotal(numArray);
       System.out.println(arrayTotal);
       double arrayAverage = getAverage(numArray);
       System.out.println(arrayAverage);
       int arrayHighest = getHighest(numArray);
       System.out.println(arrayHighest);
       int arrayLowest = getLowest(numArray);
       System.out.println(arrayLowest);
    }
    
    public static int getTotal(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            total = total + array[i];
        }
        return total;
    }
    public static double getAverage(int[] array) {
        double average;
        double total = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            total = total + array[i];
        }
        average = total / array.length;
        return average;
    }
    public static int getHighest(int[] array) {
        int highest = array[0];
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }
    public static int getLowest(int[] array) {
        int lowest = array[0];
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }
}
