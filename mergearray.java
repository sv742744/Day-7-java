/*
4
1 2 3 4
3
1 2 3
[1, 2, 3, 4, 1, 2, 3]
*/
import java.util.*;
class mergearray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
           arr1[i]=s.nextInt();
        }
        int m=s.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
           arr2[i]=s.nextInt();
        }
        int temp []=new int[n+m];
        for(int i=0;i<n;i++){
            temp[k]=arr1[i];
            k++;
        }
        for(int i=0;i<m;i++){
            temp[k]=arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}