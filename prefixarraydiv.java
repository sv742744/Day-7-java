/*
5
1 2 3 4 5
[1, 1, 2, 2, 3]
*/
import java.util.*;
class prefixarraydiv{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    int p=0;
    for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
    for(int i=0;i<arr.length;i++){
        p+=arr[i];
        int res=p/(i+1);
        arr[i]=res;
    }
    System.out.println(Arrays.toString(arr));
  }
}