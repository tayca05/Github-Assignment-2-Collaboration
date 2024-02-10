import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayOperations 
{
    private static int[] array;

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int choice = 0;

        while (choice != 5) 
        {
            displayTheMenu();
            choice = in.nextInt();

            if (choice == 1) 
            {
                createArray();
            } 
            else if (choice == 2 && array != null) 
            {
                int min = findMinimum(array);
                int max = findMaximum(array);
                System.out.println("Minimum value: " + min);
                System.out.println("Maximum value: " + max);
            } 
            else if (choice == 3 && array != null) 
            {
                int[] differences = differenceFromAverage(array);
                System.out.println("Differences from average: " + Arrays.toString(differences));
            } 
            else if (choice == 4 && array != null) 
            {
                int sumEven = getSumOfEvenIndexes(array);
                int sumOdd = getSumOfOddIndexes(array);
                System.out.println("Sum of elements with even indexes: " + sumEven);
                System.out.println("Sum of elements with odd indexes: " + sumOdd);
            } 
            else if (choice == 5) 
            {
                System.out.println("Exiting...");
            } 
            else if (array == null)
            {
                System.out.println("Please first create an array!");
            }
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }

        }
        
        in.close();
    }

     public static void displayTheMenu ()
    {
        String menu = """
                
        1) Create an array.
        2) Show the minumum and the maximum values of the array.
        3) Show the differences from the average of the array's values.
        4) Show the sum of the values in odd and even indexes.
        5) Exit the menu.
        Choice:     """;
        
        System.out.print ("The Menu: " + menu + " ");
    }


    private static void createArray() 
    {
        Scanner in = new Scanner (System.in);
        
        int length = 0;
        System.out.print("Enter the length of the array: ");
        boolean inputIsValid = false;
        
        while (!inputIsValid)
        {
            if(in.hasNextInt())
            {
                length = in.nextInt();
                if (length > 0)
                {
                    inputIsValid = true; 
                }
                else
                {
                    System.out.print("Length should be positive! Try again: ");
                }
            }
            else
            {
                System.out.print("Length should be an integer! Please try again: ");
            }
        }

        array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) 
        {
            array[i] = random.nextInt(101);
        }
        System.out.println("Array created: " + Arrays.toString(array));
    }

    public static int findMinimum(int[] givenArray)
    {
        int min = givenArray[0];
        for (int i = 1; i < givenArray.length; i++)
        {
            if (givenArray[i] < min)
            {
                min = givenArray[i];
            }
        }

        return min;
    }

    public static int findMaximum(int[] givenArray)
    {
        int max = givenArray[0];
        for (int i = 1; i < givenArray.length; i++)
        {
            if (givenArray[i] > max)
            {
                max = givenArray[i];
            }
        }

        return max;
    }

     /**
     * Finds and returns the sum of the numbers in the even indexes 
     * of an array
     * @param givenArray
     * @return The sum of the number in even indexes.
     */
    public static int getSumOfEvenIndexes (int[] givenArray)
    {
        int sumOfEvenIndexes = 0;
        for (int i = 0; i < givenArray.length; i = i + 2)
        {
            sumOfEvenIndexes = sumOfEvenIndexes + givenArray [i];
        }

        return sumOfEvenIndexes;
    }

    /**
     * Finds and returns the sum of the numbers in the odd indexes
     * of an array
     * @param givenArray
     * @return
     */
    public static int getSumOfOddIndexes (int[] givenArray)
    {
        int sumOfOddIndexes = 0;

        for (int i = 1; i < givenArray.length; i = i + 2)
        {
            sumOfOddIndexes = sumOfOddIndexes + givenArray [i];
        }

        return sumOfOddIndexes;
    }
    
    /**
     * calculates the average of the given array and returns it with the 
     * differences of each element from average
     * @param givenArray array to take average
     * @return an array of differences from the average
     */
    public static int [] differenceFromAverage(int [] givenArray)
    {
        int [] changedArray = new int[givenArray.length];
        
        int sum = 0;
        
        for(int elements : givenArray)
        {
            sum += elements;
        }

        int average = sum / givenArray.length;

        for(int i = 0; i < givenArray.length; i++)
        {
            changedArray[i] = givenArray[i] - average;
        }

        return changedArray;
    }
}
