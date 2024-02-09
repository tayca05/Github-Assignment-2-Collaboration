import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayOperations 
{
    private static int[] array;

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int length;
        System.out.print("Enter the length of the array: ");
        boolean inputIsValid = false;
        
        while (!inputIsValid)
        {
            if(in.hasNextInt())
            {
                length = in.nextInt();
                if(length > 0)
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
                in = new Scanner(System.in);
            }
        }
        

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
        int sum = 0;
        
        for(int elements : givenArray)
        {
            sum += elements;
        }

        int average = sum / givenArray.length;

        for(int i = 0; i < givenArray.length; i++)
        {
            givenArray[i] -= average;
        }

        return givenArray;
    }



}
