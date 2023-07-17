import java.util.*;

class Solution
{
    public void unique(int[] array)
    {
        int element=array[0];
        for(int i=1;i<array.length;i++)
        {
            element=element^array[i];
        }
        System.out.println(element);

    }
}

class UniqueElement
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.unique(array);
    }
}
