import java.util.Scanner;

public class SpecialSubsequence {
    static void sequenceCheck(String[] arr, int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals("A"))
            {
                for (int j=i+1;j<n;j++)
                {
                    if(arr[j].equals("G"))
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println("COUNT: "+count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int n=str.length();
        str=str.toUpperCase();
        String split_str[]=str.split("");
      sequenceCheck(split_str,n);


    }
}
