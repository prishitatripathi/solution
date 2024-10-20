import java.util.*;
class Solution
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=sc.nextInt();
        System.out.println("Enter target");
        int target=sc.nextInt();
        int ar[]=new int[n]; 
        for(int x=0;x<n;x++) 
        {
            ar[x]=sc.nextInt();
        } 
        int sum=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(x!=y)
                {
                    sum=ar[x]+ar[y];
                }
                if(sum==target)
                {
                    System.out.println("["+x+","+y+"]");
                    break;
                }
                
            }
        }   
    }
}