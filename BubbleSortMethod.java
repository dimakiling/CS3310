
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortMethod 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Total numbers: ");
        int n = s.nextInt();
        
        double a[] = new double[n];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Math.random();
            System.out.println("Random generated total numbers are: " + a[i]);
        }
        System.out.println("\n Sorted Numbers are: " + Arrays.toString(BubbleSortDesc(a)));
    }
    
    private static double[] BubbleSortDesc(double[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 1; j < a.length - i; j++)
            {
                if(a[j-1] > a[j])
                {
                    double temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
