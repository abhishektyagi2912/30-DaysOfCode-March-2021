import java.util.*;
public class MinSum
{
    static int minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        int a = 0, b = 0;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 != 0)
                a = a * 10 + arr[i];
            else
                b = b * 10 + arr[i];
        }
        return a + b;
    }
    public static void main (int arr[] )
    {
        int n = arr.length;
        System.out.print("Sum is : " + minSum(arr, n));
    }
}
