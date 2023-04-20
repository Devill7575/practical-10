/*
Write a program, take 7 characters as an input , Print only vowels from the array
Input: a b c o d p e
Output : a o e
*/

import java.io.*;
class Vowels {
        public static void main (String ar[])throws IOException {
                BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
                System.out.println("Enter number of elements");
                int size= Integer.parseInt(br.readLine());
                char arr[] = new char[size];
                System.out.println("Enter elements");
                for(int i=0; i<arr.length; i++) {
                        arr[i] = br.readLine().charAt(0);
                }
                System.out.print("vowels = ");
                for(int i=0; i<arr.length; i++) {
                        if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ) {

                                System.out.print(arr[i]+" ");

                        }
                }
        }
}
