import java.util.*;
public class Question_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the sorted array : ");
        int c=0;
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter element no."+(i+1)+" of array : ");
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            if (arr[i]==1)
            {
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}