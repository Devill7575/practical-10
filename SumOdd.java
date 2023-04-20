/*
WAP to take size of array from user and also take integer elements from user Print sum
of odd elements only
input : Enter size : 5
Enter array elements : 1 2 3 4 5
output : 9
1 + 3 + 5
*/

import java.io.*;
class SumOdd {
        public static void main (String ar[])throws IOException {
                BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
                System.out.println("Enter number of elements");
                int size= Integer.parseInt(br.readLine());
                int arr[] =new int[size];
                int sum =0;
                System.out.println("Enter array elements");
                for(int i=0; i<size; i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                        if(arr[i]%2==1) {
                                sum= sum+arr[i];
                        }
                }
                System.out.println("Total sum of odd elements = "+sum);
        }
}
