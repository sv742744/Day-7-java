/*
5
5
1 2 3 12 4
true
*/import java.util.*;
class twopairsum{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr [i]=s.nextInt();
    }
    Arrays.sort(arr);
    int l=0;
    int r=arr.length-1;
    boolean g=false;
    while(l<=r)
    {
      int sum=arr[l]+arr[r];
      if(sum==k)
      {
        g=true;
        break;
      }else if(sum<k)
      {
        l++;
      }else{
        r--;
      }
    }
    System.out.println(g);
  }
}