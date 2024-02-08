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

    



}
