/*
6
7
4
3
2
8
9
[9,8,2,3,4,7
*/
import java.util.*;
class twopointertech{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}