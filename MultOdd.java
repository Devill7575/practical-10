/*
WAP to take size of array from user and also take integer elements from user Print
product of odd index only
*/

import java.io.*;
class MultOdd {
        public static void main (String ar[])throws IOException {
                BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
                System.out.println("Enter number of elements");
                int size= Integer.parseInt(br.readLine());
                int arr[] =new int[size];
                int mult =1;
                System.out.println("Enter array elements");
                for(int i=0; i<size; i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                        if(arr[i]%2==1) {
                                mult=mult*arr[i];
                        }
                }
                System.out.println("Multiplication of Odd elements = "+mult);
        }
}
